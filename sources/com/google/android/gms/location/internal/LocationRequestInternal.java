package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationRequestInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rgv();
    public static final List a = Collections.emptyList();
    public LocationRequest b;
    public List c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean g;
    public String h;
    public boolean i;
    public boolean j;
    public String k;
    public long l;

    public LocationRequestInternal(LocationRequest locationRequest, List list, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, long j2) {
        this.b = locationRequest;
        this.c = list;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str2;
        this.i = z4;
        this.j = z5;
        this.k = str3;
        this.l = j2;
    }

    public static LocationRequestInternal a(LocationRequestInternal locationRequestInternal) {
        return new LocationRequestInternal(locationRequestInternal.b, locationRequestInternal.c, locationRequestInternal.d, locationRequestInternal.e, locationRequestInternal.f, locationRequestInternal.g, locationRequestInternal.h, locationRequestInternal.i, locationRequestInternal.j, locationRequestInternal.k, locationRequestInternal.l);
    }

    public static LocationRequestInternal b(LocationRequestInternal locationRequestInternal) {
        LocationRequestInternal a2 = a(locationRequestInternal);
        a2.a((List) new ArrayList(locationRequestInternal.c));
        a2.a(new LocationRequest(locationRequestInternal.b));
        return a2;
    }

    public final void a() {
        this.g = true;
    }

    public final void b() {
        this.e = true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequestInternal) {
            LocationRequestInternal locationRequestInternal = (LocationRequestInternal) obj;
            if (!ius.a(this.b, locationRequestInternal.b) || !ius.a(this.c, locationRequestInternal.c) || !ius.a(this.d, locationRequestInternal.d) || this.e != locationRequestInternal.e || this.f != locationRequestInternal.f || this.g != locationRequestInternal.g || !ius.a(this.h, locationRequestInternal.h) || this.i != locationRequestInternal.i || this.j != locationRequestInternal.j || !ius.a(this.k, locationRequestInternal.k)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        if (this.d != null) {
            sb.append(" tag=");
            sb.append(this.d);
        }
        if (this.h != null) {
            sb.append(" moduleId=");
            sb.append(this.h);
        }
        if (this.k != null) {
            sb.append(" contextFeatureId=");
            sb.append(this.k);
        }
        sb.append(" hideAppOps=");
        sb.append(this.e);
        sb.append(" clients=");
        sb.append(this.c);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f);
        if (this.g) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.i) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.j) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    public static LocationRequestInternal a(String str, LocationRequest locationRequest) {
        return new LocationRequestInternal(locationRequest, a, str, false, false, false, (String) null, false, false, (String) null, Long.MAX_VALUE);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, i2, false);
        ivx.c(parcel, 5, this.c, false);
        ivx.a(parcel, 6, this.d, false);
        ivx.a(parcel, 7, this.e);
        ivx.a(parcel, 8, this.f);
        ivx.a(parcel, 9, this.g);
        ivx.a(parcel, 10, this.h, false);
        ivx.a(parcel, 11, this.i);
        ivx.a(parcel, 12, this.j);
        ivx.a(parcel, 13, this.k, false);
        ivx.a(parcel, 14, this.l);
        ivx.b(parcel, a2);
    }

    public final void a(LocationRequest locationRequest) {
        iva.a((Object) locationRequest);
        this.b = locationRequest;
    }

    public final void a(List list) {
        iva.a((Object) list);
        this.c = list;
    }
}
