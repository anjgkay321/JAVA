package unit.copy;

public class Marine extends Unit{
	//Hp,amor,type
	int base_damage;
	
	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println(type + "이동합니다");
	}

	@Override
	void underAttact(int damage) {
		// TODO Auto-generated method stub
		//amor  -- 0  --> hp --> dead
		
		
	}
	

	
}
