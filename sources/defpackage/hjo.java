package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: hjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hjo {
    public static baaj b;
    public static baaj c;
    public static baaj d;
    public static baaj e;
    public static baaj f;
    public static baaj g;
    public static baaj h;
    public static baaj i;
    public static baaj j;
    public static baaj k;
    private static baaj l;
    public final izd a;

    public hjo(izd izd) {
        this.a = izd;
    }

    public final aqop a(ClientContext clientContext, aqoo aqoo) {
        if (l == null) {
            l = baaj.a(baai.UNARY, "google.internal.chrome.sync.passwords.v1.Passwords/BatchUpdatePasswords", baoq.a(aqoo.b), baoq.a(aqop.c));
        }
        return (aqop) this.a.a(l, clientContext, aqoo, 10000, TimeUnit.MILLISECONDS);
    }
}
