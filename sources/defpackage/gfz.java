package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: gfz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gfz implements TextView.OnEditorActionListener {
    final /* synthetic */ ggc a;

    public gfz(ggc ggc) {
        this.a = ggc;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            this.a.l.onClick(textView);
            return true;
        } else if (keyEvent == null) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 66 && keyCode != 20) {
                return false;
            }
            this.a.l.onClick(textView);
            return true;
        }
    }
}
