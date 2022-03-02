package defpackage;

import android.graphics.PointF;
import android.os.SystemClock;
import com.google.android.pano.widget.CursorWebView;

/* renamed from: akfn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akfn implements Runnable {
    final /* synthetic */ CursorWebView a;
    private long b = 0;
    private long c = 0;

    public akfn(CursorWebView cursorWebView) {
        this.a = cursorWebView;
    }

    private final float a(float f, long j, long j2) {
        CursorWebView cursorWebView = this.a;
        float f2 = ((float) (j - j2)) / cursorWebView.l;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        float f3 = f2 * ((float) (cursorWebView.k - cursorWebView.j));
        if (f <= 0.0f) {
            f3 = -f3;
        }
        return f + f3;
    }

    public final void run() {
        float f;
        float f2;
        PointF a2 = this.a.b.a();
        float a3 = this.a.a(a2.x, this.a.m);
        float a4 = this.a.a(a2.y, this.a.n);
        int i = 0;
        float f3 = 0.0f;
        if (a3 == 0.0f && a4 == 0.0f) {
            this.a.r = false;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        CursorWebView cursorWebView = this.a;
        if (!cursorWebView.r) {
            cursorWebView.r = true;
        }
        int i2 = cursorWebView.j;
        if (a3 == ((float) i2) || a3 == ((float) (-i2))) {
            long j = this.b;
            if (j != 0) {
                a3 = a(a3, elapsedRealtime, j);
            } else {
                this.b = elapsedRealtime;
            }
        } else {
            this.b = 0;
        }
        float f4 = a3;
        int i3 = this.a.j;
        if (a4 == ((float) i3) || a4 == ((float) (-i3))) {
            long j2 = this.c;
            if (j2 != 0) {
                a4 = a(a4, elapsedRealtime, j2);
            } else {
                this.c = elapsedRealtime;
            }
        } else {
            this.c = 0;
        }
        float f5 = a2.x;
        float f6 = a2.y;
        if (f4 != 0.0f) {
            f5 += f4 > 0.0f ? -this.a.q : this.a.q;
        }
        if (a4 != 0.0f) {
            CursorWebView cursorWebView2 = this.a;
            if (a4 > 0.0f) {
                f2 = -cursorWebView2.q;
            } else {
                f2 = cursorWebView2.q;
            }
            f6 += f2;
        }
        akeq akeq = this.a.b;
        float f7 = akeq.c;
        if (f7 > 0.0f) {
            f = (f5 * akeq.a) / f7;
        } else {
            f = 0.0f;
        }
        float f8 = akeq.d;
        if (f8 > 0.0f) {
            f3 = (f6 * akeq.b) / f8;
        }
        akeq.a(f, f3);
        this.a.postOnAnimation(this);
        int scrollX = this.a.getScrollX() + ((int) f4);
        if (scrollX < 0) {
            scrollX = 0;
        } else if (scrollX > this.a.getWidth()) {
            scrollX = this.a.getWidth();
        }
        int scrollY = this.a.getScrollY() + ((int) a4);
        if (scrollY >= 0) {
            i = ((float) scrollY) > ((float) this.a.getContentHeight()) * this.a.getScaleY() ? (int) (((float) this.a.getContentHeight()) * this.a.getScaleY()) : scrollY;
        }
        this.a.scrollTo(scrollX, i);
        this.a.postInvalidate();
    }
}
