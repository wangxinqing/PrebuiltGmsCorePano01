package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.badge.BadgeDrawable$SavedState;
import com.google.android.material.internal.ParcelableSparseArray;
import java.lang.ref.WeakReference;

/* renamed from: ajst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajst {
    public static final /* synthetic */ int a = 0;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public static SparseArray a(Context context, ParcelableSparseArray parcelableSparseArray) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
        int i = 0;
        while (i < parcelableSparseArray.size()) {
            int keyAt = parcelableSparseArray.keyAt(i);
            BadgeDrawable$SavedState badgeDrawable$SavedState = (BadgeDrawable$SavedState) parcelableSparseArray.valueAt(i);
            if (badgeDrawable$SavedState != null) {
                ajss ajss = new ajss(context);
                int i2 = badgeDrawable$SavedState.e;
                BadgeDrawable$SavedState badgeDrawable$SavedState2 = ajss.d;
                if (badgeDrawable$SavedState2.e != i2) {
                    badgeDrawable$SavedState2.e = i2;
                    double d = (double) i2;
                    Double.isNaN(d);
                    ajss.e = ((int) Math.pow(10.0d, d - 4.0d)) - 1;
                    ajss.c.a();
                    ajss.d();
                    ajss.invalidateSelf();
                }
                int i3 = badgeDrawable$SavedState.d;
                if (i3 != -1) {
                    int max = Math.max(0, i3);
                    BadgeDrawable$SavedState badgeDrawable$SavedState3 = ajss.d;
                    if (badgeDrawable$SavedState3.d != max) {
                        badgeDrawable$SavedState3.d = max;
                        ajss.c.a();
                        ajss.d();
                        ajss.invalidateSelf();
                    }
                }
                int i4 = badgeDrawable$SavedState.a;
                ajss.d.a = i4;
                ColorStateList valueOf = ColorStateList.valueOf(i4);
                if (ajss.b.i() != valueOf) {
                    ajss.b.c(valueOf);
                    ajss.invalidateSelf();
                }
                int i5 = badgeDrawable$SavedState.b;
                ajss.d.b = i5;
                if (ajss.c.a.getColor() != i5) {
                    ajss.c.a.setColor(i5);
                    ajss.invalidateSelf();
                }
                int i6 = badgeDrawable$SavedState.h;
                BadgeDrawable$SavedState badgeDrawable$SavedState4 = ajss.d;
                if (badgeDrawable$SavedState4.h != i6) {
                    badgeDrawable$SavedState4.h = i6;
                    WeakReference weakReference = ajss.f;
                    if (!(weakReference == null || weakReference.get() == null)) {
                        View view = (View) ajss.f.get();
                        WeakReference weakReference2 = ajss.g;
                        if (weakReference2 != null) {
                            viewGroup = (ViewGroup) weakReference2.get();
                        } else {
                            viewGroup = null;
                        }
                        ajss.a(view, viewGroup);
                    }
                }
                ajss.d.i = badgeDrawable$SavedState.i;
                ajss.d();
                ajss.d.j = badgeDrawable$SavedState.j;
                ajss.d();
                sparseArray.put(keyAt, ajss);
                i++;
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    public static void b(ajss ajss, View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        ajss.setBounds(rect);
        ajss.a(view, (ViewGroup) null);
    }

    public static ParcelableSparseArray a(SparseArray sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        int i = 0;
        while (i < sparseArray.size()) {
            int keyAt = sparseArray.keyAt(i);
            ajss ajss = (ajss) sparseArray.valueAt(i);
            if (ajss != null) {
                parcelableSparseArray.put(keyAt, ajss.d);
                i++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return parcelableSparseArray;
    }

    public static void a(ajss ajss, View view) {
        if (ajss != null) {
            view.getOverlay().remove(ajss);
        }
    }

    public static void a(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
