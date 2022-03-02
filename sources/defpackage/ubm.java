package defpackage;

import android.os.IBinder;

/* renamed from: ubm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ubm implements IBinder.DeathRecipient {
    private final arye a;

    public ubm(arye arye) {
        this.a = arye;
    }

    public final void binderDied() {
        arye arye = this.a;
        jjg jjg = tsp.a;
        arye.a();
    }
}
