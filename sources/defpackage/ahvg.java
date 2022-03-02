package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;

/* renamed from: ahvg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahvg implements Runnable {
    final /* synthetic */ ahus a;
    final /* synthetic */ Sensor b;
    final /* synthetic */ long[] c;
    final /* synthetic */ long[] d;
    final /* synthetic */ float[][] e;

    public ahvg(ahus ahus, Sensor sensor, long[] jArr, long[] jArr2, float[][] fArr) {
        this.a = ahus;
        this.b = sensor;
        this.c = jArr;
        this.d = jArr2;
        this.e = fArr;
    }

    public final void run() {
        ahus ahus = this.a;
        int type = this.b.getType();
        long[] jArr = this.c;
        long[] jArr2 = this.d;
        float[][] fArr = this.e;
        if (!ahus.a.i()) {
            ahup a2 = ahut.a(type);
            ahus.a.h.a.a(type, jArr, fArr);
            int length = jArr2.length;
            if (length > 0) {
                ahus.a.a(a2, jArr2[length - 1], (SensorEvent) null);
            }
        }
    }
}
