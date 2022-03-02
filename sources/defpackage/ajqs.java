package defpackage;

/* renamed from: ajqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ajqs implements ajab {
    private final Object a;
    private final Object b;
    private boolean c = true;

    public ajqs(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public void a() {
        this.c = false;
    }

    public final Object s() {
        return this.c ? this.a : this.b;
    }

    public final void a(aqek aqek) {
        ((ajab) s()).a(aqek);
    }

    public final void a(aqek aqek, int i, aizx aizx, airt airt) {
        ((ajab) s()).a(aqek, i, aizx, airt);
    }

    public final void a(aqek aqek, aizn aizn) {
        ((ajab) s()).a(aqek, aizn);
    }
}
