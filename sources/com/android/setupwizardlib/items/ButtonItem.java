package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.R;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ButtonItem extends AbstractItem implements View.OnClickListener {
    public boolean b = true;
    public CharSequence c;
    public int d = R.style.SuwButtonItem;
    public Button e;

    public ButtonItem() {
    }

    public final int a() {
        return 0;
    }

    public final boolean d() {
        return this.b;
    }

    public final int e() {
        return 0;
    }

    public void onClick(View view) {
    }

    public ButtonItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bdg.b);
        this.b = obtainStyledAttributes.getBoolean(1, true);
        this.c = obtainStyledAttributes.getText(3);
        this.d = obtainStyledAttributes.getResourceId(0, R.style.SuwButtonItem);
        obtainStyledAttributes.recycle();
    }

    public final void a(View view) {
        throw new UnsupportedOperationException("Cannot bind to ButtonItem's view");
    }
}
