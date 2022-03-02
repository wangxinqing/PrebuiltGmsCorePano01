package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: whd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class whd {
    public static baaj b;
    public static baaj c;
    private static baaj d;
    public final izd a;

    public whd(izd izd) {
        this.a = izd;
    }

    public final asqf a(ClientContext clientContext, asqe asqe) {
        if (d == null) {
            d = baaj.a(baai.UNARY, "location.nearby.sharing.v1.NearbySharingService/UpdateDevice", baoq.a(asqe.c), baoq.a(asqf.c));
        }
        return (asqf) this.a.a(d, clientContext, asqe, 10000, TimeUnit.MILLISECONDS);
    }
}
