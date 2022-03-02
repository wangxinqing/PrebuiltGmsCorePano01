package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;

/* renamed from: lwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lwk implements SensorEventListener {
    public final Sensor a;
    public final SensorManager b;
    public ltu c;
    private final float d;

    public lwk(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(8);
        this.a = defaultSensor;
        if (defaultSensor != null) {
            this.d = Math.min(defaultSensor.getMaximumRange(), 5.0f);
            return;
        }
        this.d = 5.0f;
        lww.a();
        lww.e(context).a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_NULL_PROXIMITY_SENSOR);
    }

    public final void a() {
        this.c = null;
        this.b.unregisterListener(this);
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        ltu ltu;
        if (sensorEvent.values[0] >= this.d && (ltu = this.c) != null) {
            lty lty = ltu.a;
            if (SystemClock.elapsedRealtime() <= lty.f) {
                lty.c();
            }
            a();
        }
    }
}
