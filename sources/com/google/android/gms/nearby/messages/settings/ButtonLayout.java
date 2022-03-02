package com.google.android.gms.nearby.messages.settings;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.cast.JGCastService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ButtonLayout extends ViewGroup {
    private final vgj a;
    private final vgj b;
    private Button c;
    private Button d;
    private boolean e;

    public ButtonLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public static boolean a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() == 2) {
            this.c = (Button) getChildAt(0);
            this.d = (Button) getChildAt(1);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        if (this.e) {
            Button button = this.d;
            button.layout(paddingLeft, paddingBottom - button.getMeasuredHeight(), this.d.getMeasuredWidth() + paddingLeft, paddingBottom);
            this.c.layout(paddingLeft, this.d.getTop() - this.c.getMeasuredHeight(), this.c.getMeasuredWidth() + paddingLeft, this.d.getTop());
        } else if (!a(getContext())) {
            Button button2 = this.c;
            button2.layout(paddingRight - button2.getMeasuredWidth(), paddingBottom - this.c.getMeasuredHeight(), paddingRight, paddingBottom);
            this.d.layout(this.c.getLeft() - this.d.getMeasuredWidth(), paddingBottom - this.d.getMeasuredHeight(), this.c.getLeft(), paddingBottom);
        } else {
            Button button3 = this.c;
            button3.layout(paddingLeft, paddingBottom - button3.getMeasuredHeight(), this.c.getMeasuredWidth() + paddingLeft, paddingBottom);
            this.d.layout(this.c.getRight(), paddingBottom - this.d.getMeasuredHeight(), this.c.getRight() + this.d.getMeasuredWidth(), paddingBottom);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setPadding(this.b.d(), this.b.b(), this.b.e(), this.b.c());
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        this.c.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.b.a(), JGCastService.FLAG_PRIVATE_DISPLAY));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.b.a(), JGCastService.FLAG_PRIVATE_DISPLAY));
        boolean z = this.c.getMeasuredWidth() + this.d.getMeasuredWidth() > paddingLeft;
        this.e = z;
        vgj vgj = !z ? this.b : this.a;
        setPadding(vgj.d(), vgj.b(), vgj.e(), vgj.c());
        int paddingLeft2 = (size - getPaddingLeft()) - getPaddingRight();
        this.c.setGravity(vgj.a);
        this.d.setGravity(vgj.a);
        int i3 = Build.VERSION.SDK_INT;
        this.c.setTextAlignment(vgj.b);
        this.d.setTextAlignment(vgj.b);
        if (this.e) {
            this.c.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft2, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(vgj.a(), JGCastService.FLAG_PRIVATE_DISPLAY));
            this.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft2, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(vgj.a(), JGCastService.FLAG_PRIVATE_DISPLAY));
        }
        if (this.e) {
            setMeasuredDimension(size, this.c.getMeasuredHeight() + this.d.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
        } else {
            setMeasuredDimension(size, this.c.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
        }
    }

    public ButtonLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ButtonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = false;
        vgi vgi = new vgi(context);
        vgi.a = 48;
        vgi.b = 21;
        vgi.c = 6;
        vgi.d = 24;
        vgi.e = 8;
        this.a = vgi.a();
        vgi vgi2 = new vgi(context);
        vgi2.a = 52;
        vgi2.b = 17;
        vgi2.c = 0;
        vgi2.f = 16;
        vgi2.g = 16;
        this.b = vgi2.a();
    }
}
