package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MenuInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BottomNavigationView extends FrameLayout {
    public final wt a;
    public final ajtc b;
    public final ajte c;
    public daa d;
    private ColorStateList e;
    private MenuInflater f;

    public BottomNavigationView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ajzg.a((View) this);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.b);
        wt wtVar = this.a;
        SparseArray sparseParcelableArray = savedState.c.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !wtVar.h.isEmpty()) {
            Iterator it = wtVar.h.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                xh xhVar = (xh) weakReference.get();
                if (xhVar == null) {
                    wtVar.h.remove(weakReference);
                } else {
                    int b2 = xhVar.b();
                    if (b2 > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(b2)) != null) {
                        xhVar.a(parcelable2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Parcelable f2;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = new Bundle();
        wt wtVar = this.a;
        Bundle bundle = savedState.c;
        if (!wtVar.h.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = wtVar.h.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                xh xhVar = (xh) weakReference.get();
                if (xhVar == null) {
                    wtVar.h.remove(weakReference);
                } else {
                    int b2 = xhVar.b();
                    if (b2 > 0 && (f2 = xhVar.f()) != null) {
                        sparseArray.put(b2, f2);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return savedState;
    }

    public final void setElevation(float f2) {
        super.setElevation(f2);
        ajzg.a((View) this, f2);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new ajth();
        Bundle c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(akdg.a(context, attributeSet, i, 2132018784), attributeSet, i);
        Drawable drawable;
        this.c = new ajte();
        Context context2 = getContext();
        this.a = new ajta(context2);
        this.b = new ajtc(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.b.setLayoutParams(layoutParams);
        ajte ajte = this.c;
        ajte.a = this.b;
        ajte.c = 1;
        this.b.n = ajte;
        this.a.a((xh) this.c);
        this.c.a(getContext(), this.a);
        aev b2 = ajya.b(context2, attributeSet, ajti.a, i, 2132018784, 8, 7);
        if (b2.f(5)) {
            this.b.a(b2.e(5));
        } else {
            ajtc ajtc = this.b;
            ajtc.a(ajtc.b());
        }
        int d2 = b2.d(4, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_icon_size));
        ajtc ajtc2 = this.b;
        ajtc2.g = d2;
        ajsz[] ajszArr = ajtc2.d;
        if (ajszArr != null) {
            for (ajsz b3 : ajszArr) {
                b3.b(d2);
            }
        }
        if (b2.f(8)) {
            int f2 = b2.f(8, 0);
            ajtc ajtc3 = this.b;
            ajtc3.i = f2;
            ajsz[] ajszArr2 = ajtc3.d;
            if (ajszArr2 != null) {
                for (ajsz ajsz : ajszArr2) {
                    ajsz.c(f2);
                    ColorStateList colorStateList = ajtc3.h;
                    if (colorStateList != null) {
                        ajsz.b(colorStateList);
                    }
                }
            }
        }
        if (b2.f(7)) {
            int f3 = b2.f(7, 0);
            ajtc ajtc4 = this.b;
            ajtc4.j = f3;
            ajsz[] ajszArr3 = ajtc4.d;
            if (ajszArr3 != null) {
                for (ajsz ajsz2 : ajszArr3) {
                    ajsz2.d(f3);
                    ColorStateList colorStateList2 = ajtc4.h;
                    if (colorStateList2 != null) {
                        ajsz2.b(colorStateList2);
                    }
                }
            }
        }
        if (b2.f(9)) {
            ColorStateList e2 = b2.e(9);
            ajtc ajtc5 = this.b;
            ajtc5.h = e2;
            ajsz[] ajszArr4 = ajtc5.d;
            if (ajszArr4 != null) {
                for (ajsz b4 : ajszArr4) {
                    b4.b(e2);
                }
            }
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            ajzf ajzf = new ajzf();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                ajzf.c(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            ajzf.a(context2);
            qb.a((View) this, (Drawable) ajzf);
        }
        if (b2.f(1)) {
            qb.a((View) this, (float) b2.d(1, 0));
        }
        ma.a(getBackground().mutate(), ajym.a(context2, b2, 0));
        int b5 = b2.b(10, -1);
        ajtc ajtc6 = this.b;
        if (ajtc6.c != b5) {
            ajtc6.c = b5;
            this.c.a(false);
        }
        boolean a2 = b2.a(3, true);
        ajtc ajtc7 = this.b;
        if (ajtc7.b != a2) {
            ajtc7.b = a2;
            this.c.a(false);
        }
        int f4 = b2.f(2, 0);
        if (f4 == 0) {
            ColorStateList a3 = ajym.a(context2, b2, 6);
            if (this.e != a3) {
                this.e = a3;
                if (a3 != null) {
                    ColorStateList a4 = ajyu.a(a3);
                    int i2 = Build.VERSION.SDK_INT;
                    this.b.a((Drawable) new RippleDrawable(a4, (Drawable) null, (Drawable) null));
                } else {
                    this.b.a((Drawable) null);
                }
            } else if (a3 == null) {
                ajtc ajtc8 = this.b;
                ajsz[] ajszArr5 = ajtc8.d;
                if (ajszArr5 != null && ajszArr5.length > 0) {
                    drawable = ajszArr5[0].getBackground();
                } else {
                    drawable = ajtc8.k;
                }
                if (drawable != null) {
                    this.b.a((Drawable) null);
                }
            }
        } else {
            ajtc ajtc9 = this.b;
            ajtc9.l = f4;
            ajsz[] ajszArr6 = ajtc9.d;
            if (ajszArr6 != null) {
                for (ajsz e3 : ajszArr6) {
                    e3.e(f4);
                }
            }
        }
        if (b2.f(11)) {
            int f5 = b2.f(11, 0);
            this.c.b = true;
            if (this.f == null) {
                this.f = new vz(getContext());
            }
            this.f.inflate(f5, this.a);
            ajte ajte2 = this.c;
            ajte2.b = false;
            ajte2.a(true);
        }
        b2.a();
        addView(this.b, layoutParams);
        int i3 = Build.VERSION.SDK_INT;
        this.a.b = new ajtf(this);
        ajyf.a((View) this, (ajyd) new ajtg());
    }
}
