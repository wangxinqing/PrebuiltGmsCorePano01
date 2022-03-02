package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import java.util.HashSet;

/* renamed from: acik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acik implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserCredential[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    i = ivw.g(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    str2 = ivw.q(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    str3 = ivw.q(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    str4 = ivw.q(parcel, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    str5 = ivw.q(parcel, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    str6 = ivw.q(parcel, readInt);
                    hashSet.add(8);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new UserCredential(hashSet, str, i, str2, str3, str4, str5, str6);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
