package com.google.android.gms.instantapps;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.instantapps.routing.DomainFilterUpdateChimeraService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ModuleInitializer extends hec {
    private static final String[] a = new String[0];

    static {
        new qfn("ModuleInitializer");
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        DomainFilterUpdateChimeraService.a((Context) this);
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        new Object[1][0] = Integer.valueOf(i);
        for (String valueOf : a) {
            String valueOf2 = String.valueOf(valueOf);
            String str = valueOf2.length() == 0 ? new String("com.google.android.gms.instantapps.") : "com.google.android.gms.instantapps.".concat(valueOf2);
            new Object[1][0] = str;
            jhg.a((Context) this, str, true);
        }
        DomainFilterUpdateChimeraService.c();
    }
}
