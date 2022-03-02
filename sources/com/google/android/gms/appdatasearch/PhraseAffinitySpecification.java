package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhraseAffinitySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dth();
    final PhraseAffinityCorpusSpec[] a;

    public PhraseAffinitySpecification(PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr) {
        this.a = phraseAffinityCorpusSpecArr;
    }

    public final PhraseAffinityCorpusSpec[] a() {
        return (PhraseAffinityCorpusSpec[]) this.a.clone();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, (Parcelable[]) this.a, i);
        ivx.b(parcel, a2);
    }
}
