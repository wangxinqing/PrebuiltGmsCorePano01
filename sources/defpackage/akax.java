package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.R;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: akax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akax extends akat {
    private static final int[] q = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public akap n;
    private final AccessibilityManager o;
    private boolean p;

    private akax(ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        super(viewGroup, view, snackbarContentLayout);
        this.o = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static akax a(View view, int i, int i2) {
        return a(view, view.getResources().getText(i), i2);
    }

    public final int b() {
        int i;
        int i2 = this.f;
        if (i2 == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (!this.p) {
                i = 0;
            } else {
                i = 4;
            }
            return this.o.getRecommendedTimeoutMillis(i2, i | 3);
        } else if (!this.p || !this.o.isTouchExplorationEnabled()) {
            return i2;
        } else {
            return -2;
        }
    }

    public final void c(int i) {
        this.e.setBackgroundTintList(ColorStateList.valueOf(i));
    }

    public static akax a(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup != null) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(q);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            int i2 = R.layout.design_layout_snackbar_include;
            if (!(resourceId == -1 || resourceId2 == -1)) {
                i2 = R.layout.mtrl_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, viewGroup, false);
            akax akax = new akax(viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) akax.e.getChildAt(0)).a.setText(charSequence);
            akax.f = i;
            return akax;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    public final void b(int i) {
        ((SnackbarContentLayout) this.e.getChildAt(0)).b.setTextColor(i);
    }

    public final void a(int i, View.OnClickListener onClickListener) {
        CharSequence text = this.d.getText(i);
        Button button = ((SnackbarContentLayout) this.e.getChildAt(0)).b;
        if (!TextUtils.isEmpty(text) && onClickListener != null) {
            this.p = true;
            button.setVisibility(0);
            button.setText(text);
            button.setOnClickListener(new akav(this, onClickListener));
            return;
        }
        button.setVisibility(8);
        button.setOnClickListener((View.OnClickListener) null);
        this.p = false;
    }
}
