package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CorpusConfigParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aafv();
    public final String a;
    public final String b;
    public final String c;

    public CorpusConfigParcelable(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
