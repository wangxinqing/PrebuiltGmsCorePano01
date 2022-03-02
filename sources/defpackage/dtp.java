package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.ScoringConfig;

/* renamed from: dtp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dtp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RegisterSectionInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Feature[] featureArr = null;
        String str4 = null;
        ScoringConfig scoringConfig = null;
        boolean z = false;
        int i = 1;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 11) {
                str4 = ivw.q(parcel, readInt);
            } else if (a != 12) {
                switch (a) {
                    case 1:
                        str = ivw.q(parcel, readInt);
                        break;
                    case 2:
                        str2 = ivw.q(parcel, readInt);
                        break;
                    case 3:
                        z = ivw.c(parcel, readInt);
                        break;
                    case 4:
                        i = ivw.g(parcel, readInt);
                        break;
                    case 5:
                        z2 = ivw.c(parcel, readInt);
                        break;
                    case 6:
                        str3 = ivw.q(parcel, readInt);
                        break;
                    case 7:
                        featureArr = (Feature[]) ivw.b(parcel, readInt, Feature.CREATOR);
                        break;
                    default:
                        ivw.b(parcel, readInt);
                        break;
                }
            } else {
                scoringConfig = (ScoringConfig) ivw.a(parcel, readInt, ScoringConfig.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new RegisterSectionInfo(str, str2, z, i, z2, str3, featureArr, str4, scoringConfig);
    }
}
