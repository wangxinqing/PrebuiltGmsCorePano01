package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new req();
    public final boolean a;
    public final boolean b;
    public LocationSettingsConfiguration c;
    private final List d;

    public LocationSettingsRequest(List list, boolean z, boolean z2, LocationSettingsConfiguration locationSettingsConfiguration) {
        this.d = list;
        this.a = z;
        this.b = z2;
        this.c = locationSettingsConfiguration;
    }

    public final List a() {
        return Collections.unmodifiableList(this.d);
    }

    @Deprecated
    public final void b() {
        this.c = null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, a(), false);
        ivx.a(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 5, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
