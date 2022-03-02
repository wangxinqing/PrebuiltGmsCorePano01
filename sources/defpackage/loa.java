package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: loa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class loa implements TextView.OnEditorActionListener {
    private final Dialog a;

    public loa(Dialog dialog) {
        this.a = dialog;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Dialog dialog = this.a;
        DialogInterface.OnKeyListener onKeyListener = loc.a;
        if ((i != 0 || keyEvent.getAction() != 0) && i != 6 && i != 5) {
            return i == 0 && keyEvent.getAction() == 1;
        }
        ((Button) dialog.findViewById(16908313)).performClick();
        return true;
    }
}
