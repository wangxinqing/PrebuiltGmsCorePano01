package defpackage;

import com.google.android.gms.contextmanager.internal.QueryFilterParameters;

/* renamed from: jxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jxp {
    public int[] a = null;
    private int b = 0;
    private int c = -1;

    public final QueryFilterParameters a() {
        return new QueryFilterParameters(this.b, this.c, this.a);
    }

    public final void b() {
        iva.b(true);
        this.b = 1;
    }

    public final void a(int i) {
        boolean z = true;
        if (i != -1 && i <= 0) {
            z = false;
        }
        iva.b(z);
        this.c = i;
    }
}
