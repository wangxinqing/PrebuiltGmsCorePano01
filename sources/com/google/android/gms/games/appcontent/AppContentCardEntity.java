package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AppContentCardEntity extends GamesAbstractSafeParcelable implements AppContentCard {
    public static final Parcelable.Creator CREATOR = new nlv();
    public final String a;
    public final int b;
    public final String c;
    public final Bundle d;
    public final String e;
    public final String f;
    public final int g;
    public final String h;
    public final String i;
    private final ArrayList j;
    private final ArrayList k;
    private final ArrayList l;

    public AppContentCardEntity(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i2, String str2, Bundle bundle, String str3, String str4, int i3, String str5, String str6) {
        this.j = arrayList;
        this.k = arrayList2;
        this.l = arrayList3;
        this.a = str;
        this.b = i2;
        this.c = str2;
        this.d = bundle;
        this.i = str6;
        this.e = str3;
        this.f = str4;
        this.g = i3;
        this.h = str5;
    }

    public final List a() {
        return new ArrayList(this.j);
    }

    public final List b() {
        return new ArrayList(this.k);
    }

    public final List c() {
        return new ArrayList(this.l);
    }

    public final String d() {
        return this.a;
    }

    public final int e() {
        return this.b;
    }

    public final String f() {
        return this.c;
    }

    public final Bundle g() {
        return this.d;
    }

    public final String h() {
        return this.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), c(), this.a, Integer.valueOf(this.b), this.c, Integer.valueOf(nma.a(this.d)), this.i, this.e, this.f, Integer.valueOf(this.g), this.h});
    }

    public final String i() {
        return this.e;
    }

    public final String j() {
        return this.f;
    }

    public final int k() {
        return this.g;
    }

    public final String l() {
        return this.h;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AppContentCard) {
            if (this == obj) {
                return true;
            }
            AppContentCard appContentCard = (AppContentCard) obj;
            if (!ius.a(appContentCard.a(), a()) || !ius.a(appContentCard.b(), b()) || !ius.a(appContentCard.c(), c()) || !ius.a(appContentCard.d(), this.a) || !ius.a(Integer.valueOf(appContentCard.e()), Integer.valueOf(this.b)) || !ius.a(appContentCard.f(), this.c) || !nma.a(appContentCard.g(), this.d) || !ius.a(appContentCard.h(), this.i) || !ius.a(appContentCard.i(), this.e) || !ius.a(appContentCard.j(), this.f) || !ius.a(Integer.valueOf(appContentCard.k()), Integer.valueOf(this.g)) || !ius.a(appContentCard.l(), this.h)) {
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
        a2.a("Conditions", c());
        a2.a("ContentDescription", this.a);
        a2.a("CurrentSteps", Integer.valueOf(this.b));
        a2.a("Description", this.c);
        a2.a("Extras", this.d);
        a2.a("Id", this.i);
        a2.a("Subtitle", this.e);
        a2.a("Title", this.f);
        a2.a("TotalSteps", Integer.valueOf(this.g));
        a2.a("Type", this.h);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, a(), false);
        ivx.c(parcel, 2, b(), false);
        ivx.c(parcel, 3, c(), false);
        ivx.a(parcel, 4, this.a, false);
        ivx.b(parcel, 5, this.b);
        ivx.a(parcel, 6, this.c, false);
        ivx.a(parcel, 7, this.d, false);
        ivx.a(parcel, 10, this.e, false);
        ivx.a(parcel, 11, this.f, false);
        ivx.b(parcel, 12, this.g);
        ivx.a(parcel, 13, this.h, false);
        ivx.a(parcel, 14, this.i, false);
        ivx.b(parcel, a2);
    }
}
