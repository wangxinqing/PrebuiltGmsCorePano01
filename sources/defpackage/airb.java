package defpackage;

import android.app.PendingIntent;

/* renamed from: airb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class airb implements Runnable {
    private final aire a;
    private final PendingIntent b;

    public airb(aire aire, PendingIntent pendingIntent) {
        this.a = aire;
        this.b = pendingIntent;
    }

    public final void run() {
        aire aire = this.a;
        PendingIntent pendingIntent = this.b;
        synchronized (aire.f) {
            String valueOf = String.valueOf(Integer.toHexString(pendingIntent.hashCode()));
            if (valueOf.length() == 0) {
                new String("removing activity pendingIntent ");
            } else {
                "removing activity pendingIntent ".concat(valueOf);
            }
            aiov aiov = aire.n;
            aiov.a((Object) pendingIntent);
            aiov.a(pendingIntent);
            aire.b(false);
            if (aire.n.h() == 0 && aire.d && axwx.g()) {
                aire.u.a();
                aire.d = false;
            }
        }
    }
}
