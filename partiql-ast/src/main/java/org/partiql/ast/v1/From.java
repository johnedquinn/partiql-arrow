package org.partiql.ast.v1;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * TODO docs, equals, hashcode
 */
@Builder(builderClassName = "Builder")
@EqualsAndHashCode(callSuper = false)
public class From extends AstNode {
    @NotNull
    public final List<FromTableRef> tableRefs;

    public From(@NotNull List<FromTableRef> tableRefs) {
        this.tableRefs = tableRefs;
    }

    @NotNull
    @Override
    public Collection<AstNode> children() {
        return new ArrayList<>(tableRefs);
    }

    @Override
    public <R, C> R accept(@NotNull AstVisitor<R, C> visitor, C ctx) {
        return visitor.visitFrom(this, ctx);
    }
}
