package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class UserLocationNearbyAlertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adva();
    public final int a;
    public final int b;
    public final UserLocationNearbyAlertFilter c;
    public final boolean d;
    public final int e;
    public final int f;

    public UserLocationNearbyAlertRequest(int i, int i2, UserLocationNearbyAlertFilter userLocationNearbyAlertFilter, boolean z, int i3, int i4) {
        this.a = i;
        this.b = i2;
        if (userLocationNearbyAlertFilter != null) {
            this.c = userLocationNearbyAlertFilter;
        } else {
            this.c = null;
        }
        this.d = z;
        this.e = i3;
        this.f = i4;
    }

    public static UserLocationNearbyAlertRequest a(int i, UserLocationNearbyAlertFilter userLocationNearbyAlertFilter, int i2, boolean z, int i3, int i4) {
        return new UserLocationNearbyAlertRequest(i, i2, userLocationNearbyAlertFilter, z, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserLocationNearbyAlertRequest) {
            UserLocationNearbyAlertRequest userLocationNearbyAlertRequest = (UserLocationNearbyAlertRequest) obj;
            return this.a == userLocationNearbyAlertRequest.a && this.b == userLocationNearbyAlertRequest.b && ius.a(this.c, userLocationNearbyAlertRequest.c) && this.f == userLocationNearbyAlertRequest.f && this.e == userLocationNearbyAlertRequest.e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, Integer.valueOf(this.f), Integer.valueOf(this.e)});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("transitionTypes", Integer.valueOf(this.a));
        a2.a("loiteringTimeMillis", Integer.valueOf(this.b));
        a2.a("filter", this.c);
        a2.a("priority", Integer.valueOf(this.f));
        a2.a("radiusType", Integer.valueOf(this.e));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 4, this.c, i, false);
        ivx.a(parcel, 5, this.d);
        ivx.b(parcel, 6, this.e);
        ivx.b(parcel, 7, this.f);
        ivx.b(parcel, a2);
    }
}
