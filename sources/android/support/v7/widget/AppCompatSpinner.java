package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppCompatSpinner extends Spinner {
    private static final int[] e = {16843505};
    public final Context a;
    public zo b;
    public int c;
    public final Rect d;
    private final yp f;
    private aav g;
    private SpinnerAdapter h;
    private final boolean i;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new zn();
        boolean a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readByte() != 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.a ? (byte) 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2;
        int i3 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int i4 = 0;
        while (max2 < min) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i3) {
                i2 = itemViewType;
            } else {
                i2 = i3;
            }
            if (itemViewType != i3) {
                view = null;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i4 = Math.max(i4, view.getMeasuredWidth());
            max2++;
            i3 = i2;
        }
        if (drawable == null) {
            return i4;
        }
        drawable.getPadding(this.d);
        return i4 + this.d.left + this.d.right;
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        yp ypVar = this.f;
        if (ypVar != null) {
            ypVar.a();
        }
    }

    public final int getDropDownHorizontalOffset() {
        zo zoVar = this.b;
        if (zoVar != null) {
            return zoVar.f();
        }
        int i2 = Build.VERSION.SDK_INT;
        return super.getDropDownHorizontalOffset();
    }

    public final int getDropDownVerticalOffset() {
        zo zoVar = this.b;
        if (zoVar != null) {
            return zoVar.c();
        }
        int i2 = Build.VERSION.SDK_INT;
        return super.getDropDownVerticalOffset();
    }

    public final int getDropDownWidth() {
        if (this.b != null) {
            return this.c;
        }
        int i2 = Build.VERSION.SDK_INT;
        return super.getDropDownWidth();
    }

    public final Drawable getPopupBackground() {
        zo zoVar = this.b;
        if (zoVar != null) {
            return zoVar.b();
        }
        int i2 = Build.VERSION.SDK_INT;
        return super.getPopupBackground();
    }

    public final Context getPopupContext() {
        return this.a;
    }

    public final CharSequence getPrompt() {
        zo zoVar = this.b;
        return zoVar != null ? zoVar.a() : super.getPrompt();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zo zoVar = this.b;
        if (zoVar != null && zoVar.e()) {
            this.b.d();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.b != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new zg(this));
        }
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        zo zoVar = this.b;
        boolean z = false;
        if (zoVar != null && zoVar.e()) {
            z = true;
        }
        savedState.a = z;
        return savedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        aav aav = this.g;
        if (aav == null || !aav.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean performClick() {
        zo zoVar = this.b;
        if (zoVar == null) {
            return super.performClick();
        }
        if (zoVar.e()) {
            return true;
        }
        a();
        return true;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        yp ypVar = this.f;
        if (ypVar != null) {
            ypVar.b();
        }
    }

    public final void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        yp ypVar = this.f;
        if (ypVar != null) {
            ypVar.a(i2);
        }
    }

    public final void setDropDownHorizontalOffset(int i2) {
        zo zoVar = this.b;
        if (zoVar != null) {
            zoVar.c(i2);
            this.b.b(i2);
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        super.setDropDownHorizontalOffset(i2);
    }

    public final void setDropDownVerticalOffset(int i2) {
        zo zoVar = this.b;
        if (zoVar == null) {
            int i3 = Build.VERSION.SDK_INT;
            super.setDropDownVerticalOffset(i2);
            return;
        }
        zoVar.a(i2);
    }

    public final void setDropDownWidth(int i2) {
        if (this.b == null) {
            int i3 = Build.VERSION.SDK_INT;
            super.setDropDownWidth(i2);
            return;
        }
        this.c = i2;
    }

    public final void setPopupBackgroundDrawable(Drawable drawable) {
        zo zoVar = this.b;
        if (zoVar == null) {
            int i2 = Build.VERSION.SDK_INT;
            super.setPopupBackgroundDrawable(drawable);
            return;
        }
        zoVar.a(drawable);
    }

    public final void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(uj.b(this.a, i2));
    }

    public final void setPrompt(CharSequence charSequence) {
        zo zoVar = this.b;
        if (zoVar != null) {
            zoVar.a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public AppCompatSpinner(Context context, int i2) {
        this(context, (AttributeSet) null, R.attr.spinnerStyle, i2);
    }

    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (this.i) {
            super.setAdapter(spinnerAdapter);
            if (this.b != null) {
                Context context = this.a;
                if (context == null) {
                    context = getContext();
                }
                this.b.a((ListAdapter) new zi(spinnerAdapter, context.getTheme()));
                return;
            }
            return;
        }
        this.h = spinnerAdapter;
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r12 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        if (r12 != null) goto L_0x0051;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.d = r0
            android.content.Context r0 = r7.getContext()
            defpackage.aeq.a((android.view.View) r7, (android.content.Context) r0)
            int[] r0 = defpackage.uh.w
            r1 = 0
            aev r0 = defpackage.aev.a(r8, r9, r0, r10, r1)
            yp r2 = new yp
            r2.<init>(r7)
            r7.f = r2
            if (r12 == 0) goto L_0x0029
            vt r2 = new vt
            r2.<init>((android.content.Context) r8, (android.content.res.Resources.Theme) r12)
            r7.a = r2
            goto L_0x003a
        L_0x0029:
            r12 = 4
            int r12 = r0.f(r12, r1)
            if (r12 == 0) goto L_0x0038
            vt r2 = new vt
            r2.<init>((android.content.Context) r8, (int) r12)
            r7.a = r2
            goto L_0x003a
        L_0x0038:
            r7.a = r8
        L_0x003a:
            r12 = -1
            r2 = 0
            if (r11 == r12) goto L_0x003f
            goto L_0x0067
        L_0x003f:
            int[] r12 = e     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            android.content.res.TypedArray r12 = r8.obtainStyledAttributes(r9, r12, r10, r1)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            boolean r3 = r12.hasValue(r1)     // Catch:{ Exception -> 0x0055 }
            if (r3 == 0) goto L_0x004f
            int r11 = r12.getInt(r1, r1)     // Catch:{ Exception -> 0x0055 }
        L_0x004f:
            if (r12 == 0) goto L_0x0067
        L_0x0051:
            r12.recycle()
            goto L_0x0067
        L_0x0055:
            r3 = move-exception
            goto L_0x005d
        L_0x0057:
            r8 = move-exception
            goto L_0x00dc
        L_0x005a:
            r12 = move-exception
            r3 = r12
            r12 = r2
        L_0x005d:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x00da }
            if (r12 == 0) goto L_0x0067
            goto L_0x0051
        L_0x0067:
            r12 = 2
            r3 = 1
            if (r11 == 0) goto L_0x009f
            if (r11 == r3) goto L_0x006e
            goto L_0x00ad
        L_0x006e:
            zm r11 = new zm
            android.content.Context r4 = r7.a
            r11.<init>(r7, r4, r9, r10)
            android.content.Context r4 = r7.a
            int[] r5 = defpackage.uh.w
            aev r4 = defpackage.aev.a(r4, r9, r5, r10, r1)
            r5 = 3
            r6 = -2
            int r5 = r4.e(r5, r6)
            r7.c = r5
            android.graphics.drawable.Drawable r5 = r4.a(r3)
            r11.a((android.graphics.drawable.Drawable) r5)
            java.lang.String r12 = r0.d(r12)
            r11.a = r12
            r4.a()
            r7.b = r11
            zf r12 = new zf
            r12.<init>(r7, r7, r11)
            r7.g = r12
            goto L_0x00ad
        L_0x009f:
            zh r11 = new zh
            r11.<init>(r7)
            r7.b = r11
            java.lang.String r12 = r0.d(r12)
            r11.a((java.lang.CharSequence) r12)
        L_0x00ad:
            android.content.res.TypedArray r11 = r0.b
            java.lang.CharSequence[] r11 = r11.getTextArray(r1)
            if (r11 == 0) goto L_0x00c6
            android.widget.ArrayAdapter r12 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r12.<init>(r8, r1, r11)
            r8 = 2131624974(0x7f0e040e, float:1.8877143E38)
            r12.setDropDownViewResource(r8)
            r7.setAdapter((android.widget.SpinnerAdapter) r12)
        L_0x00c6:
            r0.a()
            r7.i = r3
            android.widget.SpinnerAdapter r8 = r7.h
            if (r8 == 0) goto L_0x00d4
            r7.setAdapter((android.widget.SpinnerAdapter) r8)
            r7.h = r2
        L_0x00d4:
            yp r8 = r7.f
            r8.a(r9, r10)
            return
        L_0x00da:
            r8 = move-exception
            r2 = r12
        L_0x00dc:
            if (r2 == 0) goto L_0x00e1
            r2.recycle()
        L_0x00e1:
            goto L_0x00e3
        L_0x00e2:
            throw r8
        L_0x00e3:
            goto L_0x00e2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    public final void a() {
        int i2 = Build.VERSION.SDK_INT;
        this.b.a(getTextDirection(), getTextAlignment());
    }
}
