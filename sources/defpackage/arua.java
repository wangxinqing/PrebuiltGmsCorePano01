package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: arua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arua {
    public final arty a;
    public final arub b;
    public final artz c;
    public boolean d = false;
    public float e;
    public float f;
    public float g;
    public double h = Double.NaN;
    public long i = Long.MIN_VALUE;
    public final aruc j;
    public final aruh k;

    public arua() {
        arub arub = new arub();
        arty arty = new arty((byte[]) null);
        artz artz = new artz();
        aruc aruc = new aruc();
        this.b = arub;
        this.c = artz;
        this.a = arty;
        this.k = aruh.a();
        this.j = aruc;
    }

    public final boolean a(long j2) {
        return this.i != Long.MIN_VALUE && TimeUnit.NANOSECONDS.toSeconds(j2 - this.i) < 1 && !Double.isNaN(this.h) && this.a.c;
    }

    public final float[] b(long j2) {
        if (!a(j2)) {
            return null;
        }
        arty arty = this.a;
        for (int i2 = 0; i2 < 3; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                arty.a[(i2 * 3) + i3] = (float) arty.b.a[(i3 * 3) + i2];
            }
        }
        return arty.a;
    }
}
