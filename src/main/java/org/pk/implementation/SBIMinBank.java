package org.pk.implementation;

import org.springframework.stereotype.Component;

@Component
public class SBIMinBank implements OnlineTransfer{
    @Override
    public String onlineMoneyTransfer() {
        return "Money transfer through online";
    }

    @Override
    public String toString() {
        return " SBI Min Bank transfer";
    }
}
