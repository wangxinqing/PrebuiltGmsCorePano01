package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: aufm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aufm extends aufo {
    public aufm(Unsafe unsafe) {
        super(unsafe);
    }

    public final byte a(long j) {
        return Memory.peekByte(j);
    }

    public final boolean b(Object obj, long j) {
        return aufp.e ? aufp.i(obj, j) : aufp.j(obj, j);
    }

    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(e(obj, j));
    }

    public final double d(Object obj, long j) {
        return Double.longBitsToDouble(f(obj, j));
    }

    public final byte a(Object obj, long j) {
        return aufp.e ? aufp.g(obj, j) : aufp.h(obj, j);
    }

    public final void a(long j, byte b) {
        Memory.pokeByte(j, b);
    }

    public final void a(long j, byte[] bArr, long j2) {
        Memory.peekByteArray(j, bArr, 0, (int) j2);
    }

    public final void a(Object obj, long j, byte b) {
        if (aufp.e) {
            aufp.a(obj, j, b);
        } else {
            aufp.b(obj, j, b);
        }
    }

    public final void a(Object obj, long j, double d) {
        a(obj, j, Double.doubleToLongBits(d));
    }

    public final void a(Object obj, long j, float f) {
        a(obj, j, Float.floatToIntBits(f));
    }

    public final void a(Object obj, long j, boolean z) {
        if (aufp.e) {
            aufp.a(obj, j, (byte) z);
        } else {
            aufp.b(obj, j, z ? (byte) 1 : 0);
        }
    }

    public final void a(byte[] bArr, long j, long j2, long j3) {
        Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
    }
}
