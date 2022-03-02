package defpackage;

import android.os.Handler;

/* renamed from: aije  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aije extends aijc implements ajbh {
    public ajbh a;
    public Handler b;
    private final ajbi c;

    public aije(ajbi ajbi) {
        this.c = ajbi;
        a(((ajbr) ajbi).d);
    }

    public final void E() {
        this.b.post(new aijd(this));
    }

    /* access modifiers changed from: protected */
    public final void a() {
        ajbi ajbi = this.c;
        if (!((ajbr) ajbi).d) {
            return;
        }
        if (this.u && this.v) {
            ajbi.a(this);
            return;
        }
        ajbi.c();
        this.a = null;
    }
}
