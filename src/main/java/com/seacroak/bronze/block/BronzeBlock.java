package com.seacroak.bronze.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.enums.Instrument;
import net.minecraft.sound.BlockSoundGroup;

public class BronzeBlock extends Block {
  public BronzeBlock() {
    super(AbstractBlock.Settings.create().strength(3.5f).instrument(Instrument.IRON_XYLOPHONE).sounds(BlockSoundGroup.METAL).requiresTool());
  }
}
