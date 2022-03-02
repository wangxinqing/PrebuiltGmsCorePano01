package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: vyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vyo extends bhv implements vyq {
    public vyo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.sharing.internal.IStringResultListener");
    }

    public final void a(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        c(1, aQ);
    }
}
