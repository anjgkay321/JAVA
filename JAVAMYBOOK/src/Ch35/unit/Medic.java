package Ch35.unit;

public class Medic extends Unit{
	
	private int HealingPoint;
	public Medic() {
		hp=100;
		amor=100;
		HealingPoint=30;
	}
	public void setType(String type) {
		this.type= type;
	}
	public void Healing(Unit unit) {
		unit.hp+=HealingPoint;
		System.out.println(unit.type+"을 회복시힙니다" + unit.type+"체력 : " + unit.hp);
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void underAttact(int damage) {
		// TODO Auto-generated method stub
		
	}

}
