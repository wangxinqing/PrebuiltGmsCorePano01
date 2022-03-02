package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: ajbo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajbo implements SensorEventListener {
    private final ajbp a;
    private final ajbr b;

    public ajbo(ajbg ajbg, ajbr ajbr) {
        this.a = new ajbp(ajbg, ajbr);
        this.b = ajbr;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.b.c.unregisterListener(this);
        this.a.a();
    }
}
