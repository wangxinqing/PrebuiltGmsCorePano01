package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.sharing.internal.RegisterSendSurfaceParams;

/* renamed from: wah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wah implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RegisterSendSurfaceParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                iBinder = ivw.r(parcel, readInt);
            } else if (a == 2) {
                iBinder2 = ivw.r(parcel, readInt);
            } else if (a == 3) {
                i = ivw.g(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                iBinder3 = ivw.r(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new RegisterSendSurfaceParams(iBinder, iBinder2, i, iBinder3);
    }
}
