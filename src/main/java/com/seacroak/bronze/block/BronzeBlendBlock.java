package com.seacroak.bronze.block;

import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class BronzeBlendBlock extends Block {
  public BronzeBlendBlock() {
    super(Settings.create().strength(2.5f).sounds(BlockSoundGroup.COPPER).requiresTool());  }
}
