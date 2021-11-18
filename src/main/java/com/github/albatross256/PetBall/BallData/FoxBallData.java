package com.github.albatross256.PetBall.BallData;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;

public class FoxBallData extends BallData{

	@Override
	public EntityType getEntityType() {
		return EntityType.FOX;
	}

	@Override
	public Material getFilledBallMaterial() {
		return Material.FOX_SPAWN_EGG;
	}

	@Override
	public EntityType getFilledBallEntityType() {
		return EntityType.FOX;
	}
}
