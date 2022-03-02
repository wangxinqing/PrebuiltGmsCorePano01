package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.connection.ConnectionOptions;

/* renamed from: tio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tio implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConnectionOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        byte[] bArr = null;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 2:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 3:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 4:
                    z4 = ivw.c(parcel2, readInt);
                    break;
                case 5:
                    z5 = ivw.c(parcel2, readInt);
                    break;
                case 6:
                    z6 = ivw.c(parcel2, readInt);
                    break;
                case 7:
                    z7 = ivw.c(parcel2, readInt);
                    break;
                case 8:
                    z8 = ivw.c(parcel2, readInt);
                    break;
                case 9:
                    bArr = ivw.t(parcel2, readInt);
                    break;
                case 10:
                    z9 = ivw.c(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new ConnectionOptions(z, z2, z3, z4, z5, z6, z7, z8, bArr, z9);
    }
}
