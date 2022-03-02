package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: zlu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zlu implements ica, icb {
    final /* synthetic */ zlw a;

    public zlu(zlw zlw) {
        this.a = zlw;
    }

    public final void a(int i) {
        zlw zlw = this.a;
        if (zlw.g) {
            zlw.b.t();
        }
    }

    public final void g(Bundle bundle) {
        zlw zlw = this.a;
        zlw.f = zlw.b.a();
        if (!this.a.e.i() && !this.a.e.j()) {
            this.a.e.e();
        }
        zlw zlw2 = this.a;
        if (zlw2.g) {
            zlw2.b.a((yun) zlw2, zlw2.h);
        }
        this.a.i.e();
        this.a.d = true;
    }

    public final void a(ConnectionResult connectionResult) {
        zlv zlv = this.a.i;
        if (zlv != null) {
            zlv.a(connectionResult);
        }
    }
}
