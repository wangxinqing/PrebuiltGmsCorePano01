package defpackage;

/* renamed from: jew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jew implements jey {
    final Runnable a;
    final Object b;

    public jew(Runnable runnable, Object obj) {
        this.a = runnable;
        this.b = obj;
    }

    public final Object a() {
        return this.b;
    }

    public final Runnable b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jew) {
            return this.a.equals(((jew) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void run() {
        this.a.run();
    }
}
