package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: appa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class appa implements appd {
    final /* synthetic */ appf a;

    public appa(appf appf) {
        this.a = appf;
    }

    public final void a(aptg aptg, Object... objArr) {
        String str = this.a.i;
        try {
            aptm aptm = aptg.c;
            Parcel aQ = aptm.aQ();
            aQ.writeString(str);
            aptm.c(11, aQ);
        } catch (RemoteException e) {
            aptg.b.e("RemoteException when sending auto retrieval timeout response.", e, new Object[0]);
        }
    }
}
