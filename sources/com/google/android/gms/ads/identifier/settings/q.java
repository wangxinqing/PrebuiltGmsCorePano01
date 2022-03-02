package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.c;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class q {
    private final Context a;
    private final v b;

    public q(Context context, v vVar) {
        this.a = context;
        this.b = vVar;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        if (!awhh.f()) {
            return 0;
        }
        c.a("DeviceIntegrityToken fetcher woke up.");
        p pVar = new p();
        try {
            byte[] c = this.b.c();
            long millis = TimeUnit.SECONDS.toMillis(awhh.a.a().k());
            try {
                this.b.c((byte[]) aopr.a(aopr.a(aopr.a(aopr.a((aorr) aoqw.c(pVar.b.b(new o(c, this.a))), h.a, (Executor) aoqm.a), (amqy) new i(c), (Executor) pVar.b), (aoqb) new j(pVar), (Executor) pVar.b), k.a, (Executor) aoqm.a).get(millis, TimeUnit.MILLISECONDS));
                return 0;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return 2;
            } catch (ExecutionException e2) {
                f.a(this.a, "deviceIntegrityTokenFetch", e2.getCause());
                return 2;
            } catch (TimeoutException e3) {
                f.a(this.a, "deviceIntegrityTokenFetch", "Time out");
                return 2;
            }
        } catch (IOException | GeneralSecurityException e4) {
            f.a(this.a, "publicKeyError", e4);
            return 2;
        }
    }
}
