package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.HandleClientLifecycleEventRequest;

/* renamed from: vcb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vcb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new HandleClientLifecycleEventRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int i = 0;
        ClientAppContext clientAppContext = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                clientAppContext = (ClientAppContext) ivw.a(parcel, readInt, ClientAppContext.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                i2 = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new HandleClientLifecycleEventRequest(i, clientAppContext, i2);
    }
}
