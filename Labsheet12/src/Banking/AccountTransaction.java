package Banking;

import org.w3c.dom.DOMStringList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccountTransaction extends BankAccount implements Transactionable {

    AccountTransaction(String accId) {
        super(accId);
    }

    boolean hasAccountId() {
        try (BufferedReader br = new BufferedReader(new FileReader(super.getFilename()))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.split(",")[0].equals(super.getAccId())) return true;
            }
        } catch (Exception e) {

        }
        return false;
    }

    @Override
    public double checkBalance() { // อ่านยอดเงินล่าสุดจากไฟล์
        try (BufferedReader br = new BufferedReader(new FileReader(super.getFilename()))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(getAccId())) {
                    double balance = Double.parseDouble(data[1]);
                    setAccBalance(balance); // อัปเดตค่าใน Object
                    return balance;
                }
            }
        } catch (IOException e) {

        }
        return 0.0;
    }

    private void updateFile(double newBalance) {

       List<String> allData = new ArrayList<>(); // 1. อ่านข้อมูลทั้งหมดมาเก็บไว้ใน List

        try (BufferedReader br = new BufferedReader(new FileReader(getFilename()))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(getAccId())) {
                    allData.add(data[0] + "," + newBalance);
                } else {
                    allData.add(line);
                }
            }
        } catch (IOException e)
        {

        }

        //เขียนทับไฟล์เดิม
        try (PrintWriter out = new PrintWriter(new FileWriter(super.getFilename()))) {
            for (String record : allData) {
                out.println(record);
            }
        } catch (IOException e)
        {

        }
    }

    public void deposit(double amount)
    {
        double current = checkBalance();
        updateFile(current + amount); // ฝากเงินเพิ่มเข้าไป
    }

    public void withdraw(double amount)
    {
        double current = checkBalance();
        if (current >= amount) { // เช็คว่าเงินพอไหม
            updateFile(current - amount);
        }
    }
}
