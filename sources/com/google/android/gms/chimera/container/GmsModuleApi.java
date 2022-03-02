package com.google.android.gms.chimera.container;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.chimera.container.ModuleApi;
import com.google.android.gms.chimera.GmsModuleInitializer;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GmsModuleApi extends ModuleApi {
    public Set getInstrumentationFilterRules(Context context) {
        hgs a = hgs.a(context);
        if (a != null) {
            return a.c;
        }
        return null;
    }

    public void onApkLoaded(Context context) {
        ModuleApi.a(context.getClassLoader().loadClass(GmsModuleInitializer.class.getName()).getMethod("initializeModuleV0", new Class[]{Context.class, BaseApplicationContext.class}), context, ihs.b());
    }

    public void onBeforeApkLoad(Context context, bms bms) {
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
