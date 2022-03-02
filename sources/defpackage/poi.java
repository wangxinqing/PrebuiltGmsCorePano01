package defpackage;

/* renamed from: poi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class poi {
    private static poi b;
    public final jfc a;

    public poi(jfc jfc) {
        this.a = jfc;
    }

    public static Runnable a(String str, Runnable runnable) {
        return new poh(runnable, str);
    }

    public static synchronized poi a() {
        poi poi;
        synchronized (poi.class) {
            if (b == null) {
                b = new poi(jfm.a(1, 10));
            }
            poi = b;
        }
        return poi;
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
