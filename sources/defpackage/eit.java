package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import java.util.ArrayList;

/* renamed from: eit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eit implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        Long l = null;
        ArrayList arrayList = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    break;
                case 2:
                    str = ivw.q(parcel, readInt);
                    break;
                case 3:
                    l = ivw.j(parcel, readInt);
                    break;
                case 4:
                    z = ivw.c(parcel, readInt);
                    break;
                case 5:
                    z2 = ivw.c(parcel, readInt);
                    break;
                case 6:
                    arrayList = ivw.C(parcel, readInt);
                    break;
                case 7:
                    str2 = ivw.q(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new TokenData(i, str, l, z, z2, arrayList, str2);
    }
}
