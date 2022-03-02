package com.google.android.gms.tron;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ModuleInitializer extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        int i2;
        Intent a = CollectionChimeraService.a((Context) this);
        if ((i & 2) == 0) {
            i2 = (i & 4) == 0 ? (i & 8) != 0 ? 5 : 0 : 4;
        } else {
            i2 = 3;
        }
        a.putExtra("com.google.android.gms.tron.extra.reason", i2);
        startService(a);
    }
}
