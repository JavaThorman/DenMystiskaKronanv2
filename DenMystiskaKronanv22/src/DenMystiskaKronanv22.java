
    public class DenMystiskaKronanv22 {
    public static void main(String[] args) {



// Priset på bullarna = 25, donation 2 kr, de betalar 30kr. = 3kr tbx
        int pastriesPrice = 25; // Priset på bullar
        int kalleMoney = 10; // Kalles pengar
        int pelleMoney = 10; // Pelles pengar
        int tjalleMoney = 10; // Tjalles pengar
        int redCrossDonation = 2; // Donation till Röda Korset

// Skriver ut informationen till Console
        System.out.println("Bullarna kostar " + pastriesPrice);
        System.out.println("Kalle har " + kalleMoney);
        System.out.println("Pelle har " + pelleMoney);
        System.out.println("Tjalle har " + tjalleMoney);
        System.out.println();

// Beräkning av summan för köpet
        // moneyLeftAfterPurchase skall vara 5.
        System.out.println("De betalar " + (kalleMoney + pelleMoney + tjalleMoney));
        int moneyLeftAfterPurchase = (kalleMoney + pelleMoney + tjalleMoney) - pastriesPrice;
        kalleMoney -= 10;
        pelleMoney -= 10;
        tjalleMoney -= 10;
        System.out.println("Kalle har nu " + kalleMoney);
        System.out.println("Pelle har nu " + pelleMoney);
        System.out.println("Tjalle har nu " + tjalleMoney);
        System.out.println("Och får tillbaka " + moneyLeftAfterPurchase);
        System.out.println();
        // moneyLeftAfterPurchase = 5.
// Delar pengarna så att alla får en krona
        // moneyLeftAfterPurchase = 5 - 3 (ger varje person en krona, 2kr kvar)
        System.out.println("De delar så att de får en krona var");
        kalleMoney++;
        pelleMoney++;
        tjalleMoney++;
        moneyLeftAfterPurchase -= 3;
        redCrossDonation += moneyLeftAfterPurchase;
        System.out.println("Kalle har nu " + kalleMoney);
        System.out.println("Pelle har nu " + pelleMoney);
        System.out.println("Tjalle har nu " + tjalleMoney);
        System.out.println("Och donerar " + moneyLeftAfterPurchase + " till Röda korset");
        moneyLeftAfterPurchase = 0;
        System.out.println();

// Summerar utläggen
        System.out.println("Summa summarum:");
        // De betalade inte 27kr för bullarna, utan totalet efter donationen blev 27kr
        int expenses = 25;

        System.out.println("De betalade ca 8.3 kronor var, alltså (8.3)*3 = " + expenses + " kronor");
        System.out.println("och donerade 2 kronor");
       //adderar donationen
        expenses += 2;
        System.out.println("Summan blir då: " + expenses);

// Kontrollerar att utläggen stämmer
        if (expenses != 30)
            System.out.println("Error 404: Krona not found");
    }
}