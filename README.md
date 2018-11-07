# fuldawarfare

#Alpha 0.1:

NPC interface.

	Private int[3] goalPos
	
	Private ??? model
	
	Private ??? texture

	Public void setGoalPos(int x, int y, int z)
	
	Public void setOwnUnit(Unit u)
	
	Public void checkUpkeep()

Soldier extends Entity implements NPC

	//However MC handles gear
	
	//really not sure how to do MC AI either

Unit class
	Private Soldier templateSoldier
	
	Private int maxTroops //stored separately so we know how many to add for healing
	
	Private Soldier[] troops
	
	Private Ability[] abilities
	
	Private String[] formations //permitted formations
	
	Private FormationUnit[] curFormation

	Public void Unit(Soldier s, int m, Ability[] a, Formation[] f) //m is maxTroops
	
	Public void changeFormation(String f) //if F is in formations, change curFormation
	
	Public void useAbility(Ability a) //similar
	
	Public void soldierDies(soldier s) //called by the soldier when it dies to update troops
	
	Public void checkUpkeep()
	
Formation class
	Private int numTroops()
	
	Private FormationUnit[] formation

	Public void Formation(int numTroops)\

	Public FormationUnit[] rectangle(int depth, float dispersion) //line or column
	
	Public FormationUnit[] square(bool hollow) //like rectangle but faces outwards
	
	Public FormationUnit[] wedge(float dispersion) //For charging

FormationUnit class
	Private float distance
	
	Private float angle
	
	Private float facing

	Public void FormationUnit(float d, float a)
	
	Public float getDistance()
	
	Public float getAngle()
	
	Public float getFacing()
	

Ability interface //unsure how to implement

#Alpha 0.2:

#Alpha 0.3:


Long Term Plans:

Factions 

Diplomacy, Marriage, and Inheritance

NPC armies and factions

Scores - Renown, Reputation, etc

Special units - heroes, fliers, undead armies (fight worse but no upkeep), mod tie-ins

Convoys etc

Siege Engines

Bodies (stacking, looting, slowing down armies)

Weather (add potion effects slowing down etc when standing in rain)

Fire arrows?

A strategic map allowing you to order construction of buildings and move armies from afar

Cultures

NPC characters

Tech

Laws

Internal structure


