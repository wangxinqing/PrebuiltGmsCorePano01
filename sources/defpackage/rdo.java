package defpackage;

import com.google.android.gms.location.internal.ParcelableGeofence;

/* renamed from: rdo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rdo {
    public String a = null;
    public int b = 0;
    public long c = Long.MIN_VALUE;
    public int d = 0;
    public int e = -1;
    private short f = -1;
    private double g;
    private double h;
    private float i;

    public final ParcelableGeofence a() {
        String str = this.a;
        if (str != null) {
            int i2 = this.b;
            if (i2 == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            } else if ((i2 & 4) != 0 && this.e < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            } else {
                long j = this.c;
                if (j == Long.MIN_VALUE) {
                    throw new IllegalArgumentException("Expiration not set.");
                } else if (this.f != -1) {
                    int i3 = this.d;
                    if (i3 >= 0) {
                        return new ParcelableGeofence(str, i2, 1, this.g, this.h, this.i, j, i3, this.e);
                    }
                    throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
                } else {
                    throw new IllegalArgumentException("Geofence region not set.");
                }
            }
        } else {
            throw new IllegalArgumentException("Request ID not set.");
        }
    }

    public final void a(double d2, double d3, float f2) {
        this.f = 1;
        this.g = d2;
        this.h = d3;
        this.i = f2;
    }

    public final void b() {
        this.c = -1;
    }
}
