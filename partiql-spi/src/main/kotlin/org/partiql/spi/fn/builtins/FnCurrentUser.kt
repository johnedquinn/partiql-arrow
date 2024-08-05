// ktlint-disable filename
@file:Suppress("ClassName")

package org.partiql.spi.fn.builtins

import org.partiql.spi.fn.Fn
import org.partiql.spi.fn.FnSignature
import org.partiql.value.PartiQLValue
import org.partiql.value.PartiQLValueExperimental
import org.partiql.value.PartiQLValueType.STRING

@OptIn(PartiQLValueExperimental::class)
internal object Fn_CURRENT_USER____STRING : Fn {

    override val signature = FnSignature(
        name = "current_user",
        returns = STRING,
        parameters = listOf(),
        isNullCall = false,
        isNullable = true,
    )

    override fun invoke(args: Array<PartiQLValue>): PartiQLValue {
        TODO("Function current_user not implemented")
    }
}