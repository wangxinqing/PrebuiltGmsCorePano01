package defpackage;

import sun.misc.Unsafe;

/* renamed from: aufn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aufn extends aufo {
    public aufn(Unsafe unsafe) {
        super(unsafe);
    }

    public final byte a(long j) {
        return this.a.getByte(j);
    }

    public final boolean b(Object obj, long j) {
        return this.a.getBoolean(obj, j);
    }

    public final float c(Object obj, long j) {
        return this.a.getFloat(obj, j);
    }

    public final double d(Object obj, long j) {
        return this.a.getDouble(obj, j);
    }

    public final byte a(Object obj, long j) {
        return this.a.getByte(obj, j);
    }

    public final void a(long j, byte b) {
        this.a.putByte(j, b);
    }

    public final void a(long j, byte[] bArr, long j2) {
        this.a.copyMemory((Object) null, j, bArr, aufp.d, j2);
    }

    public final void a(Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    public final void a(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    public final void a(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }

    public final void a(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    public final void a(byte[] bArr, long j, long j2, long j3) {
        this.a.copyMemory(bArr, aufp.d + j, (Object) null, j2, j3);
    }
}
