package defpackage;

import android.os.RemoteException;

/* renamed from: apst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apst implements apts {
    final /* synthetic */ apts a;
    final /* synthetic */ apsu b;

    public apst(apsu apsu, apts apts) {
        this.b = apsu;
        this.a = apts;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
        aptg aptg = this.b.a;
        try {
            aptm aptm = aptg.c;
            aptm.c(6, aptm.aQ());
        } catch (RemoteException e) {
            aptg.b.e("RemoteException when sending delete account response.", e, new Object[0]);
        }
    }

    public final void a(String str) {
        this.a.a(str);
    }
}
