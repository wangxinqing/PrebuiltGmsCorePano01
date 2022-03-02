package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: aoqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoqc extends Number implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLong value;

    public aoqc() {
        this(0.0d);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.value = new AtomicLong();
        a(objectInputStream.readDouble());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(a());
    }

    public final double a() {
        return Double.longBitsToDouble(this.value.get());
    }

    public final double doubleValue() {
        return a();
    }

    public final float floatValue() {
        return (float) a();
    }

    public final int intValue() {
        return (int) a();
    }

    public final long longValue() {
        return (long) a();
    }

    public final String toString() {
        return Double.toString(a());
    }

    public aoqc(double d) {
        this.value = new AtomicLong(Double.doubleToRawLongBits(d));
    }

    public final void a(double d) {
        this.value.set(Double.doubleToRawLongBits(d));
    }
}
