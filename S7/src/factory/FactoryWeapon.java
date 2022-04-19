package factory;

public class FactoryWeapon {
		public static IWeapon create(int price) throws Exception {
			if (price < 200) {
				return new CheapWeapon();
			}
			
			if (price >= 200 && price <=500) {
				return new NormalWeapon();
			}
			
			if (price > 500) {
				return new MagicWeapon();
			} else {
				throw new Exception("Something bad happened");
			}
		}
	}

