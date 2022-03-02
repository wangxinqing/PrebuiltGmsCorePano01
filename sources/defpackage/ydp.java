package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Flag;

/* renamed from: ydp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ydp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Configuration[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Flag[] flagArr = null;
        String[] strArr = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a == 3) {
                flagArr = (Flag[]) ivw.b(parcel, readInt, Flag.CREATOR);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                strArr = ivw.A(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new Configuration(i, flagArr, strArr);
    }
}
