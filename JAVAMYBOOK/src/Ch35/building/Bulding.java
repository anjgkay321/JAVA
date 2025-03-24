package Ch35.building;

import Ch35.unit.Unit;

public abstract class  Bulding {
	public int hp;
	public int sheld;
	public int amor;
	public boolean isDestroyed;
	//건물짓기
	abstract void BuildStructure();
	//공격당함
	void underAttack(int damage) {
		// sheld --> amor --> hp
		if(sheld-damage >0)
			this.sheld -=damage;
		else if(amor -(damage-sheld) > 0) {
			amor = amor-(damage-sheld);
			sheld =0;
		}else {
			hp=0;
			amor=0;
			isDestroyed=false;
			System.out.println( "건물이 붕괴되었습니다.");
		}
	};
	
}
