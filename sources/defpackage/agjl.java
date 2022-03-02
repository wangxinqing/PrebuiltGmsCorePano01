package defpackage;

import android.app.Application;
import android.view.WindowManager;

/* renamed from: agjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agjl {
    private static volatile int a;
    private static volatile int b;

    private agjl() {
    }

    public static int a(Application application) {
        if (a == 0) {
            synchronized (agjl.class) {
                if (a == 0) {
                    int b2 = b(application);
                    if (b2 < 10) {
                        b2 = 60;
                    } else if (b2 > 60) {
                        b2 = 60;
                    }
                    double d = (double) b2;
                    Double.isNaN(d);
                    a = (int) Math.ceil(1000.0d / d);
                }
            }
        }
        return a;
    }

    public static int b(Application application) {
        if (b == 0) {
            synchronized (agjl.class) {
                if (b == 0) {
                    b = Math.round(((WindowManager) application.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate());
                }
            }
        }
        return b;
    }
}
