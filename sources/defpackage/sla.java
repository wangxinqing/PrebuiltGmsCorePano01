package defpackage;

/* renamed from: sla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sla {
    public final bapu a;
    public final bapu b;
    public final bapu c;
    public final bapu d;
    public final bapu e;
    public final bapu f;

    public sla(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4, bapu bapu5, bapu bapu6) {
        a(bapu, 1);
        this.a = bapu;
        a(bapu2, 2);
        this.b = bapu2;
        a(bapu3, 3);
        this.c = bapu3;
        a(bapu4, 4);
        this.d = bapu4;
        a(bapu5, 5);
        this.e = bapu5;
        a(bapu6, 6);
        this.f = bapu6;
    }

    public static void a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
