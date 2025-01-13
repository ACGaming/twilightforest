package twilightforest.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import twilightforest.client.ModelRegisterCallback;

public class ItemTFIronwoodAxe extends ItemAxe implements ModelRegisterCallback {

	protected ItemTFIronwoodAxe(Item.ToolMaterial material) {
		super(material, 6F + material.getAttackDamage(), material.getEfficiency() * 0.05f - 3.4f);
		this.setCreativeTab(TFItems.creativeTab);
	}
}
