package com.google.android.gms.awareness.snapshot.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AwarenessPlaceEntity extends AbstractSafeParcelable implements rhq {
    public static final Parcelable.Creator CREATOR = new grf();
    public final String a;
    public final LatLng b;
    public final float c;
    public final LatLngBounds d;
    public final String e;
    public final Uri f;
    public final boolean g;
    public final float h;
    public final int i;
    public final String j;
    public final String k;
    public final String l;
    public final List m;
    public final List n;
    public final String o;
    private Locale p;

    public AwarenessPlaceEntity(String str, List list, String str2, String str3, String str4, List list2, LatLng latLng, float f2, LatLngBounds latLngBounds, String str5, Uri uri, boolean z, float f3, int i2, String str6) {
        this.a = str;
        this.n = Collections.unmodifiableList(list);
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = list2 == null ? Collections.emptyList() : list2;
        this.b = latLng;
        this.c = f2;
        this.d = latLngBounds;
        this.e = str5 == null ? "UTC" : str5;
        this.f = uri;
        this.g = z;
        this.h = f3;
        this.i = i2;
        this.p = null;
        this.o = str6;
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        return this.n;
    }

    public final Locale c() {
        return null;
    }

    public final LatLng d() {
        return this.b;
    }

    public final float e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AwarenessPlaceEntity) {
            AwarenessPlaceEntity awarenessPlaceEntity = (AwarenessPlaceEntity) obj;
            if (this.a.equals(awarenessPlaceEntity.a)) {
                Locale locale = awarenessPlaceEntity.p;
                if (ius.a((Object) null, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final LatLngBounds f() {
        return this.d;
    }

    @Deprecated
    public final TimeZone g() {
        return null;
    }

    public final Uri h() {
        return this.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null});
    }

    public final CharSequence i() {
        List list = this.m;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return TextUtils.join(", ", this.m);
    }

    public final boolean j() {
        return this.g;
    }

    public final float k() {
        return this.h;
    }

    public final int l() {
        return this.i;
    }

    public final String m() {
        return this.o;
    }

    public final SafeParcelable n() {
        return this;
    }

    public final /* bridge */ /* synthetic */ CharSequence o() {
        return this.l;
    }

    public final /* bridge */ /* synthetic */ CharSequence p() {
        return this.j;
    }

    public final /* bridge */ /* synthetic */ CharSequence q() {
        return this.k;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("id", this.a);
        a2.a("placeTypes", this.n);
        a2.a("locale", (Object) null);
        a2.a("name", this.j);
        a2.a("address", this.k);
        a2.a("phoneNumber", this.l);
        a2.a("latlng", this.b);
        a2.a("viewport", this.d);
        a2.a("websiteUri", this.f);
        a2.a("isPermanentlyClosed", Boolean.valueOf(this.g));
        a2.a("priceLevel", Integer.valueOf(this.i));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 4, this.b, i2, false);
        ivx.a(parcel, 5, this.c);
        ivx.a(parcel, 6, this.d, i2, false);
        ivx.a(parcel, 7, this.e, false);
        ivx.a(parcel, 8, this.f, i2, false);
        ivx.a(parcel, 9, this.g);
        ivx.a(parcel, 10, this.h);
        ivx.b(parcel, 11, this.i);
        ivx.a(parcel, 14, this.k, false);
        ivx.a(parcel, 15, this.l, false);
        ivx.b(parcel, 17, this.m, false);
        ivx.a(parcel, 19, this.j, false);
        ivx.a(parcel, 20, this.n, false);
        ivx.a(parcel, 23, this.o, false);
        ivx.b(parcel, a2);
    }
}
