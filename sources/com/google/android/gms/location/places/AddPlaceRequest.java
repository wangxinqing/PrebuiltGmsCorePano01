package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AddPlaceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rhc();
    public final String a;
    public final LatLng b;
    public final String c;
    public final List d;
    public final String e;
    public final Uri f;

    public AddPlaceRequest(String str, LatLng latLng, String str2, List list, String str3, Uri uri) {
        iva.c(str);
        this.a = str;
        iva.a((Object) latLng);
        this.b = latLng;
        iva.c(str2);
        this.c = str2;
        iva.a((Object) list);
        ArrayList arrayList = new ArrayList(list);
        this.d = arrayList;
        boolean z = true;
        iva.b(!arrayList.isEmpty(), "At least one place type should be provided.");
        if (TextUtils.isEmpty(str3) && uri == null) {
            z = false;
        }
        iva.b(z, "One of phone number or URI should be provided.");
        this.e = str3;
        this.f = uri;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("name", this.a);
        a2.a("latLng", this.b);
        a2.a("address", this.c);
        a2.a("placeTypes", this.d);
        a2.a("phoneNumer", this.e);
        a2.a("websiteUri", this.f);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, i, false);
        ivx.b(parcel, a2);
    }
}
