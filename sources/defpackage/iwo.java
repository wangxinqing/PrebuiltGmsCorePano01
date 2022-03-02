package defpackage;

/* renamed from: iwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iwo {
    public static hph a;
    private final String b;

    public iwo(String str) {
        iva.a((Object) str);
        this.b = str;
    }

    private static synchronized void a(String str) {
        synchronized (iwo.class) {
            if (axaf.a.a().b()) {
                a.c(str).a();
                a.d();
            }
        }
    }

    public final void b() {
        a(this.b.concat("-cancelled"));
    }

    public final void c() {
        a(this.b.concat("-blocked"));
    }

    public final void a() {
        a(this.b.concat("-notified"));
    }
}
