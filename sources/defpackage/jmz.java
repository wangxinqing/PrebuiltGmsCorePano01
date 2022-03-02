package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;

/* renamed from: jmz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jmz extends acg implements jma, jlz {
    public final jmw a = new jmw((CharSequence) null);
    private final Context e;
    private final ArrayList f = new ArrayList();
    private final SparseArray g;
    private final jnf h;

    public jmz(Context context) {
        this.e = context;
        this.a.e = this;
        this.g = new SparseArray();
        this.h = new jnf(context);
    }

    public final int a() {
        if (this.f.isEmpty()) {
            return this.a.g().size();
        }
        ArrayList arrayList = this.f;
        jmx jmx = (jmx) arrayList.get(arrayList.size() - 1);
        return jmx.a + jmx.a();
    }

    public final void b(int i) {
        a((jly) this.a.g().get(i));
        c();
        L(i);
        if (i > 0) {
            K(i - 1);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        int size = this.a.g().size();
        int size2 = this.f.size();
        for (int i = 0; i < size2; i++) {
            jmx jmx = (jmx) this.f.get(i);
            jmx.a = size;
            size += jmx.a();
        }
    }

    public final void d(int i) {
        if (i > 0) {
            h(i - 1, 2);
        } else {
            K(0);
        }
    }

    public final jmw e(int i) {
        return a(this.e.getText(i), i);
    }

    public final jmw f(int i) {
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            jmw jmw = ((jmx) this.f.get(i2)).c;
            if (jmw.b == i) {
                return jmw;
            }
        }
        jmw jmw2 = this.a;
        if (jmw2.b != i) {
            return null;
        }
        return jmw2;
    }

    /* access modifiers changed from: package-private */
    public final jmt g(int i) {
        jmy jmy;
        if (i >= this.a.g().size()) {
            int size = this.f.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    jmy = null;
                    break;
                }
                jmx jmx = (jmx) this.f.get(i2);
                if (i >= jmx.a + jmx.a()) {
                    i2++;
                } else {
                    int i3 = jmx.a;
                    jmy = i == i3 ? new jmy(i2, -1) : new jmy(i2, i - (i3 + 1));
                }
            }
        } else {
            jmy = new jmy(-1, i);
        }
        if (jmy == null) {
            return null;
        }
        int i4 = jmy.a;
        if (i4 < 0) {
            return (jnb) this.a.g().get(jmy.b);
        }
        jmw jmw = ((jmx) this.f.get(i4)).c;
        return jmy.b >= 0 ? (jnb) jmw.g().get(jmy.b) : jmw;
    }

    public final int a(int i) {
        return g(i).e();
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        jms jms = (jms) this.g.get(i);
        if (jms != null) {
            return jms.a(viewGroup, i);
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("No factory for viewType ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void c(int i) {
        c();
        M(i);
        if (i > 0) {
            K(i - 1);
        }
    }

    public final jmw a(CharSequence charSequence, int i) {
        int i2;
        jmw jmw = new jmw(charSequence);
        jmw.b = i;
        if (this.f.isEmpty()) {
            i2 = this.a.g().size();
        } else {
            ArrayList arrayList = this.f;
            jmx jmx = (jmx) arrayList.get(arrayList.size() - 1);
            i2 = jmx.a() + jmx.a;
        }
        this.f.add(new jmx(this, jmw, i2));
        a((jmt) jmw);
        return jmw;
    }

    public final void a(int i, int i2) {
        b(i, i2);
        if (i >= i2) {
            K(i);
            if (i2 > 0) {
                K(i2 - 1);
                return;
            }
            return;
        }
        if (i > 0) {
            K(i - 1);
        }
        K(i2 - 1);
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i) {
        jmr jmr = (jmr) adl;
        jmt g2 = g(i);
        jmr.a(g2);
        boolean z = true;
        jmt g3 = g(i + 1);
        if (g2 == null) {
            z = false;
        } else if (g3 == null || !g2.d() || !g3.d()) {
            z = false;
        }
        jmr.s = z;
    }

    public final void a(Window window) {
        RecyclerView recyclerView = (RecyclerView) window.findViewById(16908298);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new abk());
        recyclerView.addItemDecoration(this.h);
        recyclerView.setAdapter(this);
    }

    /* access modifiers changed from: package-private */
    public final void a(jly jly) {
        a((jmt) jly);
    }

    /* access modifiers changed from: package-private */
    public final void a(jmt jmt) {
        int e2 = jmt.e();
        if (this.g.indexOfKey(e2) < 0) {
            this.g.put(e2, jmt.f());
        }
    }

    public final void a(jmw jmw) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        jmx jmx = null;
        for (int i = 0; i < size; i++) {
            jmx jmx2 = (jmx) arrayList.get(i);
            if (jmx2.c.equals(jmw)) {
                jmx = jmx2;
            } else if (jmx != null) {
                jmx2.a -= jmx.a();
            }
        }
        if (jmx != null) {
            this.f.remove(jmx);
            d(jmx.a, jmx.a());
        }
    }
}
