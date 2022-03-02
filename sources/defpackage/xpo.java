package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: xpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xpo {
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
    public static baaj l;
    public static baaj m;
    public static baaj n;
    public static baaj o;
    private static baaj p;
    public final izd a;

    public xpo(izd izd) {
        this.a = izd;
    }

    public final aqvr a(ClientContext clientContext, aqvp aqvp) {
        return a(clientContext, aqvp, 10000);
    }

    public final aqvr a(ClientContext clientContext, aqvp aqvp, long j2) {
        if (p == null) {
            p = baaj.a(baai.UNARY, "google.internal.people.v2.InternalPeopleService/GetPeople", baoq.a(aqvp.g), baoq.a(aqvr.b));
        }
        return (aqvr) this.a.a(p, clientContext, aqvp, j2, TimeUnit.MILLISECONDS);
    }
}
