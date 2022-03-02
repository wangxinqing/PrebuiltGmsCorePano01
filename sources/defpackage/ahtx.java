package defpackage;

import android.hardware.Sensor;
import java.util.Locale;

/* renamed from: ahtx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahtx {
    public float[] a;
    public Sensor b;
    public long c;
    public long d;

    public final String toString() {
        return String.format(Locale.ENGLISH, "Value: %f; Sensor: %s; timestampNanos: %d; elapsedRealtimeNanos: %d", new Object[]{Float.valueOf(this.a[0]), Integer.valueOf(this.b.getType()), Long.valueOf(this.c), Long.valueOf(this.d)});
    }
}
