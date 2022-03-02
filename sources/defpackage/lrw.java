package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* renamed from: lrw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lrw {
    public final DataHolder a;

    public lrw(DataHolder dataHolder) {
        iva.a((Object) dataHolder);
        this.a = dataHolder;
    }

    public final void a() {
        if (!this.a.b()) {
            lbm.a(this.a);
            this.a.close();
        }
    }
}
