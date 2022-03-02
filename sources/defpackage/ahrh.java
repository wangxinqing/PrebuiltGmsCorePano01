package defpackage;

import android.hardware.SensorEvent;

/* renamed from: ahrh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ahrh {
    protected final Runnable a = new ahrg(this);
    public final ahuo b;
    public final ahsr c;

    public ahrh(ahuo ahuo, ahsr ahsr) {
        this.b = ahuo;
        this.c = ahsr;
    }

    public abstract void a();

    public abstract void a(ahup ahup, long j, SensorEvent sensorEvent);

    public abstract void b();
}
