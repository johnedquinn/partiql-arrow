package org.partiql.plan.v1.operator.rex

import org.partiql.types.PType

/**
 * TODO DOCUMENTATION
 */
public interface RexStruct : Rex {

    public fun getFields(): List<Field>

    override fun getChildren(): Collection<Rex> {
        val children = mutableListOf<Rex>()
        for (field in getFields()) {
            children.add(field.getKey())
            children.add(field.getValue())
        }
        return children
    }

    override fun getType(): PType = PType.struct()

    override fun <R, C> accept(visitor: RexVisitor<R, C>, ctx: C): R = visitor.visitStruct(this, ctx)

    /**
     * TODO DOCUMENTATION
     */
    public class Field(
        private var key: Rex,
        private var value: Rex,
    ) {
        public fun getKey(): Rex = key
        public fun getValue(): Rex = value
    }
}

/**
 * Default [RexStruct] implementation intended for extension.
 */
internal class RexStructImpl(fields: List<RexStruct.Field>) : RexStruct {

    // DO NOT USE FINAL
    private var _fields = fields
    private var _children: Collection<Rex>? = null

    override fun getFields(): List<RexStruct.Field> = _fields

    override fun getChildren(): Collection<Rex> {
        if (_children == null) {
            _children = super.getChildren()
        }
        return _children!!
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RexStruct) return false
        if (_fields != other.getFields()) return false
        return true
    }

    override fun hashCode(): Int = _fields.hashCode()
}