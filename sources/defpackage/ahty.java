package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.location.collectionlib.RealCollectorConfig;

/* renamed from: ahty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahty implements SensorEventListener {
    private final int a;
    private ahtx b = null;
    private final ahtn c;

    public ahty(Context context, int i) {
        int i2 = ahvx.b;
        this.a = i;
        ahtn ahtn = new ahtn(context);
        this.c = ahtn;
        ahtn.a.registerListener(this, ahtn.a(this.a), 3);
    }

    public final synchronized ahtx a() {
        long elapsedRealtime = SystemClock.elapsedRealtime() + 100;
        while (this.b == null && SystemClock.elapsedRealtime() < elapsedRealtime) {
            try {
                wait(100);
            } catch (InterruptedException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Error reading sensor value: ");
                sb.append(valueOf);
                sb.toString();
            }
        }
        if (this.b == null) {
            int i = this.a;
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Reading sensor value timed out for sensor ");
            sb2.append(i);
            sb2.append(" after 100 ms");
            sb2.toString();
            this.c.a((SensorEventListener) this);
        }
        return this.b;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final synchronized void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == this.a) {
            this.b = new ahtx();
            ahup ahup = (ahup) RealCollectorConfig.b.get(Integer.valueOf(this.a));
            if (ahup != null) {
                ahtx ahtx = this.b;
                amrl.a((Object) ahtx);
                ahtx.a = new float[ahup.A];
                for (int i = 0; i < ahup.A; i++) {
                    ahtx.a[i] = sensorEvent.values[i];
                }
                ahtx.b = sensorEvent.sensor;
                ahtx.c = sensorEvent.timestamp;
                int i2 = Build.VERSION.SDK_INT;
                ahtx.d = SystemClock.elapsedRealtimeNanos();
                String valueOf = String.valueOf(ahtx);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
                sb.append("Sensor value retrieved from OnChangeSensorSignalCollector: ");
                sb.append(valueOf);
                sb.toString();
                notifyAll();
                this.c.a((SensorEventListener) this);
            }
        }
    }
}
