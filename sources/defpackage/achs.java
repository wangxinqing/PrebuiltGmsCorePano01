package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import java.util.HashSet;

/* renamed from: achs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class achs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Assertion[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    bArr = ivw.t(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    bArr2 = ivw.t(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    bArr3 = ivw.t(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    bArr4 = ivw.t(parcel, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    i = ivw.g(parcel, readInt);
                    hashSet.add(7);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Assertion(hashSet, str, bArr, bArr2, bArr3, bArr4, i);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
