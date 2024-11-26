package org.pk.bean;

import org.pk.service.ModeOfWithdraw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CashWithdraw {
    public String chashierName = "suhas";
    private ModeOfWithdraw modeOfWithdraw;

    @Autowired
    public CashWithdraw(ModeOfWithdraw modeOfWithdraw) {
        this.modeOfWithdraw = modeOfWithdraw;
    }

    public String getChashierName() {
        return chashierName;
    }

    public void setChashierName(String chashierName) {
        this.chashierName = chashierName;
    }

    public ModeOfWithdraw getModeOfWithdraw() {
        return modeOfWithdraw;
    }

    public void setModeOfWithdraw(ModeOfWithdraw modeOfWithdraw) {
        this.modeOfWithdraw = modeOfWithdraw;
    }

    @Override
    public String toString() {
        return "CashWithdraw {" +
                " cashier Name='" + chashierName + '\'' +
                '}';
    }
}
