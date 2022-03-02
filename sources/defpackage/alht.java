package defpackage;

import android.content.Intent;
import android.os.Build;
import java.util.Arrays;

/* renamed from: alht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alht {
    public static void a(Intent intent, Intent intent2) {
        intent2.putExtra("wizardBundle", intent.getBundleExtra("wizardBundle"));
        for (String str : Arrays.asList(new String[]{"firstRun", "deferredSetup", "preDeferredSetup", "isSetupFlow"})) {
            intent2.putExtra(str, intent.getBooleanExtra(str, false));
        }
        for (String str2 : Arrays.asList(new String[]{"theme", "scriptUri", "actionId"})) {
            intent2.putExtra(str2, intent.getStringExtra(str2));
        }
    }

    public static boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return intent.getBooleanExtra("isSetupFlow", false);
        }
        if (intent.getBooleanExtra("firstRun", false) || intent.getBooleanExtra("preDeferredSetup", false) || intent.getBooleanExtra("deferredSetup", false)) {
            return true;
        }
        return false;
    }
}
