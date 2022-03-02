package com.google.android.gms.drive.ui.select.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FileListView extends RecyclerView {
    public final lrb a;
    public Runnable b;
    public acy c;
    private final aci d;

    public FileListView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void draw(Canvas canvas) {
        int i;
        int i2;
        super.draw(canvas);
        lrb lrb = this.a;
        if (lrb.r != 0) {
            int i3 = lrb.f;
            int width = lrb.i.getWidth();
            lqz lqz = lrb.q;
            if (lrb.r == 4) {
                i = lqz.a();
                if (i < 104) {
                    lrb.a.setAlpha(i + i);
                }
                if (!lrb.x.equals(lqy.LEFT)) {
                    i2 = width - ((lrb.e * i) / 208);
                } else {
                    width = (lrb.e * i) / 208;
                    i2 = 0;
                }
                lrb.a.setBounds(i2, 0, width, lrb.d);
                lrb.v = true;
            } else {
                i = -1;
            }
            if (lrb.b != null) {
                Rect bounds = lrb.a.getBounds();
                int i4 = bounds.left;
                int i5 = (bounds.bottom - bounds.top) / 2;
                int intrinsicWidth = lrb.b.getIntrinsicWidth();
                int i6 = (i4 + (lrb.e / 2)) - (intrinsicWidth / 2);
                lrb.b.setBounds(i6, i5, intrinsicWidth + i6, lrb.i.getHeight() - i5);
                lrb.b.draw(canvas);
            }
            canvas.translate(0.0f, (float) i3);
            lrb.a.draw(canvas);
            canvas.translate(0.0f, (float) (-i3));
            int i7 = lrb.r;
            if (i7 == 3) {
                if (lrb.p) {
                    String str = lrb.o;
                    lrb.A.draw(canvas);
                    Paint paint = lrb.z;
                    RectF rectF = lrb.B;
                    float ascent = paint.ascent();
                    canvas.drawText(str, (float) (((int) (rectF.left + rectF.right)) / 2), (float) ((int) (((rectF.top + rectF.bottom) - (paint.descent() + ascent)) / 2.0f)), paint);
                }
            } else if (i7 != 4) {
            } else {
                if (i != 0) {
                    lrb.w.invalidate(lrb.b(), i3, lrb.a(), lrb.d + i3);
                } else {
                    lrb.a(0);
                }
            }
        }
    }

    public final boolean isVerticalScrollBarEnabled() {
        return this.a.r == 0;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
            this.b = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        lrb lrb = this.a;
        Resources resources = getResources();
        Drawable drawable = lrb.a;
        if (drawable != null) {
            drawable.setBounds(lrb.c(i), 0, lrb.b(i), lrb.d);
        }
        RectF rectF = lrb.g;
        rectF.left = (float) ((i - lrb.h) / 2);
        rectF.right = rectF.left + ((float) lrb.h);
        float f = (float) (i2 / 10);
        rectF.top = f;
        rectF.bottom = rectF.top + ((float) lrb.h);
        Drawable drawable2 = lrb.c;
        if (drawable2 != null) {
            drawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        RectF rectF2 = lrb.B;
        rectF2.left = (float) ((i - lrb.y) / 2);
        rectF2.right = rectF2.left + ((float) lrb.y);
        rectF2.top = f;
        Rect rect = new Rect();
        lrb.z.getTextBounds("W", 0, 1, rect);
        int i5 = (int) (resources.getDisplayMetrics().density * 30.0f);
        rectF2.bottom = rectF2.top + ((float) (i5 + i5)) + ((float) (rect.bottom - rect.top));
        NinePatchDrawable ninePatchDrawable = lrb.A;
        if (ninePatchDrawable != null) {
            ninePatchDrawable.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        }
    }

    public final void setAdapter(acg acg) {
        acg adapter = getAdapter();
        if (acg != adapter) {
            if (adapter != null) {
                adapter.b(this.d);
            }
            super.setAdapter(acg);
            if (acg != null) {
                acg.a(this.d);
            }
        }
    }

    public final void setOnScrollListener(acy acy) {
        this.c = acy;
    }

    public FileListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FileListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new lre(this);
        this.a = new lrb(getContext(), this, this, lqy.RIGHT);
        super.setOnScrollListener(new lrf(this));
        setWillNotDraw(false);
    }
}
