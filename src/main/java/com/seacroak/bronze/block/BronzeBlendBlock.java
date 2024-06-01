package com.seacroak.bronze.block;

import net.minecraft.block.Block;
import net.minecraft.block.enums.NoteBlockInstrument;

public class BronzeBlendBlock extends Block {
  public BronzeBlendBlock() {
    super(Settings.create().strength(2.5f).instrument(NoteBlockInstrument.BASEDRUM).requiresTool());  }
}
