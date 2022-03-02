package defpackage;

import java.util.concurrent.Callable;

/* renamed from: arzk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arzk {
    public static Object a(Callable callable, String str, arzj arzj) {
        int i = 1;
        while (true) {
            if (i <= arzj.c) {
                if (arzj.b.get()) {
                    jjg jjg = tgb.a;
                    break;
                }
                try {
                    jjg jjg2 = tgb.a;
                    return callable.call();
                } catch (Exception e) {
                    if (i != arzj.c) {
                        jjg jjg3 = tgb.a;
                        if (arzj.b.get()) {
                            return null;
                        }
                        try {
                            arzj.a.run();
                            i++;
                        } catch (Exception e2) {
                            anih anih = (anih) tgb.a.b();
                            anih.a((Throwable) e2);
                            anih.a("Exception while recovering after attempt #%d for %s, bailing!", i, (Object) str);
                            return null;
                        }
                    } else {
                        anih anih2 = (anih) tgb.a.c();
                        anih2.a((Throwable) e);
                        anih2.a("Failed attempt #%d out of %d for %s", (Object) Integer.valueOf(i), (Object) Integer.valueOf(arzj.c), (Object) str);
                        return null;
                    }
                }
            } else {
                break;
            }
        }
        return null;
    }

    public static boolean a(Runnable runnable, String str, arzj arzj) {
        return a((Callable) new arzf(runnable), str, arzj) != null;
    }
}
