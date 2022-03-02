package defpackage;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: ajpr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajpr implements ahyn {
    private final int a;
    private final boolean[] b;
    private final int[] c;
    private final float[] d;
    private final float[] e;
    private final float[] f;
    private final int[] g;
    private final float[] h;

    public ajpr(GpsStatus gpsStatus) {
        int i;
        Iterable<GpsSatellite> satellites = gpsStatus.getSatellites();
        if (satellites instanceof Collection) {
            i = ((Collection) satellites).size();
        } else {
            Iterator<GpsSatellite> it = satellites.iterator();
            long j = 0;
            while (it.hasNext()) {
                it.next();
                j++;
            }
            i = aoog.b(j);
        }
        this.a = i;
        this.b = new boolean[i];
        this.c = new int[i];
        this.d = new float[i];
        this.e = new float[i];
        this.f = new float[i];
        this.g = new int[i];
        this.h = new float[i];
        int i2 = 0;
        for (GpsSatellite next : gpsStatus.getSatellites()) {
            this.b[i2] = next.usedInFix();
            this.c[i2] = next.getPrn();
            this.d[i2] = next.getSnr();
            this.e[i2] = next.getElevation();
            this.f[i2] = next.getAzimuth();
            this.g[i2] = 1;
            this.h[i2] = 1.57542003E9f;
            i2++;
        }
    }

    public final int a() {
        return this.a;
    }

    public final int b(int i) {
        return this.c[i];
    }

    public final float c(int i) {
        return this.d[i];
    }

    public final boolean d(int i) {
        return this.b[i];
    }

    public final float e(int i) {
        return this.h[i];
    }

    public final int a(int i) {
        return this.g[i];
    }
}
