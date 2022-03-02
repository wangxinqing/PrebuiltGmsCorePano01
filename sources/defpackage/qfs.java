package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.instantapps.internal.AtomInfo;

/* renamed from: qfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qfs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AtomInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        int[] iArr = null;
        byte[] bArr = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel, readInt);
                    break;
                case 4:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 5:
                    strArr = ivw.A(parcel, readInt);
                    break;
                case 6:
                    i = ivw.g(parcel, readInt);
                    break;
                case 7:
                    bArr = ivw.t(parcel, readInt);
                    break;
                case 8:
                    iArr = ivw.w(parcel, readInt);
                    break;
                case 9:
                    z = ivw.c(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new AtomInfo(str, str2, strArr, iArr, i, bArr, z);
    }
}
