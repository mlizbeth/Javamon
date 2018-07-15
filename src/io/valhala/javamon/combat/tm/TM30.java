package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM30 extends CombatAbility {

	public TM30() {
		super.name = "Teleport";
		super.type = AbilityType.PSYCHIC;
		super.category = AbilityCategory.STATUS;
		super.power = (int) 0;
		super.accuracy = (float) 0.0;
		super.pp = (int) 20;
		super.effect = "?";
	}
}
