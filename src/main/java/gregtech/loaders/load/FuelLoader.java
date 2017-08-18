package gregtech.loaders.load;

import gregtech.GT_Mod;
import gregtech.api.GT_Values;
import gregtech.api.items.ItemList;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.unification.OreDictionaryUnifier;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;

public class FuelLoader implements Runnable {

    public void run() {

        ItemList.sNitricAcid = GT_Mod.gregtechproxy.addFluid("nitricacid", "Nitric acid", null, 1, 295);
        ItemList.sBlueVitriol = GT_Mod.gregtechproxy.addFluid("solution.bluevitriol", "Blue Vitriol water solution", null, 1, 295);
        ItemList.sNickelSulfate = GT_Mod.gregtechproxy.addFluid("solution.nickelsulfate", "Nickel sulfate water solution", null, 1, 295);
        ItemList.sRocketFuel = GT_Mod.gregtechproxy.addFluid("rocket_fuel", "Rocket Fuel", null, 1, 295);

        RecipeMap.SMALL_NAQUADAH_REACTOR_FUELS.recipeBuilder()
                .inputs(OreDictionaryUnifier.get(OrePrefix.bolt, Materials.Naquadah))
                .EUt((int) GT_Values.V[4])
                .duration(12)
                .buildAndRegister();

        RecipeMap.SMALL_NAQUADAH_REACTOR_FUELS.recipeBuilder()
                .inputs(OreDictionaryUnifier.get(OrePrefix.bolt, Materials.NaquadahEnriched))
                .EUt((int) GT_Values.V[4])
                .duration(18)
                .buildAndRegister();

        RecipeMap.LARGE_NAQUADAH_REACTOR_FUELS.recipeBuilder()
                .inputs(OreDictionaryUnifier.get(OrePrefix.ingot, Materials.Naquadah))
                .EUt((int) GT_Values.V[5])
                .duration(24)
                .buildAndRegister();

        RecipeMap.LARGE_NAQUADAH_REACTOR_FUELS.recipeBuilder()
                .inputs(OreDictionaryUnifier.get(OrePrefix.ingot, Materials.NaquadahEnriched))
                .EUt((int) GT_Values.V[5])
                .duration(30)
                .buildAndRegister();

        RecipeMap.FLUID_NAQUADAH_REACTOR_FUELS.recipeBuilder()
                .fluidInputs(Materials.Naquadah.getFluid(144))
                .EUt((int) GT_Values.V[6])
                .duration(42)
                .buildAndRegister();

        RecipeMap.FLUID_NAQUADAH_REACTOR_FUELS.recipeBuilder()
                .fluidInputs(Materials.NaquadahEnriched.getFluid(144))
                .EUt((int) GT_Values.V[6])
                .duration(48)
                .buildAndRegister();

    }

}