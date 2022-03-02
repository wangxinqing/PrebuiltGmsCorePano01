package defpackage;

import java.util.Locale;

/* renamed from: ahkk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahkk {
    public final float a;
    public final float b;
    public final ahkn c;
    public final int d;
    public final ahkn e;
    public final Float f;
    public final float g;
    public final long h;
    public final long i;
    public final int j;
    public final int k;

    public ahkk(float f2, float f3, ahkn ahkn, int i2, ahkn ahkn2, Float f4, float f5, long j2, long j3, int i3, int i4) {
        this.a = f2;
        this.b = f3;
        this.c = ahkn;
        this.d = i2;
        this.e = ahkn2;
        this.f = f4;
        this.g = f5;
        this.h = j2;
        this.i = j3;
        this.j = i3;
        this.k = i4;
    }

    public final String toString() {
        String str;
        String format = String.format(Locale.ENGLISH, "(%f,%f,%f) from %d samples", new Object[]{Float.valueOf(this.c.b), Float.valueOf(this.c.c), Float.valueOf(this.c.d), Integer.valueOf(this.d)});
        if (this.e != null) {
            str = String.format(Locale.ENGLISH, "(%f,%f,%f)", new Object[]{Float.valueOf(this.e.b), Float.valueOf(this.e.c), Float.valueOf(this.e.d)});
        } else {
            str = "null";
        }
        return String.format(Locale.ENGLISH, "AccelWindowResult [angleThreshold=%.3f, energyThreshold=%.1f, gravityVectorCurrent=%s, gravityVectorPrevious=%s, angle=%f, energy=%.3f, time window=(%d, %d), lastReportedState=%s, state=%s]", new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), format, str, this.f, Float.valueOf(this.g), Long.valueOf(this.h), Long.valueOf(this.i), ahkm.a(this.j), ahkm.a(this.k)});
    }
}
