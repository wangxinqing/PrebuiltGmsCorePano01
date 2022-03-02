package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppCompatButton extends Button implements rk, rz {
    public final yp b;
    private final zr c;

    public AppCompatButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a(ColorStateList colorStateList) {
        this.c.a(colorStateList);
        this.c.a();
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
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

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        zr zrVar = this.c;
        if (zrVar != null) {
            zrVar.i();
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        yp ypVar = this.b;
        if (ypVar != null) {
            ypVar.b();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        yp ypVar = this.b;
        if (ypVar != null) {
            ypVar.a(i);
        }
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ry.a((TextView) this, callback));
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        zr zrVar = this.c;
        if (zrVar != null) {
            zrVar.a(context, i);
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

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public final void a(PorterDuff.Mode mode) {
        this.c.a(mode);
        this.c.a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
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
    }
}
