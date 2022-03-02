package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.MessageWrapper;
import com.google.android.gms.nearby.messages.internal.UnpublishRequest;

/* renamed from: vdu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vdu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UnpublishRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        MessageWrapper messageWrapper = null;
        IBinder iBinder = null;
        String str = null;
        String str2 = null;
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
                    messageWrapper = (MessageWrapper) ivw.a(parcel, readInt, MessageWrapper.CREATOR);
                    break;
                case 3:
                    iBinder = ivw.r(parcel, readInt);
                    break;
                case 4:
                    str = ivw.q(parcel, readInt);
                    break;
                case 5:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 6:
                    z = ivw.c(parcel, readInt);
                    break;
                case 7:
                    clientAppContext = (ClientAppContext) ivw.a(parcel, readInt, ClientAppContext.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new UnpublishRequest(i, messageWrapper, iBinder, str, str2, z, clientAppContext);
    }
}
