package defpackage;

/* renamed from: aklz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aklz {
    private static akof a;

    public static synchronized akof a() {
        akof akof;
        synchronized (aklz.class) {
            if (a == null) {
                a(new akly());
            }
            akof = a;
        }
        return akof;
    }

    public static synchronized void a(akoe akoe) {
        synchronized (aklz.class) {
            a = new akof("PlaceInferenceEngine", akoe);
        }
    }
}
