package defpackage;

import java.util.Arrays;

/* renamed from: aoup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoup {
    public final Object a;
    public final int b;
    public final int c;
    private final byte[] d;

    public aoup(Object obj, byte[] bArr, int i, int i2) {
        this.a = obj;
        this.d = Arrays.copyOf(bArr, bArr.length);
        this.b = i;
        this.c = i2;
    }

    public final byte[] a() {
        byte[] bArr = this.d;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }
}
