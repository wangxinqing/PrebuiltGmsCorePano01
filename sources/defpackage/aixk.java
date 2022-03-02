package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;

/* renamed from: aixk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aixk implements SensorEventListener {
    final /* synthetic */ aixl a;
    private final long b;

    public aixk(aixl aixl, long j) {
        this.a = aixl;
        this.b = j;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (SystemClock.elapsedRealtime() - this.b >= 1000) {
            this.a.b.a(aico.WAKE_UP_TILT);
            boolean a2 = this.a.a.a((Runnable) new aixj(this));
        }
    }
}
