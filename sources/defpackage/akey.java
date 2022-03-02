package defpackage;

import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: akey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akey {
    public static final /* synthetic */ int k = 0;
    private static final long l = 250;
    private static final long m = 250;
    private static final long n = 160;
    private static final RectF p = new RectF();
    private static final RectF q = new RectF();
    public Interpolator a = new DecelerateInterpolator();
    public final ViewGroup b;
    public long c = m;
    public long d = n;
    public final List e = new ArrayList();
    public akex f;
    public final Comparator g = new akez();
    public int h;
    public boolean i;
    public final View.OnLayoutChangeListener j;
    private final long o = l;

    public akey(ViewGroup viewGroup) {
        new akes(this);
        this.j = new aket(this);
        this.b = viewGroup;
        this.h = 0;
    }

    public final void a(float f2) {
        int size = this.e.size() - 1;
        for (int i2 = size; i2 >= 0; i2--) {
            akfa akfa = (akfa) this.e.get(i2);
            akfa.y = f2;
            akfa.setScaleX((akfa.f * f2) + 1.0f);
            akfa.setScaleY((akfa.g * akfa.y) + 1.0f);
            akfa.setTranslationX(((float) akfa.z.left) + (akfa.y * akfa.h));
            akfa.setTranslationY(((float) akfa.z.top) + (akfa.y * akfa.i));
            float centerX = akfa.A.centerX() + (akfa.n * akfa.y);
            float centerY = akfa.A.centerY() + (akfa.o * akfa.y);
            float width = akfa.A.width();
            float f3 = akfa.p;
            float f4 = akfa.y;
            float height = akfa.A.height();
            float f5 = akfa.q;
            float f6 = akfa.y;
            float scaleX = akfa.getScaleX();
            float scaleY = akfa.getScaleY();
            float f7 = ((width + (f3 * f4)) / scaleX) * 0.5f;
            akfa.E.left = (int) (centerX - f7);
            float f8 = ((height + (f5 * f6)) / scaleY) * 0.5f;
            akfa.E.top = (int) (centerY - f8);
            akfa.E.right = (int) (centerX + f7);
            akfa.E.bottom = (int) (centerY + f8);
            akfa.c.setBounds(akfa.E);
            akfa.D.left = akfa.B.left + (akfa.j * akfa.y);
            akfa.D.top = akfa.B.top + (akfa.l * akfa.y);
            akfa.D.right = akfa.B.right + (akfa.k * akfa.y);
            akfa.D.bottom = akfa.B.bottom + (akfa.m * akfa.y);
            float f9 = akfa.s;
            if (f9 != 0.0f) {
                int i3 = (int) ((akfa.a.e + (f9 * akfa.y)) * 255.0f);
                akfa.c.setAlpha(i3);
                if (akfa.getBackground() != null) {
                    akfa.getBackground().setAlpha(i3);
                }
            }
            float f10 = akfa.r;
            if (f10 != 0.0f) {
                akfa.G.setSaturation(akfa.a.f + (f10 * akfa.y));
                akfa.c.setColorFilter(new ColorMatrixColorFilter(akfa.G));
            }
            if (akfa.x) {
                akfa.setBackgroundColor(Color.argb(Color.alpha(akfa.F) + ((int) (((float) akfa.t) * akfa.y)), Color.red(akfa.F) + ((int) (((float) akfa.u) * akfa.y)), Color.green(akfa.F) + ((int) (((float) akfa.v) * akfa.y)), Color.blue(akfa.F) + ((int) (((float) akfa.w) * akfa.y))));
            }
            akfa.invalidate();
            q.left = 0.0f;
            q.top = 0.0f;
            q.right = (float) akfa.getWidth();
            q.bottom = (float) akfa.getHeight();
            akfb.a((View) akfa, q);
            if (i2 == size) {
                akfa.H = null;
                p.set(q);
            } else {
                RectF rectF = p;
                if (akfa.H == null) {
                    akfa.H = new RectF();
                }
                akfa.H.set(rectF);
                akfa.H.offset(-akfa.getX(), -akfa.getY());
                akfa.H.left /= (akfa.f * akfa.y) + 1.0f;
                akfa.H.right /= (akfa.f * akfa.y) + 1.0f;
                akfa.H.top /= (akfa.g * akfa.y) + 1.0f;
                akfa.H.bottom /= (akfa.g * akfa.y) + 1.0f;
                p.union(q);
            }
            akfa.invalidate();
        }
    }

    public final void a(View view) {
        view.animate().alpha(0.0f).setDuration(this.o).setListener(new akew(this, view)).start();
    }
}
