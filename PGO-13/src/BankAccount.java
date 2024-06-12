import java.lang.reflect.Array;
import java.util.ArrayList;

public class BankAccount implements AccountOperations{

    private double stanKonta=0.0;
    ArrayList<Transaction>transactions=new ArrayList<>();

    public BankAccount(int stanKonta) {
        this.stanKonta = stanKonta;
    }

    public double getStanKonta() {
        return stanKonta;
    }

    public void setStanKonta(double stanKonta) {
        this.stanKonta = stanKonta;
    }

    @Override
    public void sprStanuKonta() {
        System.out.println("Stan konta: " + stanKonta);
    }

    @Override
    public void wykonaniePrzelewu() {

    }

    @Override
    public void dokonanieWplaty() {

    }
}
