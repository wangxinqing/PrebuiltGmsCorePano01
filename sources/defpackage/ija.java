package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ija  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ija implements Runnable {
    final /* synthetic */ acwd a;
    final /* synthetic */ long b;
    final /* synthetic */ TimeUnit c;

    public ija(acwd acwd, long j, TimeUnit timeUnit) {
        this.a = acwd;
        this.b = j;
        this.c = timeUnit;
    }

    public final void run() {
        this.a.b((Exception) new TimeoutException(String.format(Locale.US, "Timed out after %d %s", new Object[]{Long.valueOf(this.b), this.c.name()})));
    }
}
