// ktlint-disable filename
@file:Suppress("ClassName")

package org.partiql.spi.fn.builtins

import org.partiql.eval.value.Datum
import org.partiql.spi.fn.Fn
import org.partiql.spi.fn.FnParameter
import org.partiql.spi.fn.FnSignature
import org.partiql.spi.fn.utils.StringUtils.codepointTrimLeading
import org.partiql.types.PType

internal object Fn_TRIM_LEADING__STRING__STRING : Fn {

    override val signature = FnSignature(
        name = "trim_leading",
        returns = PType.string(),
        parameters = listOf(FnParameter("value", PType.string())),
        isNullCall = true,
        isNullable = false,
    )

    override fun invoke(args: Array<Datum>): Datum {
        val value = args[0].string
        val result = value.codepointTrimLeading()
        return Datum.string(result)
    }
}

internal object Fn_TRIM_LEADING__SYMBOL__SYMBOL : Fn {

    override val signature = FnSignature(
        name = "trim_leading",
        returns = PType.symbol(),
        parameters = listOf(FnParameter("value", PType.symbol())),
        isNullCall = true,
        isNullable = false,
    )

    override fun invoke(args: Array<Datum>): Datum {
        val value = args[0].string
        val result = value.codepointTrimLeading()
        return Datum.symbol(result)
    }
}

internal object Fn_TRIM_LEADING__CLOB__CLOB : Fn {

    override val signature = FnSignature(
        name = "trim_leading",
        returns = PType.clob(Int.MAX_VALUE),
        parameters = listOf(FnParameter("value", PType.clob(Int.MAX_VALUE))),
        isNullCall = true,
        isNullable = false,
    )

    override fun invoke(args: Array<Datum>): Datum {
        val string = args[0].bytes.toString(Charsets.UTF_8)
        val result = string.codepointTrimLeading()
        return Datum.clob(result.toByteArray())
    }
}