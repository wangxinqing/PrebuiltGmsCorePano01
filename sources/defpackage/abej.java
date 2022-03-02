package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: abej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abej {
    public static final abej a = new abej();

    public static final String a(String str, String str2) {
        iva.a((Object) str);
        iva.a((Object) str2);
        MessageDigest b = jhg.b("MD5");
        if (b == null) {
            return null;
        }
        b.update(String.format("%s:%s", new Object[]{str, str2}).getBytes(Charset.forName("UTF-8")));
        return jjp.d(b.digest());
    }
}
