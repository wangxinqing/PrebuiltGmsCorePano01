package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class NearbyAlertFilter extends AbstractPlaceFilter {
    public static final Parcelable.Creator CREATOR = new rhk();
    final List a;
    final List b;
    public final String c;
    public final boolean d;
    public final Set e;
    public final Set f = a(this.b);

    public NearbyAlertFilter(List list, List list2, String str, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = str;
        this.d = z;
        this.e = a(list);
    }

    public static NearbyAlertFilter b(Collection collection) {
        if (collection != null) {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty()) {
                return new NearbyAlertFilter(arrayList, (List) null, (String) null, false);
            }
            throw new IllegalArgumentException("NearbyAlertFilters must contain at least one place ID to match results with.");
        }
        throw new IllegalArgumentException("NearbyAlertFilters must contain a list of place IDs to match results with.");
    }

    public static NearbyAlertFilter c(Collection collection) {
        if (collection != null) {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (num != null) {
                    arrayList.add(num);
                }
            }
            if (!arrayList.isEmpty()) {
                return new NearbyAlertFilter((List) null, arrayList, (String) null, false);
            }
            throw new IllegalArgumentException("NearbyAlertFilters must contain at least one place type to match results with.");
        }
        throw new IllegalArgumentException("NearbyAlertFilters must contain a list of place types to match results with.");
    }

    public final Set b() {
        return this.e;
    }

    public final Set c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj instanceof NearbyAlertFilter) {
            NearbyAlertFilter nearbyAlertFilter = (NearbyAlertFilter) obj;
            if ((this.c != null || nearbyAlertFilter.c == null) && this.f.equals(nearbyAlertFilter.f) && this.e.equals(nearbyAlertFilter.e) && (((str = this.c) == null || str.equals(nearbyAlertFilter.c)) && this.d == nearbyAlertFilter.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.e, this.c, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        if (!this.f.isEmpty()) {
            a2.a("types", this.f);
        }
        if (!this.e.isEmpty()) {
            a2.a("placeIds", this.e);
        }
        String str = this.c;
        if (str != null) {
            a2.a("chainName", str);
        }
        a2.a("Beacon required: ", Boolean.valueOf(this.d));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d);
        ivx.b(parcel, a2);
    }
}
