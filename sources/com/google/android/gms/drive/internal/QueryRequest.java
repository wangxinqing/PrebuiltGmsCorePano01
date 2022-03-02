package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.query.Query;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class QueryRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kxh();
    public final Query a;

    public QueryRequest(Query query) {
        this.a = query;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.b(parcel, a2);
    }
}
