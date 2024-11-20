package org.partiql.ast.expr;

import lombok.EqualsAndHashCode;
import org.jetbrains.annotations.NotNull;
import org.partiql.ast.AstNode;
import org.partiql.ast.AstVisitor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * TODO docs, equals, hashcode
 *  Also add optional [ROW] keyword property. https://ronsavage.github.io/SQL/sql-99.bnf.html#row%20value%20constructor
 */
@lombok.Builder(builderClassName = "Builder")
@EqualsAndHashCode(callSuper = false)
public class ExprRowValue extends Expr {
    @NotNull
    public final List<Expr> values;

    public ExprRowValue(@NotNull List<Expr> values) {
        this.values = values;
    }

    @Override
    @NotNull
    public Collection<AstNode> children() {
        return new ArrayList<>(values);
    }

    @Override
    public <R, C> R accept(@NotNull AstVisitor<R, C> visitor, C ctx) {
        return visitor.visitExprRowValue(this, ctx);
    }
}