package com.google.android.location.fused.bluepixel;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BluePixelNanoAdapterReal$1 extends nla {
    final /* synthetic */ aihg a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluePixelNanoAdapterReal$1(aihg aihg, String str) {
        super(str);
        this.a = aihg;
    }

    public final void a(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!"com.google.android.gms.phenotype.COMMITTED".equals(action) || !"com.google.android.location".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(action)) {
                    aihg aihg = this.a;
                    int i = aihg.d;
                    if (aihg.a.isPowerSaveMode()) {
                        this.a.e();
                    } else {
                        this.a.d();
                    }
                }
            } else if (!axxm.k()) {
                this.a.e();
            } else if (!axxm.l()) {
                aihg aihg2 = this.a;
                int i2 = aihg.d;
                aihg2.g();
            }
        }
    }
}
