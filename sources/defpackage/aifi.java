package defpackage;

import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: aifi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aifi {
    public static final amrm a = aifd.a;
    public static final amrm b = aife.a;
    public static final amrm c = aiff.a;
    public static final amrm d = aifg.a;
    public static final amrm e = aifh.a;
    public long f;
    public long g;
    public int h;
    public int i;
    public boolean j;
    public final Collection k = new ArrayList();
    public final Collection l = new ArrayList();
    private float m;

    public aifi() {
        a(Collections.emptyList());
    }

    public final void a() {
        a(Collections.emptyList());
    }

    public final boolean b() {
        long j2 = this.g;
        return j2 / 2 >= this.f && j2 > 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aifi) {
            aifi aifi = (aifi) obj;
            if (this.f != aifi.f || this.g != aifi.g || !atiu.a(this.k, aifi.k) || !atiu.a(this.l, aifi.l)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f), Long.valueOf(this.g), this.k, this.l});
    }

    public final String toString() {
        long j2 = this.f;
        long j3 = this.g;
        String valueOf = String.valueOf(this.k);
        String valueOf2 = String.valueOf(this.l);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 138 + String.valueOf(valueOf2).length());
        sb.append("LocationRequestSummary[minIntervalMs ");
        sb.append(j2);
        sb.append(", maxWaitTimeMs ");
        sb.append(j3);
        sb.append(", blameClients ");
        sb.append(valueOf);
        sb.append(", blamedGmsCoreComponentTags ");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }

    public final void a(Iterable iterable) {
        this.f = Long.MAX_VALUE;
        this.g = Long.MAX_VALUE;
        this.m = Float.MAX_VALUE;
        this.h = 0;
        this.i = 0;
        this.j = false;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            LocationRequestInternal locationRequestInternal = (LocationRequestInternal) it.next();
            LocationRequest locationRequest = locationRequestInternal.b;
            long j2 = locationRequest.b;
            if (j2 < this.f) {
                this.f = j2;
            }
            long b2 = locationRequest.b();
            if (b2 < this.g) {
                this.g = b2;
            }
            float f2 = locationRequest.g;
            if (f2 < this.m) {
                this.m = f2;
            }
            int i2 = locationRequest.a;
            if (i2 == 100) {
                this.h++;
            } else if (i2 == 102) {
                this.i++;
            }
            this.j = locationRequestInternal.i | this.j;
        }
        float f3 = this.m;
        if (f3 == Float.MAX_VALUE) {
            f3 = 0.0f;
        }
        this.m = f3;
        this.k.clear();
        this.l.clear();
        long j3 = this.f;
        if (j3 < Long.MAX_VALUE) {
            long j4 = ((j3 + 1000) * 3) / 2;
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                LocationRequestInternal locationRequestInternal2 = (LocationRequestInternal) it2.next();
                if (locationRequestInternal2.b.b < j4) {
                    this.k.addAll(locationRequestInternal2.c);
                    String str = locationRequestInternal2.d;
                    if (str != null) {
                        this.l.add(str);
                    }
                }
            }
        }
    }
}
