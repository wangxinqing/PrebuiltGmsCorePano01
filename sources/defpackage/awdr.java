package defpackage;

/* renamed from: awdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awdr implements awdt {
    private bapu a;

    public static void a(bapu bapu, bapu bapu2) {
        awdx.a(bapu2);
        awdr awdr = (awdr) bapu;
        if (awdr.a == null) {
            awdr.a = bapu2;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object a() {
        bapu bapu = this.a;
        if (bapu != null) {
            return bapu.a();
        }
        throw new IllegalStateException();
    }
}
