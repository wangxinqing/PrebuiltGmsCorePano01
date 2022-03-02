package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GlobalQueryCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aali();
    public String a;
    public int b;
    public int c;
    public GlobalSearchQuerySpecification d;
    public Bundle e;

    public GlobalQueryCall$Request() {
    }

    public GlobalQueryCall$Request(String str, int i, int i2, GlobalSearchQuerySpecification globalSearchQuerySpecification, Bundle bundle) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = globalSearchQuerySpecification;
        this.e = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.b(parcel, a2);
    }
}
