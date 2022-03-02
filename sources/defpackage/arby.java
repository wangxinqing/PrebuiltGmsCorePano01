package defpackage;

import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;
import com.google.location.bluemoon.inertialanchor.ThreeAxisCalibrationData;

/* renamed from: arby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arby implements Runnable {
    final /* synthetic */ AndroidInertialAnchor a;

    public arby(AndroidInertialAnchor androidInertialAnchor) {
        this.a = androidInertialAnchor;
    }

    public final void run() {
        synchronized (this.a.h) {
            try {
                AndroidInertialAnchor androidInertialAnchor = this.a;
                ThreeAxisCalibrationData threeAxisCalibrationData = androidInertialAnchor.d;
                if (threeAxisCalibrationData == null) {
                    throw new IllegalArgumentException("outCalibrationData cannot be null.");
                } else if (androidInertialAnchor.g.getLatestCalibration(androidInertialAnchor.e(), threeAxisCalibrationData)) {
                    for (arce d : this.a.h) {
                        d.d();
                    }
                } else {
                    throw new IllegalStateException("Error occurred when querying calibration data from native.");
                }
            } catch (IllegalArgumentException | IllegalStateException e) {
                e.getMessage();
            }
        }
    }
}
