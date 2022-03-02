package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetDocumentsCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aalc();
    public String a;
    public String b;
    public String[] c;
    public QuerySpecification d;
    public Bundle e;

    public GetDocumentsCall$Request() {
    }

    public GetDocumentsCall$Request(String str, String str2, String[] strArr, QuerySpecification querySpecification, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = querySpecification;
        this.e = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.b(parcel, a2);
    }
}
