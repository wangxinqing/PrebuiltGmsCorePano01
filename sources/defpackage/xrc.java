package defpackage;

import android.content.DialogInterface;
import android.view.View;

/* renamed from: xrc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xrc implements DialogInterface.OnClickListener {
    final /* synthetic */ View a;
    final /* synthetic */ xrf b;

    public xrc(xrf xrf, View view) {
        this.b = xrf;
        this.a = view;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        new xre(this.b, this.a).start();
    }
}
