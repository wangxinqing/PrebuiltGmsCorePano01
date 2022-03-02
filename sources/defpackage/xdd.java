package defpackage;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* renamed from: xdd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xdd extends xdg {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xdd(icc icc, String str, int i, int i2) {
        super(icc);
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        xbi xbi = (xbi) ibf;
        String str = this.a;
        int i = this.b;
        int i2 = this.c;
        xay xay = new xay(this);
        itp itp = null;
        try {
            itp = xbi.A().b(xay, str, (String) null, i, i2);
        } catch (RemoteException e) {
            xay.a(8, (Bundle) null, (ParcelFileDescriptor) null, (Bundle) null);
        }
        a(itp);
    }
}
