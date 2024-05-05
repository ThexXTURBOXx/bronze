package com.seacroak.bronze.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class TinRawBlock extends Block {
  public TinRawBlock() {
    super(AbstractBlock.Settings.create().strength(2.5f).sounds(BlockSoundGroup.COPPER).requiresTool());  }
}
