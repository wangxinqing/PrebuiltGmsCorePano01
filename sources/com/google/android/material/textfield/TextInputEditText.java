package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.gms.R;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TextInputEditText extends AppCompatEditText {
    private final Rect a;
    private boolean b;

    public TextInputEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    private final TextInputLayout a() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout a2 = a();
        if (a2 != null && this.b && rect != null) {
            a2.getFocusedRect(this.a);
            rect.bottom = this.a.bottom;
        }
    }

    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout a2 = a();
        if (!(a2 == null || !this.b || rect == null)) {
            a2.getGlobalVisibleRect(this.a, point);
            rect.bottom = this.a.bottom;
        }
        return globalVisibleRect;
    }

    public final CharSequence getHint() {
        TextInputLayout a2 = a();
        if (a2 == null || !a2.h) {
            return super.getHint();
        }
        return a2.a();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout a2 = a();
        if (a2 != null && a2.h && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            TextInputLayout a2 = a();
            editorInfo.hintText = a2 != null ? a2.a() : null;
        }
        return onCreateInputConnection;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout a2 = a();
        if (Build.VERSION.SDK_INT < 23 && a2 != null) {
            Editable text = getText();
            CharSequence a3 = a2.a();
            CharSequence e = a2.e();
            CharSequence d = a2.d();
            boolean z = !TextUtils.isEmpty(text);
            boolean isEmpty = TextUtils.isEmpty(a3);
            boolean z2 = !TextUtils.isEmpty(e);
            boolean z3 = !TextUtils.isEmpty(d);
            String str2 = "";
            if (!(!isEmpty)) {
                str = str2;
            } else {
                str = a3.toString();
            }
            String valueOf = String.valueOf(str);
            String str3 = ((!z3 && !z2) || TextUtils.isEmpty(str)) ? str2 : ", ";
            String valueOf2 = String.valueOf(str3.length() == 0 ? new String(valueOf) : valueOf.concat(str3));
            if (z3) {
                e = d;
            } else if (!z2) {
                e = str2;
            }
            String valueOf3 = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
            sb.append(valueOf2);
            sb.append(valueOf3);
            String sb2 = sb.toString();
            if (z) {
                String valueOf4 = String.valueOf(text);
                if (!TextUtils.isEmpty(sb2)) {
                    String valueOf5 = String.valueOf(sb2);
                    str2 = valueOf5.length() == 0 ? new String(", ") : ", ".concat(valueOf5);
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + String.valueOf(str2).length());
                sb3.append(valueOf4);
                sb3.append(str2);
                str2 = sb3.toString();
            } else if (!TextUtils.isEmpty(sb2)) {
                str2 = sb2;
            }
            accessibilityNodeInfo.setText(str2);
        }
    }

    public final boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout a2 = a();
        if (a2 != null && this.b) {
            this.a.set(0, a2.getHeight() - getResources().getDimensionPixelOffset(R.dimen.mtrl_edittext_rectangle_top_offset), a2.getWidth(), a2.getHeight());
            a2.requestRectangleOnScreen(this.a, true);
        }
        return requestRectangleOnScreen;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(akdg.a(context, attributeSet, i, 0), attributeSet, i);
        this.a = new Rect();
        TypedArray a2 = ajya.a(context, attributeSet, akcw.b, i, 2132018793, new int[0]);
        this.b = a2.getBoolean(0, false);
        a2.recycle();
    }
}
