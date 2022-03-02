package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import org.chromium.net.UrlRequest;

/* renamed from: vdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vdr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SubscribeRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        IBinder iBinder = null;
        Strategy strategy = null;
        IBinder iBinder2 = null;
        MessageFilter messageFilter = null;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        IBinder iBinder3 = null;
        ClientAppContext clientAppContext = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 2:
                    iBinder = ivw.r(parcel2, readInt);
                    break;
                case 3:
                    strategy = (Strategy) ivw.a(parcel2, readInt, Strategy.CREATOR);
                    break;
                case 4:
                    iBinder2 = ivw.r(parcel2, readInt);
                    break;
                case 5:
                    messageFilter = (MessageFilter) ivw.a(parcel2, readInt, MessageFilter.CREATOR);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) ivw.a(parcel2, readInt, PendingIntent.CREATOR);
                    break;
                case 7:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 8:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 9:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 10:
                    bArr = ivw.t(parcel2, readInt);
                    break;
                case 11:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 12:
                    iBinder3 = ivw.r(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    clientAppContext = (ClientAppContext) ivw.a(parcel2, readInt, ClientAppContext.CREATOR);
                    break;
                case Service.START_CONTINUATION_MASK:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 16:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 17:
                    i4 = ivw.g(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new SubscribeRequest(i, iBinder, strategy, iBinder2, messageFilter, pendingIntent, i2, str, str2, bArr, z, iBinder3, z2, clientAppContext, z3, i3, i4);
    }
}
