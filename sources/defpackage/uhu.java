package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;

/* renamed from: uhu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uhu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OnDisconnectedParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 1) {
                ivw.b(parcel, readInt);
            } else {
                str = ivw.q(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new OnDisconnectedParams(str);
    }
}
