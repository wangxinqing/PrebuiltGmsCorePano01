package com.google.android.material.theme;

import android.content.Context;
import android.os.Build;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MaterialComponentsViewInflater extends tr {
    private static int d = -1;

    /* access modifiers changed from: protected */
    public final AppCompatTextView a(Context context, AttributeSet attributeSet) {
        return new akde(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final yq c(Context context, AttributeSet attributeSet) {
        return new ajud(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final zb d(Context context, AttributeSet attributeSet) {
        return new ajyh(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final yo e(Context context, AttributeSet attributeSet) {
        return new akcp(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT == 23 || Build.VERSION.SDK_INT == 24 || Build.VERSION.SDK_INT == 25) {
            if (d == -1) {
                d = context.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", "android");
            }
            int i = d;
            if (!(i == 0 || i == -1)) {
                for (int i2 = 0; i2 < attributeSet.getAttributeCount(); i2++) {
                    if (attributeSet.getAttributeNameResource(i2) == 16842964 && d == attributeSet.getAttributeListValue(i2, (String[]) null, 0)) {
                        return new AppCompatButton(context, attributeSet);
                    }
                }
            }
        }
        return new MaterialButton(context, attributeSet);
    }
}
