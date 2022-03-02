package com.google.android.setupdesign;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupdesign.view.NavigationBar;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SetupWizardLayout extends TemplateLayout {

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new alhy();
        boolean a = false;

        public SavedState(Parcel parcel) {
            super(parcel);
            boolean z = false;
            this.a = parcel.readInt() != 0 ? true : z;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SetupWizardLayout(Context context) {
        super(context, 0, 0);
        b((AttributeSet) null, R.attr.sudLayoutTheme);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            alhk r0 = new alhk
            r1 = 0
            r0.<init>(r8, r1)
            java.lang.Class<alhk> r2 = defpackage.alhk.class
            r8.a((java.lang.Class) r2, (defpackage.alhi) r0)
            aliu r0 = new aliu
            r0.<init>(r8, r9, r10)
            java.lang.Class<aliu> r2 = defpackage.aliu.class
            r8.a((java.lang.Class) r2, (defpackage.alhi) r0)
            aliz r0 = new aliz
            r0.<init>(r8)
            java.lang.Class<aliz> r2 = defpackage.aliz.class
            r8.a((java.lang.Class) r2, (defpackage.alhi) r0)
            aliy r0 = new aliy
            r0.<init>(r8)
            java.lang.Class<aliy> r2 = defpackage.aliy.class
            r8.a((java.lang.Class) r2, (defpackage.alhi) r0)
            aljc r0 = new aljc
            r0.<init>()
            java.lang.Class<aljc> r2 = defpackage.aljc.class
            r8.a((java.lang.Class) r2, (defpackage.alhi) r0)
            r0 = 2131429564(0x7f0b08bc, float:1.8480804E38)
            android.view.View r0 = r8.b(r0)
            boolean r2 = r0 instanceof android.widget.ScrollView
            if (r2 == 0) goto L_0x0042
            r1 = r0
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            goto L_0x0043
        L_0x0042:
        L_0x0043:
            if (r1 != 0) goto L_0x0046
            goto L_0x004b
        L_0x0046:
            aljd r0 = new aljd
            r0.<init>(r1)
        L_0x004b:
            android.content.Context r0 = r8.getContext()
            int[] r1 = defpackage.alhx.p
            r2 = 0
            android.content.res.TypedArray r9 = r0.obtainStyledAttributes(r9, r1, r10, r2)
            android.graphics.drawable.Drawable r10 = r9.getDrawable(r2)
            r0 = 1
            if (r10 == 0) goto L_0x0061
            r8.a((android.graphics.drawable.Drawable) r10)
            goto L_0x0079
        L_0x0061:
            android.graphics.drawable.Drawable r10 = r9.getDrawable(r0)
            if (r10 == 0) goto L_0x0079
            boolean r1 = r10 instanceof android.graphics.drawable.BitmapDrawable
            if (r1 == 0) goto L_0x0076
            r1 = r10
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Shader$TileMode r3 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.REPEAT
            r1.setTileModeXY(r3, r4)
        L_0x0076:
            r8.a((android.graphics.drawable.Drawable) r10)
        L_0x0079:
            r10 = 3
            android.graphics.drawable.Drawable r10 = r9.getDrawable(r10)
            r1 = 2
            r3 = 2131429574(0x7f0b08c6, float:1.8480825E38)
            if (r10 != 0) goto L_0x00e6
            r10 = 6
            android.graphics.drawable.Drawable r10 = r9.getDrawable(r10)
            r4 = 5
            android.graphics.drawable.Drawable r4 = r9.getDrawable(r4)
            if (r10 != 0) goto L_0x0091
            goto L_0x00f4
        L_0x0091:
            if (r4 == 0) goto L_0x00f4
            android.view.View r5 = r8.b(r3)
            boolean r6 = r5 instanceof com.google.android.setupdesign.view.Illustration
            if (r6 == 0) goto L_0x00f4
            com.google.android.setupdesign.view.Illustration r5 = (com.google.android.setupdesign.view.Illustration) r5
            android.content.Context r6 = r8.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131034140(0x7f05001c, float:1.767879E38)
            boolean r6 = r6.getBoolean(r7)
            if (r6 == 0) goto L_0x00dd
            boolean r6 = r4 instanceof android.graphics.drawable.BitmapDrawable
            if (r6 == 0) goto L_0x00bf
            r6 = r4
            android.graphics.drawable.BitmapDrawable r6 = (android.graphics.drawable.BitmapDrawable) r6
            android.graphics.Shader$TileMode r7 = android.graphics.Shader.TileMode.REPEAT
            r6.setTileModeX(r7)
            r7 = 48
            r6.setGravity(r7)
        L_0x00bf:
            boolean r6 = r10 instanceof android.graphics.drawable.BitmapDrawable
            if (r6 == 0) goto L_0x00cb
            r6 = r10
            android.graphics.drawable.BitmapDrawable r6 = (android.graphics.drawable.BitmapDrawable) r6
            r7 = 51
            r6.setGravity(r7)
        L_0x00cb:
            android.graphics.drawable.LayerDrawable r6 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r7 = new android.graphics.drawable.Drawable[r1]
            r7[r2] = r4
            r7[r0] = r10
            r6.<init>(r7)
            int r10 = android.os.Build.VERSION.SDK_INT
            r6.setAutoMirrored(r0)
            r10 = r6
            goto L_0x00e2
        L_0x00dd:
            int r2 = android.os.Build.VERSION.SDK_INT
            r10.setAutoMirrored(r0)
        L_0x00e2:
            r5.a(r10)
            goto L_0x00f4
        L_0x00e6:
            android.view.View r2 = r8.b(r3)
            boolean r4 = r2 instanceof com.google.android.setupdesign.view.Illustration
            if (r4 == 0) goto L_0x00f4
            com.google.android.setupdesign.view.Illustration r2 = (com.google.android.setupdesign.view.Illustration) r2
            r2.a(r10)
        L_0x00f4:
            r10 = -1
            int r1 = r9.getDimensionPixelSize(r1, r10)
            if (r1 != r10) goto L_0x0107
            android.content.res.Resources r10 = r8.getResources()
            r1 = 2131167255(0x7f070817, float:1.7948778E38)
            int r1 = r10.getDimensionPixelSize(r1)
        L_0x0107:
            android.view.View r10 = r8.b(r3)
            if (r10 == 0) goto L_0x011d
            int r2 = r10.getPaddingLeft()
            int r4 = r10.getPaddingRight()
            int r5 = r10.getPaddingBottom()
            r10.setPadding(r2, r1, r4, r5)
        L_0x011d:
            r10 = 4
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r10 = r9.getFloat(r10, r1)
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x013b
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            android.content.res.Resources r1 = r8.getResources()
            r2 = 2131167291(0x7f07083b, float:1.7948851E38)
            r1.getValue(r2, r10, r0)
            float r10 = r10.getFloat()
        L_0x013b:
            android.view.View r0 = r8.b(r3)
            boolean r1 = r0 instanceof com.google.android.setupdesign.view.Illustration
            if (r1 == 0) goto L_0x014e
            com.google.android.setupdesign.view.Illustration r0 = (com.google.android.setupdesign.view.Illustration) r0
            r0.a = r10
            r0.invalidate()
            r0.requestLayout()
        L_0x014e:
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupdesign.SetupWizardLayout.b(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: protected */
    public View a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = R.layout.sud_template;
        }
        return a(layoutInflater, 2132018098, i);
    }

    public final NavigationBar c() {
        View b = ((aliy) a(aliy.class)).a.b(R.id.sud_layout_navigation_bar);
        if (!(b instanceof NavigationBar)) {
            return null;
        }
        return (NavigationBar) b;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            String valueOf = String.valueOf(parcelable);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("Ignoring restore instance state ");
            sb.append(valueOf);
            Log.w("SetupWizardLayout", sb.toString());
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        b(savedState.a);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        View b = ((aliz) a(aliz.class)).a.b(R.id.sud_layout_progress);
        boolean z = false;
        if (b != null && b.getVisibility() == 0) {
            z = true;
        }
        savedState.a = z;
        return savedState;
    }

    public SetupWizardLayout(Context context, int i) {
        this(context, i, 0);
    }

    /* access modifiers changed from: protected */
    public ViewGroup a(int i) {
        if (i == 0) {
            i = R.id.sud_layout_content;
        }
        return super.a(i);
    }

    public SetupWizardLayout(Context context, int i, int i2) {
        super(context, i, i2);
        b((AttributeSet) null, R.attr.sudLayoutTheme);
    }

    public final void a(Drawable drawable) {
        View b = b(R.id.sud_layout_decor);
        if (b != null) {
            b.setBackgroundDrawable(drawable);
        }
    }

    public SetupWizardLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet, R.attr.sudLayoutTheme);
    }

    public SetupWizardLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(attributeSet, i);
    }

    public final void a(CharSequence charSequence) {
        ((aliu) a(aliu.class)).a(charSequence);
    }

    public final void b(boolean z) {
        ((aliz) a(aliz.class)).a(z);
    }
}
