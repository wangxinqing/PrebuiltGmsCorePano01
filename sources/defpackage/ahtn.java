package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.google.android.location.collectionlib.RealCollectorConfig;

/* renamed from: ahtn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahtn {
    public final SensorManager a;

    public ahtn(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
    }

    public final Sensor a(int i) {
        return this.a.getDefaultSensor(i);
    }

    public final Sensor a(ahup ahup) {
        Integer num = (Integer) RealCollectorConfig.a.get(ahup);
        if (num != null) {
            return (Sensor) anbs.e(this.a.getSensorList(num.intValue()));
        }
        return null;
    }

    public final void a(SensorEventListener sensorEventListener) {
        this.a.unregisterListener(sensorEventListener);
    }

    public final boolean a(SensorEventListener sensorEventListener, Sensor sensor, int i, Handler handler) {
        return this.a.registerListener(sensorEventListener, sensor, i, handler);
    }
}
