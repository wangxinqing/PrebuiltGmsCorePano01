package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.setupcompat.view.StatusBarBackgroundLayout;

/* renamed from: alhj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alhj implements alhi {
    private final algc a;
    private StatusBarBackgroundLayout b;
    private LinearLayout c;
    private final View d;

    public alhj(algc algc, Window window, AttributeSet attributeSet, int i) {
        boolean z;
        this.a = algc;
        View b2 = algc.b(R.id.suc_layout_status);
        if (b2 != null) {
            if (b2 instanceof StatusBarBackgroundLayout) {
                this.b = (StatusBarBackgroundLayout) b2;
            } else {
                this.c = (LinearLayout) b2;
            }
            this.d = window.getDecorView();
            if (Build.VERSION.SDK_INT >= 23) {
                window.setStatusBarColor(0);
                TypedArray obtainStyledAttributes = algc.getContext().obtainStyledAttributes(attributeSet, algd.d, i, 0);
                if (Build.VERSION.SDK_INT < 23 || (this.d.getSystemUiVisibility() & FragmentTransaction.TRANSIT_EXIT_MASK) == 8192) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = obtainStyledAttributes.getBoolean(0, z);
                if (Build.VERSION.SDK_INT >= 23) {
                    if (this.a.c()) {
                        Context context = this.a.getContext();
                        z2 = alhb.a(context).d(context, alha.CONFIG_LIGHT_STATUS_BAR);
                    }
                    if (!z2) {
                        View view = this.d;
                        view.setSystemUiVisibility(view.getSystemUiVisibility() & -8193);
                    } else {
                        View view2 = this.d;
                        view2.setSystemUiVisibility(8192 | view2.getSystemUiVisibility());
                    }
                }
                a(obtainStyledAttributes.getDrawable(1));
                obtainStyledAttributes.recycle();
                return;
            }
            return;
        }
        throw new NullPointerException("sucLayoutStatus cannot be null in StatusBarMixin");
    }

    public final void a(Drawable drawable) {
        boolean z;
        if (this.a.c()) {
            Context context = this.a.getContext();
            drawable = alhb.a(context).b(context, alha.CONFIG_STATUS_BAR_BACKGROUND);
        }
        StatusBarBackgroundLayout statusBarBackgroundLayout = this.b;
        if (statusBarBackgroundLayout != null) {
            statusBarBackgroundLayout.a = drawable;
            boolean z2 = true;
            if (drawable == null) {
                z = true;
            } else {
                z = false;
            }
            int i = Build.VERSION.SDK_INT;
            statusBarBackgroundLayout.setWillNotDraw(z);
            if (drawable == null) {
                z2 = false;
            }
            statusBarBackgroundLayout.setFitsSystemWindows(z2);
            statusBarBackgroundLayout.invalidate();
            return;
        }
        this.c.setBackgroundDrawable(drawable);
    }
}
