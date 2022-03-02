package defpackage;

import java.util.concurrent.Callable;

/* renamed from: apze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class apze implements Callable {
    private final apzh a;

    public apze(apzh apzh) {
        this.a = apzh;
    }

    public final Object call() {
        apzh apzh = this.a;
        apxt apxt = apxt.DEFAULT_CACHE_OK_IF_VALID;
        int ordinal = apzh.i.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return ampu.a;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new IllegalStateException("Unrecognized directive");
                    }
                }
            }
            apzh.h.a();
            return apzh.e.a();
        }
        apzh.h.a();
        return apzh.e.b();
    }
}
