package defpackage;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ers  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ers extends aurh {
    public final Mac a(byte[] bArr) {
        Mac c = jhg.c("HMACSHA256");
        c.init(new SecretKeySpec(bArr, ""));
        return c;
    }
}
