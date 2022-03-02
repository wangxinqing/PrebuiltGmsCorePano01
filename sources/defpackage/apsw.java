package defpackage;

import android.os.RemoteException;

/* renamed from: apsw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apsw implements apts {
    final /* synthetic */ aptg a;

    public apsw(aptg aptg) {
        this.a = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apum apum = (apum) obj;
        aptg aptg = this.a;
        try {
            aptm aptm = aptg.c;
            aptm.c(7, aptm.aQ());
        } catch (RemoteException e) {
            aptg.b.e("RemoteException when sending email verification response.", e, new Object[0]);
        }
    }

    public final void a(String str) {
        this.a.a(apvs.a(str));
    }
}
