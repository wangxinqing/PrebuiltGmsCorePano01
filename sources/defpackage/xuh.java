package defpackage;

import android.content.DialogInterface;

/* renamed from: xuh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xuh implements DialogInterface.OnClickListener {
    private final xui a;

    public xuh(xui xui) {
        this.a = xui;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        xui xui = this.a;
        if (xui != null) {
            xui.a();
        }
    }
}
