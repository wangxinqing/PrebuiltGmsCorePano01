package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import java.util.HashSet;

/* renamed from: abou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abou implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new D2DDevice[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = null;
        String str3 = null;
        byte[] bArr = null;
        int i = 0;
        byte b2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    i = ivw.g(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    str = ivw.q(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    str2 = ivw.q(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    b2 = ivw.e(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    str3 = ivw.q(parcel, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    bArr = ivw.t(parcel, readInt);
                    hashSet.add(7);
                    break;
                case 9:
                    i2 = ivw.g(parcel, readInt);
                    hashSet.add(9);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new D2DDevice(hashSet, i, str, str2, b2, str3, bArr, i2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
