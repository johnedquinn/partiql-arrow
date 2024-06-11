package org.partiql.eval.value;

import org.jetbrains.annotations.NotNull;
import org.partiql.types.PType;
import org.partiql.value.datetime.Date;
import org.partiql.value.datetime.Time;
import org.partiql.value.datetime.Timestamp;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

/**
 * This shall always be package-private (internal).
 */
class DatumNull implements Datum {

    @NotNull
    private final PType _type;

    DatumNull() {
        this._type = PType.typeUnknown();
    }

    DatumNull(@NotNull PType type) {
        this._type = type;
    }

    @Override
    public boolean isNull() {
        return true;
    }

    @NotNull
    @Override
    public PType getType() {
        return _type;
    }

    @Override
    public boolean getBoolean() {
        if (_type.getKind() == PType.Kind.BOOL) {
            throw new NullPointerException();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public short getShort() {
        if (_type.getKind() == PType.Kind.SMALLINT) {
            throw new NullPointerException();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public int getInt() {
        if (_type.getKind() == PType.Kind.INT) {
            throw new NullPointerException();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public long getLong() {
        if (_type.getKind() == PType.Kind.BIGINT) {
            throw new NullPointerException();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @NotNull
    @Override
    public BigInteger getBigInteger() {
        if (_type.getKind() == PType.Kind.INT_ARBITRARY) {
            throw new NullPointerException();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @NotNull
    @Override
    public BigDecimal getBigDecimal() {
        if (_type.getKind() == PType.Kind.DECIMAL || _type.getKind() == PType.Kind.DECIMAL_ARBITRARY) {
            throw new NullPointerException();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public byte getByte() {
        if (_type.getKind() == PType.Kind.TINYINT) {
            throw new NullPointerException();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @NotNull
    @Override
    public byte[] getBytes() {
        if (_type.getKind() == PType.Kind.BLOB || _type.getKind() == PType.Kind.CLOB) {
            throw new NullPointerException();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @NotNull
    @Override
    public Date getDate() {
        if (_type.getKind() == PType.Kind.DATE) {
            throw new NullPointerException();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public double getDouble() {
        if (_type.getKind() == PType.Kind.DOUBLE_PRECISION) {
            throw new NullPointerException();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public float getFloat() {
        if (_type.getKind() == PType.Kind.REAL) {
            throw new NullPointerException();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Iterator<Datum> iterator() {
        if (_type.getKind() == PType.Kind.BAG || _type.getKind() == PType.Kind.LIST || _type.getKind() == PType.Kind.SEXP) {
            throw new NullPointerException();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @NotNull
    @Override
    public Iterator<Field> getFields() {
        if (_type.getKind() == PType.Kind.STRUCT) {
            throw new NullPointerException();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @NotNull
    @Override
    public String getString() {
        if (_type.getKind() == PType.Kind.STRING || _type.getKind() == PType.Kind.CHAR || _type.getKind() == PType.Kind.SYMBOL) {
            throw new NullPointerException();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @NotNull
    @Override
    public Time getTime() {
        if (_type.getKind() == PType.Kind.TIME_WITH_TZ || _type.getKind() == PType.Kind.TIME_WITHOUT_TZ) {
            throw new NullPointerException();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @NotNull
    @Override
    public Timestamp getTimestamp() {
        if (_type.getKind() == PType.Kind.TIMESTAMP_WITH_TZ || _type.getKind() == PType.Kind.TIMESTAMP_WITHOUT_TZ) {
            throw new NullPointerException();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public long getInterval() {
        throw new UnsupportedOperationException();
    }
}
