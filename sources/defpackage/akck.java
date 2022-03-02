package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.gms.R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: akck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akck extends akcl {
    public static final /* synthetic */ int j = 0;
    public final TextWatcher a = new akcb(this);
    public final akdb b = new akcc(this, this.k);
    public boolean c = false;
    public boolean d = false;
    public long e = Long.MAX_VALUE;
    public StateListDrawable f;
    public ajzf g;
    public AccessibilityManager h;
    public ValueAnimator i;
    private final akdc n = new akcd(this);
    private ValueAnimator o;

    static {
        int i2 = Build.VERSION.SDK_INT;
    }

    public akck(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    private final ajzf a(float f2, float f3, float f4, int i2) {
        ajzk a2 = ajzl.a();
        a2.c(f2);
        a2.d(f2);
        a2.a(f3);
        a2.b(f3);
        ajzl a3 = a2.a();
        ajzf a4 = ajzf.a(this.l, f4);
        a4.a(a3);
        ajze ajze = a4.s;
        if (ajze.i == null) {
            ajze.i = new Rect();
        }
        a4.s.i.set(0, i2, 0, i2);
        a4.invalidateSelf();
        return a4;
    }

    public final boolean a(int i2) {
        return i2 != 0;
    }

    public final void b(boolean z) {
        if (this.d != z) {
            this.d = z;
            this.i.cancel();
            this.o.start();
        }
    }

    public final boolean b() {
        return true;
    }

    public final boolean c() {
        long currentTimeMillis = System.currentTimeMillis() - this.e;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    private final ValueAnimator a(int i2, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(ajrr.a);
        ofFloat.setDuration((long) i2);
        ofFloat.addUpdateListener(new akcj(this));
        return ofFloat;
    }

    public final AutoCompleteTextView a(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final void a() {
        float dimensionPixelOffset = (float) this.l.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.l.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.l.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ajzf a2 = a(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        ajzf a3 = a(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.g = a2;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, a2);
        this.f.addState(new int[0], a3);
        this.k.b(uj.b(this.l, R.drawable.mtrl_dropdown_arrow));
        TextInputLayout textInputLayout = this.k;
        textInputLayout.d(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.k.a((View.OnClickListener) new akce(this));
        this.k.a(this.n);
        this.i = a(67, 0.0f, 1.0f);
        ValueAnimator a4 = a(50, 1.0f, 0.0f);
        this.o = a4;
        a4.addListener(new akci(this));
        qb.b((View) this.m, 2);
        this.h = (AccessibilityManager) this.l.getSystemService("accessibility");
    }

    public final void a(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (c()) {
                this.c = false;
            }
            if (!this.c) {
                b(!this.d);
                if (this.d) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.c = false;
        }
    }
}
