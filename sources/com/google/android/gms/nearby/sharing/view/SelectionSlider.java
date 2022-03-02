package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.volley.toolbox.ImageRequest;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SelectionSlider extends FrameLayout {
    public ImageView a;
    public int b;
    public acg c;
    public final aci d = new wiy(this);
    private LinearLayout e;
    private final List f = new ArrayList();
    private int g;
    private int h;
    private VelocityTracker i;
    private float j;

    public SelectionSlider(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setLayoutParams(generateDefaultLayoutParams());
        addView(this.a);
        LinearLayout linearLayout = new LinearLayout(context);
        this.e = linearLayout;
        linearLayout.setLayoutParams(generateDefaultLayoutParams());
        addView(this.e);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.g = viewConfiguration.getScaledMinimumFlingVelocity();
        this.h = viewConfiguration.getScaledMaximumFlingVelocity();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, crk.e, 0, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                this.a.setImageDrawable(obtainStyledAttributes.getDrawable(0));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private final int b() {
        if (wil.a(getContext())) {
            return (((c() - d()) - 1) * getMeasuredWidth()) / c();
        }
        return (d() * getMeasuredWidth()) / c();
    }

    private final int c() {
        acg acg = this.c;
        if (acg != null) {
            return acg.a();
        }
        return 0;
    }

    private final int d() {
        acg acg = this.c;
        if (acg != null) {
            return ((vus) acg).g;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        a(true);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0 || motionEvent.getX() <= ((float) b()) || motionEvent.getX() >= ((float) (b() + this.a.getWidth()))) {
            return false;
        }
        this.j = motionEvent.getX();
        if (this.i == null) {
            this.i = VelocityTracker.obtain();
        }
        this.i.addMovement(motionEvent);
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            this.i.addMovement(motionEvent);
            this.i.computeCurrentVelocity(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, (float) this.h);
            float xVelocity = this.i.getXVelocity();
            if (Math.abs(xVelocity) > ((float) this.g)) {
                int width = getWidth() - this.a.getWidth();
                if (wil.a(getContext())) {
                    i3 = -width;
                    i2 = 0;
                } else {
                    i2 = width;
                    i3 = 0;
                }
                aig aig = new aig(this.a, aig.k);
                aig.a = xVelocity;
                aig.j.a = -16.8f;
                aig.g = (float) i3;
                aig.f = (float) i2;
                wix wix = new wix(this);
                if (!aig.i.contains(wix)) {
                    aig.i.add(wix);
                }
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                } else if (!aig.e) {
                    aig.e = true;
                    float translationX = ((View) aig.c).getTranslationX();
                    aig.b = translationX;
                    if (translationX > aig.f || translationX < aig.g) {
                        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                    }
                    aid a2 = aid.a();
                    if (a2.c.size() == 0) {
                        a2.b().a();
                    }
                    if (!a2.c.contains(aig)) {
                        a2.c.add(aig);
                    }
                }
            } else {
                a(a());
            }
            this.b = 0;
            this.j = 0.0f;
            this.i.recycle();
            this.i = null;
        } else if (actionMasked == 2) {
            this.i.addMovement(motionEvent);
            int x = (int) ((motionEvent.getX() - this.j) + ((float) b()));
            this.b = x;
            int max = Math.max(x, 0);
            this.b = max;
            int min = Math.min(max, getWidth() - this.a.getWidth());
            this.b = min;
            if (wil.a(getContext())) {
                min += (-getWidth()) + this.a.getWidth();
            }
            this.a.setTranslationX((float) min);
        } else if (actionMasked == 3) {
            b(true);
            this.b = 0;
            this.j = 0.0f;
            this.i.recycle();
            this.i = null;
            return false;
        }
        return true;
    }

    private final void b(boolean z) {
        int b2 = b();
        if (wil.a(getContext())) {
            b2 += (-getMeasuredWidth()) + this.a.getWidth();
        }
        if (z && this.a.isLaidOut()) {
            this.a.animate().translationX((float) b2);
            return;
        }
        this.a.animate().cancel();
        this.a.setTranslationX((float) b2);
    }

    public SelectionSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public SelectionSlider(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context, attributeSet);
    }

    public final int a() {
        int width = (this.b + (this.a.getWidth() / 2)) / this.a.getWidth();
        if (wil.a(getContext())) {
            width = (c() - width) - 1;
        }
        return Math.min(Math.max(width, 0), c() - 1);
    }

    public final void a(int i2) {
        a(i2, true);
    }

    public final void a(int i2, boolean z) {
        if (this.c == null) {
            return;
        }
        if (i2 < 0 || i2 > c() - 1) {
            throw new IllegalArgumentException();
        }
        ((vus) this.c).g(i2);
        a(z);
    }

    public final void a(boolean z) {
        if (this.c != null) {
            this.a.getLayoutParams().width = getMeasuredWidth() / this.c.a();
        } else {
            this.a.getLayoutParams().width = -1;
        }
        invalidate();
        this.e.removeAllViews();
        if (this.c != null) {
            while (this.f.size() > this.c.a()) {
                adl adl = (adl) this.f.remove(0);
            }
            while (this.f.size() < this.c.a()) {
                this.f.add(this.c.b((ViewGroup) this.e, 0));
            }
            this.e.setWeightSum((float) this.c.a());
            for (int i2 = 0; i2 < this.c.a(); i2++) {
                this.c.b((adl) this.f.get(i2), i2);
                View view = ((adl) this.f.get(i2)).a;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
                this.e.addView(view, i2);
            }
        }
        b(z);
        int d2 = d();
        for (int i3 = 0; i3 < c(); i3++) {
            View view2 = ((adl) this.f.get(i3)).a;
            if (i3 == d2) {
                view2.setSelected(true);
            } else {
                view2.setSelected(false);
            }
        }
    }
}
