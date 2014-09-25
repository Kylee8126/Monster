package monster.view;

import monster.controller.MonsterAppController;

public class MonsterView {

	private MonsterAppController baseController;
	
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
	}

	
	public void displayInformation()
	{
		Object JOptionPane;
		((null, String))
		JOptionPane.showMessageDialog(null,"I made this Monster");
		JOptionPane.showMessageDialog(null,"His name is "+ baseController + ((null,double) getMonster()).getName());
		
		
	}


	private Object getMonster()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
