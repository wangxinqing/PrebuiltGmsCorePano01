package defpackage;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: aljs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aljs extends LinkMovementMethod {
    public boolean a = false;
    public MotionEvent b;

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        this.b = motionEvent;
        boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
        if (motionEvent.getAction() == 0) {
            this.a = Selection.getSelectionStart(spannable) != -1;
        } else {
            this.a = onTouchEvent;
        }
        return onTouchEvent;
    }
}
