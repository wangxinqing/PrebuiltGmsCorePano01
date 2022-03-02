package defpackage;

import com.google.android.gms.mdh.SyncStatus;

/* renamed from: rzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class rzv implements Runnable {
    private final SyncStatus a;
    private final sag b;

    public rzv(sag sag, SyncStatus syncStatus) {
        this.b = sag;
        this.a = syncStatus;
    }

    public final void run() {
        sag sag = this.b;
        SyncStatus syncStatus = this.a;
        if (sag.a) {
            afht afht = sag.b.b;
            afia.a(syncStatus);
            afht.c();
        }
    }
}
