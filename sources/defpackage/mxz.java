package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: mxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mxz implements DialogInterface.OnKeyListener {
    private final mya a;

    public mxz(mya mya) {
        this.a = mya;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        mvt mvt = this.a.a;
        if (i != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        mvt.a(121, mvt.a);
        mvt.c.i();
        return true;
    }
}
