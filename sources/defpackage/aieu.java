package defpackage;

import android.location.Location;

/* renamed from: aieu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aieu {
    public Location a;
    public Location b;
    private long c = -600000000000L;

    public final Location a() {
        if (this.a != null) {
            return this.b;
        }
        return null;
    }

    public final void a(Location location) {
        this.a = location;
        if (ayap.l() || "network".equals(location.getProvider()) || rev.d(location, "noGPSLocation")) {
            long a2 = aicu.a(location);
            if (a2 - this.c >= 600000000000L) {
                this.b = location;
                this.c = a2;
            }
        }
    }
}
