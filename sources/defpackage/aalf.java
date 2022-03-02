package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Request;

/* renamed from: aalf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aalf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetPhraseAffinityCall$Request[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String[] strArr = null;
        PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                strArr = ivw.A(parcel, readInt);
            } else if (a == 2) {
                phraseAffinityCorpusSpecArr = (PhraseAffinityCorpusSpec[]) ivw.b(parcel, readInt, PhraseAffinityCorpusSpec.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                bundle = ivw.s(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new GetPhraseAffinityCall$Request(strArr, phraseAffinityCorpusSpecArr, bundle);
    }
}
