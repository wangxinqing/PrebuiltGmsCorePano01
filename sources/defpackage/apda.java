package defpackage;

import java.security.interfaces.RSAPublicKey;

/* renamed from: apda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apda implements aouv {
    public final RSAPublicKey a;
    public final int b;
    public final int c;
    public final int d;

    public apda(RSAPublicKey rSAPublicKey, int i, int i2, int i3) {
        int i4 = apdc.a;
        apdc.b(rSAPublicKey.getModulus().bitLength());
        this.a = rSAPublicKey;
        this.c = i;
        this.d = i2;
        this.b = i3;
    }
}
