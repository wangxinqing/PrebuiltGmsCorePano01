package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import java.util.HashSet;

/* renamed from: abnv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abnv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BootstrapAccount[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                str = ivw.q(parcel, readInt);
                hashSet.add(2);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                str2 = ivw.q(parcel, readInt);
                hashSet.add(3);
            }
        }
        if (parcel.dataPosition() == b) {
            return new BootstrapAccount(hashSet, str, str2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
