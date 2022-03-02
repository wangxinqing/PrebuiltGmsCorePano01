package com.google.android.gms.search.ime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetCorpusHandlesRegisteredForIMECall$Response extends AbstractSafeParcelable implements icl {
    public static final Parcelable.Creator CREATOR = new aakf();
    public Status a;
    public String[] b;

    public GetCorpusHandlesRegisteredForIMECall$Response() {
    }

    public final Status aO() {
        return this.a;
    }

    public GetCorpusHandlesRegisteredForIMECall$Response(Status status, String[] strArr) {
        this.a = status;
        this.b = strArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }
}
