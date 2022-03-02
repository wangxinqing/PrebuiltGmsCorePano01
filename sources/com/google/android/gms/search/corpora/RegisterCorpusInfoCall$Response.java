package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RegisterCorpusInfoCall$Response extends AbstractSafeParcelable implements icl {
    public static final Parcelable.Creator CREATOR = new aaia();
    public Status a;
    public boolean b;

    public RegisterCorpusInfoCall$Response() {
    }

    public final Status aO() {
        return this.a;
    }

    public RegisterCorpusInfoCall$Response(Status status, boolean z) {
        this.a = status;
        this.b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }
}
