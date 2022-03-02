package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ProfileSettingsEntity extends GamesAbstractSafeParcelable implements nlr {
    public static final Parcelable.Creator CREATOR = new nmt();
    public final Status a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final StockProfileImageEntity f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final int m;

    public ProfileSettingsEntity(Status status, String str, boolean z, boolean z2, boolean z3, StockProfileImageEntity stockProfileImageEntity, boolean z4, boolean z5, int i2, boolean z6, boolean z7, int i3, int i4) {
        this.a = status;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = stockProfileImageEntity;
        this.g = z4;
        this.h = z5;
        this.i = i2;
        this.j = z6;
        this.k = z7;
        this.l = i3;
        this.m = i4;
    }

    public final Status aO() {
        return this.a;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public final StockProfileImage e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nlr)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        nlr nlr = (nlr) obj;
        return ius.a(this.b, nlr.d()) && ius.a(Boolean.valueOf(this.c), Boolean.valueOf(nlr.f())) && ius.a(Boolean.valueOf(this.d), Boolean.valueOf(nlr.b())) && ius.a(Boolean.valueOf(this.e), Boolean.valueOf(nlr.c())) && ius.a(this.a, nlr.aO()) && ius.a(this.f, nlr.e()) && ius.a(Boolean.valueOf(this.g), Boolean.valueOf(nlr.g())) && ius.a(Boolean.valueOf(this.h), Boolean.valueOf(nlr.h())) && this.i == nlr.k() && this.j == nlr.i() && this.k == nlr.j() && this.l == nlr.l() && this.m == nlr.m();
    }

    public final boolean f() {
        return this.c;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.a, this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.j), Boolean.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(this.m)});
    }

    public final boolean i() {
        return this.j;
    }

    public final boolean j() {
        return this.k;
    }

    public final int k() {
        return this.i;
    }

    public final int l() {
        return this.l;
    }

    public final int m() {
        return this.m;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("GamerTag", this.b);
        a2.a("IsGamerTagExplicitlySet", Boolean.valueOf(this.c));
        a2.a("IsProfileVisible", Boolean.valueOf(this.d));
        a2.a("IsVisibilityExplicitlySet", Boolean.valueOf(this.e));
        a2.a("Status", this.a);
        a2.a("StockProfileImage", this.f);
        a2.a("IsProfileDiscoverable", Boolean.valueOf(this.g));
        a2.a("AutoSignIn", Boolean.valueOf(this.h));
        a2.a("httpErrorCode", Integer.valueOf(this.i));
        a2.a("IsSettingsChangesProhibited", Boolean.valueOf(this.j));
        char[] cArr = {128, 171, 171, 174, 182, 133, 177, 168, 164, 173, 163, 136, 173, 181, 168, 179, 164, 178};
        for (int i2 = 0; i2 < 18; i2++) {
            cArr[i2] = (char) (cArr[i2] - '?');
        }
        a2.a(new String(cArr), Boolean.valueOf(this.k));
        a2.a("ProfileVisibility", Integer.valueOf(this.l));
        char[] cArr2 = {166, 171, 174, 161, 160, 171, 158, 165, 177, 168, 164, 173, 163, 178, 158, 171, 168, 178, 179, 158, 181, 168, 178, 168, 161, 168, 171, 168, 179, 184};
        for (int i3 = 0; i3 < 30; i3++) {
            cArr2[i3] = (char) (cArr2[i3] - '?');
        }
        a2.a(new String(cArr2), Integer.valueOf(this.m));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i2, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f, i2, false);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h);
        ivx.b(parcel, 9, this.i);
        ivx.a(parcel, 10, this.j);
        ivx.a(parcel, 11, this.k);
        ivx.b(parcel, 12, this.l);
        ivx.b(parcel, 13, this.m);
        ivx.b(parcel, a2);
    }
}
