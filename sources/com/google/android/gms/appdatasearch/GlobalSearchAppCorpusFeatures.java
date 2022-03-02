package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GlobalSearchAppCorpusFeatures extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dst();
    final String a;
    final Feature[] b;

    public GlobalSearchAppCorpusFeatures(String str, Feature[] featureArr) {
        this.a = str;
        this.b = featureArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, (Parcelable[]) this.b, i);
        ivx.b(parcel, a2);
    }
}
