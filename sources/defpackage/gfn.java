package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.frp.FrpSnapshot;

/* renamed from: gfn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gfn extends bhv implements gfp {
    public gfn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.frp.IFrpService");
    }

    public final boolean b() {
        Parcel a = a(1, aQ());
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final boolean c() {
        Parcel a = a(2, aQ());
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final FrpSnapshot d() {
        Parcel a = a(5, aQ());
        FrpSnapshot frpSnapshot = (FrpSnapshot) bhx.a(a, FrpSnapshot.CREATOR);
        a.recycle();
        return frpSnapshot;
    }
}
