package defpackage;

import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: alhs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alhs {
    @Deprecated
    public static void a(Window window) {
        int i = Build.VERSION.SDK_INT;
        a(window, 5634);
        c(window, 5634);
        window.setNavigationBarColor(0);
        window.setStatusBarColor(0);
    }

    public static void b(Window window, int i) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.systemUiVisibility = (i ^ -1) & attributes.systemUiVisibility;
        window.setAttributes(attributes);
    }

    public static void c(Window window, int i) {
        a(window, (alhq) new alhm(i));
    }

    public static void d(Window window, int i) {
        a(window, (alhq) new alhn(i));
    }

    public static void a(Window window, int i) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.systemUiVisibility = i | attributes.systemUiVisibility;
        window.setAttributes(attributes);
    }

    private static void a(Window window, alhq alhq) {
        alhp alhp = new alhp();
        alhp.b = window;
        alhp.c = 3;
        alhp.d = alhq;
        alhp.e.run();
    }

    public static void a(Window window, boolean z) {
        if (!z) {
            a(window, 4194304);
            c(window, 4194304);
            return;
        }
        b(window, 4194304);
        d(window, 4194304);
    }
}
