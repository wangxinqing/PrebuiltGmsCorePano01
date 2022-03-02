package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.Random;

/* renamed from: alg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class alg extends EditText {
    int b;

    static {
        new alf(Integer.class, "streamPosition");
    }

    public alg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Random();
    }

    private final void a(int i) {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), i);
        Bitmap.createScaledBitmap(decodeResource, (int) (((float) decodeResource.getWidth()) * 1.3f), (int) (((float) decodeResource.getHeight()) * 1.3f), false);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        a(R.drawable.lb_text_dot_one);
        a(R.drawable.lb_text_dot_two);
        this.b = -1;
        setText("");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.leanback.widget.StreamingTextView");
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ry.a((TextView) this, callback));
    }

    public alg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Random();
    }
}
