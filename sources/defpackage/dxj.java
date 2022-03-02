package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: dxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dxj implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ dxm a;

    public dxj(dxm dxm) {
        this.a = dxm;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        dxm dxm = this.a;
        dzj dzj = new dzj(dxm.e, dxm.h, "80", "com.google.android.gms");
        dzj.a(this.a.t);
        return dzj;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        zni zni;
        ilh ilh = (ilh) obj;
        if (ilh != null) {
            this.a.p.clear();
            int a2 = ilh.a();
            for (int i = 0; i < a2; i++) {
                this.a.p.add(new dxl(eap.a((xfj) ilh.a(i), this.a.i), (ContactPerson.ContactMethod) null, 3));
            }
            dxm dxm = this.a;
            dxg dxg = new dxg(dxm, dxm.p);
            dxm dxm2 = this.a;
            zni[] zniArr = new zni[4];
            zniArr[0] = dxm2.y;
            zniArr[1] = dxm2.x;
            zniArr[2] = dxg;
            if (!dxm2.r.a()) {
                zni = this.a.w;
            } else {
                zni = this.a.v;
            }
            zniArr[3] = zni;
            dxm2.a((zni) new znh(zniArr));
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
