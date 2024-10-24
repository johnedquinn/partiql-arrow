package org.partiql.ast.v1.expr;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.jetbrains.annotations.NotNull;
import org.partiql.ast.v1.AstNode;
import org.partiql.ast.v1.AstVisitor;
import org.partiql.ast.v1.DataType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * TODO docs, equals, hashcode
 */
@Builder(builderClassName = "Builder")
@EqualsAndHashCode(callSuper = false)
public class ExprIsType extends Expr {
    @NotNull
    public final Expr value;

    @NotNull
    public final DataType type;

    public final boolean not;

    public ExprIsType(@NotNull Expr value, @NotNull DataType type, boolean not) {
        this.value = value;
        this.type = type;
        this.not = not;
    }

    @Override
    @NotNull
    public Collection<AstNode> children() {
        List<AstNode> kids = new ArrayList<>();
        kids.add(value);
        return kids;
    }

    @Override
    public <R, C> R accept(@NotNull AstVisitor<R, C> visitor, C ctx) {
        return visitor.visitExprIsType(this, ctx);
    }
}
