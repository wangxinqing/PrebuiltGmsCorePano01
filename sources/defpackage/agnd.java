package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;

/* renamed from: agnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agnd {
    public static final anhq a = anhq.a("agnd");
    public final SharedPreferences b;

    public agnd(SharedPreferences sharedPreferences) {
        this.b = sharedPreferences;
    }

    public final audx a(String str, auef auef) {
        int length;
        byte[] decode = Base64.decode(this.b.getString(str, ""), 0);
        if (!(decode == null || (length = decode.length) == 0)) {
            if (decode[0] == 1) {
                try {
                    return (audx) auef.a(decode, 1, length - 1);
                } catch (auda e) {
                    anhn anhn = (anhn) a.c();
                    anhn.a((Throwable) e);
                    ((anhn) anhn.a("agnd", "a", 57, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("failure reading proto");
                }
            } else {
                ((anhn) ((anhn) a.c()).a("agnd", "a", 60, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("wrong header");
            }
        }
        return null;
    }
}
