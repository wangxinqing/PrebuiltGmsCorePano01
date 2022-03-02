package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AppContentAnnotationEntity extends GamesAbstractSafeParcelable implements AppContentAnnotation {
    public static final Parcelable.Creator CREATOR = new nlu();
    public final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final Bundle i;

    public AppContentAnnotationEntity(String str, Uri uri, String str2, String str3, String str4, String str5, int i2, int i3, Bundle bundle) {
        this.a = str;
        this.d = str3;
        this.f = str5;
        this.g = i2;
        this.b = uri;
        this.h = i3;
        this.e = str4;
        this.i = bundle;
        this.c = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f;
    }

    public final int d() {
        return this.g;
    }

    public final Uri e() {
        return this.b;
    }

    public final Bundle f() {
        return this.i;
    }

    public final int g() {
        return this.h;
    }

    public final String h() {
        return this.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.d, this.f, Integer.valueOf(this.g), this.b, Integer.valueOf(this.h), this.e, Integer.valueOf(nma.a(this.i)), this.c});
    }

    public final String i() {
        return this.c;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AppContentAnnotation) {
            if (this == obj) {
                return true;
            }
            AppContentAnnotation appContentAnnotation = (AppContentAnnotation) obj;
            if (!ius.a(appContentAnnotation.a(), this.a) || !ius.a(appContentAnnotation.b(), this.d) || !ius.a(appContentAnnotation.c(), this.f) || !ius.a(Integer.valueOf(appContentAnnotation.d()), Integer.valueOf(this.g)) || !ius.a(appContentAnnotation.e(), this.b) || !ius.a(Integer.valueOf(appContentAnnotation.g()), Integer.valueOf(this.h)) || !ius.a(appContentAnnotation.h(), this.e) || !nma.a(appContentAnnotation.f(), this.i) || !ius.a(appContentAnnotation.i(), this.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("Description", this.a);
        a2.a("Id", this.d);
        a2.a("ImageDefaultId", this.f);
        a2.a("ImageHeight", Integer.valueOf(this.g));
        a2.a("ImageUri", this.b);
        a2.a("ImageWidth", Integer.valueOf(this.h));
        a2.a("LayoutSlot", this.e);
        a2.a("Modifiers", this.i);
        a2.a("Title", this.c);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, i2, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e, false);
        ivx.a(parcel, 7, this.f, false);
        ivx.b(parcel, 8, this.g);
        ivx.b(parcel, 9, this.h);
        ivx.a(parcel, 10, this.i, false);
        ivx.b(parcel, a2);
    }
}
