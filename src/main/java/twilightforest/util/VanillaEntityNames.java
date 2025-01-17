package twilightforest.util;

import net.minecraft.util.ResourceLocation;

public class VanillaEntityNames {

	public static final ResourceLocation PIG           = prefix("pig");
	public static final ResourceLocation SHEEP         = prefix("sheep");
	public static final ResourceLocation COW           = prefix("cow");
	public static final ResourceLocation CHICKEN       = prefix("chicken");
	public static final ResourceLocation RABBIT        = prefix("rabbit");
	public static final ResourceLocation PARROT        = prefix("parrot");
	public static final ResourceLocation WOLF          = prefix("wolf");

	public static final ResourceLocation VILLAGER      = prefix("villager");

	public static final ResourceLocation BAT           = prefix("bat");

	public static final ResourceLocation CAVE_SPIDER   = prefix("cave_spider");
	public static final ResourceLocation SPIDER        = prefix("spider");
	public static final ResourceLocation ZOMBIE        = prefix("zombie");
	public static final ResourceLocation SKELETON      = prefix("skeleton");
	public static final ResourceLocation BLAZE         = prefix("blaze");
	public static final ResourceLocation ZOMBIE_PIGMAN = prefix("zombie_pigman");
	public static final ResourceLocation WITCH         = prefix("witch");
	public static final ResourceLocation CREEPER       = prefix("creeper");
	public static final ResourceLocation SILVERFISH    = prefix("silverfish");
	public static final ResourceLocation IRON_GOLEM    = prefix("iron_golem");
	public static final ResourceLocation SLIME         = prefix("slime");
	public static final ResourceLocation GHAST         = prefix("ghast");
	public static final ResourceLocation SNOW_GOLEM    = prefix("snow_golem");
	public static final ResourceLocation VEX           = prefix("vex");

	private static ResourceLocation prefix(String path) {
		return new ResourceLocation("minecraft", path);
	}
}
