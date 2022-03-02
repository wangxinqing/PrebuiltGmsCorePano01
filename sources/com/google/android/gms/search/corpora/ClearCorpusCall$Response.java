package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ClearCorpusCall$Response extends AbstractSafeParcelable implements icl {
    public static final Parcelable.Creator CREATOR = new aaho();
    public Status a;

    public ClearCorpusCall$Response() {
    }

    public final Status aO() {
        return this.a;
    }

    public ClearCorpusCall$Response(Status status) {
        this.a = status;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.b(parcel, a2);
    }
}
