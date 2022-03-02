package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: nvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nvu {
    public static String a(Context context) {
        SharedPreferences b = nsm.b(context);
        if (axlc.o().equals(b.getString("sender", (String) null))) {
            return b.getString("regId", (String) null);
        }
        SharedPreferences.Editor edit = b.edit();
        edit.remove("sender");
        edit.remove("regId");
        edit.commit();
        return null;
    }

    public static boolean b(Context context) {
        if (!aekv.a() || !axkn.e()) {
            return false;
        }
        return c(context).contains("gcm_local_directboot_token");
    }

    public static synchronized SharedPreferences c(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (nvu.class) {
            sharedPreferences = context.createDeviceProtectedStorageContext().getSharedPreferences("com.google.android.gms.gcm.gmsproc.directboot", 0);
        }
        return sharedPreferences;
    }

    public static void a(Context context, qwq qwq) {
        SharedPreferences b = nsm.b(context);
        if (a(context) == null || ((axlc.a.a().Q() && b.getInt("GCM_V", 0) != 201216073) || !axlc.o().equals(b.getString("sender", "")) || b.getLong("reg_time", 0) + (axlc.a.a().A() * 1000) < System.currentTimeMillis())) {
            Log.i("GCM-GMS", "Scheduling task to register GMS");
            qxf qxf = new qxf();
            qxf.k = "gms_registration";
            qxf.i = "com.google.android.gms.gcm.gmsproc.GcmInGmsTaskService";
            qxf.a(0, 30);
            qxf.a(0);
            qxf.a(0, 0);
            qxf.b(true);
            qxf.n = true;
            qwq.a((qxx) qxf.b());
        }
    }
}
