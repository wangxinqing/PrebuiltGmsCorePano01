package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new rek();
    public static final List a = Collections.emptyList();
    public final List b;

    public LocationResult(List list) {
        this.b = list;
    }

    public static LocationResult a(List list) {
        if (list == null) {
            list = a;
        }
        return new LocationResult(list);
    }

    public static LocationResult b(Intent intent) {
        if (a(intent)) {
            return (LocationResult) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationResult) {
            LocationResult locationResult = (LocationResult) obj;
            if (locationResult.b.size() == this.b.size()) {
                Iterator it = this.b.iterator();
                for (Location time : locationResult.b) {
                    if (((Location) it.next()).getTime() != time.getTime()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (Location time : this.b) {
            long time2 = time.getTime();
            i = (i * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public static boolean a(Intent intent) {
        if (intent != null) {
            return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, this.b, false);
        ivx.b(parcel, a2);
    }

    public final Location a() {
        int size = this.b.size();
        if (size != 0) {
            return (Location) this.b.get(size - 1);
        }
        return null;
    }
}
