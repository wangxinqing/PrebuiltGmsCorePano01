package defpackage;

import android.os.Bundle;
import android.view.View;

/* renamed from: akai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akai extends oz {
    final /* synthetic */ akat b;

    public akai(akat akat) {
        this.b = akat;
    }

    public final void a(View view, qs qsVar) {
        super.a(view, qsVar);
        qsVar.a(1048576);
        qsVar.f(true);
    }

    public final boolean a(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.a(view, i, bundle);
        }
        this.b.d();
        return true;
    }
}
