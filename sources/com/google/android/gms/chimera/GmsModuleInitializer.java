package com.google.android.gms.chimera;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GmsModuleInitializer {
    private static final String TAG = "GmsModuleInitializer";
    private static boolean initialized = false;

    public static void initializeModuleV0(Context context, BaseApplicationContext baseApplicationContext) {
        if (!initialized) {
            new ihs(context, baseApplicationContext);
            anax anax = null;
            if (Build.VERSION.SDK_INT >= 24 && !((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked()) {
                anax = anax.a((Collection) Arrays.asList(iks.a()));
            }
            ikz.a(context, (Set) anax);
            aeej.a(context);
            crj.a = context;
            agvx.a(context);
            iqh.a();
            njf.a();
            jni.a = new aedd();
            jhr.a = new aeda();
            if (jkr.b()) {
                ixm.b.a(context.getPackageManager());
            }
            ixw.a(baseApplicationContext);
            ikp.a(context);
            hdh.a(context);
            boolean a = jdc.a(jda.a());
            StringBuilder sb = new StringBuilder(34);
            sb.append("Set StatisticalEventTracker: ");
            sb.append(a);
            sb.toString();
            initialized = true;
        }
    }
}
