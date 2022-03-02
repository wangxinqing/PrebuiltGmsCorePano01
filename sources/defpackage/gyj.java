package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: gyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gyj extends bhv implements gyl {
    public gyj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.checkin.internal.ICheckinService");
    }

    public final String b() {
        Parcel a = a(1, aQ());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final long c() {
        Parcel a = a(2, aQ());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }
}
