package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: gds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gds extends bhv implements gdu {
    public gds(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
    }

    public final long b() {
        Parcel a = a(1, aQ());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }

    public final long c() {
        Parcel a = a(2, aQ());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }
}
