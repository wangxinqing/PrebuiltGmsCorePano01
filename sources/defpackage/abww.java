package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;

/* renamed from: abww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abww extends bhv implements abwy {
    public abww(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.d2d.internal.ISourceBootstrapListener");
    }

    public final void a(BootstrapProgressResult bootstrapProgressResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) bootstrapProgressResult);
        b(1, aQ);
    }

    public final void b() {
        b(2, aQ());
    }

    public final void a(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        b(3, aQ);
    }
}
