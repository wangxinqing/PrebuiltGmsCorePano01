package defpackage;

import android.hardware.Sensor;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;
import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;

/* renamed from: aijf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aijf extends aijc {
    private static final DeviceOrientationRequestInternal a = new DeviceOrientationRequestInternal(new DeviceOrientationRequest(), DeviceOrientationRequestInternal.a, "FusionEngine");
    private final aigh b;
    private final aiii c;
    private final AndroidInertialAnchor d;

    public aijf(aigh aigh, aiii aiii) {
        this.b = aigh;
        this.c = aiii;
        this.d = null;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.u && this.v) {
            aigh aigh = this.b;
            Sensor sensor = aigh.b;
            if (sensor != null) {
                aigh.a.registerListener(aigh, sensor, 20000, aigh.c);
                aigh.d = new aqgi();
            }
            aiii aiii = this.c;
            if (aiii != null) {
                aiii.a(a);
            }
            AndroidInertialAnchor androidInertialAnchor = this.d;
            if (androidInertialAnchor != null) {
                androidInertialAnchor.c();
                return;
            }
            return;
        }
        aigh aigh2 = this.b;
        if (aigh2.b != null) {
            aigh2.a.unregisterListener(aigh2);
        }
        aigh2.d = null;
        aiii aiii2 = this.c;
        if (aiii2 != null) {
            aiii2.b(a);
        }
        AndroidInertialAnchor androidInertialAnchor2 = this.d;
        if (androidInertialAnchor2 != null) {
            androidInertialAnchor2.d();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StepDetector[");
        a(sb);
        sb.append(']');
        return sb.toString();
    }

    public aijf(aigh aigh, AndroidInertialAnchor androidInertialAnchor) {
        this.b = aigh;
        this.c = null;
        this.d = androidInertialAnchor;
    }
}
