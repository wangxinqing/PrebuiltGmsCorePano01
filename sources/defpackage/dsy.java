package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;

/* renamed from: dsy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dsy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GlobalSearchCorpusConfig[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int[] iArr = null;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                iArr = ivw.w(parcel, readInt);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                featureArr = (Feature[]) ivw.b(parcel, readInt, Feature.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new GlobalSearchCorpusConfig(iArr, featureArr);
    }
}
