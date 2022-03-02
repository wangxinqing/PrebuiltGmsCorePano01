package defpackage;

import android.os.Bundle;
import android.view.View;

/* renamed from: dew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class dew extends dex {
    public cye j;

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public final void a(Bundle bundle) {
        int i;
        int i2 = 0;
        if (bundle != null) {
            int i3 = bundle.getInt("visible_item", 0);
            i = bundle.getInt("visible_item_offset", 0);
            i2 = i3;
        } else {
            i = 0;
        }
        this.j.getLayoutManager().e(i2, i);
    }

    public final boolean d() {
        abk c = this.j.getLayoutManager();
        int m = c.m();
        View b = c.b(m);
        return m == 0 && b != null && b.getTop() <= a();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int m = this.j.getLayoutManager().m();
        View b = this.j.getLayoutManager().b(m);
        if (b != null) {
            int top = b.getTop();
            bundle.putInt("visible_item", m);
            bundle.putInt("visible_item_offset", top);
        }
    }
}
