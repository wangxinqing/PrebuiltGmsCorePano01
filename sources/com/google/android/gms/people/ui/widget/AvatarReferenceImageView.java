package com.google.android.gms.people.ui.widget;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import com.google.android.gms.people.model.AvatarReference;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AvatarReferenceImageView extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    private static final int[] i = {R.color.material_google_red_500, R.color.material_pink_500, R.color.material_purple_500, R.color.material_deep_purple_500, R.color.material_indigo_500, R.color.material_google_blue_500, R.color.material_light_blue_500, R.color.material_cyan_500, R.color.material_teal_500, R.color.material_google_green_500, R.color.material_light_green_500, R.color.material_lime_500, R.color.material_yellow_500, R.color.material_google_yellow_500, R.color.material_orange_500, R.color.material_deep_orange_500, R.color.material_brown_500, R.color.material_grey_500, R.color.material_blue_grey_500};
    public ImageView a;
    public AvatarReference b;
    public Long c;
    public BitmapDrawable d;
    public ybq e;
    public ybr f;
    public boolean g;
    private TextView j;
    private ImageView k;
    private GradientDrawable l;
    private float m = 0.6666667f;

    public AvatarReferenceImageView(Context context) {
        super(context);
        e();
    }

    private final void e() {
        if (this.j == null) {
            TextView textView = new TextView(getContext());
            this.j = textView;
            textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.j.setGravity(17);
            this.j.setTextColor(-1);
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.l = gradientDrawable;
            this.j.setBackgroundDrawable(gradientDrawable);
            qb.b((View) this.j, 2);
            addView(this.j);
        }
        if (this.k == null) {
            ImageView imageView = new ImageView(getContext());
            this.k = imageView;
            imageView.setImageResource(R.drawable.quantum_ic_person_white_48);
            this.k.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.k.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.k.setVisibility(8);
            this.k.setBackgroundDrawable(this.l);
            addView(this.k);
        }
        if (this.a == null) {
            ImageView imageView2 = new ImageView(getContext());
            this.a = imageView2;
            imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.setVisibility(8);
            addView(this.a);
        }
    }

    public final void a() {
        ybq ybq = this.e;
        if (ybq != null) {
            ybq.a.b();
            ybq.cancel(true);
            this.e = null;
        }
        if (this.f != null) {
            this.f = null;
        }
    }

    public final void b() {
        int i2;
        TextView textView = this.j;
        if (textView != null) {
            int length = textView.getText().length();
            TextView textView2 = this.j;
            int i3 = 0;
            if (length > 0) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            textView2.setVisibility(i2);
            ImageView imageView = this.k;
            if (imageView != null) {
                if (length > 0) {
                    i3 = 4;
                }
                imageView.setVisibility(i3);
            }
        }
        ImageView imageView2 = this.a;
        if (imageView2 != null) {
            imageView2.setVisibility(4);
        }
    }

    public final void c() {
        TextView textView = this.j;
        if (textView != null) {
            textView.setVisibility(4);
        }
        ImageView imageView = this.k;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        ImageView imageView2 = this.a;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
    }

    public final void d() {
        if (!this.g) {
            a();
            this.d = null;
            this.g = true;
            this.l.setShape(1);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        TextView textView = this.j;
        if (textView != null) {
            textView.setTextSize(0, ((float) size) * this.m);
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(size, JGCastService.FLAG_PRIVATE_DISPLAY));
        ImageView imageView = this.k;
        if (imageView != null) {
            int measuredWidth = (int) ((((float) imageView.getMeasuredWidth()) * (1.0f - this.m)) / 2.0f);
            int measuredHeight = (int) ((((float) this.k.getMeasuredHeight()) * (1.0f - this.m)) / 2.0f);
            this.k.setPadding(measuredWidth, measuredHeight, measuredWidth, measuredHeight);
        }
    }

    public AvatarReferenceImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public AvatarReferenceImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        e();
    }

    public final void a(int i2) {
        this.a.setPadding(i2, i2, i2, i2);
    }

    public final void a(icc icc, wli wli, AvatarReference avatarReference) {
        this.c = null;
        if (!ius.a(this.b, avatarReference)) {
            a();
            b();
            this.b = avatarReference;
            this.d = null;
            if (avatarReference != null) {
                ybq ybq = new ybq(this, icc, this.b, wli, this.g);
                this.e = ybq;
                ybq.execute(new Void[0]);
                return;
            }
            this.e = null;
        } else if (avatarReference != null) {
            BitmapDrawable bitmapDrawable = this.d;
            if (bitmapDrawable != null) {
                this.a.setImageDrawable(bitmapDrawable);
                c();
            } else if (this.e == null) {
                b();
                ybq ybq2 = new ybq(this, icc, this.b, wli, this.g);
                this.e = ybq2;
                ybq2.execute(new Void[0]);
            }
        } else {
            b();
        }
    }

    public final void a(String str) {
        String str2;
        String str3 = null;
        if (str != null) {
            str2 = str.trim();
        } else {
            str2 = null;
        }
        int i2 = 0;
        if (!TextUtils.isEmpty(str2) && Character.isLetter(str2.codePointAt(0))) {
            str3 = str2.substring(0, 1).toUpperCase();
        }
        this.j.setText(str3);
        if (str != null) {
            i2 = str.hashCode();
        }
        int[] iArr = i;
        int length = i2 % iArr.length;
        if (length < 0) {
            length += iArr.length;
        }
        this.l.setColor(getResources().getColor(i[length]));
    }
}
