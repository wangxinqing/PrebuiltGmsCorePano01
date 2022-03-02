package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* renamed from: snx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class snx extends ihg {
    final /* synthetic */ ige a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public snx(igc igc, ige ige) {
        super(igc);
        this.a = ige;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        sol sol = (sol) ibf;
        igc igc = this.a.b;
        if (igc != null) {
            synchronized (sol.a) {
                sob sob = (sob) sol.a.remove(igc);
                if (sob == null) {
                    Log.w("MdnsServiceBrowserImpl", "Tried to unregister nonexistent listener");
                } else {
                    soa soa = (soa) sol.x();
                    Parcel aQ = soa.aQ();
                    bhx.a(aQ, (IInterface) sob);
                    soa.b(2, aQ);
                }
            }
        }
        acwd.a((Object) true);
    }
}
