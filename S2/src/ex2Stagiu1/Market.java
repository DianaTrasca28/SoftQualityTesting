package ex2Stagiu1;

public class Market {
	
	public float computePriceWithDiscount(int categorieProdus, float pretInitial, int period)
		  {
		    float pretFinal = 0;
		    float discountByTimeSpent = (period > 10) ? (float)30/100 : (float)period/100; 
		    if (categorieProdus == 1)
		    {
		    	pretFinal = pretInitial;
		    }
		    else if (categorieProdus == 2)
		    {
		    	pretFinal = (pretInitial - (0.1f * pretInitial)) - discountByTimeSpent * (pretInitial - (0.1f * pretInitial));
		    }
		    else if (categorieProdus == 3)
		    {
		    	pretFinal = (pretInitial - (0.25f * pretInitial)) - discountByTimeSpent * (pretInitial - (0.25f * pretInitial));
		    }
		    else if (categorieProdus == 4)
		    {
		    	pretFinal = (pretInitial - (0.35f * pretInitial)) - discountByTimeSpent * (pretInitial - (0.35f * pretInitial));
		    }
		    return pretFinal;
		  }

}
