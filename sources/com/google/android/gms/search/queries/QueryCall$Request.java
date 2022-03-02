package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class QueryCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aaln();
    public String a;
    public String b;
    public String[] c;
    public int d;
    public int e;
    public QuerySpecification f;
    public Bundle g;

    public QueryCall$Request() {
    }

    public QueryCall$Request(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = i;
        this.e = i2;
        this.f = querySpecification;
        this.g = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, 4, this.d);
        ivx.b(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f, i, false);
        ivx.a(parcel, 7, this.g, false);
        ivx.b(parcel, a2);
    }
}
