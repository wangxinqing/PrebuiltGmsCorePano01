package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: nfd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nfd extends bhv implements nff {
    public nfd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.flags.IFlagProvider");
    }

    public final boolean getBooleanFlagValue(String str, boolean z, int i) {
        throw null;
    }

    public final int getIntFlagValue(String str, int i, int i2) {
        throw null;
    }

    public final long getLongFlagValue(String str, long j, int i) {
        throw null;
    }

    public final String getStringFlagValue(String str, String str2, int i) {
        throw null;
    }

    public final void init(mby mby) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        b(1, aQ);
    }
}
