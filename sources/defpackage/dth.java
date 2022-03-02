package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.appdatasearch.PhraseAffinitySpecification;

/* renamed from: dth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dth implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PhraseAffinitySpecification[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 1) {
                ivw.b(parcel, readInt);
            } else {
                phraseAffinityCorpusSpecArr = (PhraseAffinityCorpusSpec[]) ivw.b(parcel, readInt, PhraseAffinityCorpusSpec.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new PhraseAffinitySpecification(phraseAffinityCorpusSpecArr);
    }
}
