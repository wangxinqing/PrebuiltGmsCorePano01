package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* renamed from: ql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ql extends qm {
    private final WindowInsets.Builder a;

    public ql() {
        this.a = new WindowInsets.Builder();
    }

    public final qn a() {
        return qn.a(this.a.build());
    }

    public ql(qn qnVar) {
        this.a = new WindowInsets.Builder((WindowInsets) qnVar.a);
    }

    public final void a(ll llVar) {
        this.a.setSystemWindowInsets(Insets.of(llVar.b, llVar.c, llVar.d, llVar.e));
    }
}
