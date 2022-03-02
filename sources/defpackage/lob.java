package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: lob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class lob implements DialogInterface.OnKeyListener {
    static final DialogInterface.OnKeyListener a = new lob();

    private lob() {
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener = loc.a;
        return i == 84;
    }
}
