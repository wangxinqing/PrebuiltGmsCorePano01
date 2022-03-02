package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlaceExtendedDetailsEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rkl();
    public final List a;
    public final String b;
    public final Uri c;
    public final float d;
    public final int e;

    public PlaceExtendedDetailsEntity(List list, String str, Uri uri, float f, int i) {
        this.a = Collections.unmodifiableList(list);
        this.b = str;
        this.c = uri;
        this.d = f;
        this.e = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.a(parcel, 4, this.d);
        ivx.b(parcel, 5, this.e);
        ivx.b(parcel, a2);
    }
}
