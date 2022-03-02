package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PlaceFilter extends AbstractPlaceFilter {
    public static final Parcelable.Creator CREATOR = new rhx();
    final List a;
    public final boolean b;
    final List c;
    final List d;
    public final Set e;
    public final Set f;
    public final Set g;

    static {
        new PlaceFilter();
    }

    @Deprecated
    public static rhw d() {
        return new rhw();
    }

    @Deprecated
    public static PlaceFilter e() {
        return new rhw().a();
    }

    public final boolean a() {
        return this.b;
    }

    public final Set b() {
        return this.g;
    }

    public final Set c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaceFilter) {
            PlaceFilter placeFilter = (PlaceFilter) obj;
            return this.e.equals(placeFilter.e) && this.b == placeFilter.b && this.f.equals(placeFilter.f) && this.g.equals(placeFilter.g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, Boolean.valueOf(this.b), this.f, this.g});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        if (!this.e.isEmpty()) {
            a2.a("types", this.e);
        }
        a2.a("requireOpenNow", Boolean.valueOf(this.b));
        if (!this.g.isEmpty()) {
            a2.a("placeIds", this.g);
        }
        if (!this.f.isEmpty()) {
            a2.a("requestedUserDataTypes", this.f);
        }
        return a2.toString();
    }

    public PlaceFilter() {
        this((Collection) null, false, (Collection) null, (Collection) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 3, this.b);
        ivx.c(parcel, 4, this.c, false);
        ivx.b(parcel, 6, this.d, false);
        ivx.b(parcel, a2);
    }

    public PlaceFilter(Collection collection, boolean z, Collection collection2, Collection collection3) {
        this(a(collection), z, a(collection2), a(collection3));
    }

    public PlaceFilter(List list, boolean z, List list2, List list3) {
        this.a = list;
        this.b = z;
        this.c = list3;
        this.d = list2;
        this.e = a(list);
        this.f = a(this.c);
        this.g = a(this.d);
    }
}
