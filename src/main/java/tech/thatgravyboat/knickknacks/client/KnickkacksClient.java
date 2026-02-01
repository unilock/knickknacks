package tech.thatgravyboat.knickknacks.client;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import tech.thatgravyboat.knickknacks.Knickknacks;
import tech.thatgravyboat.knickknacks.client.perks.LifeNeedleClient;
import tech.thatgravyboat.knickknacks.client.perks.MinersGogglesClient;

@Mod(value = Knickknacks.MODID, dist = Dist.CLIENT)
public class KnickkacksClient {

    public KnickkacksClient() {
        NeoForge.EVENT_BUS.register(MinersGogglesClient.INSTANCE);
        NeoForge.EVENT_BUS.register(LifeNeedleClient.INSTANCE);
    }
}
