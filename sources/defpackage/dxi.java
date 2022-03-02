package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;

/* renamed from: dxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dxi extends znp {
    final /* synthetic */ dxm a;

    protected dxi(dxm dxm) {
        this.a = dxm;
    }

    public final int a() {
        return this.a.b;
    }

    public final Object b(int i) {
        return this;
    }

    public final View a(View view, ViewGroup viewGroup, boolean z) {
        dxm dxm = this.a;
        dzj dzj = dxm.r;
        if (dzj.a()) {
            dzj.a(dzj.a);
        }
        return dxm.a(view, R.layout.appinvite_auto_complete_loading);
    }
}
