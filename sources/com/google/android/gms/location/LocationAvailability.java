package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new reg();
    @Deprecated
    public int a;
    @Deprecated
    public int b;
    public long c;
    public int d;
    public NetworkLocationStatus[] e;

    public LocationAvailability(int i, int i2, int i3, long j, NetworkLocationStatus[] networkLocationStatusArr) {
        this.d = i;
        this.a = i2;
        this.b = i3;
        this.c = j;
        this.e = networkLocationStatusArr;
    }

    public static LocationAvailability a(int i, int i2, int i3, long j) {
        return new LocationAvailability(i, i2, i3, j, (NetworkLocationStatus[]) null);
    }

    public static LocationAvailability b(Intent intent) {
        if (a(intent)) {
            try {
                return (LocationAvailability) intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
            } catch (ClassCastException e2) {
            }
        }
        return null;
    }

    public final boolean a() {
        return this.d < 1000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.a == locationAvailability.a && this.b == locationAvailability.b && this.c == locationAvailability.c && this.d == locationAvailability.d && Arrays.equals(this.e, locationAvailability.e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c), this.e});
    }

    public final String toString() {
        boolean a2 = a();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(a2);
        sb.append("]");
        return sb.toString();
    }

    public static boolean a(Intent intent) {
        if (intent != null) {
            return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, 4, this.d);
        ivx.a(parcel, 5, (Parcelable[]) this.e, i);
        ivx.b(parcel, a2);
    }
}
