// ktlint-disable filename
@file:Suppress("ClassName")

package org.partiql.spi.function.builtins

import org.partiql.spi.function.Parameter
import org.partiql.spi.types.PType
import org.partiql.spi.utils.FunctionUtils
import org.partiql.spi.value.Datum

internal val Fn_IS_BAG__ANY__BOOL = FunctionUtils.hidden(
    name = "is_bag",
    returns = PType.bool(),
    parameters = arrayOf(Parameter("value", PType.dynamic())),
) { args ->
    Datum.bool(args[0].type.code() == PType.BAG)
}
