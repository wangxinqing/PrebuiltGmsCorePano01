package defpackage;

/* renamed from: lcy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lcy {
    public final boolean a;
    public final int b;
    public final boolean c;

    public lcy(boolean z, int i, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = z2;
        boolean z3 = true;
        if (z && z2) {
            z3 = false;
        }
        iva.a(z3, (Object) "Network error should only be marked in failures!");
    }
}
