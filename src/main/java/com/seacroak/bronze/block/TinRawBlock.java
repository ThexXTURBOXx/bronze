package com.seacroak.bronze.block;

import net.minecraft.block.Block;
import net.minecraft.block.enums.NoteBlockInstrument;

public class TinRawBlock extends Block {
  public TinRawBlock() {
    super(Settings.create().strength(2.5f).instrument(NoteBlockInstrument.BASEDRUM).requiresTool());  }
}
