package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FullTextSearchFilter extends AbstractFilter {
    public static final Parcelable.Creator CREATOR = new ljh();
    final String a;

    public FullTextSearchFilter(String str) {
        this.a = str;
    }

    public final Object a(ljf ljf) {
        return ljf.a(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, a2);
    }
}
