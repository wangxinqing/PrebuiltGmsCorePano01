package com.google.android.gms.phonesky.recovery;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhoneskyRecoveryModuleInitIntentOperation extends hec {
    public final void a(Intent intent, int i) {
        int i2 = i & 4;
        int i3 = i & 8;
        if ((i & 2) == 0 && i2 == 0 && i3 == 0) {
            yja.b("Module triggered without updates or boot complete", new Object[0]);
        } else {
            new yje(this).a();
        }
    }
}
