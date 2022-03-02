package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: aptc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aptc implements apts {
    final /* synthetic */ aptg a;

    public aptc(aptg aptg) {
        this.a = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aptg aptg = this.a;
        String str = ((apuy) obj).a;
        try {
            aptm aptm = aptg.c;
            Parcel aQ = aptm.aQ();
            aQ.writeString(str);
            aptm.c(8, aQ);
        } catch (RemoteException e) {
            aptg.b.e("RemoteException when sending set account info response.", e, new Object[0]);
        }
    }

    public final void a(String str) {
        this.a.a(apvs.a(str));
    }
}
