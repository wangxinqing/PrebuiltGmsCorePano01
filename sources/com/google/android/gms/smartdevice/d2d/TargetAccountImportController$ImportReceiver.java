package com.google.android.gms.smartdevice.d2d;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TargetAccountImportController$ImportReceiver extends nla {
    public final /* synthetic */ absy a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TargetAccountImportController$ImportReceiver(absy absy) {
        super("smartdevice");
        this.a = absy;
    }

    public final void a(Context context, Intent intent) {
        absy.a.a("Received broadcast %s", intent);
        String action = intent.getAction();
        if ("com.google.android.gms.smartdevice.setup.RESTORE_DATA".equals(action)) {
            this.a.b.post(new absw(this, intent));
        } else if ("com.google.android.gms.auth.ACCOUNT_DATA_AVAILABLE_FOR_SETUP".equals(action)) {
            this.a.b.post(new absx(this, intent.getStringArrayExtra("key_extra_ids")));
        } else {
            absy.a.e("Unexpected broadcast action %s", action);
        }
    }
}
