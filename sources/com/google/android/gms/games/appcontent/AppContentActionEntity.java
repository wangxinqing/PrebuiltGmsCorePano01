package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AppContentActionEntity extends GamesAbstractSafeParcelable implements AppContentAction {
    public static final Parcelable.Creator CREATOR = new nlt();
    public final String a;
    public final Bundle b;
    public final String c;
    public final String d;
    public final AppContentAnnotationEntity e;
    public final String f;
    private final ArrayList g;

    public AppContentActionEntity(ArrayList arrayList, String str, Bundle bundle, String str2, String str3, AppContentAnnotationEntity appContentAnnotationEntity, String str4) {
        this.e = appContentAnnotationEntity;
        this.g = arrayList;
        this.a = str;
        this.b = bundle;
        this.d = str3;
        this.f = str4;
        this.c = str2;
    }

    public final AppContentAnnotation a() {
        return this.e;
    }

    public final List b() {
        return new ArrayList(this.g);
    }

    public final String c() {
        return this.a;
    }

    public final Bundle d() {
        return this.b;
    }

    public final String e() {
        return this.d;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, b(), this.a, Integer.valueOf(nma.a(this.b)), this.d, this.f, this.c});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AppContentAction) {
            if (this == obj) {
                return true;
            }
            AppContentAction appContentAction = (AppContentAction) obj;
            if (!ius.a(appContentAction.a(), this.e) || !ius.a(appContentAction.b(), b()) || !ius.a(appContentAction.c(), this.a) || !nma.a(appContentAction.d(), this.b) || !ius.a(appContentAction.e(), this.d) || !ius.a(appContentAction.f(), this.f) || !ius.a(appContentAction.g(), this.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("Annotation", this.e);
        a2.a("Conditions", b());
        a2.a("ContentDescription", this.a);
        a2.a("Extras", this.b);
        a2.a("Id", this.d);
        a2.a("OverflowText", this.f);
        a2.a("Type", this.c);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, b(), false);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 6, this.c, false);
        ivx.a(parcel, 7, this.d, false);
        ivx.a(parcel, 8, this.e, i, false);
        ivx.a(parcel, 9, this.f, false);
        ivx.b(parcel, a2);
    }
}
