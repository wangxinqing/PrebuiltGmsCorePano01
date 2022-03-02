package com.google.android.gms.nearby.sharing;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SharingSyncChimeraService extends qwf {
    public final int a(qxz qxz) {
        ((anih) vvj.a.d()).a("SharingSyncChimeraService periodic task firing now.");
        Intent intent = new Intent("com.google.android.gms.nearby.sharing.SYNC_SERVER");
        intent.setPackage(getPackageName());
        thp.a((Context) this, intent);
        return 0;
    }
}
