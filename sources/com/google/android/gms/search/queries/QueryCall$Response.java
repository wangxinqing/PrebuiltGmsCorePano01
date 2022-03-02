package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class QueryCall$Response extends AbstractSafeParcelable implements icl {
    public static final Parcelable.Creator CREATOR = new aalo();
    public Status a;
    public SearchResults b;
    public Bundle c;

    public QueryCall$Response() {
    }

    public final Status aO() {
        return this.a;
    }

    public QueryCall$Response(Status status, SearchResults searchResults, Bundle bundle) {
        this.a = status;
        this.b = searchResults;
        this.c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
