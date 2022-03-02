package defpackage;

import android.os.Build;
import android.view.View;

/* renamed from: dcf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dcf extends oz {
    final /* synthetic */ String b;
    final /* synthetic */ dch c;

    public dcf(dch dch, String str) {
        this.c = dch;
        this.b = str;
    }

    public final void a(View view, qs qsVar) {
        super.a(view, qsVar);
        View view2 = this.c.c;
        if (Build.VERSION.SDK_INT >= 22) {
            qsVar.a.setTraversalBefore(view2);
        }
        if (!jlh.d(this.b)) {
            qsVar.a(new qp(qp.a.a(), (CharSequence) this.b));
        }
    }
}
