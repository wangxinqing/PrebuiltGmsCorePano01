package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: aoxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoxd extends aouh {
    public aoxd(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aoyq aoyq = (aoyq) obj;
        aoys aoys = aoyq.b;
        if (aoys == null) {
            aoys = aoys.c;
        }
        int b = aoyp.b(aoys.a);
        if (b == 0) {
            b = 1;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(aoyq.c.k(), "HMAC");
        aoys aoys2 = aoyq.b;
        if (aoys2 == null) {
            aoys2 = aoys.c;
        }
        int i = aoys2.b;
        int i2 = b - 2;
        if (i2 == 1) {
            return new apct("HMACSHA1", secretKeySpec, i);
        }
        if (i2 == 3) {
            return new apct("HMACSHA256", secretKeySpec, i);
        }
        if (i2 == 4) {
            return new apct("HMACSHA512", secretKeySpec, i);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
