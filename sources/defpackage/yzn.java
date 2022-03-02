package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.plus.data.internal.PlusImageView;

/* renamed from: yzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class yzn extends LinearLayout implements View.OnClickListener {
    private static final int i = Color.parseColor("#666666");
    public boolean a;
    protected final FrameLayout b;
    final CompoundButton c;
    public final ProgressBar d;
    final ywj e;
    int f = 1;
    protected String g;
    protected View.OnClickListener h;
    private final Resources j;
    private final LayoutInflater k;
    private final LinearLayout l;
    private final PlusImageView[] m = new PlusImageView[4];
    private int n = 2;
    private int o = 3;
    private Uri[] p;
    private String[] q;
    private String[] r;

    public yzn(Context context, int i2, int i3, String str) {
        super(context, (AttributeSet) null);
        Context context2;
        iva.a((Object) context, (Object) "Context must not be null.");
        iva.a((Object) str, (Object) "URL must not be null.");
        this.o = i2;
        this.n = i3;
        this.g = str;
        int i4 = hxy.a;
        try {
            context2 = getContext().createPackageContext("com.google.android.gms", 4);
        } catch (PackageManager.NameNotFoundException e2) {
            if (Log.isLoggable("PlusOneButtonView", 5)) {
                Log.w("PlusOneButtonView", "Google Play services is not installed");
            }
            context2 = null;
        }
        this.j = context2.getResources();
        this.k = (LayoutInflater) context2.getSystemService("layout_inflater");
        Point h2 = h();
        if (isInEditMode()) {
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText("[ +1 ]");
            addView(textView, new LinearLayout.LayoutParams(h2.x, h2.y));
            this.e = null;
            this.d = null;
            this.c = null;
            this.b = null;
            this.l = null;
            return;
        }
        setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(context);
        this.l = linearLayout;
        linearLayout.setGravity(17);
        this.l.setOrientation(0);
        addView(this.l);
        yzm yzm = new yzm(this, context);
        this.c = yzm;
        yzm.setBackgroundDrawable((Drawable) null);
        ywj ywj = new ywj(context);
        ywj.setFocusable(false);
        ywj.b.setGravity(17);
        ywj.b.setSingleLine();
        ywj.a(TypedValue.applyDimension(2, (float) a(this.o, this.n), context.getResources().getDisplayMetrics()));
        ywj.b.setTextColor(i);
        ywj.setVisibility(0);
        this.e = ywj;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setFocusable(false);
        this.b = frameLayout;
        frameLayout.addView(this.c, new FrameLayout.LayoutParams(h2.x, h2.y, 17));
        a(h2);
        ProgressBar progressBar = new ProgressBar(context, (AttributeSet) null, 16843400);
        progressBar.setFocusable(false);
        progressBar.setIndeterminate(true);
        this.d = progressBar;
        progressBar.setVisibility(4);
        this.b.addView(this.d, new FrameLayout.LayoutParams(h2.x, h2.y, 17));
        int length = this.m.length;
        for (int i5 = 0; i5 < 4; i5++) {
            PlusImageView[] plusImageViewArr = this.m;
            PlusImageView plusImageView = new PlusImageView(getContext());
            plusImageView.setVisibility(8);
            plusImageViewArr[i5] = plusImageView;
        }
        c();
    }

    private static int a(int i2, int i3) {
        if (i2 != 0) {
            return (i2 == 2 && i3 != 2) ? 15 : 13;
        }
        return 11;
    }

    private final String b(String str) {
        Resources resources = this.j;
        if (resources == null) {
            return null;
        }
        return resources.getString(resources.getIdentifier(str, "string", "com.google.android.gms"), new Object[]{""});
    }

    private final void f() {
        int i2 = this.n;
        if (i2 == 1) {
            ywj ywj = this.e;
            ywj.a = this.r;
            ywj.setVisibility(0);
        } else if (i2 != 2) {
            ywj ywj2 = this.e;
            ywj2.a = null;
            ywj2.setVisibility(8);
        } else {
            ywj ywj3 = this.e;
            ywj3.a = this.q;
            ywj3.setVisibility(0);
        }
    }

    private final void g() {
        Uri uri;
        if (this.p != null && this.n == 2) {
            Point h2 = h();
            h2.x = h2.y;
            int length = this.m.length;
            int length2 = this.p.length;
            for (int i2 = 0; i2 < 4; i2++) {
                if (i2 < length2) {
                    uri = this.p[i2];
                } else {
                    uri = null;
                }
                if (uri != null) {
                    this.m[i2].setLayoutParams(new LinearLayout.LayoutParams(h2.x, h2.y));
                    this.m[i2].a(uri, h2.y);
                    this.m[i2].setVisibility(0);
                } else {
                    this.m[i2].setVisibility(8);
                }
            }
        } else {
            int length3 = this.m.length;
            for (int i3 = 0; i3 < 4; i3++) {
                this.m[i3].setVisibility(8);
            }
        }
        boolean z = true;
        int applyDimension = (int) TypedValue.applyDimension(1, 5.0f, getContext().getResources().getDisplayMetrics());
        int applyDimension2 = (int) TypedValue.applyDimension(1, 1.0f, getContext().getResources().getDisplayMetrics());
        int length4 = this.m.length;
        for (int i4 = 0; i4 < 4; i4++) {
            if (this.m[i4].getVisibility() == 0) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.m[i4].getLayoutParams());
                if (z) {
                    layoutParams.setMargins(applyDimension, 0, applyDimension2, 0);
                } else {
                    layoutParams.setMargins(applyDimension2, 0, applyDimension2, 0);
                }
                this.m[i4].setLayoutParams(layoutParams);
                z = false;
            }
        }
    }

    private final Point h() {
        int i2 = this.o;
        int i3 = 20;
        int i4 = 24;
        if (i2 == 0) {
            i3 = 14;
        } else if (i2 == 1) {
            i4 = 32;
        } else if (i2 != 2) {
            i3 = 24;
            i4 = 38;
        } else {
            i4 = 50;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float applyDimension = TypedValue.applyDimension(1, (float) i4, displayMetrics);
        float applyDimension2 = TypedValue.applyDimension(1, (float) i3, displayMetrics);
        double d2 = (double) applyDimension;
        Double.isNaN(d2);
        double d3 = (double) applyDimension2;
        Double.isNaN(d3);
        return new Point((int) (d2 + 0.5d), (int) (d3 + 0.5d));
    }

    /* access modifiers changed from: protected */
    public void c() {
        b(1);
        this.d.setVisibility(4);
        e();
    }

    /* access modifiers changed from: protected */
    public void d() {
        b(0);
        this.d.setVisibility(4);
        e();
    }

    public final void e() {
        Drawable drawable;
        String str;
        CompoundButton compoundButton = this.c;
        Resources resources = this.j;
        if (resources != null) {
            int i2 = this.o;
            if (i2 != 0) {
                str = i2 != 1 ? i2 != 2 ? "ic_plusone_standard" : "ic_plusone_tall" : "ic_plusone_medium";
            } else {
                str = "ic_plusone_small";
            }
            drawable = resources.getDrawable(resources.getIdentifier(str, "drawable", "com.google.android.gms"));
        } else {
            drawable = null;
        }
        compoundButton.setButtonDrawable(drawable);
        int i3 = this.f;
        if (i3 == 0) {
            this.c.setEnabled(true);
            this.c.setChecked(true);
            this.c.setContentDescription(b("plus_one_description_remove"));
        } else if (i3 == 1) {
            this.c.setEnabled(true);
            this.c.setChecked(false);
            this.c.setContentDescription(b("plus_one_description"));
        } else if (i3 != 2) {
            this.c.setEnabled(false);
            this.c.setChecked(false);
            this.c.setContentDescription(b("plus_one_description_standard"));
        } else {
            this.c.setEnabled(false);
            this.c.setChecked(true);
            this.c.setContentDescription(b("plus_one_description_standard"));
        }
    }

    public void onClick(View view) {
        if (this.h != null) {
            this.c.performClick();
            this.e.performClick();
            this.h.onClick(view);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
        super.setOnClickListener(this);
    }

    private final void a(Point point) {
        point.y = (int) (((float) point.y) - TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics()));
        point.x = point.y;
    }

    public void b() {
        b(3);
        this.d.setVisibility(4);
        e();
    }

    public final void b(int i2) {
        this.f = i2;
        a();
    }

    /* access modifiers changed from: protected */
    public final View a(String str) {
        return this.k.inflate(this.j.getLayout(this.j.getIdentifier(str, "layout", "com.google.android.gms")), (ViewGroup) null);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        String str;
        if (!isInEditMode()) {
            this.l.removeAllViews();
            Point h2 = h();
            this.c.setLayoutParams(new FrameLayout.LayoutParams(h2.x, h2.y, 17));
            a(h2);
            this.d.setLayoutParams(new FrameLayout.LayoutParams(h2.x, h2.y, 17));
            if (this.n == 1) {
                ywj ywj = this.e;
                int i2 = this.o;
                if (i2 != 0) {
                    str = i2 != 1 ? i2 != 2 ? "global_count_bubble_standard" : "global_count_bubble_tall" : "global_count_bubble_medium";
                } else {
                    str = "global_count_bubble_small";
                }
                ywj.a(ive.a(str));
            } else {
                this.e.a((Uri) null);
            }
            g();
            ywj ywj2 = this.e;
            int i3 = this.n;
            if (i3 == 1) {
                layoutParams = new LinearLayout.LayoutParams(-2, -2);
            } else if (i3 != 2) {
                layoutParams = new LinearLayout.LayoutParams(-2, -2);
            } else {
                layoutParams = new LinearLayout.LayoutParams(-2, -1);
            }
            layoutParams.bottomMargin = this.o == 2 ? 1 : 0;
            layoutParams.leftMargin = this.o == 2 ? 0 : 1;
            ywj2.setLayoutParams(layoutParams);
            this.e.a(TypedValue.applyDimension(2, (float) a(this.o, this.n), getContext().getResources().getDisplayMetrics()));
            ywj ywj3 = this.e;
            int applyDimension = (int) TypedValue.applyDimension(1, 3.0f, getContext().getResources().getDisplayMetrics());
            int applyDimension2 = (int) TypedValue.applyDimension(1, 5.0f, getContext().getResources().getDisplayMetrics());
            int i4 = this.n;
            if (i4 != 2) {
                applyDimension2 = 0;
            }
            if (this.o != 2) {
                applyDimension = 0;
            } else if (i4 != 1) {
                applyDimension = 0;
            }
            ywj3.setPadding(applyDimension2, 0, 0, applyDimension);
            if (this.o == 2 && this.n == 1) {
                this.l.setOrientation(1);
                this.l.addView(this.e);
                this.l.addView(this.b);
            } else {
                this.l.setOrientation(0);
                this.l.addView(this.b);
                int length = this.m.length;
                for (int i5 = 0; i5 < 4; i5++) {
                    this.l.addView(this.m[i5]);
                }
                this.l.addView(this.e);
            }
            requestLayout();
        }
    }

    public final void a(ysx ysx) {
        Uri[] uriArr;
        if (ysx != null) {
            this.q = ysx.a.getStringArray("inline_annotations");
            f();
            this.r = new String[]{ysx.a.getString("bubble_text")};
            f();
            Parcelable[] parcelableArray = ysx.a.getParcelableArray("profile_photo_uris");
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                uriArr = new Uri[length];
                System.arraycopy(parcelableArray, 0, uriArr, 0, length);
            } else {
                uriArr = null;
            }
            this.p = uriArr;
            g();
            if (ysx.a()) {
                d();
            } else {
                c();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(yuv yuv) {
        int length = this.m.length;
        for (int i2 = 0; i2 < 4; i2++) {
            this.m[i2].a(yuv);
        }
    }
}
