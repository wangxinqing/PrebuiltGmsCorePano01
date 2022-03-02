package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Flag;
import java.util.HashSet;

/* renamed from: yea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yea implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Flag[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        long j = 0;
        String str2 = null;
        byte[] bArr = null;
        double d = 0.0d;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    j = ivw.i(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    z = ivw.c(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    d = ivw.n(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    str2 = ivw.q(parcel, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    bArr = ivw.t(parcel, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    i = ivw.g(parcel, readInt);
                    hashSet.add(8);
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
            return new Flag(hashSet, str, j, z, d, str2, bArr, i, i2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
