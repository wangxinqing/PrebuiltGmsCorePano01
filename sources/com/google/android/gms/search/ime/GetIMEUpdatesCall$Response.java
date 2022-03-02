package com.google.android.gms.search.ime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PIMEUpdateResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetIMEUpdatesCall$Response extends AbstractSafeParcelable implements icl {
    public static final Parcelable.Creator CREATOR = new aakh();
    public Status a;
    public PIMEUpdateResponse b;

    public GetIMEUpdatesCall$Response() {
    }

    public final Status aO() {
        return this.a;
    }

    public GetIMEUpdatesCall$Response(Status status, PIMEUpdateResponse pIMEUpdateResponse) {
        this.a = status;
        this.b = pIMEUpdateResponse;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.b(parcel, a2);
    }
}
