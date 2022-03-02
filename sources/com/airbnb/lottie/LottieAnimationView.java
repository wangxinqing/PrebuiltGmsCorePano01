package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LottieAnimationView extends AppCompatImageView {
    public static final ave a = new aug();
    public int b = 0;
    public final avc c = new avc();
    public Set d = new HashSet();
    public auk e;
    private final ave f = new auh(this);
    private final ave g = new aui(this);
    private boolean h;
    private String i;
    private int j;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private int n = 0;
    private avl o;
    private int p = 1;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new auj();
        String a;
        int b;
        float c;
        boolean d;
        String e;
        int f;
        int g;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
            this.c = parcel.readFloat();
            this.d = parcel.readInt() != 1 ? false : true;
            this.e = parcel.readString();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    static {
        LottieAnimationView.class.getSimpleName();
    }

    public LottieAnimationView(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    private final void a(AttributeSet attributeSet) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, avn.a);
        boolean z = false;
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(8);
            boolean hasValue2 = obtainStyledAttributes.hasValue(4);
            boolean hasValue3 = obtainStyledAttributes.hasValue(14);
            if (!hasValue || !hasValue2) {
                if (hasValue) {
                    int resourceId = obtainStyledAttributes.getResourceId(8, 0);
                    if (resourceId != 0) {
                        a(resourceId);
                    }
                } else if (hasValue2) {
                    String string2 = obtainStyledAttributes.getString(4);
                    if (string2 != null) {
                        a(string2);
                    }
                } else if (hasValue3 && (string = obtainStyledAttributes.getString(14)) != null) {
                    a(aus.a(getContext(), string));
                }
                this.b = obtainStyledAttributes.getResourceId(3, 0);
            } else {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
        }
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.l = true;
            this.m = true;
        }
        if (obtainStyledAttributes.getBoolean(6, false)) {
            this.c.b(-1);
        }
        if (obtainStyledAttributes.hasValue(11)) {
            b(obtainStyledAttributes.getInt(11, 1));
        }
        if (obtainStyledAttributes.hasValue(10)) {
            c(obtainStyledAttributes.getInt(10, -1));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            this.c.b.b = obtainStyledAttributes.getFloat(13, 1.0f);
        }
        this.c.h = obtainStyledAttributes.getString(5);
        a(obtainStyledAttributes.getFloat(7, 0.0f));
        boolean z2 = obtainStyledAttributes.getBoolean(2, false);
        avc avc = this.c;
        if (avc.j != z2) {
            int i2 = Build.VERSION.SDK_INT;
            avc.j = z2;
            if (avc.a != null) {
                avc.a();
            }
        }
        if (obtainStyledAttributes.hasValue(1)) {
            avp avp = new avp(obtainStyledAttributes.getColor(1, 0));
            axi axi = new axi("**");
            bbe bbe = new bbe(avp);
            this.c.a(axi, avh.B, bbe);
        }
        if (obtainStyledAttributes.hasValue(12)) {
            this.c.b(obtainStyledAttributes.getFloat(12, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(9)) {
            int i3 = obtainStyledAttributes.getInt(9, 0);
            if (i3 >= avo.a().length) {
                i3 = 0;
            }
            d(avo.a()[i3]);
        }
        if (getScaleType() != null) {
            this.c.f = getScaleType();
        }
        obtainStyledAttributes.recycle();
        avc avc2 = this.c;
        if (bbb.a(getContext()) != 0.0f) {
            z = true;
        }
        avc2.d = Boolean.valueOf(z).booleanValue();
        e();
        this.h = true;
    }

    private final void f() {
        avl avl = this.o;
        if (avl != null) {
            avl.d(this.f);
            this.o.c(this.g);
        }
    }

    public final void b() {
        if (isShown()) {
            this.c.d();
            e();
            return;
        }
        this.k = true;
    }

    public final void buildDrawingCache(boolean z) {
        this.n++;
        super.buildDrawingCache(z);
        if (this.n == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            d(2);
        }
        this.n--;
        auf.a();
    }

    public final void c(int i2) {
        this.c.b(i2);
    }

    public final void d() {
        this.m = false;
        this.l = false;
        this.k = false;
        avc avc = this.c;
        avc.e.clear();
        avc.b.i();
        e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r5 = this;
            int r0 = r5.p
            int r1 = r0 + -1
            r2 = 0
            if (r0 == 0) goto L_0x003c
            r0 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0014
            if (r1 == r3) goto L_0x0013
            if (r1 == r0) goto L_0x0011
            r0 = 1
            goto L_0x0032
        L_0x0011:
            r0 = 1
            goto L_0x0032
        L_0x0013:
            goto L_0x0032
        L_0x0014:
            auk r1 = r5.e
            if (r1 != 0) goto L_0x0019
            goto L_0x0024
        L_0x0019:
            boolean r1 = r1.k
            if (r1 == 0) goto L_0x0024
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r1 >= r4) goto L_0x0024
            goto L_0x0011
        L_0x0024:
            auk r1 = r5.e
            if (r1 != 0) goto L_0x0029
            goto L_0x0030
        L_0x0029:
            int r1 = r1.l
            r4 = 4
            if (r1 <= r4) goto L_0x0030
            r0 = 1
            goto L_0x0032
        L_0x0030:
            int r1 = android.os.Build.VERSION.SDK_INT
        L_0x0032:
            int r1 = r5.getLayerType()
            if (r0 == r1) goto L_0x003b
            r5.setLayerType(r0, r2)
        L_0x003b:
            return
        L_0x003c:
            goto L_0x003f
        L_0x003e:
            throw r2
        L_0x003f:
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.e():void");
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        avc avc = this.c;
        if (drawable2 == avc) {
            super.invalidateDrawable(avc);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.m || this.l) {
            a();
            this.m = false;
            this.l = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        if (c()) {
            this.k = false;
            avc avc = this.c;
            avc.e.clear();
            avc.b.cancel();
            e();
            this.l = true;
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.a;
        this.i = str;
        if (!TextUtils.isEmpty(str)) {
            a(this.i);
        }
        int i2 = savedState.b;
        this.j = i2;
        if (i2 != 0) {
            a(i2);
        }
        a(savedState.c);
        if (savedState.d) {
            a();
        }
        this.c.h = savedState.e;
        b(savedState.f);
        c(savedState.g);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.i;
        savedState.b = this.j;
        savedState.c = this.c.l();
        savedState.d = this.c.i();
        avc avc = this.c;
        savedState.e = avc.h;
        savedState.f = avc.b.getRepeatMode();
        savedState.g = this.c.h();
        return savedState;
    }

    public final void onVisibilityChanged(View view, int i2) {
        if (!this.h) {
            return;
        }
        if (isShown()) {
            if (this.k) {
                b();
                this.k = false;
            }
        } else if (c()) {
            d();
            this.k = true;
        }
    }

    public final void setImageBitmap(Bitmap bitmap) {
        f();
        super.setImageBitmap(bitmap);
    }

    public final void setImageDrawable(Drawable drawable) {
        f();
        super.setImageDrawable(drawable);
    }

    public final void setImageResource(int i2) {
        f();
        super.setImageResource(i2);
    }

    public final void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        avc avc = this.c;
        if (avc != null) {
            avc.f = scaleType;
        }
    }

    public final void b(int i2) {
        this.c.b.setRepeatMode(i2);
    }

    public final boolean c() {
        return this.c.i();
    }

    public final void b(Animator.AnimatorListener animatorListener) {
        this.c.b.removeListener(animatorListener);
    }

    public final void d(int i2) {
        this.p = i2;
        e();
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet);
    }

    public final void a() {
        if (isShown()) {
            this.c.c();
            e();
            return;
        }
        this.k = true;
    }

    public final void a(float f2) {
        this.c.a(f2);
    }

    public final void a(float f2, float f3) {
        this.c.a(f2, f3);
    }

    public final void a(int i2) {
        this.j = i2;
        this.i = null;
        a(aus.a(getContext(), i2));
    }

    public final void a(int i2, int i3) {
        this.c.a(i2, i3);
    }

    public final void a(Animator.AnimatorListener animatorListener) {
        this.c.b.addListener(animatorListener);
    }

    public final void a(avl avl) {
        this.e = null;
        this.c.b();
        f();
        avl.b(this.f);
        avl.a(this.g);
        this.o = avl;
    }

    public final void a(String str) {
        this.i = str;
        this.j = 0;
        a(aus.b(getContext(), str));
    }

    @Deprecated
    public final void a(boolean z) {
        this.c.b(!z ? 0 : -1);
    }
}
