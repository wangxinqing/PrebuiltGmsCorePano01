package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dxw implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ dxx a;
    private final Loader b;

    public dxw(dxx dxx, Loader loader) {
        this.a = dxx;
        this.b = loader;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return this.b;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        char c;
        ArrayList arrayList = (ArrayList) obj;
        int id = loader.getId();
        boolean z = false;
        if (arrayList != null) {
            LoaderSectionInfo loaderSectionInfo = (LoaderSectionInfo) this.a.v.get(id);
            List a2 = this.a.a(id, (List) arrayList);
            String str = loaderSectionInfo.a;
            if (str.hashCode() == 315730723 && str.equals("suggested")) {
                c = 0;
            } else {
                c = 65535;
            }
            if (c != 0) {
                this.a.H = a2.size();
            } else {
                this.a.G = a2.size();
            }
            if (loaderSectionInfo.e) {
                ArrayList arrayList2 = new ArrayList(a2);
                dxx dxx = this.a;
                eap.a((List) arrayList2, (List) dxx.m, (List) dxx.n, (List) dxx.o);
                this.a.E.n.addAll(arrayList2);
            }
        }
        if (!this.a.w.get(id, false)) {
            if ((loader instanceof dzg) && !((dzg) loader).a) {
                z = true;
            }
            this.a.w.put(id, true);
            this.a.c(z);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
