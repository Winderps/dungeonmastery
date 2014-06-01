package com.fingersome.dungeonmastery.lib;

public class CharacterInfo
{
	
public static final String STAT_CATAGORY_TRAITS = "CHARACTER TRAITS";

	public static final int STAT_TRAIT_LEVEL_DEFAULT = 1;
	public static final int STAT_TRAIT_LEVEL_MIN = 1;
	public static final int STAT_TRAIT_LEVEL_PARAGON = 11;
	public static final int STAT_TRAIT_LEVEL_EPIC = 21;
	public static final int[] STAT_TRAIT_EXP_PERLEVEL = {0, 1000, 2250, 3750, 5500, 7500, 10000, 13000, 16500, 20500, 
															26500, 32000, 39000, 47000, 57000, 69000, 83000, 99000,
															119000, 143000, 175000, 210000, 255000, 310000, 375000, 
															450000, 550000,	675000, 825000, 1000000};
	
	public static final String[] STAT_TRAIT_RACES = {"Human", "Elf", "Dwarf", "Gnome", "Halfling", "Pixie", "Half-Elf",
														"Half-Orc", "Dragonborn", "Tiefling", "Warforged"};
	public static String[] STAT_TRAIT_CREATURETYPES = {"Ancient", "Animal","Aberrant", "Celestial", "Construct", "Dragon", 
														"Elemental", "Fey", "Fiend", "Giant", "Humanoid", 
														"Magical Beast", "Monstrous Creature", "Ooze", "Outsider", 
														"Plant", "Undead", "Vermin"};
	
	public static final String[] STAT_TRAIT_CLASSES = {"Fighter", "Rogue", "Ranger", "Monk", "Warlord", "Bard",
														"Wizard", "Sorcerer", "Druid", "Warlock", "Cleric", "Paladin"};
	
	public static final int[] STAT_TRAIT_CLASSES_BASE_HEALTH = {10, 12, 15, 17};
	
	public static final int STAT_TRAIT_ALIGNMENT_MORAL_DEFAULT = 0;
	public static final int STAT_TRAIT_ALIGNMENT_MORAL_MIN = -100;
	public static final int STAT_TRAIT_ALIGNMENT_MORAL_MAX = 100;
					
	
	public static final int STAT_TRAIT_ALIGNMENT_LEGAL_DEFAULT = 0;
	public static final int STAT_TRAIT_ALIGNMENT_LEGAL_MIN = -100;
	public static final int STAT_TRAIT_ALIGNMENT_LEGAL_MAX = 100;
	
	
public static final String STAT_CATAGORY_ABILITY = "ABILITY SCORES";

	public static final int STAT_ABLITY_MIN = 1;
	public static final int STAT_ABILITY_MAX = 20;
	public static final int STAT_ABILITY_DEFAULT = 0;
	
	
public static final String STAT_CATAGORY_DEFENSES = "DEFENSES";
	
	public static final int STAT_DEFENSES_DEFAULT = 0;
	public static final int[] STAT_DEFENSES_HEALTH_PERLEVEL = {4, 5, 6, 7};
	
	
public static final String STAT_CATAGORY_SKILLS = "SKILLS";


	public static int STAT_SKILL_POINTS_DEFAULT;

	public static final int STAT_SKILL_DEFAULT = 0;
	public static final int STAT_SKILL_TRAINING_BONUS = 5;
	public static final boolean STAT_SKILL_TRAINED_DEFAULT = false;
	
}
