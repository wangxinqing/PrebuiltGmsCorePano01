package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.RegisterStatusCallbackRequest;

/* renamed from: vdq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vdq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RegisterStatusCallbackRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str = null;
        ClientAppContext clientAppContext = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    break;
                case 2:
                    iBinder = ivw.r(parcel, readInt);
                    break;
                case 3:
                    iBinder2 = ivw.r(parcel, readInt);
                    break;
                case 4:
                    z = ivw.c(parcel, readInt);
                    break;
                case 5:
                    str = ivw.q(parcel, readInt);
                    break;
                case 6:
                    clientAppContext = (ClientAppContext) ivw.a(parcel, readInt, ClientAppContext.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new RegisterStatusCallbackRequest(i, iBinder, iBinder2, z, str, clientAppContext);
    }
}
