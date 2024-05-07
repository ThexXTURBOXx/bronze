package com.seacroak.bronze.block;

import net.minecraft.block.Block;
import net.minecraft.block.enums.Instrument;
import net.minecraft.sound.BlockSoundGroup;

public class BronzeBlendBlock extends Block {
  public BronzeBlendBlock() {
    super(Settings.create().strength(2.5f).instrument(Instrument.BASEDRUM).requiresTool());  }
}
