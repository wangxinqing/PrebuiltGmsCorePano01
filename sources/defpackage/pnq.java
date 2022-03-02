package defpackage;

/* renamed from: pnq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class pnq {
    public static final pnq a = new pnh();
    public static final pnq b = new pnj("emails", "email");
    public static final pnq c = new pnj("phones", "phone");
    public static final pnq d;
    public static final pnq[] e;
    private final String f;
    private final String g;
    private dvj h;

    static {
        pnj pnj = new pnj("postals", "postal");
        d = pnj;
        e = new pnq[]{a, b, c, pnj};
    }

    public pnq(String str, String str2) {
        this.f = str;
        this.g = str2;
    }

    public static dvj[] a() {
        dvj[] dvjArr = new dvj[4];
        for (int i = 0; i < 4; i++) {
            dvjArr[i] = e[i].c();
        }
        return dvjArr;
    }

    /* access modifiers changed from: protected */
    public abstract dvj a(dvi dvi);

    public final String b() {
        String str = this.f;
        String str2 = this.g;
        StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }

    public final dvj c() {
        if (this.h == null) {
            dvi a2 = dvj.a();
            a2.a(b());
            a2.b(this.f);
            a2.a(this.g, true);
            this.h = a(a2);
        }
        return this.h;
    }
}
