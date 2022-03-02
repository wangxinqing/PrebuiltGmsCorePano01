package defpackage;

import java.util.concurrent.ScheduledFuture;

/* renamed from: ijb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ijb implements acvp {
    final /* synthetic */ acwd a;
    final /* synthetic */ ScheduledFuture b;

    public ijb(acwd acwd, ScheduledFuture scheduledFuture) {
        this.a = acwd;
        this.b = scheduledFuture;
    }

    public final void a(acwa acwa) {
        if (acwa.b()) {
            this.a.b(acwa.d());
        } else {
            this.a.b(acwa.e());
        }
        this.b.cancel(true);
    }
}
