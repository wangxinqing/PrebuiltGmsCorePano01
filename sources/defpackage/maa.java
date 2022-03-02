package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: maa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class maa extends bhv implements mac {
    public maa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.droidguard.internal.IDroidGuardService");
    }

    public final lzz b() {
        lzz lzz;
        Parcel a = a(2, aQ());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            lzz = queryLocalInterface instanceof lzz ? (lzz) queryLocalInterface : new lzx(readStrongBinder);
        } else {
            lzz = null;
        }
        a.recycle();
        return lzz;
    }
}
