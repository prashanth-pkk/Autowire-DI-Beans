package org.pk.service;

import org.pk.implementation.OfflineTransfer;
import org.pk.implementation.OnlineTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ModeOfWithdraw {

    @Autowired
    private OfflineTransfer offlineTransfer;
    private OnlineTransfer onlineTransfer;

    public void moneydraw() {
        String money = offlineTransfer.offlineMoneyTransfer();
        System.out.println(money);
    }

    public void moneyTransfer() {
        String onMoney = onlineTransfer.onlineMoneyTransfer();
        System.out.println(onMoney);
    }

    public OfflineTransfer getOfflineTransfer() {
        return offlineTransfer;
    }

    public void setOfflineTransfer(OfflineTransfer offlineTransfer) {
        this.offlineTransfer = offlineTransfer;
    }

    public OnlineTransfer getOnlineTransfer() {
        return onlineTransfer;
    }

    @Autowired
    public void setOnlineTransfer(OnlineTransfer onlineTransfer) {
        this.onlineTransfer = onlineTransfer;
    }

    @Override
    public String toString() {
        return "Mode Of Withdraw { " +
                " offline Transfer=" + offlineTransfer +
                ", online Transfer=" + onlineTransfer +
                '}';
    }
}
