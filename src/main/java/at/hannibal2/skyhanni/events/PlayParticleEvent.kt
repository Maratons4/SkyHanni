package at.hannibal2.skyhanni.events

import at.hannibal2.skyhanni.utils.LorenzVec
import net.minecraft.util.EnumParticleTypes
import net.minecraftforge.fml.common.eventhandler.Cancelable

@Cancelable
class PlayParticleEvent(
    val type: EnumParticleTypes,
    val location: LorenzVec,
    val count: Int,
    val speed: Float,
    val offset: LorenzVec,
    val particleArgs: IntArray
) : LorenzEvent()