package defpackage;

/* renamed from: agya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class agya implements agym {
    private boolean a = false;

    private final void a(String str) {
        if (this.a) {
            StringBuilder sb = new StringBuilder(str.length() + 36);
            sb.append("cannot invoke ");
            sb.append(str);
            sb.append(" on a closed transport");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(alzn alzn);

    public final void b() {
        a("close");
        a();
        this.a = true;
    }

    public final boolean c() {
        return this.a;
    }

    public final void b(alzn alzn) {
        a("log");
        a(alzn);
    }
}
