package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.internal.OnEventResponse;

/* renamed from: kwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kwh extends bhv implements kwj {
    public kwh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.internal.IEventCallback");
    }

    public final void a(OnEventResponse onEventResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onEventResponse);
        b(1, aQ);
    }
}
