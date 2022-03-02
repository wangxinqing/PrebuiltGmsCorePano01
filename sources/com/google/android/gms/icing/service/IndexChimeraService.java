package com.google.android.gms.icing.service;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class IndexChimeraService extends jaz {
    private prm a;

    public IndexChimeraService() {
        super(new int[]{21, 30, 33, 32, 36, 66, 78}, new String[]{"com.google.android.gms.icing.INDEX_SERVICE"}, Collections.emptySet(), 1, 9);
    }

    public final osf a() {
        iva.a((Object) this.a);
        return this.a.b();
    }

    public final ppp b() {
        iva.a((Object) this.a);
        return this.a.c;
    }

    public final void onCreate() {
        oso.a("%s: IndexService onCreate", (Object) "main");
        if (axsd.f()) {
            this.a = prm.a("main", getApplicationContext());
            a();
            pnm.b(this);
        }
        super.onCreate();
    }

    public final void onDestroy() {
        oso.a("%s: IndexService onDestroy", (Object) "main");
        prm prm = this.a;
        if (prm != null) {
            prm.a();
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        oso.a("%s: IndexService: onStartCommand with %s", (Object) "main", (Object) intent);
        if (intent == null || !"com.google.android.gms.icing.INDEX_SERVICE".equals(intent.getAction())) {
            return 2;
        }
        intent.setClassName(this, "com.google.android.gms.icing.service.IndexWorkerService");
        startService(intent);
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        oso.a("%s: Unbind", (Object) "main");
        return false;
    }

    public final void a(jbb jbb, int i, jbh jbh) {
        if (i != 0) {
            try {
                jbb.a(i, new Bundle());
            } catch (Throwable th) {
                oso.a(th, "Service broker callback failed");
                a().r.a("postinit_failed");
            }
        } else {
            jbb.a(jbh);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(jbb jbb, GetServiceRequest getServiceRequest) {
        String str;
        if (this.a != null) {
            String str2 = getServiceRequest.d;
            iyc iyc = (iyc) amrh.a(iyc.a(getServiceRequest.b), iyc.UNKNOWN);
            int callingUid = Binder.getCallingUid();
            int i = getServiceRequest.c;
            Bundle bundle = getServiceRequest.g;
            if (bundle != null) {
                str = bundle.getString("ComponentName");
            } else {
                str = null;
            }
            b().d(new prb(this, aonk.GET_CLIENT_SERVICE_INTERFACE, str2, jbb, str2, iyc, i, callingUid, str));
            return;
        }
        oso.a("IndexService is unavailable on this device");
        jbb.a(16, new Bundle());
    }

    public final void a(oyz oyz, jbb jbb, jbh jbh) {
        boolean z;
        try {
            oyq oyq = a().r;
            synchronized (oyz.e) {
                if (oyz.g != null) {
                    if (oyz.b.equals("com.google.android.gms")) {
                        z = oyz.g.contains(" getStringResource threw a NPE");
                    } else {
                        z = false;
                    }
                    if (!z) {
                        throw new pau(oyz.g);
                    }
                } else {
                    z = false;
                }
            }
            if (z && oyq != null) {
                oyq.a("b28339005");
            }
            a(jbb, 0, jbh);
        } catch (pau e) {
            oso.b(e.getMessage());
            a(jbb, 10, jbh);
        }
    }
}
