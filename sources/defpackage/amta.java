package defpackage;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* renamed from: amta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amta {
    public static amsv a(amsv amsv) {
        if ((amsv instanceof amsy) || (amsv instanceof amsx)) {
            return amsv;
        }
        return amsv instanceof Serializable ? new amsx(amsv) : new amsy(amsv);
    }

    public static amsv a(amsv amsv, long j, TimeUnit timeUnit) {
        return new amsw(amsv, j, timeUnit);
    }

    public static amsv a(Object obj) {
        return new amsz(obj);
    }
}
