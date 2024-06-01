package com.seacroak.bronze.block;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.sound.BlockSoundGroup;

public class BronzeDoor extends DoorBlock {
  public BronzeDoor() {
    super(BlockSetType.IRON,Settings.create().strength(3.5f).instrument(NoteBlockInstrument.IRON_XYLOPHONE).sounds(BlockSoundGroup.METAL).requiresTool());
  }
}
