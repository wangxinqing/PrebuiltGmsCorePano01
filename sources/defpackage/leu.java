package defpackage;

import android.content.SyncResult;

/* renamed from: leu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class leu implements Runnable {
    final /* synthetic */ lev a;
    final /* synthetic */ SyncResult b;

    public leu(lev lev, SyncResult syncResult) {
        this.a = lev;
        this.b = syncResult;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
