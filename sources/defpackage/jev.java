package defpackage;

/* renamed from: jev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jev extends qwf {
    private final ing a;

    public jev() {
        this(new ing());
    }

    public final int a(qxz qxz) {
        if (!axai.e() || !b()) {
            return 0;
        }
        ing ing = this.a;
        aogr aogr = aogr.SCHEDULED_IDLE;
        if (!axai.e()) {
            return 0;
        }
        if (!awyw.h()) {
            imr.a();
        }
        ina c = inb.c();
        c.b = this;
        c.a = aogr;
        ing.b(c.a());
        return 0;
    }

    public abstract boolean b();

    public jev(ing ing) {
        this.a = ing;
    }
}
