
public class test2 {
	
	public static void main(String[] caca){
		Monster lobo = new Monster();
		lobo.setAc("13 (armadura natural)");
		lobo.setAlignement("no alineado");
		lobo.setCha(12);
		lobo.setCon(12);
		lobo.setCr("1/4");
		lobo.setDex(15);
		lobo.setHd("2d8 + 2");
		lobo.setHp(11);
		lobo.setId("wolf");
		lobo.setImgPath("../images/characers/wolf.png");
		lobo.setIntel(3);
		lobo.setName("lobo");
		lobo.setSize("mediano");
		lobo.setSpeed("40 ft.");
		lobo.setStr(12);
		lobo.setType("bestia");
		lobo.setWis(12);
		lobo.setXp(50);
		Abilities abilities = new Abilities();
		abilities.add(new Ability("olfato y oido", "oye y huele like a baus"));
		abilities.add(new Ability("tacticas de manada", "wolves before whores"));
		lobo.setAbilities(abilities);
		Actions actions = new Actions();
		actions.add(new Action("mordisco", "cac", "ñamñam", "20 daño gastrico"));
		actions.add(new Action("meada", "pac", "puaaajjjj", "100 daño asqueroso"));
		lobo.setActions(actions);
		Details details = new Details();
		details.add(new Detail("habilidades", "hambe + 2, meada + 5"));
		details.add(new Detail("sentidos", "Intuicion perruna 16"));
		details.add(new Detail("idiomas", "---"));
		lobo.setDetails(details);
		System.out.println(lobo);
	}
}
