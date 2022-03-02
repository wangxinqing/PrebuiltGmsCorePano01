package defpackage;

import java.util.Comparator;

/* renamed from: cio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cio extends cim {
    private boolean b = false;
    private long c = 0;

    public cio(Comparator comparator) {
        super(1, comparator, false);
    }

    public final void a(cij cij) {
        super.a(cij);
        this.b = true;
        this.c = cij.a.j().c();
    }

    public final boolean b(boolean z) {
        this.b = z;
        return true;
    }

    public final boolean a(long j) {
        if (!awvp.b()) {
            return super.a(j);
        }
        if (j == Long.MAX_VALUE) {
            return true;
        }
        Object[] objArr = {Long.valueOf(this.c), Boolean.valueOf(this.b), Long.valueOf(j)};
        if (cbi.i().a() - this.c > j || !this.b) {
            return false;
        }
        return true;
    }
}
