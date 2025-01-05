package net.hypnotica.obscura_ch1.datagen;

import net.hypnotica.obscura_ch1.Cinderfall;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Cinderfall.MOD_ID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {

    }
}
