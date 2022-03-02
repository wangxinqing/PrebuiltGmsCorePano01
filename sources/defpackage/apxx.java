package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: apxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apxx {
    public aekn a;
    public apyr b;
    public amsv c;
    public amsv d;
    public amsv e;
    private Context f;
    private apyp g;
    private Executor h;
    private Executor i;
    private Executor j;
    private amsv k;

    public final apxy a() {
        String str = this.f == null ? " context" : "";
        if (this.a == null) {
            str = str.concat(" clock");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" transport");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" transportExecutor");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" ioExecutor");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" networkExecutor");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" recordNetworkMetricsToPrimes");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" recordCachingMetricsToPrimes");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" recordBandwidthMetrics");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" grpcIdleTimeoutMillis");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        apxv apxv = new apxv(this.f, this.a, this.g, this.h, this.i, this.j, this.b, this.c, this.d, this.e, this.k);
        apyr apyr = apxv.b;
        boolean z = true;
        if (apyr != null && apxv.a == null) {
            z = false;
        }
        amrl.b(z, (Object) "If authContextManager is set, networkExecutor must be set.");
        return apxv;
    }

    public final void b(Executor executor) {
        if (executor != null) {
            this.j = executor;
            return;
        }
        throw new NullPointerException("Null networkExecutor");
    }

    public final void c(Executor executor) {
        if (executor != null) {
            this.h = executor;
            return;
        }
        throw new NullPointerException("Null transportExecutor");
    }

    public final void a(amsv amsv) {
        if (amsv != null) {
            this.k = amsv;
            return;
        }
        throw new NullPointerException("Null grpcIdleTimeoutMillis");
    }

    public final void a(Context context) {
        if (context != null) {
            this.f = context;
            return;
        }
        throw new NullPointerException("Null context");
    }

    public final void a(apyp apyp) {
        if (apyp != null) {
            this.g = apyp;
            return;
        }
        throw new NullPointerException("Null transport");
    }

    public final void a(Executor executor) {
        if (executor != null) {
            this.i = executor;
            return;
        }
        throw new NullPointerException("Null ioExecutor");
    }
}
