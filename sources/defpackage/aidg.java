package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: aidg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aidg extends ajqo {
    public static final String[] a = {"unknown", "remove updates overlay", "request updates overlay", "received AR result", "received NLP status", "received NLP locations", "fusion engine disabled", "fusion engine enabled", "fusion engine set requests", "fusion engine inject location", "fusion engine flush locations", "fusion engine set callback", "fusion engine getLastLocation", "fusion engine dump", "WearableHelper peer disconnected", "WearableHelper peer connected", "WearableHelper connected nodes", "WearableHelper message received", "WearableHelper capability changed", "init system cache", "dump", "requestLocationUpdates", "removeLocationUpdates", "setMockMode", "setMockLocation", "all clients disconnected", "gps status received", "flush complete", "wifi connection changed", "device orientation dump", "requestDeviceOrientationUpdates", "removeDeviceOrientationUpdates", "received NLP compute Wifi locations result"};
    public static final short[] b = new short[33];

    public aidg(Handler handler, acrz acrz) {
        super(handler, acrz);
    }

    public final void a(int i, int i2, int i3, int i4, Object obj) {
        Message obtainMessage = this.e.obtainMessage(i2, i3, i4, obj);
        acrz acrz = this.d;
        if (acrz != null) {
            acrz.a(60000);
            if (!this.e.sendMessage(obtainMessage)) {
                if (this.d.e()) {
                    this.d.c();
                    return;
                }
                return;
            }
        } else if (!this.c.sendMessage(obtainMessage)) {
            return;
        }
        short[] sArr = b;
        sArr[i] = (short) (sArr[i] + 1);
    }

    public final boolean a(int i, Runnable runnable) {
        boolean a2 = a(runnable);
        if (a2) {
            short[] sArr = b;
            sArr[i] = (short) (sArr[i] + 1);
        }
        return a2;
    }
}
