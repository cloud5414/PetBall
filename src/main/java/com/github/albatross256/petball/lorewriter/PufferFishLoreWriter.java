package com.github.albatross256.petball.lorewriter;

import java.util.List;

import org.bukkit.entity.Entity;

public class PufferFishLoreWriter extends LoreWriter {

  /**
   * Loreに表示するMobの日本語名
   */
  private static String loreMobName = "フグ";

  /**
   * コンストラクタ
   */
  public PufferFishLoreWriter() {
    super(loreMobName);
  }

  /**
   * Lore情報の作成
   *
   * @param entity Loreを作成するエンティティ情報
   */
  @Override
  public List<String> generateLore(Entity entity) {
    List<String> lore = generateCommonLore(entity);
    return lore;
  }
}
