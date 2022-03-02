package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: ajso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ajso extends ahj {
    private ajsp a;
    private int b = 0;

    public ajso() {
    }

    public final boolean a(int i) {
        ajsp ajsp = this.a;
        if (ajsp != null) {
            return ajsp.a(i);
        }
        this.b = i;
        return false;
    }

    public final int c() {
        ajsp ajsp = this.a;
        if (ajsp != null) {
            return ajsp.b;
        }
        return 0;
    }

    public ajso(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        c(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new ajsp(view);
        }
        this.a.a();
        this.a.b();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.a(i2);
        this.b = 0;
        return true;
    }

    /* access modifiers changed from: protected */
    public void c(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.b(view, i);
    }
}
