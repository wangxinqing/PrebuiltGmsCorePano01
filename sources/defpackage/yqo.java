package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: yqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yqo implements TextView.OnEditorActionListener {
    final /* synthetic */ yqq a;

    public yqo(yqq yqq) {
        this.a = yqq;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 66 || !this.a.d.isClickable()) {
            return false;
        }
        this.a.d.performClick();
        return true;
    }
}
