package com.google.android.gms.location.places.internal;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
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
public final class PlaceEntity extends AbstractSafeParcelable implements ReflectedParcelable, rhq {
    public static final Parcelable.Creator CREATOR = new rkk();
    public final String a;
    public final LatLng b;
    public final float c;
    public final LatLngBounds d;
    public final String e;
    public final Uri f;
    public final boolean g;
    public final float h;
    public final int i;
    public final List j;
    public final String k;
    public final String l;
    public final String m;
    public final List n;
    public final PlaceOpeningHoursEntity o;
    public final PlaceExtendedDetailsEntity p;
    public final String q;
    public Locale r;

    public PlaceEntity(String str, List list, String str2, String str3, String str4, List list2, LatLng latLng, float f2, LatLngBounds latLngBounds, String str5, Uri uri, boolean z, float f3, int i2, PlaceOpeningHoursEntity placeOpeningHoursEntity, PlaceExtendedDetailsEntity placeExtendedDetailsEntity, String str6) {
        this.a = str;
        this.j = Collections.unmodifiableList(list);
        this.k = str2;
        this.l = str3;
        this.m = str4;
        this.n = list2 == null ? Collections.emptyList() : list2;
        this.b = latLng;
        this.c = f2;
        this.d = latLngBounds;
        this.e = str5 == null ? "UTC" : str5;
        this.f = uri;
        this.g = z;
        this.h = f3;
        this.i = i2;
        this.r = null;
        this.o = placeOpeningHoursEntity;
        this.p = placeExtendedDetailsEntity;
        this.q = str6;
    }

    public static rhq a(Parcelable parcelable, Context context) {
        if (parcelable == null) {
            return null;
        }
        iva.a((Object) context, (Object) "context must not be null");
        try {
            return (PlaceEntity) parcelable;
        } catch (ClassCastException e2) {
            throw new IllegalArgumentException("Parcelable is not a Place");
        }
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        return this.j;
    }

    public final Locale c() {
        return this.r;
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
        if (obj instanceof PlaceEntity) {
            PlaceEntity placeEntity = (PlaceEntity) obj;
            return this.a.equals(placeEntity.a) && ius.a(this.r, placeEntity.r);
        }
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
        return Arrays.hashCode(new Object[]{this.a, this.r});
    }

    public final CharSequence i() {
        return rjd.a(this.n);
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
        return this.q;
    }

    public final SafeParcelable n() {
        return this;
    }

    public final /* bridge */ /* synthetic */ CharSequence o() {
        return this.m;
    }

    public final /* bridge */ /* synthetic */ CharSequence p() {
        return this.k;
    }

    public final /* bridge */ /* synthetic */ CharSequence q() {
        return this.l;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final ContentValues s() {
        ContentValues contentValues = new ContentValues(rks.a.length);
        contentValues.put("place_id", this.a);
        contentValues.put("place_types", ilj.a(this.j));
        contentValues.put("place_name", this.k);
        contentValues.put("place_address", this.l);
        Locale locale = this.r;
        if (locale != null) {
            contentValues.put("place_locale", locale.getLanguage());
            contentValues.put("place_locale_language", this.r.getLanguage());
            contentValues.put("place_locale_country", this.r.getCountry());
        }
        contentValues.put("place_phone_number", this.m);
        contentValues.put("place_attributions", ilj.c(this.n));
        LatLng latLng = this.b;
        if (latLng != null) {
            contentValues.put("place_lat_lng", ivy.a(latLng));
        }
        contentValues.put("place_level_number", Float.valueOf(this.c));
        LatLngBounds latLngBounds = this.d;
        if (latLngBounds != null) {
            contentValues.put("place_viewport", ivy.a(latLngBounds));
        }
        Uri uri = this.f;
        if (uri != null) {
            contentValues.put("place_website_uri", uri.toString());
        }
        contentValues.put("place_is_permanently_closed", Boolean.valueOf(this.g));
        contentValues.put("place_rating", Float.valueOf(this.h));
        contentValues.put("place_price_level", Integer.valueOf(this.i));
        PlaceOpeningHoursEntity placeOpeningHoursEntity = this.o;
        if (placeOpeningHoursEntity != null) {
            contentValues.put("place_opening_hours", ivy.a(placeOpeningHoursEntity));
        }
        contentValues.put("place_adr_address", this.q);
        return contentValues;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("id", this.a);
        a2.a("placeTypes", this.j);
        a2.a("locale", this.r);
        a2.a("name", this.k);
        a2.a("address", this.l);
        a2.a("phoneNumber", this.m);
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
        ivx.a(parcel, 14, this.l, false);
        ivx.a(parcel, 15, this.m, false);
        ivx.b(parcel, 17, this.n, false);
        ivx.a(parcel, 19, this.k, false);
        ivx.a(parcel, 20, this.j, false);
        ivx.a(parcel, 21, this.o, i2, false);
        ivx.a(parcel, 22, this.p, i2, false);
        ivx.a(parcel, 23, this.q, false);
        ivx.b(parcel, a2);
    }
}
