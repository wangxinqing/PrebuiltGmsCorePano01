package defpackage;

/* renamed from: ahxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahxd {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public ahxd(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.f = f7;
    }

    public final String toString() {
        return String.format("averageSatellites: %s, maxNeighborAzimDiff: %s, earlyMaxNeighborAzimDiff: %s, lateMaxNeighborAzimDiff: %s, highSnrScore: %s, maxElevInHighSnrSatellites: %s", new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f)});
    }
}
