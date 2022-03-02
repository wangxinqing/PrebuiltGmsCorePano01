package defpackage;

import android.os.IBinder;

/* renamed from: ubn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ubn implements IBinder.DeathRecipient {
    private final arxy a;

    public ubn(arxy arxy) {
        this.a = arxy;
    }

    public final void binderDied() {
        arxy arxy = this.a;
        jjg jjg = tsp.a;
        arxy.c();
    }
}
