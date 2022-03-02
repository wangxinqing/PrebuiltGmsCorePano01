package com.google.android.gms.location.places.internal;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlacesParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rkt();
    public static final PlacesParams a = new PlacesParams("com.google.android.gms", Locale.getDefault(), (String) null);
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;

    public PlacesParams(String str, String str2, String str3, String str4, int i, int i2) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = i2;
    }

    private static String a(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        return locale.toLanguageTag();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof PlacesParams)) {
            PlacesParams placesParams = (PlacesParams) obj;
            return this.f == placesParams.f && this.g == placesParams.g && this.c.equals(placesParams.c) && this.b.equals(placesParams.b) && ius.a(this.d, placesParams.d) && ius.a(this.e, placesParams.e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, Integer.valueOf(this.f), Integer.valueOf(this.g)});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("clientPackageName", this.b);
        a2.a("locale", this.c);
        a2.a("accountName", this.d);
        a2.a("gCoreClientName", this.e);
        return a2.toString();
    }

    public PlacesParams(String str, Locale locale, String str2) {
        this(str, a(locale), str2, (String) null, hxj.b, 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, false);
        ivx.a(parcel, 2, this.c, false);
        ivx.a(parcel, 3, this.d, false);
        ivx.a(parcel, 4, this.e, false);
        ivx.b(parcel, 6, this.f);
        ivx.b(parcel, 7, this.g);
        ivx.b(parcel, a2);
    }

    public PlacesParams(String str, Locale locale, String str2, String str3, int i) {
        this(str, a(locale), str2, str3, hxj.b, i);
    }
}
