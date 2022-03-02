package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;

/* renamed from: dsw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dsw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GlobalSearchApplicationInfo[i];
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
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel, readInt);
                    break;
                case 2:
                    i = ivw.g(parcel, readInt);
                    break;
                case 3:
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 4:
                    i3 = ivw.g(parcel, readInt);
                    break;
                case 5:
                    str3 = ivw.q(parcel, readInt);
                    break;
                case 6:
                    str4 = ivw.q(parcel, readInt);
                    break;
                case 7:
                    str5 = ivw.q(parcel, readInt);
                    break;
                case 8:
                    str2 = ivw.q(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new GlobalSearchApplicationInfo(str, str2, i, i2, i3, str3, str4, str5);
    }
}
