package defpackage;

/* renamed from: iqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iqh {
    private static boolean a = false;

    public static void a() {
        synchronized (iqh.class) {
            if (!a) {
                a = true;
                new Thread(iqg.a).start();
            }
        }
    }
}
