package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ButtonItem extends AbstractItem implements View.OnClickListener {
    public boolean a = true;
    public CharSequence c;
    public int d = R.style.SudButtonItem;
    public Button e;

    public ButtonItem() {
    }

    public final int a() {
        return 0;
    }

    public final boolean d() {
        return this.a;
    }

    public final int e() {
        return 0;
    }

    public void onClick(View view) {
    }

    public ButtonItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alhx.c);
        this.a = obtainStyledAttributes.getBoolean(1, true);
        this.c = obtainStyledAttributes.getText(3);
        this.d = obtainStyledAttributes.getResourceId(0, R.style.SudButtonItem);
        obtainStyledAttributes.recycle();
    }

    public final void a(View view) {
        throw new UnsupportedOperationException("Cannot bind to ButtonItem's view");
    }
}
