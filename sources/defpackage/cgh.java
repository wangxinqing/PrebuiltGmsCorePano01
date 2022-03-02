package defpackage;

import android.util.Log;

/* renamed from: cgh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cgh implements Runnable {
    final /* synthetic */ cgj a;

    public cgh(cgj cgj) {
        this.a = cgj;
    }

    public final void run() {
        try {
            cgj cgj = this.a;
            cgj.a.addGpsStatusListener(cgj);
        } catch (SecurityException e) {
            Log.wtf("IndoorOutdoorPredictor", "Failed: ", e);
        }
    }
}
