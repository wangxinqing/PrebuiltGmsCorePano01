package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RegisterCorpusIMEInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dtk();
    public final int a;
    public final String[] b;
    public final String c;
    public final String d;
    public final String[] e;
    public final String f;

    public RegisterCorpusIMEInfo(int i, String[] strArr, String str, String str2, String[] strArr2, String str3) {
        this.a = i;
        this.b = strArr;
        this.c = str;
        this.d = str2;
        this.e = strArr2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterCorpusIMEInfo) {
            RegisterCorpusIMEInfo registerCorpusIMEInfo = (RegisterCorpusIMEInfo) obj;
            return this.a == registerCorpusIMEInfo.a && Arrays.equals(this.b, registerCorpusIMEInfo.b) && ius.a(this.c, registerCorpusIMEInfo.c) && ius.a(this.d, registerCorpusIMEInfo.d) && Arrays.equals(this.e, registerCorpusIMEInfo.e) && ius.a(this.f, registerCorpusIMEInfo.f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.b)), this.c, this.d, Integer.valueOf(Arrays.hashCode(this.e)), this.f});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.e, false);
        ivx.b(parcel, a2);
    }
}
