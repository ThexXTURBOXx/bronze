package com.seacroak.bronze.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class TinBlock extends Block {
  public TinBlock() {
    super(AbstractBlock.Settings.create().strength(2.5f).sounds(BlockSoundGroup.COPPER).requiresTool());  }
}
