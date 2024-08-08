// ktlint-disable filename
@file:Suppress("ClassName")

package org.partiql.spi.fn.builtins

import org.partiql.eval.value.Datum
import org.partiql.spi.fn.Fn
import org.partiql.spi.fn.FnParameter
import org.partiql.spi.fn.FnSignature
import org.partiql.types.PType

internal object Fn_DATE_DIFF_YEAR__DATE_DATE__INT64 : Fn {

    override val signature = FnSignature(
        name = "date_diff_year",
        returns = PType.typeBigInt(),
        parameters = listOf(
            FnParameter("datetime1", PType.typeDate()),
            FnParameter("datetime2", PType.typeDate()),
        ),
        isNullCall = true,
        isNullable = false,
    )

    override fun invoke(args: Array<Datum>): Datum {
        TODO("Function date_diff_year not implemented")
    }
}

internal object Fn_DATE_DIFF_YEAR__TIMESTAMP_TIMESTAMP__INT64 : Fn {

    override val signature = FnSignature(
        name = "date_diff_year",
        returns = PType.typeBigInt(),
        parameters = listOf(
            FnParameter("datetime1", PType.typeTimestampWithoutTZ(6)),
            FnParameter("datetime2", PType.typeTimestampWithoutTZ(6)),
        ),
        isNullCall = true,
        isNullable = false,
    )

    override fun invoke(args: Array<Datum>): Datum {
        TODO("Function date_diff_year not implemented")
    }
}
