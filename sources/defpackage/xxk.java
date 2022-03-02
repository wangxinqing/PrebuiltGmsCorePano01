package defpackage;

import java.util.List;
import org.json.JSONException;

/* renamed from: xxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class xxk {
    protected final xnd a;
    protected final xyp b;
    protected final xvw c;
    protected final yaz d;
    protected final xwv e;
    protected final xyg f;

    protected xxk(xnd xnd, xyp xyp, xvw xvw, yaz yaz, xwv xwv, xyg xyg) {
        this.a = xnd;
        this.b = xyp;
        this.c = xvw;
        this.d = yaz;
        this.e = xwv;
        this.f = xyg;
    }

    protected static wvo a(xnd xnd) {
        xnd xnd2 = xnd.UNSPECIFIED;
        int ordinal = xnd.ordinal();
        if (ordinal == 1) {
            return wvo.INSERT;
        }
        if (ordinal == 2) {
            return wvo.UPDATE;
        }
        if (ordinal != 3) {
            return wvo.UNKNOWN_OPERATION;
        }
        return wvo.REMOVE;
    }

    protected static final xnn f(xvs xvs) {
        aucd o = xnn.c.o();
        long longValue = xvs.d.longValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xnn xnn = (xnn) o.b;
        xnn.a |= 1;
        xnn.b = longValue;
        return (xnn) o.i();
    }

    private final boolean g(xvs xvs) {
        try {
            c(xvs);
            return true;
        } catch (babk | eif | ArrayStoreException | JSONException | xya e2) {
            Exception exc = e2;
            if (exc instanceof babk) {
                wvo a2 = a(this.a);
                babj babj = ((babk) exc).a;
                int a3 = this.f.a(a2, babj.r.r, babj.s);
                int i = a3 - 1;
                xnd xnd = xnd.UNSPECIFIED;
                if (a3 == 0) {
                    throw null;
                } else if (i == 1) {
                    e(xvs);
                    this.d.a(this.a, xjo.CONTACT, false, 3, 1);
                    return true;
                } else if (i == 5) {
                    return h(xvs);
                }
            }
            if (xyi.a(false, xjo.CONTACT, this.a, exc, this.d, 1) != xnd.REMOVE) {
                return false;
            }
            e(xvs);
            return true;
        }
    }

    private final boolean h(xvs xvs) {
        try {
            d(xvs);
            return true;
        } catch (babk | eif | ArrayStoreException | JSONException | xya e2) {
            if (xyi.a(false, xjo.CONTACT, this.a, e2, this.d, 1) != xnd.REMOVE) {
                return false;
            }
            e(xvs);
            return true;
        } catch (UnsupportedOperationException e3) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean b(xvs xvs);

    /* access modifiers changed from: protected */
    public abstract void c(xvs xvs);

    /* access modifiers changed from: protected */
    public abstract void d(xvs xvs);

    /* access modifiers changed from: protected */
    public final void e(xvs xvs) {
        this.c.b.a(xvs.d, true);
        this.c.b();
    }

    /* access modifiers changed from: protected */
    public final void a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.c.b.a(((xvs) list.get(i)).d, true);
        }
        this.c.b();
    }

    /* access modifiers changed from: protected */
    public final void a(xvs xvs, xvs xvs2) {
        this.b.a(xvs, xvs2);
        this.c.b();
    }

    public final boolean a(xvs xvs) {
        this.d.a(this.a, xjo.CONTACT, false, 1, 1);
        if (!b(xvs)) {
            return false;
        }
        if (g(xvs)) {
            return true;
        }
        if (aysx.b()) {
            this.d.a(f(xvs));
        }
        return false;
    }
}
