package defpackage;

/* renamed from: afup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afup {
    public final Object a;
    public final boolean b;
    public final boolean c;

    public afup(Object obj, boolean z, boolean z2) {
        boolean z3 = true;
        if (z && z2) {
            z3 = false;
        }
        amrl.a(z3, (Object) "Skipped sync can have only a result!");
        this.a = obj;
        this.b = z;
        this.c = z2;
    }

    public static afup a() {
        afuo afuo = new afuo();
        afuo.a = null;
        afuo.b = true;
        afuo.c = false;
        return afuo.a();
    }

    public static afuo b(Object obj) {
        afuo afuo = new afuo();
        afuo.a = obj;
        afuo.b = false;
        afuo.c = false;
        return afuo;
    }

    public final afuo a(Object obj) {
        afuo afuo = new afuo();
        afuo.a = obj;
        afuo.b = this.b;
        afuo.c = this.c;
        return afuo;
    }
}
