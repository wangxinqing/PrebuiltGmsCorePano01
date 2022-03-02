package defpackage;

/* renamed from: eea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eea {
    private static boolean a;

    public static synchronized boolean a() {
        boolean z;
        synchronized (eea.class) {
            if (!a) {
                try {
                    z = jke.b(ihs.b(), "Whisper");
                    a = z;
                } catch (UnsatisfiedLinkError e) {
                    anih anih = (anih) edx.a.b();
                    anih.a((Throwable) e);
                    ((anih) anih.a("eea", "a", 25, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to load libWhisper.so");
                    return false;
                }
            } else {
                z = true;
            }
        }
        return z;
    }
}
