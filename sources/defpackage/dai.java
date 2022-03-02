package defpackage;

import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: dai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dai implements View.OnKeyListener {
    private final dau a;

    public dai(dau dau) {
        this.a = dau;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        dau dau = this.a;
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        new qvr(Looper.getMainLooper()).post(new dag(dau));
        return true;
    }
}
