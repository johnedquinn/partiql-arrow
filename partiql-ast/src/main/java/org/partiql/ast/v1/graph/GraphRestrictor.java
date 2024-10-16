package org.partiql.ast.v1.graph;

import org.partiql.ast.v1.Enum;

/**
 * TODO docs, equals, hashcode
 */
public class GraphRestrictor implements Enum {
    public static final int UNKNOWN = 0;
    public static final int TRAIL = 1;
    public static final int ACYCLIC = 2;
    public static final int SIMPLE = 3;

    public static GraphRestrictor UNKNOWN() {
        return new GraphRestrictor(UNKNOWN);
    }

    public static GraphRestrictor TRAIL() {
        return new GraphRestrictor(TRAIL);
    }

    public static GraphRestrictor ACYCLIC() {
        return new GraphRestrictor(ACYCLIC);
    }

    public static GraphRestrictor SIMPLE() {
        return new GraphRestrictor(SIMPLE);
    }

    private final int code;

    private GraphRestrictor(int code) {
        this.code = code;
    }

    @Override
    public int code() {
        return code;
    }
}