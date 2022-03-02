package defpackage;

import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;

/* renamed from: wbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wbb extends vys {
    private ige a;

    public wbb(ige ige) {
        this.a = ige;
    }

    public final void a() {
        wbd.a().a(this.a);
        this.a = null;
    }

    public final void a(OnTransferUpdateParams onTransferUpdateParams) {
        if (this.a != null) {
            if (!onTransferUpdateParams.b.e) {
                wbd.a().a(onTransferUpdateParams.a, this.a);
            } else {
                wbd.a().a(onTransferUpdateParams.a);
            }
            this.a.a(new wba(onTransferUpdateParams));
        }
    }
}
