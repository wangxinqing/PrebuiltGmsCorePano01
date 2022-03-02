package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.CheckBox;
import android.widget.TextView;

/* renamed from: zna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zna extends LinkMovementMethod implements Handler.Callback {
    private final Handler a = new qvr((Handler.Callback) this);
    private final CheckBox b;

    public zna(CheckBox checkBox) {
        this.b = checkBox;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.b.setChecked(false);
            return true;
        } else if (i != 1) {
            return false;
        } else {
            this.b.setChecked(true);
            return true;
        }
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        Rect rect = new Rect(textView.getCompoundPaddingLeft(), textView.getPaddingTop(), textView.getWidth() - textView.getCompoundPaddingRight(), textView.getHeight() - textView.getPaddingBottom());
        boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        if (onTouchEvent) {
            this.a.sendEmptyMessage(this.b.isChecked() ? 1 : 0);
        }
        return onTouchEvent;
    }
}
