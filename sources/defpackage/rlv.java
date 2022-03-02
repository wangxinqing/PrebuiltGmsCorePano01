package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: rlv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rlv {
    public static final int b = ((int) ayel.h());
    public static baaj c;
    private static baaj d;
    private static baaj e;
    public final izd a;

    public rlv(izd izd) {
        this.a = izd;
    }

    public final arve a(ClientContext clientContext, arvd arvd) {
        if (d == null) {
            d = baaj.a(baai.UNARY, "google.internal.android.location.quake.v1.QuakeApiService/NodeOnline", baoq.a(arvd.e), baoq.a(arve.e));
        }
        return (arve) this.a.a(d, clientContext, arvd, (long) b, TimeUnit.MILLISECONDS);
    }

    public final arvi a(ClientContext clientContext, arvh arvh) {
        if (e == null) {
            e = baaj.a(baai.UNARY, "google.internal.android.location.quake.v1.QuakeApiService/NodeTriggering", baoq.a(arvh.d), baoq.a(arvi.b));
        }
        return (arvi) this.a.a(e, clientContext, arvh, (long) b, TimeUnit.MILLISECONDS);
    }

    public final void a() {
        this.a.h();
    }
}
