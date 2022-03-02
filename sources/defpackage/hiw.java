package defpackage;

import android.util.Base64;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: hiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hiw {
    public final String a;
    public final hiz b;

    public hiw(String str, hiz hiz) {
        iva.c(str);
        this.a = str;
        iva.a((Object) hiz);
        this.b = hiz;
    }

    public static hiw a(hmg hmg) {
        hiz hiz = new hiz(new SecretKeySpec(hmg.c.k(), "AES"), new SecretKeySpec(hmg.d.k(), "AES"));
        return new hiw(Base64.encodeToString(hiz.a(hiy.a, "nigori-key"), 2), hiz);
    }

    public static hiw a(String str) {
        iva.a(str, (Object) "password should not be empty.");
        SecretKey a2 = hiz.a(new String(hiz.a("dummy", "localhost")), "saltsalt".getBytes(), 1001);
        hiz hiz = new hiz(new SecretKeySpec(hiz.a(str, a2.getEncoded(), 1003).getEncoded(), "AES"), new SecretKeySpec(hiz.a(str, a2.getEncoded(), 1004).getEncoded(), "AES"));
        return new hiw(Base64.encodeToString(hiz.a(hiy.a, "nigori-key"), 2), hiz);
    }

    public static hiw a(byte[] bArr) {
        return a(Base64.encodeToString(bArr, 2));
    }

    public final hmg a() {
        aucd o = hmg.e.o();
        String str = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        hmg hmg = (hmg) o.b;
        str.getClass();
        hmg.a |= 1;
        hmg.b = str;
        auay a2 = auay.a(this.b.a.getEncoded());
        if (o.c) {
            o.c();
            o.c = false;
        }
        hmg hmg2 = (hmg) o.b;
        a2.getClass();
        hmg2.a |= 4;
        hmg2.c = a2;
        auay a3 = auay.a(this.b.b.getEncoded());
        if (o.c) {
            o.c();
            o.c = false;
        }
        hmg hmg3 = (hmg) o.b;
        a3.getClass();
        hmg3.a |= 8;
        hmg3.d = a3;
        return (hmg) o.i();
    }
}
