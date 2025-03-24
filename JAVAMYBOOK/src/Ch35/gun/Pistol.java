package Ch35.gun;

import Ch35.unit.Unit;

public class Pistol extends Gun{
	public Pistol(){
		this.curBullitCut=0;
		this.power=20;
		this.maxBullitCnt=10;
	}
	@Override
	public void fire(Unit unit) {
		// TODO Auto-generated method stub
		if(curBullitCut==0) {
			System.out.println("총알 : 0 재장전 필요..");
			return;
		}
		unit.underAttact(this.power);
		curBullitCut--;
	}

	@Override
	public void reload(int bullit) {
		// TODO Auto-generated method stub
		if(this.maxBullitCnt>this.curBullitCut+bullit)
			this.curBullitCut+=bullit;
		else
			this.curBullitCut=maxBullitCnt;
	}

}
