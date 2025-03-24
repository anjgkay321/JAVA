package Ch35.gun;

import Ch35.unit.Unit;

public class Rifle extends Gun{
	public Rifle(){
		this.maxBullitCnt=100;
		this.power=30;
		this.curBullitCut=0;
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
