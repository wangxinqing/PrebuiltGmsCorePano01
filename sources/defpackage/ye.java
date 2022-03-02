package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: ye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ye extends xf {
    final /* synthetic */ yh d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ye(yh yhVar, Context context, wt wtVar, View view) {
        super(context, wtVar, view, true);
        this.d = yhVar;
        this.b = 8388613;
        a((xg) yhVar.o);
    }

    /* access modifiers changed from: protected */
    public final void d() {
        wt wtVar = this.d.c;
        if (wtVar != null) {
            wtVar.close();
        }
        this.d.l = null;
        super.d();
    }
}
