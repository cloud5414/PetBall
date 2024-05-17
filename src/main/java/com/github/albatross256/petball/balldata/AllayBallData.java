package com.github.albatross256.petball.balldata;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;

/**
 * <p>
 * PetBall の {@link com.github.albatross256.petball.balldata.BallData} .<br>
 * {@link org.bukkit.entity.Allay} を捕獲するボールを構築する実装クラス.
 * </p>
 * */
public class AllayBallData extends BallData {

  /**
   * <p>
   * このボールで召喚可能なエンティティタイプ.
   * </p>
   *
   * @return {@link org.bukkit.entity.EntityType}
   * */
  @Override
  public EntityType getEntityType() {
    return EntityType.ALLAY;
  }

  /**
   * <p>
   * ボールデータに利用されるスポーンエッグ表示.
   * </p>
   *
   * @return {@link org.bukkit.Material}
   * */
  @Override
  public Material getFilledBallMaterial() {
    return Material.ALLAY_SPAWN_EGG;
  }

  /**
   * </p>
   * このボールに格納可能なエンティティタイプ.
   * </p>
   *
   * @return {@link org.bukkit.entity.EntityType}
   * */
  @Override
  public EntityType getFilledBallEntityType() {
    return EntityType.ALLAY;
  }
}