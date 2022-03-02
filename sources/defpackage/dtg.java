package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;

/* renamed from: dtg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dtg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PhraseAffinityResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        CorpusId[] corpusIdArr = null;
        int[] iArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                corpusIdArr = (CorpusId[]) ivw.b(parcel, readInt, CorpusId.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                iArr = ivw.w(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new PhraseAffinityResponse(str, corpusIdArr, iArr);
    }
}
