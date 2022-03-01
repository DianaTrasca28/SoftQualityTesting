package ex2Stagiu1;

public class MarketStagiu2 {
	public float computePriceWithDiscount(Constants.CLIENT_TYPES productType, float initialPrice, int timeSpent)
	  {
	    float finalPrice = 0;
	    float discountByTimeSpent = (timeSpent > Constants.PRODUCT_TIME_LIMIT) ? (float)30/100 : (float)timeSpent/100; 
	    if (productType == Constants.CLIENT_TYPES.NEW_CLIENT)
	    {
	    	finalPrice = initialPrice;
	    }
	    else if (productType == Constants.CLIENT_TYPES.REGULAR_CLIENT)
	    {
	    	finalPrice = (initialPrice - (Constants.LOW_DISCOUNT * initialPrice)) - 
	    			discountByTimeSpent * (initialPrice - (Constants.LOW_DISCOUNT * initialPrice));
	    }
	    else if (productType == Constants.CLIENT_TYPES.FREQUENT_CLIENT)
	    {
	    	finalPrice = (initialPrice - (Constants.MEDIUM_DISCOUNT * initialPrice)) - 
	    			discountByTimeSpent * (initialPrice - (Constants.MEDIUM_DISCOUNT * initialPrice));
	    }
	    else if (productType == Constants.CLIENT_TYPES.EMAG_GENIUS)
	    {
	    	finalPrice = (initialPrice - (Constants.HIGH_DISCOUNT * initialPrice)) - 
	    			discountByTimeSpent * (initialPrice - (Constants.HIGH_DISCOUNT * initialPrice));
	    }
	    return finalPrice;
	  }
}

