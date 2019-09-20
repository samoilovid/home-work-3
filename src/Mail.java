import com.sun.corba.se.impl.orb.ParserTable;

public class Mail {
    public static void main(String[] args) {
        int totalValueOfAllPreviousPurchases= 100000;
        int currentPurchasePrice= 5000;
        int fixedAmount = 1000;
        int bonusStandardLevel=50;
        int bonusSilverLevel=70;
        int bonusGoldLevel =100;
        if (totalValueOfAllPreviousPurchases<=15_000) {
            int accruedBonuses = currentPurchasePrice/fixedAmount*bonusStandardLevel;
            System.out.println(accruedBonuses);
        }
        else if (totalValueOfAllPreviousPurchases<=150_000){
            int accruedBonuses = currentPurchasePrice/fixedAmount*bonusSilverLevel;
            System.out.println(accruedBonuses);
        }
        else if (totalValueOfAllPreviousPurchases>150_000){
            int accruedBonuses = currentPurchasePrice/fixedAmount*bonusSilverLevel;
            System.out.println(accruedBonuses);
        }
    }

}
