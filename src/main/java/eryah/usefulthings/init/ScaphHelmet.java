package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class ScaphHelmet extends ItemArmor {
	
	public static Item scaph_helmet;
	
    public ScaphHelmet(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setCreativeTab(UsefulthingsMod.UTTab);
        this.setUnlocalizedName("scaph_helmet");
    }
    
    public static void init(){
    	
	}
	
	public static void register()
	{
		GameRegistry.registerItem(scaph_helmet, scaph_helmet.getUnlocalizedName().substring(5));

	}
	
	public static void registerRenders()
	{
		registerRender(scaph_helmet);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
    
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {

		if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == ScaphHelmet.scaph_helmet
		        && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == ScaphChestplate.motorized_chestplate
		        && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == ScaphLeggings.airbag_leggings
		        && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == ScaphBoots.scaph_boots) {
		        this.effectPlayer(player, Potion.waterBreathing, 200);
		        if(player.isInWater()) {
		        	this.effectPlayer(player, Potion.nightVision, 200);
		        }
		}
		
	}   
    
	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
	    //Always effect for 8 seconds, then refresh
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
	        player.addPotionEffect(new PotionEffect(potion.id, 159, amplifier, true, true));
	}
    
    
}