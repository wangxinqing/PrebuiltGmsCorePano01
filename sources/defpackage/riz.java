package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity;
import java.util.ArrayList;

/* renamed from: riz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class riz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AutocompletePredictionEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        ArrayList arrayList3 = null;
        String str4 = null;
        ArrayList arrayList4 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 2:
                    str = ivw.q(parcel, readInt);
                    break;
                case 3:
                    arrayList = ivw.B(parcel, readInt);
                    break;
                case 4:
                    arrayList2 = ivw.c(parcel, readInt, AutocompletePredictionEntity.SubstringEntity.CREATOR);
                    break;
                case 5:
                    i = ivw.g(parcel, readInt);
                    break;
                case 6:
                    str3 = ivw.q(parcel, readInt);
                    break;
                case 7:
                    arrayList3 = ivw.c(parcel, readInt, AutocompletePredictionEntity.SubstringEntity.CREATOR);
                    break;
                case 8:
                    str4 = ivw.q(parcel, readInt);
                    break;
                case 9:
                    arrayList4 = ivw.c(parcel, readInt, AutocompletePredictionEntity.SubstringEntity.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new AutocompletePredictionEntity(str, arrayList, i, str2, arrayList2, str3, arrayList3, str4, arrayList4);
    }
}
