package org.drools.minecraft.util;

import org.drools.minecraft.model.DroolsPlayer;
import java.util.EnumSet;

import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;

/**
 * 
 * Stub class. Used by drools to request actions from minecraft.
 * @author Samuel
 *
 */
public class DroolsCommandInterface
{
	//TODO: complete list for rule-writer reference
	public static final int potionSpeed = Potion.moveSpeed.id;
	public static final int potionSlow = Potion.moveSlowdown.id;
	public static final int potionRegen = Potion.regeneration.id;
	public static final int potionSaturation = Potion.saturation.id;
	
	//TODO: make a complete block list for rule-writer reference, so that they don't have to go through minecraft's blocks.
	
	
	
	
	/**
	 * Stub function.
	 * @param player
	 * @param x
	 * @param y
	 * @param z
	 */
	public static void movePlayer(DroolsPlayer player, int x, int y, int z)
	{
		//TODO: NOT IMPLEMENTED!
	}
	
	public static void sendChat(String chat)
	{
            //TODO: NOT IMPLEMENTED
		/*if(RulesDriver.world.playerEntities.size() > 0)
		{
			RulesDriver.world.playerEntities.get(0).addChatMessage(new ChatComponentText(chat));
		}*/
	}
	
	public static void spawnEntity(String entityid, int x, int y, int z)
	{
            //TODO: NOT IMPLEMENTED
		/*Entity entity = EntityList.createEntityByName(entityid, RulesDriver.world);
		entity.setLocationAndAngles(x, y, z,0.0F, 0.0F);
		RulesDriver.world.spawnEntityInWorld(entity);*/
	}
	
	public static void enchantEntity(EntityLiving entity, int potion, int duration, int strength)
	{
		//TODO: NOT IMPLEMENTED
                //entity.addPotionEffect(new PotionEffect(potion, duration, strength));
	}
	
	public static void enchantEntity(EntityPlayer entity, int potion, int duration, int strength)
	{
            //TODO: NOT IMPLEMENTED
		//entity.addPotionEffect(new PotionEffect(potion, duration, strength));
	}
	
	public static boolean blockMatches(int x, int y, int z, BlockState match)
	{
            //TODO: NOT IMPLEMENTED
            return false;
		//IBlockState state = RulesDriver.world.getBlockState(new BlockPos(x, y, z));
		//System.out.println(state);
		//return match.getBlock().isAssociatedBlock(state.getBlock());
		//entity.addPotionEffect(new PotionEffect(potion, duration, strength));
	}

}