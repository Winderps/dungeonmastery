package com.fingersome.dungeonmasterycore.network;

import com.fingersome.dungeonmasterycore.DungeonMasteryCore;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;


public class PacketOpenCharacterInventory extends AbstractPacket {
	
	public PacketOpenCharacterInventory() {}
	
	public PacketOpenCharacterInventory(EntityPlayer player) {}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {}

	@Override
	public void handleClientSide(EntityPlayer player) {}

	@Override
	public void handleServerSide(EntityPlayer player) {
		player.openGui(DungeonMasteryCore.instance, DungeonMasteryCore.GuiCharacterInventory, player.worldObj, (int)player.posX, (int)player.posY, (int)player.posZ);
	}


}