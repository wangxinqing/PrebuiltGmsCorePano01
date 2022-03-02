package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AnnotateCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aakz();
    public final String a;
    public final String b;
    public final int[] c;
    public Bundle d;

    public AnnotateCall$Request(String str, String str2, int[] iArr, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = iArr;
        this.d = bundle;
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
