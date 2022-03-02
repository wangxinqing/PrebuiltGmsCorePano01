package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;

/* renamed from: lmh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lmh extends bhv implements IInterface {
    public lmh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.realtime.internal.IEventCallback");
    }

    public final void a(ParcelableEventList parcelableEventList) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) parcelableEventList);
        b(1, aQ);
    }
}
