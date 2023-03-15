import java.util.List;

public class Cashier implements ICashier{
    private Double balance;
    public Cashier(){
        this.balance = 0.0;
    }
    public Double sell(Double value){
        return this.balance += value;
    }

    public Double sellMany(Double...values){
        for(Double value : values){
            this.sell(value);
        }
        return this.balance;
    }


}
