import monster.Abilities;
import monster.Ability;
import monster.Action;
import monster.Actions;


public class Test {

	public static void main(String[] args) {
		Abilities abilities = new Abilities();
		Ability bruto = new Ability("bruto", "te destroza mucho");
		Ability agil = new Ability("agil", "rapido como el viento");
		Ability feo = new Ability("feo", "da mazo de asco");
		abilities.add(feo);
		abilities.add(agil);
		abilities.add(bruto);
		System.out.println(abilities);
		Actions actions = new Actions();
		Action bite = new Action("mordisco", "Ataque a mele","+4 a golpear, te tira", "7 (2d4 + 2) daño perforante");
		Action claw = new Action("Garrazo","Ataque cuerpo a cuerpo","+4 a golpear te araña hasa la saciedad", "6 (4d3) daño lacerate");
		actions.add(claw);
		actions.add(bite);
		//serialize the List
	
	}

}
