package com.seacroak.bronze.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.enums.Instrument;
import net.minecraft.sound.BlockSoundGroup;

public class BronzeTrapdoor extends TrapdoorBlock {
  public BronzeTrapdoor() {
    super(BlockSetType.IRON,Settings.create().strength(3.5f).instrument(Instrument.IRON_XYLOPHONE).sounds(BlockSoundGroup.METAL).requiresTool().nonOpaque());
  }
}
