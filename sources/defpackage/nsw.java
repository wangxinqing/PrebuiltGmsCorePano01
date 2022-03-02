package defpackage;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: nsw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nsw extends bhv implements nsy {
    public nsw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gcm.IMessengerConnection");
    }

    public final void a(Message message) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) message);
        c(1, aQ);
    }

    public final void b() {
        c(2, aQ());
    }
}
