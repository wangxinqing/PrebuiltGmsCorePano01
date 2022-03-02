package com.google.android.gms.chimera.container;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.container.ModuleApi;
import java.io.File;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DynamiteModuleApi extends ModuleApi {
    public Set getInstrumentationFilterRules(Context context) {
        hgs a = hgs.a(context);
        if (a != null) {
            return a.c;
        }
        return null;
    }

    public void onApkLoaded(Context context) {
        try {
            ModuleApi.a(context.getClassLoader().loadClass("com.google.android.gms.chimera.DynamiteModuleInitializer").getDeclaredMethod("initializeModuleV1", new Class[]{Context.class}), context);
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb.append("Failed to set dynamite application context: ");
            sb.append(valueOf);
            Log.i("DynamiteModuleApi", sb.toString());
        }
    }

    public void onBeforeApkLoad(Context context, bms bms) {
        if (bms instanceof blk) {
            blk blk = (blk) bms;
            blk.a = "com.google.android.gms.chimera.DynamiteModuleInitializer";
            blk.b = new File(context.getFilesDir(), ".gms-dynamite-code-cache").getAbsolutePath();
            blk.c = blk.h();
        }
        hgs a = hgs.a(context);
        if (a != null) {
            String a2 = a.a();
            if (!TextUtils.isEmpty(a2)) {
                bms.g = a2;
            }
            String b = a.b();
            if (!TextUtils.isEmpty(b)) {
                bms.h = b;
            }
        }
    }
}
