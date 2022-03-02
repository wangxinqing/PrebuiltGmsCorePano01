package defpackage;

import android.os.StrictMode;

/* renamed from: agmz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agmz implements Runnable {
    static final Runnable a = new agmz();

    private agmz() {
    }

    public final void run() {
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
    }
}
