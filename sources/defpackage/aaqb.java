package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.List;

/* renamed from: aaqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaqb extends jmr {
    public static final /* synthetic */ int t = 0;
    private final LinearLayout u;
    private final TextView v;
    private final TextView w;
    private final TextView x;

    public aaqb(View view) {
        super(view);
        this.u = (LinearLayout) view.findViewById(R.id.app_icons);
        this.v = (TextView) view.findViewById(16908310);
        this.w = (TextView) view.findViewById(16908304);
        this.x = (TextView) view.findViewById(R.id.app_count);
        view.setFocusable(true);
    }

    private static void a(View view, int i) {
        view.animate().alpha(1.0f).setDuration(300).setStartDelay((long) (i * 149));
    }

    private static void a(TextView textView, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    public final void a(jmt jmt) {
        int i;
        int i2;
        Context context;
        jmt jmt2 = jmt;
        if (jmt2 instanceof aaqc) {
            aaqc aaqc = (aaqc) jmt2;
            a(this.v, aaqc.c);
            a(this.w, aaqc.k);
            Context context2 = aaqc.i;
            List list = aaqc.l;
            boolean z = aaqc.m;
            int childCount = this.u.getChildCount();
            int i3 = 0;
            if (childCount > 1) {
                this.u.removeViews(0, childCount - 1);
            }
            this.x.setVisibility(8);
            if (list != null && !list.isEmpty()) {
                Resources resources = context2.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.verify_apps_icon_size);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.scanned_apps_icon_spacing);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.scanned_apps_fallback_padding);
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                int i4 = displayMetrics.widthPixels;
                int i5 = Build.VERSION.SDK_INT;
                try {
                    TypedValue typedValue = new TypedValue();
                    context2.getTheme().resolveAttribute(16843709, typedValue, true);
                    i = (int) typedValue.getDimension(displayMetrics);
                } catch (Exception e) {
                    i = dimensionPixelSize3;
                }
                int i6 = Build.VERSION.SDK_INT;
                try {
                    TypedValue typedValue2 = new TypedValue();
                    context2.getTheme().resolveAttribute(16843710, typedValue2, true);
                    dimensionPixelSize3 = (int) typedValue2.getDimension(displayMetrics);
                } catch (Exception e2) {
                }
                int i7 = i4 - (i + dimensionPixelSize3);
                int i8 = dimensionPixelSize + dimensionPixelSize2;
                int i9 = (i7 + dimensionPixelSize2) / i8;
                if (i9 <= 0) {
                    i9 = 1;
                }
                int size = list.size();
                if (size > i9) {
                    this.x.setText(context2.getString(R.string.verify_apps_more_scanned_apps, new Object[]{Integer.valueOf(size - (i9 - 2))}));
                    this.x.setVisibility(0);
                    this.x.setAlpha(!z ? 1.0f : 0.0f);
                    this.x.measure(0, 0);
                    i2 = (i7 - this.x.getMeasuredWidth()) / i8;
                    if (i2 <= 0) {
                        i2 = 1;
                    }
                    this.x.setText(context2.getString(R.string.verify_apps_more_scanned_apps, new Object[]{Integer.valueOf(size - i2)}));
                } else {
                    i2 = size;
                }
                PackageManager packageManager = context2.getPackageManager();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
                layoutParams.setMargins(0, 0, dimensionPixelSize2, 0);
                int i10 = Build.VERSION.SDK_INT;
                layoutParams.setMarginStart(0);
                layoutParams.setMarginEnd(dimensionPixelSize2);
                int size2 = list.size();
                int i11 = 0;
                while (i11 < size2) {
                    String str = (String) list.get(i11);
                    if (i3 >= i2) {
                        break;
                    }
                    try {
                        Drawable applicationIcon = packageManager.getApplicationIcon(str);
                        if (applicationIcon == null) {
                            context = context2;
                        } else {
                            ImageView imageView = new ImageView(context2);
                            context = context2;
                            try {
                                imageView.setContentDescription(packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)));
                            } catch (Exception e3) {
                            }
                            imageView.setImageDrawable(applicationIcon);
                            int i12 = i3 + 1;
                            if (i12 == i2 && i2 == size) {
                                imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                            } else {
                                imageView.setLayoutParams(layoutParams);
                            }
                            if (z) {
                                imageView.setAlpha(0.0f);
                            }
                            this.u.addView(imageView, i3);
                            if (z) {
                                a((View) imageView, i12);
                            }
                            i3 = i12;
                        }
                    } catch (PackageManager.NameNotFoundException e4) {
                        context = context2;
                    }
                    i11++;
                    context2 = context;
                }
                if (z) {
                    a((View) this.x, i2 + 1);
                }
            }
            aaqc.m = false;
            this.u.setOnTouchListener(new aapz(aaqc));
            this.x.setOnTouchListener(new aaqa(aaqc));
            return;
        }
        throw new IllegalArgumentException("settingItem must be ScannedAppsSettingItem");
    }
}
