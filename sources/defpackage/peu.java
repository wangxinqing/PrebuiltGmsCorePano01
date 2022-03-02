package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: peu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class peu implements aoqb {
    private final pez a;
    private final anuc b;
    private final Bundle c;

    public peu(pez pez, anuc anuc, Bundle bundle) {
        this.a = pez;
        this.b = anuc;
        this.c = bundle;
    }

    public final aorr a(Object obj) {
        aorr a2;
        boolean z;
        aosh aosh;
        pez pez = this.a;
        anuc anuc = this.b;
        Bundle bundle = this.c;
        Void voidR = (Void) obj;
        synchronized (pez.e) {
            int size = anuc.b.size();
            int size2 = pez.e.size();
            StringBuilder sb = new StringBuilder(61);
            sb.append("Uploading list of ");
            sb.append(size);
            sb.append(" apps for ");
            sb.append(size2);
            sb.append(" account(s)");
            Log.i("AppsUpload", sb.toString());
            ArrayList arrayList = new ArrayList();
            for (Map.Entry value : pez.e.entrySet()) {
                per per = (per) value.getValue();
                boolean z2 = false;
                if (bundle == null || bundle.getBoolean("skip_upload_for_unchanged", true)) {
                    z = true;
                } else {
                    z = false;
                }
                aucd aucd = (aucd) anuc.c(5);
                aucd.a((aucj) anuc);
                anub anub = (anub) aucd;
                auay a3 = auay.a(per.e);
                if (anub.c) {
                    anub.c();
                    anub.c = false;
                }
                anuc anuc2 = (anuc) anub.b;
                anuc anuc3 = anuc.e;
                anuc2.c = a3.l();
                anuc2.a |= 1;
                anuc anuc4 = (anuc) anub.i();
                try {
                    synchronized (per.f) {
                        if (per.i == null) {
                            per.i = aosh.f();
                        }
                        if (per.h == null) {
                            z2 = z;
                        } else if (per.j && z) {
                            z2 = true;
                        }
                        per.j = z2;
                        per.h = anuc4;
                        aosh = per.i;
                    }
                    per.a();
                    arrayList.add(aosh);
                } catch (Throwable th) {
                    per.a();
                    throw th;
                }
            }
            a2 = aorl.b((Iterable) arrayList).a(pew.a, pez.c);
        }
        return a2;
    }
}
