package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdns.MdnsOptions;

/* renamed from: sns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sns implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MdnsOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                str2 = ivw.q(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new MdnsOptions(str, str2);
    }
}
