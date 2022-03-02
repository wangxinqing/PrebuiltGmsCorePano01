package com.google.android.location.contexthub;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NanoAppClearcutLoggingP$1 extends nla {
    public final /* synthetic */ ahzc a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NanoAppClearcutLoggingP$1(ahzc ahzc, String str) {
        super(str);
        this.a = ahzc;
    }

    public final void a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (aydo.c() && "com.google.android.location".equals(stringExtra)) {
            ahzc ahzc = this.a;
            int i = ahzc.f;
            ahzc.a.post(new ahza(this));
        } else if (!aydo.c()) {
            ahzc ahzc2 = this.a;
            int i2 = ahzc.f;
            ahzc2.a.post(new ahzb(this));
        }
    }
}
