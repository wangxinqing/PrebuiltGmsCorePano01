package defpackage;

import android.content.BroadcastReceiver;

/* renamed from: skm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class skm implements aora {
    final /* synthetic */ BroadcastReceiver.PendingResult a;

    public skm(BroadcastReceiver.PendingResult pendingResult) {
        this.a = pendingResult;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
        skn.a.d().a("skm", "a", 45, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("GCM ping successfully handled.");
        this.a.finish();
    }

    public final void a(Throwable th) {
        anie c = sjk.a().c();
        c.a((int) aygr.b());
        c.a(th);
        c.a("skm", "a", 55, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Failed to handle GCM ping.");
        this.a.finish();
    }

    public final void a(Void voidR) {
        skn.a.d().a("skm", "a", 45, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("GCM ping successfully handled.");
        this.a.finish();
    }
}
