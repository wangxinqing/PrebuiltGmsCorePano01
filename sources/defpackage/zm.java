package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;

/* renamed from: zm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zm extends abs implements zo {
    public CharSequence a;
    ListAdapter b;
    public final Rect c = new Rect();
    final /* synthetic */ AppCompatSpinner d;
    private int r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zm(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = appCompatSpinner;
        this.l = appCompatSpinner;
        l();
        this.m = new zj(this);
    }

    public final CharSequence a() {
        return this.a;
    }

    public final void a(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final void c(int i) {
        this.r = i;
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        Drawable b2 = b();
        int i = 0;
        if (b2 != null) {
            b2.getPadding(this.d.d);
            i = !afs.a(this.d) ? -this.d.d.left : this.d.d.right;
        } else {
            Rect rect = this.d.d;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = this.d.getPaddingLeft();
        int paddingRight = this.d.getPaddingRight();
        int width = this.d.getWidth();
        AppCompatSpinner appCompatSpinner = this.d;
        int i2 = appCompatSpinner.c;
        if (i2 == -2) {
            int a2 = appCompatSpinner.a((SpinnerAdapter) this.b, b());
            int i3 = (this.d.getContext().getResources().getDisplayMetrics().widthPixels - this.d.d.left) - this.d.d.right;
            if (a2 > i3) {
                a2 = i3;
            }
            d(Math.max(a2, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            d((width - paddingLeft) - paddingRight);
        } else {
            d(i2);
        }
        this.g = afs.a(this.d) ? i + (((width - paddingRight) - this.f) - this.r) : i + paddingLeft + this.r;
    }

    public final void a(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean e = e();
        h();
        k();
        super.ar();
        aan aan = this.e;
        aan.setChoiceMode(1);
        int i3 = Build.VERSION.SDK_INT;
        aan.setTextDirection(i);
        aan.setTextAlignment(i2);
        int selectedItemPosition = this.d.getSelectedItemPosition();
        aan aan2 = this.e;
        if (e() && aan2 != null) {
            aan2.a = false;
            aan2.setSelection(selectedItemPosition);
            if (aan2.getChoiceMode() != 0) {
                aan2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!e && (viewTreeObserver = this.d.getViewTreeObserver()) != null) {
            zk zkVar = new zk(this);
            viewTreeObserver.addOnGlobalLayoutListener(zkVar);
            a((PopupWindow.OnDismissListener) new zl(this, zkVar));
        }
    }

    public final void a(ListAdapter listAdapter) {
        super.a(listAdapter);
        this.b = listAdapter;
    }
}
