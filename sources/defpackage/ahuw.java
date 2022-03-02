package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: ahuw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahuw implements SensorEventListener {
    public boolean a = false;
    final /* synthetic */ ahux b;
    private int c = 0;
    private int d = 0;
    private double e = 0.0d;

    public ahuw(ahux ahux) {
        this.b = ahux;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        long a2 = this.b.c.a();
        int i = this.c;
        if (i < 10) {
            this.c = i + 1;
        } else if (this.d < 30) {
            long j = sensorEvent.timestamp;
            double d2 = this.e;
            double d3 = (double) (j - a2);
            Double.isNaN(d3);
            this.e = d2 + (d3 / 30.0d);
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 == 30) {
                synchronized (this.b.d) {
                    if (!this.a) {
                        this.b.a(true, (long) this.e);
                        long j2 = this.b.h;
                        StringBuilder sb = new StringBuilder(72);
                        sb.append("Calibration done. mSensorTimeElapsedTimeOffsetNanos=");
                        sb.append(j2);
                        sb.toString();
                    }
                }
            }
        }
    }
}
