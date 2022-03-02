package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.lso.AuthApps;
import java.util.HashSet;

/* renamed from: iwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iwh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AuthApps.Apps.Clients[i];
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
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    str2 = ivw.q(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    str3 = ivw.q(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    str4 = ivw.q(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    str5 = ivw.q(parcel, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    str6 = ivw.q(parcel, readInt);
                    hashSet.add(7);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AuthApps.Apps.Clients(hashSet, str, str2, str3, str4, str5, str6);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
