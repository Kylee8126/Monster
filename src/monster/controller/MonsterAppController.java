package monster.controller;

import monster.model.MarshmallowMonster;
import monster.view.MonsterView;

public class MonsterAppController 
{
	private MonsterView myAppview;
	private MarshmallowMonster myMonster;
	
	public MonsterAppController()
	{
		myAppview = new MonsterView();
		myMonster = new MarshmallowMonster("Teddy", 4.0, 3.0, 5, 1, 1, true);
		
	}
	public void start()
	{
		myAppview.displayInformation();
		
	}
	
}
