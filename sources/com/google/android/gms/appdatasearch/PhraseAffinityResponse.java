package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhraseAffinityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dtg();
    public final String a;
    final CorpusId[] b;
    final int[] c;

    public PhraseAffinityResponse(String str, CorpusId[] corpusIdArr, int[] iArr) {
        this.a = str;
        this.b = corpusIdArr;
        this.c = iArr;
    }

    public PhraseAffinityResponse(CorpusId[] corpusIdArr, int[] iArr) {
        this((String) null, corpusIdArr, iArr);
        int length = corpusIdArr.length;
        boolean z = true;
        if (!(length == 0 || iArr.length % length == 0)) {
            z = false;
        }
        iva.b(z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, (Parcelable[]) this.b, i);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
