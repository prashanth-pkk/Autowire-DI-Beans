package org.pk;

import org.pk.bean.AccountHolder;
import org.pk.bean.CashWithdraw;
import org.pk.config.PersonConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(PersonConfig.class);        // Get the person bean

        AccountHolder person = context.getBean(AccountHolder.class);

        System.out.println("The account holder name : " + person.getName());
        System.out.println(person.getName());
        System.out.println(person.getCashWithdraw());

        CashWithdraw cashWithdraw = context.getBean(CashWithdraw.class);
        System.out.println("The cashier name : " + cashWithdraw.getChashierName());
        System.out.println(cashWithdraw.getModeOfWithdraw());
        person.getCashWithdraw().getModeOfWithdraw().getOfflineTransfer();
        person.getCashWithdraw().getModeOfWithdraw().getOnlineTransfer();

        person.getCashWithdraw().getModeOfWithdraw().moneydraw();

        context.close();
    }
}