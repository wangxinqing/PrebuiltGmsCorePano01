package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.PlusSession;

/* renamed from: ywi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ywi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlusSession[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        PlusCommonExtras plusCommonExtras = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        str = ivw.q(parcel, readInt);
                        break;
                    case 2:
                        strArr = ivw.A(parcel, readInt);
                        break;
                    case 3:
                        strArr2 = ivw.A(parcel, readInt);
                        break;
                    case 4:
                        strArr3 = ivw.A(parcel, readInt);
                        break;
                    case 5:
                        str2 = ivw.q(parcel, readInt);
                        break;
                    case 6:
                        str3 = ivw.q(parcel, readInt);
                        break;
                    case 7:
                        str4 = ivw.q(parcel, readInt);
                        break;
                    case 8:
                        str5 = ivw.q(parcel, readInt);
                        break;
                    case 9:
                        plusCommonExtras = (PlusCommonExtras) ivw.a(parcel, readInt, PlusCommonExtras.CREATOR);
                        break;
                    default:
                        ivw.b(parcel, readInt);
                        break;
                }
            } else {
                i = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new PlusSession(i, str, strArr, strArr2, strArr3, str2, str3, str4, str5, plusCommonExtras);
    }
}
