package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SearchEditText extends alg {
    public aks a;

    static {
        SearchEditText.class.getSimpleName();
    }

    public SearchEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && this.a != null) {
            post(new aky(this));
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2132018317);
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
