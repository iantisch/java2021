package src;

public abstract class Account {

    Account(){}

    public abstract String get_client_name();

    public abstract int get_money();

    public abstract void put_money(int m);

    public abstract int get_credit_money();

    public abstract int money_out(int m);

    public abstract int pay(int m);

    public abstract int take_credit(int m);

    public abstract int pay_credit(int m);

    public abstract String account_type();

}
