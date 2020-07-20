package by.htp.less.oop4;

import java.util.List;

import by.htp.less.oop4.LogicT;

public class Cave {

	private String name;
	private int numberOfTreasure;
	private List<Treasure> treasures;
	private LogicT treasureAction;

	public Cave(String name) {
		this.name = name;
		this.numberOfTreasure = 0;
		treasureAction = new LogicT();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfTreasure() {
		return numberOfTreasure;
	}

	public void setNumberOfTreasure(int numberOfTreasure) {
		this.numberOfTreasure = numberOfTreasure;
		this.treasures = treasureAction.fillCaveWithTreasures(numberOfTreasure);
	}

	public List<Treasure> getTreasures() {
		return treasures;
	}


}
