package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: aqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqw extends arn {
    private static final String[] o = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property p = new aqo(PointF.class, "topLeft");
    private static final Property q = new aqp(PointF.class, "bottomRight");
    private static final Property r = new aqq(PointF.class, "bottomRight");
    private static final Property s = new aqr(PointF.class, "topLeft");
    private static final Property t = new aqs(PointF.class, "position");

    static {
        new aqn(PointF.class, "boundsOrigin");
    }

    private static final void d(arw arw) {
        View view = arw.b;
        if (qb.A(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            arw.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            arw.a.put("android:changeBounds:parent", arw.b.getParent());
        }
    }

    public final Animator a(ViewGroup viewGroup, arw arw, arw arw2) {
        int i;
        Animator animator;
        arw arw3 = arw;
        arw arw4 = arw2;
        if (arw3 == null || arw4 == null) {
            return null;
        }
        Map map = arw3.a;
        Map map2 = arw4.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = arw4.b;
        Rect rect = (Rect) arw3.a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) arw4.a.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) arw3.a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) arw4.a.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = i2 != i3 ? 1 : i4 != i5 ? 1 : 0;
            if (!(i6 == i7 && i8 == i9)) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 > 0) {
            asc.a(view, i2, i4, i6, i8);
            if (i14 != 2) {
                if (i2 == i3 && i4 == i5) {
                    animator = arf.a(view, r, arg.a((float) i6, (float) i8, (float) i7, (float) i9));
                } else {
                    animator = arf.a(view, s, arg.a((float) i2, (float) i4, (float) i3, (float) i5));
                }
            } else if (i10 == i12 && i11 == i13) {
                animator = arf.a(view, t, arg.a((float) i2, (float) i4, (float) i3, (float) i5));
            } else {
                aqv aqv = new aqv(view);
                ObjectAnimator a = arf.a(aqv, p, arg.a((float) i2, (float) i4, (float) i3, (float) i5));
                ObjectAnimator a2 = arf.a(aqv, q, arg.a((float) i6, (float) i8, (float) i7, (float) i9));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{a, a2});
                animatorSet.addListener(new aqt(aqv));
                animator = animatorSet;
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                arz.a(viewGroup4, true);
                a((arm) new aqu(viewGroup4));
            }
            return animator;
        }
        return null;
    }

    public final String[] a() {
        return o;
    }

    public final void b(arw arw) {
        d(arw);
    }

    public final void a(arw arw) {
        d(arw);
    }
}
