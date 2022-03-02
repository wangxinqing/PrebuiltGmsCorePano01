package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;

/* renamed from: mbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mbr implements mbu {
    final /* synthetic */ Bundle a;
    final /* synthetic */ mbv b;

    public mbr(mbv mbv, Bundle bundle) {
        this.b = mbv;
        this.a = bundle;
    }

    public final int a() {
        return 1;
    }

    public final void b() {
        rqq rqq = this.b.c;
        Bundle bundle = this.a;
        try {
            Bundle bundle2 = new Bundle();
            rut.a(bundle, bundle2);
            rqq.b.a(bundle2);
            rut.a(bundle2, bundle);
            rqq.c = (View) mbz.a(rqq.b.f());
            rqq.a.removeAllViews();
            rqq.a.addView(rqq.c);
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }
}
