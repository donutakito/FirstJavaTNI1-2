package Banking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class OpenNewAccount extends BankAccount{

    OpenNewAccount(String accId,double accBalance)
    {
        super(accId,accBalance);
    }

    String recordAccount()
    {
        if (isExistingAccount(super.getAccId()))return "This account has been create!!";

       try(BufferedWriter bw = new BufferedWriter(new FileWriter(super.getFilename(), true))){
           bw.write(super.toString()+"\n");
        }
        catch (Exception e)
        {

        }
        return "Created account success!!";
    }

    private boolean isExistingAccount(String account_name)
    {
       try(BufferedReader br=new BufferedReader(new FileReader(super.getFilename()))){
           String line;
           while ((line=br.readLine())!=null)
           {
               String data[]=line.split(",");
               if (data[0].equals(account_name))return true;
           }
       }catch (Exception e)
       {

       }
       return false;
    }
}
