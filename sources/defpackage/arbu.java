package defpackage;

import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;

/* renamed from: arbu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arbu implements Runnable {
    final /* synthetic */ AndroidInertialAnchor a;

    public arbu(AndroidInertialAnchor androidInertialAnchor) {
        this.a = androidInertialAnchor;
    }

    public final void run() {
        synchronized (this.a) {
            AndroidInertialAnchor androidInertialAnchor = this.a;
            if (androidInertialAnchor.e) {
                androidInertialAnchor.g.registerCallbacks(androidInertialAnchor.e(), this.a);
                AndroidInertialAnchor androidInertialAnchor2 = this.a;
                androidInertialAnchor2.g.setCallbackThreadJniEnv(androidInertialAnchor2.e());
                AndroidInertialAnchor androidInertialAnchor3 = this.a;
                androidInertialAnchor3.g.startOnlineEstimator(androidInertialAnchor3.e());
            }
        }
    }
}
