package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CorpusScoringInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dsj();
    public final CorpusId a;
    public final int b;
    public final int c;

    public CorpusScoringInfo(CorpusId corpusId, int i, int i2) {
        this.a = corpusId;
        this.b = i;
        this.c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.b(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
