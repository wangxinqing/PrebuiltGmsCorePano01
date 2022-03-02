package com.google.android.gms.icing.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.icing.proxy.IcingInternalCorporaUpdateChimeraService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class IcingModuleInitIntentOperation extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        oso.d("IcingModuleInitIntentOperation.onInitRuntimeState: got intent: %s with flag %d", intent, Integer.valueOf(i));
        Context baseContext = getBaseContext();
        int i2 = i & 2;
        if ((i & 12) > 0) {
            oso.d("IcingModuleInitIntentOperation.onInitRuntimeState: module or container updated.");
            pnm.a(baseContext);
        } else if (i2 > 0) {
            oso.d("IcingModuleInitIntentOperation.onInitRuntimeState: boot completed.");
        } else {
            oso.d("IcingModuleInitIntentOperation.onInitRuntimeState: Nothing happened returning.");
            return;
        }
        pnm.b(baseContext);
        SystemEventIntentOperation.a(baseContext, intent);
        IcingInternalCorporaUpdateChimeraService.b(baseContext);
        if (((Boolean) ozx.b.c()).booleanValue()) {
            qwq a = qwq.a((Context) ihs.b());
            qxi qxi = new qxi();
            qxi.k = "InternalCorporaMaintenance";
            qxi.n = true;
            qxi.a(((Boolean) ozx.d.c()).booleanValue());
            qxi.a(2);
            qxi.a(1, 1);
            qxi.i = "com.google.android.gms.icing.proxy.IcingInternalCorporaUpdateService";
            qxi.b(1);
            long longValue = ((Long) ozx.c.c()).longValue();
            long longValue2 = ((Long) ozx.e.c()).longValue();
            if (!axcc.e()) {
                qxi.a = longValue;
                qxi.b = longValue2;
            } else {
                qxi.a(qxe.a(longValue));
            }
            a.a((qxx) qxi.b());
            pnz.a("Internal Corpora Maintenance is scheduled");
        }
        if (pbq.a()) {
            pbt.a();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, boolean z) {
        oso.d("IcingModuleInitIntentOperation.onModuleUpdated got intent: %s (containerUpdated=%b)", intent, Boolean.valueOf(z));
    }
}
