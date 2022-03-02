package defpackage;

import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import java.util.Collection;

/* renamed from: cih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class cih implements Iterable {
    public boolean a;
    private boolean b = false;
    private long c = 0;

    public cih(boolean z) {
        this.a = z;
    }

    public abstract Collection a();

    public void a(cij cij) {
        if (this.a) {
            this.b = true;
        }
        int a2 = cij.a.j().a();
        if (a2 == 1 || a2 == 2) {
            this.c = Math.max(this.c, cij.a.j().c());
        } else if (a2 == 3) {
            this.c = Math.max(this.c, cij.a.j().d());
        }
    }

    public abstract void a(ContextDataFilterImpl contextDataFilterImpl, boolean z);

    public boolean b(boolean z) {
        return false;
    }

    public final void a(boolean z) {
        this.a = z;
        if (!z && this.b) {
            this.b = false;
            this.c = Math.max(this.c, cbi.i().a());
        }
    }

    public boolean a(long j) {
        Object[] objArr = {Boolean.valueOf(this.a), Boolean.valueOf(this.b)};
        Object[] objArr2 = {Long.valueOf(this.c), Long.valueOf(j)};
        return (this.a && this.b) || cbi.i().a() - this.c <= j;
    }
}
