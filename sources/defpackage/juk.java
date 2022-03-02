package defpackage;

import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;

/* renamed from: juk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class juk {
    private final bsz a;
    private final int b;
    private final jxp c;
    private ArrayList d;

    public juk() {
        this.a = null;
        this.b = 2;
        this.c = new jxp();
    }

    private final void c() {
        if (this.d == null) {
            this.d = new ArrayList();
        }
    }

    public final jum a() {
        return new jum(this.a, this.b, this.d, this.c.a());
    }

    public final void b() {
        iva.b(true);
        this.c.b();
        this.c.a(1);
    }

    public juk(bsz bsz) {
        int i;
        this.a = bsz;
        if (bsz == null) {
            i = 0;
        } else {
            i = 1;
        }
        this.b = i;
        this.c = new jxp();
    }

    public final void a(int i, TimeFilterImpl timeFilterImpl) {
        c();
        this.d.add(new jul(i, timeFilterImpl, (KeyFilterImpl) null));
    }

    public final void a(int i, TimeFilterImpl timeFilterImpl, KeyFilterImpl keyFilterImpl) {
        iva.a((Object) keyFilterImpl);
        c();
        this.d.add(new jul(i, timeFilterImpl, keyFilterImpl));
    }
}
