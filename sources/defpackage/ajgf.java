package defpackage;

import android.location.Location;

/* renamed from: ajgf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajgf {
    final int a;
    final Location b;
    final double c;

    public ajgf(int i, double d, double d2, double d3) {
        Location location = new Location("Stored");
        this.b = location;
        this.a = i;
        location.setLatitude(d);
        this.b.setLongitude(d2);
        this.c = d3;
    }
}
