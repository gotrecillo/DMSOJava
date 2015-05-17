package monster;
import java.io.Serializable;


public class Monster implements Comparable<Monster>, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4175209997951903246L;
	private String id, name, size, type, alignement, acType, hd, cr, imgPath;
	private int hp, ac, speed, str, dex, con, intel, wis, cha, xp;
	private Details details;
	private Abilities abilities;
	private Actions actions;
	
	public Monster(){
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAlignement() {
		return alignement;
	}
	public void setAlignement(String alignement) {
		this.alignement = alignement;
	}
	public int getAc() {
		return ac;
	}
	public void setAc(int ac) {
		this.ac = ac;
	}
	public String getAcType() {
		return acType;
	}
	public void setAcType(String acType) {
		this.acType = acType;
	}
	public String getHd() {
		return hd;
	}
	public void setHd(String hd) {
		this.hd = hd;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getCr() {
		return cr;
	}
	public void setCr(String cr) {
		this.cr = cr;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getStr() {
		return str;
	}
	public void setStr(int str) {
		this.str = str;
	}
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	public int getCon() {
		return con;
	}
	public void setCon(int con) {
		this.con = con;
	}
	public int getIntel() {
		return intel;
	}
	public void setIntel(int intel) {
		this.intel = intel;
	}
	public int getWis() {
		return wis;
	}
	public void setWis(int wis) {
		this.wis = wis;
	}
	public int getCha() {
		return cha;
	}
	public void setCha(int cha) {
		this.cha = cha;
	}
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	public Details getDetails() {
		return details;
	}
	public void setDetails(Details details) {
		this.details = details;
	}
	public Abilities getAbilities() {
		return abilities;
	}
	public void setAbilities(Abilities abilities) {
		this.abilities = abilities;
	}
	public Actions getActions() {
		return actions;
	}
	public void setActions(Actions actions) {
		this.actions = actions;
	}
	
	
	@Override
	public String toString() {
		String s = "  <monster id=\"" + id + ">\n";
		s += "    <name>" + name + "</name>\n";
		s += "    <size>" + size + "</size>\n";
		s += "    <type>" + type + "</type>\n";
		s += "    <alignement>" + alignement + "</alignement>\n";
		s += "    <ac>" + ac + " " +  acType + "</ac>\n";
		s += "    <hp>" + hp + "</hp>\n";
		s += "    <speed>" + speed + "</speed>\n";
		s += "    <str>" + str + "</str>\n";
		s += "    <dex>" + dex + "</dex>\n";
		s += "    <con>" + con + "</con>\n";
		s += "    <int>" + intel + "</int>\n";
		s += "    <wis>" + wis + "</wis>\n";
		s += "    <cha>" + cha + "</cha>\n";
		s += details.toString();
		s += "    <cr>" + cr + "</cr>\n";
		s += "    <xp>" + xp + "</xp>\n";
		s += abilities.toString();
		s += actions.toString();
		s += "  </monster>\n";
		return s;
	}
	
	@Override
	public int compareTo(Monster m) {
		return this.id.compareTo(m.id);
	}

}
