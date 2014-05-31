package com.fingersome.dungeonmastery.lib;

public class CharacterInfo
{
	
public static final String STAT_CATAGORY_TRAITS = "CHARACTER TRAITS";

	public static final int STAT_TRAIT_LEVEL_DEFAULT = 1;
	public static final int STAT_TRAIT_LEVEL_MIN = 1;
	public static final int STAT_TRAIT_LEVEL_PARAGON = 11;
	public static final int STAT_TRAIT_LEVEL_EPIC = 21;
	public static int STAT_TRAIT_LEVEL;
	public static final int[] STAT_TRAIT_EXP_PERLEVEL = {0, 1000, 2250, 3750, 5500, 7500, 10000, 13000, 16500, 20500, 
															26500, 32000, 39000, 47000, 57000, 69000, 83000, 99000,
															119000, 143000, 175000, 210000, 255000, 310000, 375000, 
															450000, 550000,	675000, 825000, 1000000};
	public static int STAT_TRAIT_EXP;
	
	public static final String[] STAT_TRAIT_RACES = {"Human", "Elf", "Dwarf", "Gnome", "Halfling", "Pixie", "Half-Elf",
														"Half-Orc", "Dragonborn", "Tiefling", "Warforged"};
	public static String STAT_TRAIT_RACE;
	public static String[] STAT_TRAIT_CREATURETYPES = {"Ancient", "Animal","Aberrant", "Celestial", "Construct", "Dragon", 
														"Elemental", "Fey", "Fiend", "Giant", "Humanoid", 
														"Magical Beast", "Monstrous Creature", "Ooze", "Outsider", 
														"Plant", "Undead", "Vermin"};
	public static String STAT_TRAIT_CREATURETYPE;
	
	public static final String[] STAT_TRAIT_CLASSES = {"Fighter", "Rogue", "Ranger", "Monk", "Warlord", "Bard",
														"Wizard", "Sorcerer", "Druid", "Warlock", "Cleric", "Paladin"};
	public static String STAT_TRAIT_CLASS;
	
	public static final int STAT_TRAIT_ALIGNMENT_MORAL_DEFAULT = 0;
	public static final int STAT_TRAIT_ALIGNMENT_MORAL_MIN = -100;
	public static final int STAT_TRAIT_ALIGNMENT_MORAL_MAX = 100;
	public static final int STAT_TRAIT_ALIGNMENT_LEGAL_DEFAULT = 0;
	public static final int STAT_TRAIT_ALIGNMENT_LEGAL_MIN = -100;
	public static final int STAT_TRAIT_ALIGNMENT_LEGAL_MAX = 100;
	
	
public static final String STAT_CATAGORY_ABILITY = "ABILITY SCORES";

	public static final int STAT_ABILITY_DEFAULT = 10;
	public static final int STAT_ABLITY_MIN = 1;
	public static final int STAT_ABILITY_MAX = 20;
	
	public static int STAT_ABILITY_STRENGTH;
	public static int STAT_ABILITY_DEXTERITY;
	public static int STAT_ABILITY_CONSTITUTION;
	public static int STAT_ABILITY_INTELLECT;
	public static int STAT_ABILITY_WISDOM;
	public static int STAT_ABILITY_CHARISMA;
	
	public static int STAT_MODIFIER_STRENGTH;
	public static int STAT_MODIFIER_DEXTERITY;
	public static int STAT_MODIFIER_CONSTITUTION;
	public static int STAT_MODIFIER_INTELLECT;
	public static int STAT_MODIFIER_WISDOM;
	public static int STAT_MODIFIER_CHARISMA;
	
public static final String STAT_CATAGORY_DEFENSES = "DEFENSES";

	public static int STAT_DEFENSE_HEALTH_BASE;
	public static int STAT_DEFENSE_HEALTH_TOTAL;
	public static int STAT_DEFENSE_HEALTH_PERLEVEL;
	public static int STAT_DEFENSE_HEALTH_BLOODIED;
	public static int STAT_DEFENSE_HEALTH;
	
	public static int STAT_DEFENSES_DEFAULT = 0;
	
	public static int STAT_DEFENSE_ARMOR;
	public static int STAT_DEFENSE_REFLEXES;
	public static int STAT_DEFENSE_FORTITUDE;
	public static int STAT_DEFENSE_WILLPOWER;
	public static int STAT_DEFENSE_DEATH;

	public static int STAT_DEFENSE_RESIST_AIR;
	public static int STAT_DEFENSE_RESIST_EARTH;
	public static int STAT_DEFENSE_RESIST_FIRE;
	public static int STAT_DEFENSE_RESIST_WATER;
	public static int STAT_DEFENSE_RESIST_RADIENT;
	public static int STAT_DEFENSE_RESIST_NECROTIC;
	public static int STAT_DEFENSE_RESIST_ARCANE;
	public static int STAT_DEFENSE_RESIST_NATURE;
	public static int STAT_DEFENSE_RESIST_PSYCHIC;
	public static int STAT_DEFENSE_RESIST_PHYSICAL;
	
public static final String STAT_CATAGORY_SKILLS = "SKILLS";
	
	public static final int STAT_SKILL_DEFAULT = 0;
	public static final int STAT_SKILL_TRAINING_BONUS = 5;
	public static boolean STAT_SKILL_TRAINED;
	public static boolean STAT_SKILL_TRAINED_DEFAULT = false;
	
	public static int STAT_SKILL_ACROBATICS;
	public static int STAT_SKILL_AGILITY;
	public static int STAT_SKILL_ARCANA;
	public static int STAT_SKILL_ATHLETICS;
	public static int STAT_SKILL_BLUFF;
	public static int STAT_SKILL_DIPLOMACY;
	public static int STAT_SKILL_DUNGEONEERING;
	public static int STAT_SKILL_ENDURANCE;
	public static int STAT_SKILL_HEAL;
	public static int STAT_SKILL_HISTORY;
	public static int STAT_SKILL_INSIGHT;
	public static int STAT_SKILL_INTIMIDATE;
	public static int STAT_SKILL_NATURE;
	public static int STAT_SKILL_PERCEPTION;
	public static int STAT_SKILL_STEALTH;
	public static int STAT_SKILL_STREETWISE;
	public static int STAT_SKILL_RELIGION;
	public static int STAT_SKILL_THIEVERY;
	
}
