package defpackage;

/* renamed from: affq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class affq {
    public anaf a;
    private Long b;
    private Long c;

    public affq() {
    }

    public final affr a() {
        String str = this.b == null ? " read" : "";
        if (this.c == null) {
            str = str.concat(" write");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" triggers");
        }
        if (str.isEmpty()) {
            return new afem(this.b.longValue(), this.c.longValue(), this.a);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(long j) {
        this.c = Long.valueOf(j);
    }

    public affq(affr affr) {
        afem afem = (afem) affr;
        this.b = Long.valueOf(afem.a);
        this.c = Long.valueOf(afem.b);
        this.a = afem.c;
    }

    public final void a(long j) {
        this.b = Long.valueOf(j);
    }

    public final void a(anaf anaf) {
        if (anaf != null) {
            this.a = anaf;
            return;
        }
        throw new NullPointerException("Null triggers");
    }
}
