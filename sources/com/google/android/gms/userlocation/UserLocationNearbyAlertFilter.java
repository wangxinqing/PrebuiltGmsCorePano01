package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class UserLocationNearbyAlertFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aduz();
    public final List a;
    public final List b;
    public final String c;
    public final boolean d;

    public UserLocationNearbyAlertFilter(List list, List list2, String str, boolean z) {
        this.a = list != null ? new ArrayList(new HashSet(list)) : Collections.emptyList();
        this.b = list2 != null ? new ArrayList(new HashSet(list2)) : Collections.emptyList();
        Collections.sort(this.a);
        Collections.sort(this.b);
        this.c = str;
        this.d = z;
    }

    public static UserLocationNearbyAlertFilter a(Collection collection) {
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
                return new UserLocationNearbyAlertFilter((List) null, arrayList, (String) null, false);
            }
            throw new IllegalArgumentException("Filter must contain at least one place type to match results with.");
        }
        throw new IllegalArgumentException("Filter must contain a list of place types to match results with.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserLocationNearbyAlertFilter) {
            UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = (UserLocationNearbyAlertFilter) obj;
            return this.b.equals(userLocationNearbyAlertFilter.b) && this.a.equals(userLocationNearbyAlertFilter.a) && ius.a(this.c, userLocationNearbyAlertFilter.c) && this.d == userLocationNearbyAlertFilter.d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        if (!this.b.isEmpty()) {
            a2.a("types", this.b);
        }
        if (!this.a.isEmpty()) {
            a2.a("placeIds", this.a);
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
