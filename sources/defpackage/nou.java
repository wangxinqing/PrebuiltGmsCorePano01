package defpackage;

import android.content.Context;
import com.google.ads.afma.proto2api.c;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: nou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nou {
    public final Context a;
    public final nnt b;
    public final nnv c;
    public acwa d;
    public acwa e;
    private final Executor f;

    public nou(Context context, Executor executor, nnt nnt, nnv nnv) {
        this.a = context;
        this.f = executor;
        this.b = nnt;
        this.c = nnv;
    }

    public static c a(acwa acwa, c cVar) {
        return acwa.b() ? (c) acwa.d() : cVar;
    }

    public final acwa a(Callable callable) {
        acwa a2 = acws.a(this.f, callable);
        a2.a(this.f, (acvs) new nor(this));
        return a2;
    }
}
