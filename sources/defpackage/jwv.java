package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: jwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jwv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ContextManagerClientInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel, readInt);
                    break;
                case 3:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 4:
                    i = ivw.g(parcel, readInt);
                    break;
                case 5:
                    str3 = ivw.q(parcel, readInt);
                    break;
                case 6:
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 7:
                    i3 = ivw.g(parcel, readInt);
                    break;
                case 8:
                    str4 = ivw.q(parcel, readInt);
                    break;
                case 9:
                    str5 = ivw.q(parcel, readInt);
                    break;
                case 10:
                    i4 = ivw.g(parcel, readInt);
                    break;
                case 11:
                    i5 = ivw.g(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new ContextManagerClientInfo(str, str2, i, str3, i2, i3, str4, str5, i4, i5);
    }
}
