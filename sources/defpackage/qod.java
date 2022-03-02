package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: qod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class qod {
    protected final List a = new ArrayList();
    protected final int b;

    public qod(int i) {
        this.b = Math.max(1, i);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void a(Object obj) {
        this.a.add(obj);
        if (this.a.size() >= this.b) {
            a();
            this.a.clear();
        }
    }

    public final void b() {
        if (!this.a.isEmpty()) {
            a();
            this.a.clear();
        }
    }
}
