package defpackage;

import android.app.Dialog;

/* renamed from: idi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class idi extends ifp {
    final /* synthetic */ Dialog a;
    final /* synthetic */ idj b;

    public idi(idj idj, Dialog dialog) {
        this.b = idj;
        this.a = dialog;
    }

    public final void a() {
        this.b.a.d();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
