package mc.nugget;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class McNuggetsLOL {

    public static final McNuggetItem MC_NUGGET = new McNuggetItem(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.EPIC));

    public static void registerNuggets() {
        Registry.register(Registry.ITEM, new Identifier("mcnugget", "mc_nugget"), MC_NUGGET);
    }
}
