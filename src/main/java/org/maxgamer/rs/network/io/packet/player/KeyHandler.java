package org.maxgamer.rs.network.io.packet.player;

import org.maxgamer.rs.model.entity.mob.persona.player.Player;
import org.maxgamer.rs.network.io.packet.PacketProcessor;
import org.maxgamer.rs.network.io.packet.RSIncomingPacket;

/**
 * @author netherfoam
 */
public class KeyHandler implements PacketProcessor<Player> {
    @Override
    public void process(Player c, RSIncomingPacket p) throws Exception {
        //Opcode 26, 3 bytes
    }
}