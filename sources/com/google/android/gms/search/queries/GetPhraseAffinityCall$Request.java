package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetPhraseAffinityCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aalf();
    public String[] a;
    public PhraseAffinityCorpusSpec[] b;
    public Bundle c;

    public GetPhraseAffinityCall$Request() {
    }

    public GetPhraseAffinityCall$Request(String[] strArr, PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr, Bundle bundle) {
        this.a = strArr;
        this.b = phraseAffinityCorpusSpecArr;
        this.c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, (Parcelable[]) this.b, i);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
