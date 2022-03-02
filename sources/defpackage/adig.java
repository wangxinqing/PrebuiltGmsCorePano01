package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: adig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adig extends bhv implements adii {
    public adig(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.update.ISystemUpdateService");
    }

    public final void a(boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, false);
        b(5, aQ);
    }

    public final int b() {
        Parcel a = a(2, aQ());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final long c() {
        Parcel a = a(3, aQ());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }

    public final int d() {
        Parcel a = a(4, aQ());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final void e() {
        b(18, aQ());
    }

    public final void b(boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, true);
        b(6, aQ);
    }

    public final void c(boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, z);
        b(9, aQ);
    }
}
