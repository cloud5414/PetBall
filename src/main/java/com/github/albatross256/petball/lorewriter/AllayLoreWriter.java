package com.github.albatross256.petball.lorewriter;

import org.bukkit.entity.Entity;

import java.util.List;

public class AllayLoreWriter extends LoreWriter {

  private static String loreMobName = "アレイ";

  /**
   * コンストラクタ
   */
  public AllayLoreWriter() {
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
