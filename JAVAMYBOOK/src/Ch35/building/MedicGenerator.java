package Ch35.building;

import Ch35.unit.Marine;
import Ch35.unit.Medic;
import Ch35.unit.Unit;

public class MedicGenerator implements UnitGenerator{

	@Override
	public Unit gen() {
		// TODO Auto-generated method stub
		return new Medic();
	}

}
