package ex2Stagiu1;

public class MarketStagiu2 {
	public float computePriceWithDiscount(Constants.CLIENT_TYPES categorieProdus, float pretInitial, int timeSpent)
	  {
	    float pretFinal = 0;
	    float discountByTimeSpent = (timeSpent > Constants.PRODUCT_TIME_LIMIT) ? (float)30/100 : (float)timeSpent/100; 
	    if (categorieProdus == Constants.CLIENT_TYPES.NEW_CLIENT)
	    {
	    	pretFinal = pretInitial;
	    }
	    else if (categorieProdus == Constants.CLIENT_TYPES.REGULAR_CLIENT)
	    {
	    	pretFinal = (pretInitial - (0.1f * pretInitial)) - discountByTimeSpent * (pretInitial - (0.1f * pretInitial));
	    }
	    else if (categorieProdus == Constants.CLIENT_TYPES.FREQUENT_CLIENT)
	    {
	    	pretFinal = (pretInitial - (0.25f * pretInitial)) - discountByTimeSpent * (pretInitial - (0.25f * pretInitial));
	    }
	    else if (categorieProdus == Constants.CLIENT_TYPES.PREMIUM_CLIENT)
	    {
	    	pretFinal = (pretInitial - (0.35f * pretInitial)) - discountByTimeSpent * (pretInitial - (0.35f * pretInitial));
	    }
	    return pretFinal;
	  }
}
