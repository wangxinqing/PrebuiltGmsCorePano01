package defpackage;

import android.view.MenuItem;

/* renamed from: dca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dca implements MenuItem.OnMenuItemClickListener {
    private final dch a;
    private final aqsa b;

    public dca(dch dch, aqsa aqsa) {
        this.a = dch;
        this.b = aqsa;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        dch dch = this.a;
        aqsa aqsa = this.b;
        dgb dgb = dch.a;
        aqsr aC = dch.aC();
        aqsr aqsr = aqsa.c;
        if (aqsr == null) {
            aqsr = aqsr.d;
        }
        dgb.a(aC, aqsr);
        return true;
    }
}
