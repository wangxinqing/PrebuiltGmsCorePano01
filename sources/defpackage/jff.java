package defpackage;

/* renamed from: jff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jff implements qvn {
    private final Object b;

    public jff(Object obj) {
        this.b = obj;
    }

    public static jff a() {
        return new jff(jez.a());
    }

    public final amky b() {
        amko a = amlv.a(amlw.a);
        jez.a(this.b, a);
        return new jfd(a);
    }

    public final void a(Runnable runnable) {
        amko a = amlv.a(amlw.a);
        jez.a(this.b, a);
        try {
            runnable.run();
        } finally {
            amlv.a(a, amlw.a);
        }
    }
}
