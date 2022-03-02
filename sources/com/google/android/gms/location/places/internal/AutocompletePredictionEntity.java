package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.CharacterStyle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AutocompletePredictionEntity extends AbstractSafeParcelable implements rhf {
    public static final Parcelable.Creator CREATOR = new riz();
    public final String a;
    public final String b;
    public final List c;
    public final List d;
    public final int e;
    public final String f;
    public final List g;
    public final String h;
    public final List i;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SubstringEntity extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new rku();
        public final int a;
        public final int b;

        public SubstringEntity(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SubstringEntity) {
                SubstringEntity substringEntity = (SubstringEntity) obj;
                return ius.a(Integer.valueOf(this.a), Integer.valueOf(substringEntity.a)) && ius.a(Integer.valueOf(this.b), Integer.valueOf(substringEntity.b));
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
        }

        public final String toString() {
            iur a2 = ius.a(this);
            a2.a("offset", Integer.valueOf(this.a));
            a2.a("length", Integer.valueOf(this.b));
            return a2.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.b(parcel, 1, this.a);
            ivx.b(parcel, 2, this.b);
            ivx.b(parcel, a2);
        }
    }

    static {
        Collections.emptyList();
    }

    public AutocompletePredictionEntity(String str, List list, int i2, String str2, List list2, String str3, List list3, String str4, List list4) {
        this.b = str;
        this.c = list;
        this.e = i2;
        this.a = str2;
        this.d = list2;
        this.f = str3;
        this.g = list3;
        this.h = str4;
        this.i = list4;
    }

    public static AutocompletePredictionEntity a(String str, List list, int i2, String str2, List list2, String str3, List list3, String str4, List list4) {
        iva.a((Object) str2);
        return new AutocompletePredictionEntity(str, list, i2, str2, list2, str3, list3, str4, list4);
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        return this.d;
    }

    public final int c() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public final CharSequence e() {
        return rjd.a(this.a, this.d, (CharacterStyle) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AutocompletePredictionEntity) {
            AutocompletePredictionEntity autocompletePredictionEntity = (AutocompletePredictionEntity) obj;
            return ius.a(this.b, autocompletePredictionEntity.b) && ius.a(this.c, autocompletePredictionEntity.c) && ius.a(Integer.valueOf(this.e), Integer.valueOf(autocompletePredictionEntity.e)) && ius.a(this.a, autocompletePredictionEntity.a) && ius.a(this.d, autocompletePredictionEntity.d) && ius.a(this.f, autocompletePredictionEntity.f) && ius.a(this.g, autocompletePredictionEntity.g) && ius.a(this.h, autocompletePredictionEntity.h) && ius.a(this.i, autocompletePredictionEntity.i);
        }
    }

    public final CharSequence f() {
        return rjd.a(this.h, this.i, (CharacterStyle) null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Integer.valueOf(this.e), this.a, this.d, this.f, this.g, this.h, this.i});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("placeId", this.b);
        a2.a("placeTypes", this.c);
        a2.a("fullText", this.a);
        a2.a("fullTextMatchedSubstrings", this.d);
        a2.a("primaryText", this.f);
        a2.a("primaryTextMatchedSubstrings", this.g);
        a2.a("secondaryText", this.h);
        a2.a("secondaryTextMatchedSubstrings", this.i);
        return a2.toString();
    }

    public final CharSequence a(CharacterStyle characterStyle) {
        return rjd.a(this.f, this.g, characterStyle);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.c(parcel, 4, this.d, false);
        ivx.b(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f, false);
        ivx.c(parcel, 7, this.g, false);
        ivx.a(parcel, 8, this.h, false);
        ivx.c(parcel, 9, this.i, false);
        ivx.b(parcel, a2);
    }
}
