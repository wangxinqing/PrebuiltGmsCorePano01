package defpackage;

/* renamed from: aweb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aweb implements bapu {
    private static final Object a = new Object();
    private volatile bapu b;
    private volatile Object c = a;

    private aweb(bapu bapu) {
        this.b = bapu;
    }

    public static bapu a(bapu bapu) {
        if ((bapu instanceof aweb) || (bapu instanceof awds)) {
            return bapu;
        }
        awdx.a(bapu);
        return new aweb(bapu);
    }

    public final Object a() {
        Object obj = this.c;
        if (obj != a) {
            return obj;
        }
        bapu bapu = this.b;
        if (bapu == null) {
            return this.c;
        }
        Object a2 = bapu.a();
        this.c = a2;
        this.b = null;
        return a2;
    }
}
