package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: eez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eez extends bhv implements efb {
    public eez(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.audiomodem.internal.IAudioModemCallback");
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        b(1, aQ);
    }
}
