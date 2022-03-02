package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ResultClickInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dts();
    final String a;
    final DocumentId[] b;
    final int c;

    public ResultClickInfo(String str, DocumentId[] documentIdArr, int i) {
        this.a = str;
        this.b = documentIdArr;
        this.c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, (Parcelable[]) this.b, i);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
