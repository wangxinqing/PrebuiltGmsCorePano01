package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: aktj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aktj {
    public static baaj b;
    public static baaj c;
    private static baaj d;
    public final izd a;

    public aktj(izd izd) {
        this.a = izd;
    }

    public final aszv a(ClientContext clientContext, aszu aszu, long j) {
        if (d == null) {
            d = baaj.a(baai.UNARY, "userlocation.SemanticLocationService/GetPersonalPlaces", baoq.a(aszu.d), baoq.a(aszv.b));
        }
        return (aszv) this.a.a(d, clientContext, aszu, j, TimeUnit.MILLISECONDS);
    }
}
