public class Main {
    public static void main(String[] args) {
        int totalValueOfAllPreviousPurchases= 100000;
        int currentPurchasePrice= 5000;
        int fixedAmount = 1000;
        int bonusStandardLevel=50;
        int bonusSilverLevel=70;
        int bonusGoldLevel =100;
        int priceLimitOne = 15_000;
        int priceLimitTwo = 150_000;
        if (totalValueOfAllPreviousPurchases<= priceLimitOne) {
            int accruedBonuses = currentPurchasePrice/fixedAmount*bonusStandardLevel;
            System.out.println(accruedBonuses);
        } else { if (totalValueOfAllPreviousPurchases<= priceLimitTwo){
            int accruedBonuses = currentPurchasePrice/fixedAmount*bonusSilverLevel;
            System.out.println(accruedBonuses);
        } else if (totalValueOfAllPreviousPurchases> priceLimitTwo){
            int accruedBonuses = currentPurchasePrice/fixedAmount*bonusSilverLevel;
            System.out.println(accruedBonuses);
        }

        }
    }

}
