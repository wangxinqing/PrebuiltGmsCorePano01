package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: adyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adyj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
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
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 6:
                    z = ivw.c(parcel, readInt);
                    break;
                case 7:
                    z2 = ivw.c(parcel, readInt);
                    break;
                case 8:
                    str3 = ivw.q(parcel, readInt);
                    break;
                case 9:
                    z3 = ivw.c(parcel, readInt);
                    break;
                case 10:
                    str4 = ivw.q(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new ConnectionConfiguration(str, str2, i, i2, z, z2, str3, z3, str4);
    }
}
