package defpackage;

import android.os.StrictMode;

/* renamed from: ahhp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahhp implements Runnable {
    private final StrictMode.ThreadPolicy a;

    public ahhp(StrictMode.ThreadPolicy threadPolicy) {
        this.a = threadPolicy;
    }

    public final void run() {
        StrictMode.setThreadPolicy(this.a);
    }
}
