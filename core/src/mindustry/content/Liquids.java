package mindustry.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;

public class Liquids implements ContentList{
    public static Liquid water, slag, oil, cryofluid, neoplasm,
    gallium,
    ozone, hydrogen, cyanogen;

    @Override
    public void load(){

        water = new Liquid("water", Color.valueOf("596ab8")){{
            heatCapacity = 0.4f;
            alwaysUnlocked = true;
            effect = StatusEffects.wet;
            boilPoint = 0.5f;
            gasColor = Color.grays(0.9f);
        }};

        slag = new Liquid("slag", Color.valueOf("ffa166")){{
            temperature = 1f;
            viscosity = 0.7f;
            effect = StatusEffects.melting;
            lightColor = Color.valueOf("f0511d").a(0.4f);
        }};

        oil = new Liquid("oil", Color.valueOf("313131")){{
            viscosity = 0.75f;
            flammability = 1.2f;
            explosiveness = 1.2f;
            heatCapacity = 0.7f;
            barColor = Color.valueOf("6b675f");
            effect = StatusEffects.tarred;
            boilPoint = 0.65f;
            gasColor = Color.grays(0.4f);
        }};

        cryofluid = new Liquid("cryofluid", Color.valueOf("6ecdec")){{
            heatCapacity = 0.9f;
            temperature = 0.25f;
            effect = StatusEffects.freezing;
            lightColor = Color.valueOf("0097f5").a(0.2f);
            boilPoint = 0.55f;
            gasColor = Color.valueOf("c1e8f5");
        }};

        neoplasm = new CellLiquid("neoplasm", Color.valueOf("e05438")){{
            heatCapacity = 0.4f;
            temperature = 0.54f;
            viscosity = 0.85f;
            flammability = 0.1f;
            capPuddles = false;

            colorFrom = Color.valueOf("f98f4a");
            colorTo = Color.valueOf("9e172c");
        }};

        //TODO I have doubts about this liquid's usefulness
        gallium = new Liquid("gallium", Color.valueOf("9a9dbf")){{

        }};

        //TODO reactivity, etc
        ozone = new Liquid("ozone", Color.valueOf("f099da")){{
            gas = true;
            barColor = Color.valueOf("d699f0");
            explosiveness = 1f;
            flammability = 1f;
        }};

        //TODO combustion
        hydrogen = new Liquid("hydrogen", Color.valueOf("b8c2fc")){{
            gas = true;
            barColor = Color.valueOf("a3b0ff");
            flammability = 1f;
        }};

        cyanogen = new Liquid("cyanogen", Color.valueOf("6fd5d5")){{
            gas = true;
            barColor = Color.valueOf("6fd5d5");
            flammability = 2f;
        }};

        //TODO dicyanoacetylene vs cyanogen

        //TODO molten lead (maybe)
    }
}
