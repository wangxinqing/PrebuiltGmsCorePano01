package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AppContentSectionEntity extends GamesAbstractSafeParcelable implements AppContentSection {
    public static final Parcelable.Creator CREATOR = new nlx();
    public final String a;
    public final Bundle b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    private final ArrayList h;
    private final ArrayList i;
    private final ArrayList j;

    public AppContentSectionEntity(ArrayList arrayList, ArrayList arrayList2, String str, Bundle bundle, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList3) {
        this.h = arrayList;
        this.j = arrayList3;
        this.i = arrayList2;
        this.g = str6;
        this.a = str;
        this.b = bundle;
        this.f = str5;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final List a() {
        return new ArrayList(this.h);
    }

    public final List b() {
        return new ArrayList(this.j);
    }

    public final List c() {
        return new ArrayList(this.i);
    }

    public final String d() {
        return this.g;
    }

    public final String e() {
        return this.a;
    }

    public final Bundle f() {
        return this.b;
    }

    public final String g() {
        return this.f;
    }

    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), c(), this.g, this.a, Integer.valueOf(nma.a(this.b)), this.f, this.c, this.d, this.e});
    }

    public final String i() {
        return this.d;
    }

    public final String j() {
        return this.e;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AppContentSection) {
            if (this == obj) {
                return true;
            }
            AppContentSection appContentSection = (AppContentSection) obj;
            if (!ius.a(appContentSection.a(), a()) || !ius.a(appContentSection.b(), b()) || !ius.a(appContentSection.c(), c()) || !ius.a(appContentSection.d(), this.g) || !ius.a(appContentSection.e(), this.a) || !nma.a(appContentSection.f(), this.b) || !ius.a(appContentSection.g(), this.f) || !ius.a(appContentSection.h(), this.c) || !ius.a(appContentSection.i(), this.d) || !ius.a(appContentSection.j(), this.e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("Actions", a());
        a2.a("Annotations", b());
        a2.a("Cards", c());
        a2.a("CardType", this.g);
        a2.a("ContentDescription", this.a);
        a2.a("Extras", this.b);
        a2.a("Id", this.f);
        a2.a("Subtitle", this.c);
        a2.a("Title", this.d);
        a2.a("Type", this.e);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, a(), false);
        ivx.c(parcel, 3, c(), false);
        ivx.a(parcel, 4, this.a, false);
        ivx.a(parcel, 5, this.b, false);
        ivx.a(parcel, 6, this.c, false);
        ivx.a(parcel, 7, this.d, false);
        ivx.a(parcel, 8, this.e, false);
        ivx.a(parcel, 9, this.f, false);
        ivx.a(parcel, 10, this.g, false);
        ivx.c(parcel, 14, b(), false);
        ivx.b(parcel, a2);
    }
}
