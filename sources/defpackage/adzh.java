package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;

/* renamed from: adzh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adzh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AmsEntityUpdateParcelable[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        byte b2 = 0;
        String str = null;
        byte b3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                b2 = ivw.e(parcel, readInt);
            } else if (a == 3) {
                b3 = ivw.e(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                str = ivw.q(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new AmsEntityUpdateParcelable(b2, b3, str);
    }
}
