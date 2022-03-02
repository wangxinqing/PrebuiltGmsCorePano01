package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RegisterSectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dtp();
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final Feature[] g;
    public final String h;
    public final ScoringConfig i;

    public RegisterSectionInfo(String str, String str2, boolean z, int i2, boolean z2, String str3, Feature[] featureArr, String str4, ScoringConfig scoringConfig) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i2;
        this.e = z2;
        this.f = str3;
        this.g = featureArr;
        this.h = str4;
        this.i = scoringConfig;
    }

    public static dtn a(String str) {
        return new dtn(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterSectionInfo) {
            RegisterSectionInfo registerSectionInfo = (RegisterSectionInfo) obj;
            return this.c == registerSectionInfo.c && this.d == registerSectionInfo.d && this.e == registerSectionInfo.e && ius.a(this.a, registerSectionInfo.a) && ius.a(this.b, registerSectionInfo.b) && ius.a(this.f, registerSectionInfo.f) && ius.a(this.h, registerSectionInfo.h) && ius.a(this.i, registerSectionInfo.i) && Arrays.equals(this.g, registerSectionInfo.g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f, Integer.valueOf(Arrays.hashCode(this.g)), this.h, this.i});
    }

    public final Feature a(int i2) {
        return Feature.a(i2, this.g);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, (Parcelable[]) this.g, i2);
        ivx.a(parcel, 11, this.h, false);
        ivx.a(parcel, 12, this.i, i2, false);
        ivx.b(parcel, a2);
    }
}
