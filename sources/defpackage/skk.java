package defpackage;

import android.content.Intent;
import java.util.concurrent.ExecutionException;

/* renamed from: skk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class skk {
    public final raw a;
    public final sjl b;

    public skk(raw raw, sjl sjl) {
        this.a = raw;
        this.b = sjl;
    }

    /* access modifiers changed from: package-private */
    public final void a(Intent intent) {
        try {
            this.a.a().get();
            this.b.a(2);
        } catch (ExecutionException e) {
            this.b.a(4);
            anie c = sjk.a().c();
            c.a((int) aygr.c());
            c.a(e.getCause());
            c.a("skk", "a", 36, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Failed to schedule periodic tasks.");
        } catch (InterruptedException e2) {
            this.b.a(6);
            sjk.b().c().a("skk", "a", 39, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Scheduling was interrupted.");
            Thread.currentThread().interrupt();
        }
    }
}
