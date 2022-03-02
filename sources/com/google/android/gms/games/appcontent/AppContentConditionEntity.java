package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AppContentConditionEntity extends GamesAbstractSafeParcelable implements AppContentCondition {
    public static final Parcelable.Creator CREATOR = new nlw();
    public final String a;
    public final String b;
    public final String c;
    public final Bundle d;

    public AppContentConditionEntity(String str, String str2, String str3, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bundle;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final Bundle d() {
        return this.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AppContentCondition) {
            if (this == obj) {
                return true;
            }
            AppContentCondition appContentCondition = (AppContentCondition) obj;
            if (!ius.a(appContentCondition.a(), this.a) || !ius.a(appContentCondition.b(), this.b) || !ius.a(appContentCondition.c(), this.c) || !ius.a(appContentCondition.d(), this.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("DefaultValue", this.a);
        a2.a("ExpectedValue", this.b);
        a2.a("Predicate", this.c);
        a2.a("PredicateParameters", this.d);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }
}
