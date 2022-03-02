package defpackage;

import android.location.Location;

/* renamed from: aiwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiwz {
    public final Location a;
    public final long b;
    public final int c;

    public aiwz(Location location, long j, int i) {
        if (location != null) {
            this.a = location;
            this.b = j;
            this.c = i;
            return;
        }
        throw new IllegalArgumentException("Null location in RealLocation constructor");
    }

    public final float a() {
        return this.a.getAccuracy();
    }

    public final double b() {
        return this.a.getLatitude();
    }

    public final double c() {
        return this.a.getLongitude();
    }

    public final float d() {
        return this.a.getSpeed();
    }

    public final long e() {
        return this.a.getTime();
    }

    public final double f() {
        return this.a.getAltitude();
    }

    public final float g() {
        return this.a.getBearing();
    }

    public final boolean h() {
        return this.a.hasAltitude();
    }

    public final boolean i() {
        return this.a.hasBearing();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RealLocation [location=");
        sb.append(this.a);
        sb.append(" satellites=");
        sb.append(this.c);
        if (i()) {
            sb.append(" bearing=");
            sb.append(g());
        }
        if (h()) {
            sb.append(" altitude=");
            sb.append(f());
        }
        sb.append("]");
        return sb.toString();
    }
}
