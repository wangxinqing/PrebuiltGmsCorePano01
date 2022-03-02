package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;

/* renamed from: ahvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahvj implements Runnable {
    final /* synthetic */ ahus a;
    final /* synthetic */ Sensor b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ float e;
    final /* synthetic */ float f;
    final /* synthetic */ float g;
    final /* synthetic */ float h;
    final /* synthetic */ float i;
    final /* synthetic */ float j;

    public ahvj(ahus ahus, Sensor sensor, long j2, long j3, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a = ahus;
        this.b = sensor;
        this.c = j2;
        this.d = j3;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.i = f6;
        this.j = f7;
    }

    public final void run() {
        this.a.a(this.b.getType(), this.c, this.d / 1000000, 0, this.e, this.f, this.g, this.h, this.i, this.j, (SensorEvent) null);
    }
}
