package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

/* renamed from: vdw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vdw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UnsubscribeRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        ClientAppContext clientAppContext = null;
        int i = 0;
        int i2 = 0;
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
                    pendingIntent = (PendingIntent) ivw.a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 6:
                    str = ivw.q(parcel, readInt);
                    break;
                case 7:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 8:
                    z = ivw.c(parcel, readInt);
                    break;
                case 9:
                    clientAppContext = (ClientAppContext) ivw.a(parcel, readInt, ClientAppContext.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new UnsubscribeRequest(i, iBinder, iBinder2, pendingIntent, i2, str, str2, z, clientAppContext);
    }
}
