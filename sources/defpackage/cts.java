package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: cts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cts {
    public final iwd a;
    public final dih b;
    public final ExecutorService c;
    public final cub d;
    public final amsv e;
    public final crr f;
    public final dis g;

    public cts(Context context, dih dih, ExecutorService executorService, cub cub, crr crr) {
        ctp ctp = new ctp(context);
        dis a2 = dis.a(context, dih);
        iwd a3 = dit.a("RemoteResourceProducer");
        this.b = dih;
        this.c = executorService;
        this.d = cub;
        this.e = ctp;
        this.f = crr;
        this.g = a2;
        this.a = a3;
    }

    public final cui a(aqso aqso, long j, String str, boolean z, cvm cvm) {
        aqsr aqsr;
        csl csl = new csl(aqso, j);
        String str2 = this.b.a;
        aqsr aqsr2 = csl.a.d;
        if (aqsr2 != null) {
            aqsr = aqsr2;
        } else {
            aqsr = aqsr.d;
        }
        return new cui(str2, str, aqsr, z, cvm.a, csl);
    }
}
