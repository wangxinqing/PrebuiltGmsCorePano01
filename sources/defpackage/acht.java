package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import java.util.HashSet;

/* renamed from: acht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acht implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Challenge[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                i = ivw.g(parcel, readInt);
                hashSet.add(2);
            } else if (a == 3) {
                str = ivw.q(parcel, readInt);
                hashSet.add(3);
            } else if (a == 4) {
                str2 = ivw.q(parcel, readInt);
                hashSet.add(4);
            } else if (a == 5) {
                bArr = ivw.t(parcel, readInt);
                hashSet.add(5);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                bArr2 = ivw.t(parcel, readInt);
                hashSet.add(6);
            }
        }
        if (parcel.dataPosition() == b) {
            return new Challenge(hashSet, i, str, str2, bArr, bArr2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
