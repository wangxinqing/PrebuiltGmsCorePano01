package defpackage;

/* renamed from: psj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class psj {
    public static final ThreadLocal a = new ThreadLocal();

    public static void a(psc psc) {
        iva.a(a.get() == psc);
        a.remove();
    }
}
