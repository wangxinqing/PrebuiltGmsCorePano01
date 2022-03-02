package defpackage;

/* renamed from: aped  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aped {
    private Integer a;
    private apee b;
    private Integer c;

    public final apef a() {
        String str = this.a == null ? " size" : "";
        if (this.b == null) {
            str = str.concat(" type");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" data");
        }
        if (str.isEmpty()) {
            return new apdg(this.a.intValue(), this.b, this.c.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(int i) {
        this.a = Integer.valueOf(i);
    }

    public final void a(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void a(apee apee) {
        if (apee != null) {
            this.b = apee;
            return;
        }
        throw new NullPointerException("Null type");
    }
}
