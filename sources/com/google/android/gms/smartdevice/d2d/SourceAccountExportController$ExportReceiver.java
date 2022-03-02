package com.google.android.gms.smartdevice.d2d;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SourceAccountExportController$ExportReceiver extends nla {
    public final /* synthetic */ abpr a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SourceAccountExportController$ExportReceiver(abpr abpr) {
        super("smartdevice");
        this.a = abpr;
    }

    public final void a(Context context, Intent intent) {
        abpr.a.a("Received broadcast %s", intent);
        if (!"com.google.android.gms.auth.ACCOUNT_DATA_AVAILABLE_FOR_SETUP".equals(intent.getAction())) {
            abpr.a.e("Unexpected broadcast action %s", intent.getAction());
            return;
        }
        this.a.d.execute(new abpq(this, intent.getStringArrayExtra("key_extra_ids")));
    }
}
