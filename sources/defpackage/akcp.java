package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ListAdapter;
import com.google.android.gms.R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: akcp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akcp extends yo {
    public final abs a;
    private final AccessibilityManager b;

    public final void a(Object obj) {
        int i = Build.VERSION.SDK_INT;
        setText(convertSelectionToString(obj), false);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.a.a(getAdapter());
    }

    public final void showDropDown() {
        AccessibilityManager accessibilityManager;
        if (getInputType() != 0 || (accessibilityManager = this.b) == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.a.ar();
        }
    }

    public akcp(Context context, AttributeSet attributeSet) {
        super(akdg.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        Context context2 = getContext();
        TypedArray a2 = ajya.a(context2, attributeSet, akcw.a, R.attr.autoCompleteTextViewStyle, 2132018717, new int[0]);
        if (a2.hasValue(0) && a2.getResourceId(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.b = (AccessibilityManager) context2.getSystemService("accessibility");
        abs abs = new abs(context2);
        this.a = abs;
        abs.l();
        abs abs2 = this.a;
        abs2.l = this;
        abs2.k();
        this.a.a(getAdapter());
        this.a.m = new akco(this);
        a2.recycle();
    }

    public final CharSequence getHint() {
        TextInputLayout textInputLayout;
        ViewParent parent = getParent();
        while (true) {
            if (parent != null) {
                if (parent instanceof TextInputLayout) {
                    textInputLayout = (TextInputLayout) parent;
                    break;
                }
                parent = parent.getParent();
            } else {
                textInputLayout = null;
                break;
            }
        }
        if (textInputLayout == null || !textInputLayout.h) {
            return super.getHint();
        }
        return textInputLayout.a();
    }
}
