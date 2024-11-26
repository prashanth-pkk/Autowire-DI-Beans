package org.pk.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountHolder {
    private String name = "Rock";
    private CashWithdraw cashWithdraw;

    @Autowired
    public AccountHolder(CashWithdraw cashWithdraw) {
        this.cashWithdraw = cashWithdraw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CashWithdraw getCashWithdraw() {
        return cashWithdraw;
    }

    public void setCashWithdraw(CashWithdraw cashWithdraw) {
        this.cashWithdraw = cashWithdraw;
    }

    @Override
    public String toString() {
        return "AccountHolder{" +
                "name='" + name + '\'' +
                '}';
    }
}
