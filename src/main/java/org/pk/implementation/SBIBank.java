package org.pk.implementation;

import org.springframework.stereotype.Component;

@Component
public class SBIBank implements OfflineTransfer {

    @Override
    public String offlineMoneyTransfer() {
        return "Money transfer through offline from SBI Bank";
    }

    @Override
    public String toString() {
        return " SBI Bank transfer";
    }
}
