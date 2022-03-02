package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorManager;

/* renamed from: ahjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahjh {
    public static int a(SensorManager sensorManager, int i) {
        Sensor defaultSensor = sensorManager.getDefaultSensor(i);
        if (defaultSensor != null) {
            return defaultSensor.getFifoMaxEventCount();
        }
        return 0;
    }
}
