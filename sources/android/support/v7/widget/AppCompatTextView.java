package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppCompatTextView extends TextView implements rz, rk {
    private final yp b;
    private final zr c;
    private final zp d;

    public AppCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a(ColorStateList colorStateList) {
        this.c.a(colorStateList);
        this.c.a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        yp ypVar = this.b;
        if (ypVar != null) {
            ypVar.a();
        }
        zr zrVar = this.c;
        if (zrVar != null) {
            zrVar.a();
        }
    }

    public final int getAutoSizeMaxTextSize() {
        if (a) {
            return super.getAutoSizeMaxTextSize();
        }
        zr zrVar = this.c;
        if (zrVar != null) {
            return zrVar.g();
        }
        return -1;
    }

    public final int getAutoSizeMinTextSize() {
        if (a) {
            return super.getAutoSizeMinTextSize();
        }
        zr zrVar = this.c;
        if (zrVar != null) {
            return zrVar.f();
        }
        return -1;
    }

    public final int getAutoSizeStepGranularity() {
        if (a) {
            return super.getAutoSizeStepGranularity();
        }
        zr zrVar = this.c;
        if (zrVar != null) {
            return zrVar.e();
        }
        return -1;
    }

    public final int[] getAutoSizeTextAvailableSizes() {
        if (a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        zr zrVar = this.c;
        if (zrVar != null) {
            return zrVar.h();
        }
        return new int[0];
    }

    public final int getAutoSizeTextType() {
        if (!a) {
            zr zrVar = this.c;
            if (zrVar != null) {
                return zrVar.d();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public final TextClassifier getTextClassifier() {
        zp zpVar;
        if (Build.VERSION.SDK_INT >= 28 || (zpVar = this.d) == null) {
            return super.getTextClassifier();
        }
        return zpVar.a();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        yv.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        zr zrVar = this.c;
        if (zrVar != null) {
            zrVar.i();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.c != null && !a && this.c.c()) {
            this.c.b();
        }
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (!a) {
            zr zrVar = this.c;
            if (zrVar != null) {
                zrVar.a(i, i2, i3, i4);
                return;
            }
            return;
        }
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (!a) {
            zr zrVar = this.c;
            if (zrVar != null) {
                zrVar.a(iArr, i);
                return;
            }
            return;
        }
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public final void setAutoSizeTextTypeWithDefaults(int i) {
        if (!a) {
            zr zrVar = this.c;
            if (zrVar != null) {
                zrVar.a(i);
                return;
            }
            return;
        }
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        yp ypVar = this.b;
        if (ypVar != null) {
            ypVar.b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        yp ypVar = this.b;
        if (ypVar != null) {
            ypVar.a(i);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.c;
        if (zrVar != null) {
            zrVar.a();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.c;
        if (zrVar != null) {
            zrVar.a();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = uj.b(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = uj.b(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = uj.b(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = uj.b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.c;
        if (zrVar != null) {
            zrVar.a();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = uj.b(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = uj.b(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = uj.b(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = uj.b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.c;
        if (zrVar != null) {
            zrVar.a();
        }
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ry.a((TextView) this, callback));
    }

    public final void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            ry.b(this, i);
        }
    }

    public final void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            ry.c(this, i);
        }
    }

    public final void setLineHeight(int i) {
        ry.d(this, i);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        zr zrVar = this.c;
        if (zrVar != null) {
            zrVar.a(context, i);
        }
    }

    public final void setTextClassifier(TextClassifier textClassifier) {
        zp zpVar;
        if (Build.VERSION.SDK_INT >= 28 || (zpVar = this.d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            zpVar.a = textClassifier;
        }
    }

    public final void setTextSize(int i, float f) {
        if (!a) {
            zr zrVar = this.c;
            if (zrVar != null) {
                zrVar.a(i, f);
                return;
            }
            return;
        }
        super.setTextSize(i, f);
    }

    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2 = null;
        if (typeface != null && i > 0) {
            typeface2 = lp.a(getContext(), typeface, i);
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public final void a(PorterDuff.Mode mode) {
        this.c.a(mode);
        this.c.a();
    }

    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aes.a(context);
        aeq.a((View) this, getContext());
        yp ypVar = new yp(this);
        this.b = ypVar;
        ypVar.a(attributeSet, i);
        zr zrVar = new zr(this);
        this.c = zrVar;
        zrVar.a(attributeSet, i);
        this.c.a();
        this.d = new zp(this);
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.c;
        if (zrVar != null) {
            zrVar.a();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.c;
        if (zrVar != null) {
            zrVar.a();
        }
    }
}
