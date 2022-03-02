package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FACLConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new geb();
    final int a;
    public boolean b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    public FACLConfig(int i, boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FACLConfig) {
            FACLConfig fACLConfig = (FACLConfig) obj;
            return this.b == fACLConfig.b && TextUtils.equals(this.c, fACLConfig.c) && this.d == fACLConfig.d && this.e == fACLConfig.e && this.f == fACLConfig.f && this.g == fACLConfig.g;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g)});
    }

    public FACLConfig(boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = 1;
        this.b = z;
        if (z) {
            this.c = "";
        } else {
            this.c = str;
        }
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g);
        ivx.b(parcel, a2);
    }
}
