package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.setup.accounts.StarguardData;
import java.util.HashSet;

/* renamed from: acii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acii implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StarguardData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 2) {
                ivw.b(parcel, readInt);
            } else {
                str = ivw.q(parcel, readInt);
                hashSet.add(2);
            }
        }
        if (parcel.dataPosition() == b) {
            return new StarguardData(hashSet, str);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
