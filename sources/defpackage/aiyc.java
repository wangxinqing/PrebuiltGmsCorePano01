package defpackage;

import android.net.wifi.RttManager;

/* renamed from: aiyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiyc implements Runnable {
    private final RttManager.RttListener a;

    public aiyc(RttManager.RttListener rttListener) {
        this.a = rttListener;
    }

    public final void run() {
        RttManager.RttListener rttListener = this.a;
        int i = aiye.e;
        rttListener.onSuccess(new RttManager.RttResult[0]);
    }
}
