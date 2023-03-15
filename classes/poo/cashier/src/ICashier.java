public interface ICashier {
    Double balance = 0.0;
    public Double sell(Double value);
    public Double sellMany(Double...values);
}
