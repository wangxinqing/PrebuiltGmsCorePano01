package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.graphics.Rect;
import android.view.WindowManager;

/* renamed from: adez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adez {
    public static final jjg a = jjg.a();

    public static void a(Activity activity) {
        try {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            ((anih) ((anih) a.c()).a("adez", "a", 42, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Root view bounds: %s", (Object) rect.flattenToString());
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.width = rect.width();
            attributes.height = rect.height();
            attributes.gravity = 48;
            activity.getWindow().setAttributes(attributes);
        } catch (Exception e) {
            anih anih = (anih) a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("adez", "a", 46, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Couldn't hide caption bar");
        }
    }

    public static boolean a(Context context) {
        try {
            for (FeatureInfo featureInfo : context.getPackageManager().getSystemAvailableFeatures()) {
                if (featureInfo.name != null && featureInfo.name.equals("org.chromium.arc")) {
                    return true;
                }
            }
        } catch (Exception e) {
            anih anih = (anih) a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("adez", "a", 31, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Couldn't determine whether running on chromeOS");
        }
        return false;
    }
}
