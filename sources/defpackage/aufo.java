package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: aufo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class aufo {
    final Unsafe a;

    public aufo(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract byte a(long j);

    public abstract byte a(Object obj, long j);

    public final int a(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public abstract void a(long j, byte b);

    public abstract void a(long j, byte[] bArr, long j2);

    public abstract void a(Object obj, long j, byte b);

    public abstract void a(Object obj, long j, double d);

    public abstract void a(Object obj, long j, float f);

    public abstract void a(Object obj, long j, boolean z);

    public abstract void a(byte[] bArr, long j, long j2, long j3);

    public final void b(Class cls) {
        this.a.arrayIndexScale(cls);
    }

    public abstract boolean b(Object obj, long j);

    public abstract float c(Object obj, long j);

    public abstract double d(Object obj, long j);

    public final int e(Object obj, long j) {
        return this.a.getInt(obj, j);
    }

    public final long f(Object obj, long j) {
        return this.a.getLong(obj, j);
    }

    public final Object g(Object obj, long j) {
        return this.a.getObject(obj, j);
    }

    public final long a(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public final void a(Object obj, long j, int i) {
        this.a.putInt(obj, j, i);
    }

    public final void a(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }

    public final void a(Object obj, long j, Object obj2) {
        this.a.putObject(obj, j, obj2);
    }
}
