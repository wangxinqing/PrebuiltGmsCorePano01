package defpackage;

import java.security.SecureRandom;

/* renamed from: aehj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class aehj {
    final byte a;
    final byte b;
    private final byte[] c;

    public aehj(aehi aehi) {
        this.a = aehi.d;
        this.c = aehi.f;
        this.b = aehi.e;
    }

    public abstract byte[] a();

    /* access modifiers changed from: package-private */
    public final byte[] b() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        bArr[0] = this.a;
        bArr[1] = this.b;
        System.arraycopy(this.c, 0, bArr, 2, 6);
        return bArr;
    }
}
