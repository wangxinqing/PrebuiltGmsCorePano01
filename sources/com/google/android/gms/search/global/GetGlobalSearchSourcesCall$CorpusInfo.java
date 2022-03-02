package com.google.android.gms.search.global;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetGlobalSearchSourcesCall$CorpusInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aajd();
    public String a;
    public Feature[] b;
    public boolean c;
    public Bundle d;

    public GetGlobalSearchSourcesCall$CorpusInfo() {
    }

    public GetGlobalSearchSourcesCall$CorpusInfo(String str, Feature[] featureArr, boolean z, Bundle bundle) {
        this.a = str;
        this.b = featureArr;
        this.c = z;
        this.d = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, (Parcelable[]) this.b, i);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }
}
