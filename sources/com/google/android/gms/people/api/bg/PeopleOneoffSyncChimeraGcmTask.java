package com.google.android.gms.people.api.bg;

import android.content.Context;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PeopleOneoffSyncChimeraGcmTask extends qwf {
    public final int a(qxz qxz) {
        int i;
        xej.a((Context) this).a();
        qwq a = wna.a(getApplicationContext());
        qxi qxi = new qxi();
        qxi.k = "PeoplePeriodicSyncGcmTask";
        qxi.i = "com.google.android.gms.people.service.bg.PeoplePeriodicSyncGcmTask";
        qxi.a = aywy.g();
        qxi.a((int) aywy.i());
        boolean h = aywy.h();
        if (axcc.b() || aywy.h()) {
            i = 1;
        } else {
            i = 0;
        }
        qxi.a(h ? 1 : 0, i);
        qxi.b = aywy.f();
        qxi.b(1);
        a.a((qxx) qxi.b());
        return 0;
    }
}
