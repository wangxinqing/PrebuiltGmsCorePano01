package com.google.android.gms.googlehelp.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InvalidateGcmTokenGcmTaskChimeraService extends qwf {
    public static void a(Context context) {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_HEARTBEAT_NOW");
        intent.setPackage("com.google.android.gms");
        context.sendBroadcast(intent);
    }

    public static void a(Context context, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("REMAINING", i);
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.googlehelp.gcm.InvalidateGcmTokenGcmTaskService";
        qxf.k = "HEARTBEAT";
        qxf.a(axmj.a.a().ab(), axmj.a.a().W());
        qxf.s = bundle;
        qxf.b(1);
        qxf.n = true;
        qwq.a(context).a((qxx) qxf.b());
    }

    public final int a(qxz qxz) {
        if (!TextUtils.equals(qxz.a, "HEARTBEAT")) {
            String valueOf = String.valueOf(qxz.a);
            Log.w("gH_GcmHeartbeatsService", valueOf.length() == 0 ? new String("Unrecognized task tag: ") : "Unrecognized task tag: ".concat(valueOf));
            return 0;
        }
        a((Context) this);
        int i = qxz.b.getInt("REMAINING");
        if (i > 0) {
            a(this, i - 1);
        }
        return 0;
    }
}
