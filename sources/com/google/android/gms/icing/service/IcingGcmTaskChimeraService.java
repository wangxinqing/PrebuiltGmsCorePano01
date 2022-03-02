package com.google.android.gms.icing.service;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class IcingGcmTaskChimeraService extends qwf {
    public final int a(qxz qxz) {
        oso.a("%s: Running gcm task %s", (Object) "IcingGcmTaskChimeraService", (Object) qxz.a);
        Intent intent = new Intent("com.google.android.gms.icing.GCM_TASK");
        intent.setClassName(this, "com.google.android.gms.icing.service.IndexWorkerService");
        intent.putExtra("tag", qxz.a);
        startService(intent);
        return 0;
    }
}
