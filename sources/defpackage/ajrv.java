package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ajrv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajrv {
    private final ou a = new ou();
    private final ou b = new ou();

    public static ajrv a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return a((List) ((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return a((List) arrayList);
        } catch (Exception e) {
            String valueOf = String.valueOf(Integer.toHexString(i));
            Log.w("MotionSpec", valueOf.length() == 0 ? new String("Can't load animation resource ID #0x") : "Can't load animation resource ID #0x".concat(valueOf), e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajrv) {
            return this.a.equals(((ajrv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }

    public static ajrv a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return a(context, resourceId);
    }

    private static ajrv a(List list) {
        ajrv ajrv = new ajrv();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                ajrv.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = ajrr.b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = ajrr.c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = ajrr.d;
                }
                ajrw ajrw = new ajrw(startDelay, duration, interpolator);
                ajrw.a = objectAnimator.getRepeatCount();
                ajrw.b = objectAnimator.getRepeatMode();
                ajrv.a.put(propertyName, ajrw);
                i++;
            } else {
                String valueOf = String.valueOf(animator);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Animator must be an ObjectAnimator: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return ajrv;
    }

    public final ajrw a(String str) {
        if (this.a.get(str) != null) {
            return (ajrw) this.a.get(str);
        }
        throw new IllegalArgumentException();
    }
}
