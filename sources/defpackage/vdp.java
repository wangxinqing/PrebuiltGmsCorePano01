package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.MessageWrapper;
import com.google.android.gms.nearby.messages.internal.PublishRequest;

/* renamed from: vdp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vdp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PublishRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        MessageWrapper messageWrapper = null;
        Strategy strategy = null;
        IBinder iBinder = null;
        String str = null;
        String str2 = null;
        IBinder iBinder2 = null;
        ClientAppContext clientAppContext = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 2:
                    messageWrapper = (MessageWrapper) ivw.a(parcel2, readInt, MessageWrapper.CREATOR);
                    break;
                case 3:
                    strategy = (Strategy) ivw.a(parcel2, readInt, Strategy.CREATOR);
                    break;
                case 4:
                    iBinder = ivw.r(parcel2, readInt);
                    break;
                case 5:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 8:
                    iBinder2 = ivw.r(parcel2, readInt);
                    break;
                case 9:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 10:
                    clientAppContext = (ClientAppContext) ivw.a(parcel2, readInt, ClientAppContext.CREATOR);
                    break;
                case 11:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new PublishRequest(i, messageWrapper, strategy, iBinder, str, str2, z, iBinder2, z2, clientAppContext, i2);
    }
}
