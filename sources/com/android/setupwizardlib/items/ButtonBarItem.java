package com.android.setupwizardlib.items;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import java.util.ArrayList;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ButtonBarItem extends AbstractItem implements bdl {
    private final ArrayList b = new ArrayList();
    private boolean c = true;

    public ButtonBarItem() {
    }

    public final int a() {
        return this.c ? 1 : 0;
    }

    public final bdk c() {
        if (this.a == R.id.android_auto_item) {
            return this;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            bdk c2 = ((ButtonItem) arrayList.get(i)).c();
            i++;
            if (c2 != null) {
                return c2;
            }
        }
        return null;
    }

    public final boolean d() {
        return false;
    }

    public final int e() {
        return R.layout.suw_items_button_bar;
    }

    public final void a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.removeAllViews();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ButtonItem buttonItem = (ButtonItem) arrayList.get(i);
            Button button = buttonItem.e;
            if (button == null) {
                Context context = linearLayout.getContext();
                int i2 = buttonItem.d;
                if (i2 != 0) {
                    context = new ContextThemeWrapper(context, i2);
                }
                buttonItem.e = (Button) LayoutInflater.from(context).inflate(R.layout.suw_button, (ViewGroup) null, false);
                buttonItem.e.setOnClickListener(buttonItem);
            } else if (button.getParent() instanceof ViewGroup) {
                ((ViewGroup) buttonItem.e.getParent()).removeView(buttonItem.e);
            }
            buttonItem.e.setEnabled(buttonItem.b);
            buttonItem.e.setText(buttonItem.c);
            buttonItem.e.setId(buttonItem.a);
            linearLayout.addView(buttonItem.e);
        }
        view.setId(this.a);
    }

    public ButtonBarItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(bdk bdk) {
        if (bdk instanceof ButtonItem) {
            this.b.add((ButtonItem) bdk);
            return;
        }
        throw new UnsupportedOperationException("Cannot add non-button item to Button Bar");
    }
}
