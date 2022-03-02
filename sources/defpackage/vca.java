package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.GetPermissionStatusRequest;

/* renamed from: vca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vca implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetPermissionStatusRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        IBinder iBinder = null;
        String str = null;
        ClientAppContext clientAppContext = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                iBinder = ivw.r(parcel, readInt);
            } else if (a == 3) {
                str = ivw.q(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                clientAppContext = (ClientAppContext) ivw.a(parcel, readInt, ClientAppContext.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new GetPermissionStatusRequest(i, iBinder, str, clientAppContext);
    }
}
