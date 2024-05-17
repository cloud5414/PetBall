package com.github.albatross256.petball.balldata;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;

public class AxolotlBallData extends BallData {

  @Override
  public EntityType getEntityType() {
    return EntityType.AXOLOTL;
  }

  @Override
  public Material getFilledBallMaterial() {
    return Material.AXOLOTL_SPAWN_EGG;
  }

  @Override
  public EntityType getFilledBallEntityType() {
    return EntityType.AXOLOTL;
  }
}
