package defpackage;

import java.security.interfaces.RSAPublicKey;

/* renamed from: apcy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apcy implements aouv {
    public final RSAPublicKey a;
    public final int b;

    public apcy(RSAPublicKey rSAPublicKey, int i) {
        int i2 = apdc.a;
        apdc.b(rSAPublicKey.getModulus().bitLength());
        this.a = rSAPublicKey;
        this.b = i;
    }
}
