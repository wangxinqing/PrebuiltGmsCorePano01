package com.google.android.libraries.material.productlockup;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ProductLockupView extends ViewGroup {
    private static final Pattern h = Pattern.compile(String.format(" %1$s|%1$s ", new Object[]{"Google"}));
    private static final int[] i = {1};
    private static final int[] j = {2};
    private static final int[] k = {1, 2};
    private static Typeface l;
    final ImageView a;
    public final TextView b;
    aeoh c;
    public Drawable d;
    public int e;
    public aeoh f;
    public int[] g;
    private final aeoh m;
    private final aeoh n;
    private int o;
    private String p;
    private boolean q;
    private boolean r;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new aeog();
        String a;
        boolean b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
            this.b = parcel.readInt() != 1 ? false : true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
            parcel.writeInt(this.b ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ProductLockupView(Context context) {
        this(context, (AttributeSet) null);
    }

    private final int a(aeoh aeoh) {
        return Math.round(((float) aeoh.e) * (!this.q ? 0.15f : 1.0f));
    }

    private final void b() {
        this.a.measure(View.MeasureSpec.makeMeasureSpec(this.c.c, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(this.c.d, JGCastService.FLAG_PRIVATE_DISPLAY));
    }

    private final void c() {
        this.b.setTextSize(0, this.c.a);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.b.measure(makeMeasureSpec, makeMeasureSpec);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (this.a.getVisibility() != 8) {
            if (this.b.getVisibility() == 8 || this.r) {
                i7 = 0;
            } else {
                i7 = this.b.getMeasuredWidth() + a(this.c);
            }
            int i8 = this.c.b;
            a(this.a, i7, i8, i7 + this.a.getMeasuredWidth(), i8 + this.a.getMeasuredHeight());
        }
        if (this.b.getVisibility() != 8) {
            if (this.a.getVisibility() == 8 || !this.r) {
                i6 = 0;
            } else {
                i6 = a(this.c) + this.a.getMeasuredWidth();
            }
            int measuredWidth = this.b.getMeasuredWidth();
            a(this.b, i6, 0, i6 + measuredWidth, this.b.getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int[] iArr;
        int size = View.MeasureSpec.getSize(i2);
        int i4 = 0;
        this.a.setVisibility(0);
        this.b.setVisibility(0);
        this.r = this.p.startsWith("Google");
        boolean endsWith = this.p.endsWith("Google");
        int i5 = this.e;
        if (i5 == -1) {
            iArr = this.g;
        } else if (i5 == 0) {
            iArr = k;
        } else if (i5 == 1) {
            iArr = i;
        } else if (i5 == 2) {
            iArr = j;
        } else {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unrecognized sizingMode: ");
            sb.append(i5);
            throw new IllegalStateException(sb.toString());
        }
        if (this.r || endsWith) {
            int length = iArr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                c(iArr[i6]);
                if (a(size, true)) {
                    b();
                    c();
                    break;
                }
                i6++;
            }
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (true) {
            if (i7 < length2) {
                c(iArr[i7]);
                if (a(size, false)) {
                    c();
                    this.a.setVisibility(8);
                    break;
                }
                i7++;
            } else {
                c(1);
                this.r = true;
                b();
                this.b.setVisibility(8);
                break;
            }
        }
        int visibility = this.a.getVisibility();
        int visibility2 = this.b.getVisibility();
        if (visibility == 0) {
            i4 = this.a.getMeasuredWidth();
        }
        if (visibility2 == 0) {
            i4 += this.b.getMeasuredWidth();
        }
        if (visibility == 0 && visibility2 == 0) {
            i4 += a(this.c);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i4, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(Math.max(this.a.getMeasuredHeight() + this.c.b, this.b.getMeasuredHeight()), JGCastService.FLAG_PRIVATE_DISPLAY));
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.p = savedState.a;
        this.q = savedState.b;
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.p;
        savedState.b = this.q;
        return savedState;
    }

    public ProductLockupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.productLockupViewStyle);
    }

    private final void a(View view, int i2, int i3, int i4, int i5) {
        int i6;
        int h2 = qb.h(this);
        if (h2 == 1) {
            i6 = getMeasuredWidth() - i4;
        } else {
            i6 = i2;
        }
        if (h2 == 1) {
            i4 = getMeasuredWidth() - i2;
        }
        view.layout(i6, i3, i4, i5);
    }

    private final void c(int i2) {
        aeoh aeoh;
        if (i2 == -1) {
            aeoh = this.f;
        } else if (i2 == 0 || i2 == 1) {
            aeoh = this.m;
        } else if (i2 == 2) {
            aeoh = this.n;
        } else {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unrecognized sizingMode: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
        this.c = aeoh;
    }

    public final void b(int i2) {
        this.o = i2;
        a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductLockupView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        String str;
        Context context2 = context;
        if (l == null) {
            l = Typeface.createFromAsset(context.getAssets(), "ProductSans-Regular.ttf");
        }
        this.m = new aeoh(getResources(), R.dimen.product_name_text_size, R.dimen.logo_margin_top, R.dimen.logo_width, R.dimen.logo_height, R.dimen.separation_margin);
        this.n = new aeoh(getResources(), R.dimen.product_name_text_size_small, R.dimen.logo_margin_top_small, R.dimen.logo_width_small, R.dimen.logo_height_small, R.dimen.separation_margin_small);
        LayoutInflater.from(context).inflate(R.layout.product_lockup_view, this, true);
        ImageView imageView = (ImageView) findViewById(R.id.logo);
        agzh.a(imageView);
        this.a = imageView;
        TextView textView = (TextView) findViewById(R.id.product_name);
        agzh.a(textView);
        this.b = textView;
        textView.setTypeface(l);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, aeoi.a, i2, 2132018896);
        if (obtainStyledAttributes.hasValue(2)) {
            this.d = obtainStyledAttributes.getDrawable(2);
        } else {
            this.d = uj.b(context2, R.drawable.googlelogo_standard_color_74x24);
        }
        int i3 = obtainStyledAttributes.getInt(1, 0);
        this.e = i3;
        c(i3);
        a(obtainStyledAttributes.getColor(4, 0));
        String string = obtainStyledAttributes.getString(0);
        String trim = (string == null ? "" : string).trim();
        this.p = trim;
        this.q = h.matcher(trim).find();
        TextView textView2 = this.b;
        String str2 = "Google";
        if (this.p.startsWith(str2)) {
            str = this.p.substring(6).trim();
        } else if (this.p.endsWith(str2)) {
            String str3 = this.p;
            str = str3.substring(0, str3.length() - 6).trim();
        } else {
            str = this.p;
        }
        textView2.setText(str);
        setContentDescription(!this.p.isEmpty() ? this.p : str2);
        requestLayout();
        b(obtainStyledAttributes.getInt(3, 0));
        obtainStyledAttributes.recycle();
    }

    private final boolean a(int i2, boolean z) {
        int i3;
        if (z) {
            aeoh aeoh = this.c;
            i3 = aeoh.c + a(aeoh);
        } else {
            i3 = 0;
        }
        c();
        if (i3 + this.b.getMeasuredWidth() <= i2) {
            return true;
        }
        return false;
    }

    public final void a() {
        int i2;
        int i3 = this.o;
        if (i3 != 0) {
            ImageView imageView = this.a;
            if (i3 == 1) {
                i2 = R.color.google_black;
            } else if (i3 == 2) {
                i2 = R.color.google_white;
            } else if (i3 == 3) {
                i2 = R.color.google_grey700;
            } else {
                StringBuilder sb = new StringBuilder(35);
                sb.append("Unrecognized logoColor: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
            }
            Drawable mutate = ma.f(this.d).mutate();
            ma.a(mutate, kf.b(getContext(), i2));
            imageView.setImageDrawable(mutate);
            return;
        }
        this.a.setImageDrawable(this.d);
    }

    public final void a(int i2) {
        this.b.setTextColor(i2);
    }
}
