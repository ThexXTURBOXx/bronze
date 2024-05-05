package com.seacroak.bronze.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class BronzeBlock extends Block {
  public BronzeBlock() {
    super(AbstractBlock.Settings.create().strength(2.5f).sounds(BlockSoundGroup.COPPER).requiresTool());
  }
}
