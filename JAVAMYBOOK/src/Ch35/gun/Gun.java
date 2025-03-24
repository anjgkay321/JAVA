package Ch35.gun;

import Ch35.unit.Unit;

public abstract class Gun {
	int maxBullitCnt;
	int curBullitCut;
	int power;
	
	public abstract void fire(Unit nuit);
	public abstract void reload(int bullit);
}
