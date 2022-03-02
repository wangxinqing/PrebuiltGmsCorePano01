package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;

/* renamed from: ahvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahvi implements Runnable {
    final /* synthetic */ ahus a;
    final /* synthetic */ Sensor b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ float e;
    final /* synthetic */ float f;
    final /* synthetic */ float g;

    public ahvi(ahus ahus, Sensor sensor, long j, long j2, float f2, float f3, float f4) {
        this.a = ahus;
        this.b = sensor;
        this.c = j;
        this.d = j2;
        this.e = f2;
        this.f = f3;
        this.g = f4;
    }

    public final void run() {
        this.a.a(this.b.getType(), this.c, this.d / 1000000, 0, this.e, this.f, this.g, (SensorEvent) null);
    }
}
