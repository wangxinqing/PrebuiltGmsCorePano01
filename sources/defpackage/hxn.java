package defpackage;

import java.util.Arrays;

/* renamed from: hxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hxn extends hxm {
    public final byte[] a;

    public hxn(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    public final byte[] a() {
        return this.a;
    }
}
