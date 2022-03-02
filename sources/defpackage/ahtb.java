package defpackage;

import android.hardware.SensorEvent;

/* renamed from: ahtb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahtb extends ahrh {
    private final ahuu d;
    private int e = 0;
    private long f = -1;

    public ahtb(ahuo ahuo, ahsr ahsr, ahuu ahuu) {
        super(ahuo, ahsr);
        this.d = ahuu;
    }

    public final void a() {
        this.c.postDelayed(this.a, this.d.b);
    }

    public final void b() {
        this.c.removeCallbacks(this.a);
    }

    public final void a(ahup ahup, long j, SensorEvent sensorEvent) {
        if (ahup == ahup.ACCELEROMETER) {
            int i = this.e;
            ahuu ahuu = this.d;
            int i2 = ahuu.a;
            if (i < i2) {
                int i3 = i + 1;
                this.e = i3;
                if (i3 >= i2) {
                    this.c.removeCallbacks(this.a);
                    this.c.postDelayed(this.a, this.d.c + 60);
                    return;
                }
                return;
            }
            long j2 = this.f;
            if (j2 < 0) {
                this.f = j;
            } else if (j - j2 >= ahuu.c) {
                this.c.postAtFrontOfQueue(this.a);
            }
        }
    }
}
