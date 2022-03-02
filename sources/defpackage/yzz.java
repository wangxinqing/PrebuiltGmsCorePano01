package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.data.internal.PlusImageView;

/* renamed from: yzz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yzz extends yzn implements View.OnClickListener {
    public static final Uri i = ive.a("plus_one_button_popup_beak_up");
    public static final Uri j = ive.a("plus_one_button_popup_beak_down");
    public static final Uri k = ive.a("plus_one_button_popup_bg");
    public final yut A = new yzt(this);
    private final Context B;
    private final ImageView C;
    private View.OnClickListener D;
    private final yui E;
    private final Runnable F = new yzq(this);
    private final ica G = new yzu(this);
    private final ica H = new yzv(this);
    private final icb I = new yzw(this);
    private final icb J = new yzx(this);
    private final String K;
    public final Display l;
    public PopupWindow m;
    public boolean n;
    public final ImageView o;
    public final yuv p;
    public final yuv q;
    public ysy r;
    public ysx s;
    public ConnectionResult t;
    protected boolean u;
    protected boolean v;
    protected boolean w;
    public boolean x;
    public final yup y = new yzr(this);
    public final yup z = new yzs();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yzz(Context context, int i2, int i3, String str, String str2) {
        super(context, i2, i3, str);
        yui yui = yuv.a;
        this.E = yui;
        this.B = context;
        this.l = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        ImageView imageView = new ImageView(this.B);
        this.o = imageView;
        imageView.setImageURI(i);
        ImageView imageView2 = new ImageView(this.B);
        this.C = imageView2;
        imageView2.setImageURI(k);
        setOnClickListener(this);
        this.K = str2;
        ywh ywh = new ywh(this.B);
        ywh.a("https://www.googleapis.com/auth/pos");
        String str3 = this.K;
        if (str3 != null) {
            ywh.a = str3;
        }
        yuv a = this.E.a(this.B, ywh.a(), this.G, this.I);
        a(this.p);
        this.p = a;
        ywh ywh2 = new ywh(this.B);
        ywh2.b();
        this.q = this.E.a(this.B, ywh2.a(), this.H, this.J);
        a(this.p);
        setTag(new ytr(this));
    }

    private final void a(FrameLayout frameLayout) {
        Uri uri;
        yzy yzy = new yzy(this, frameLayout);
        ImageView imageView = new ImageView(this.B);
        if (!yzy.a) {
            uri = i;
        } else {
            uri = j;
        }
        imageView.setImageURI(uri);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, yzy.d);
        int i2 = yzy.b;
        yzy.getClass();
        int i3 = yzy.c;
        yzy.getClass();
        layoutParams.setMargins(i2, 0, i3, 0);
        frameLayout.addView(imageView, layoutParams);
        PopupWindow popupWindow = new PopupWindow(frameLayout, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight());
        this.m = popupWindow;
        popupWindow.setOutsideTouchable(true);
        if (this.n) {
            this.m.showAtLocation(this, 51, yzy.e, yzy.f);
            removeCallbacks(this.F);
            postDelayed(this.F, 3000);
        }
    }

    private final FrameLayout b(View view) {
        FrameLayout frameLayout = new FrameLayout(this.B);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view, new FrameLayout.LayoutParams(-2, -2));
        return frameLayout;
    }

    private final boolean g() {
        return this.s != null;
    }

    private final void h() {
        PopupWindow popupWindow;
        if (this.n && (popupWindow = this.m) != null) {
            popupWindow.dismiss();
            this.m = null;
        }
    }

    private final void i() {
        String c;
        if (this.n && this.u) {
            this.u = false;
            ysx ysx = this.s;
            if (ysx == null || (c = ysx.c()) == null) {
                b(3);
                return;
            }
            View a = a("plus_popup_text");
            ((TextView) a.findViewWithTag("text")).setText(c);
            a(b(a));
        }
    }

    public final void c() {
        super.c();
        h();
        i();
    }

    public final void d() {
        ysy ysy;
        super.d();
        h();
        if (this.n && this.u) {
            this.u = false;
            if (!(this.s == null || (ysy = this.r) == null)) {
                String b = ysy.b();
                String c = this.s.c();
                String a = this.r.a();
                if (!(c == null || a == null)) {
                    c = String.format(c, new Object[]{a});
                }
                String string = this.s.a.getString("visibility");
                if (!(b == null || c == null || string == null)) {
                    View a2 = a("plus_popup_confirmation");
                    PlusImageView plusImageView = new PlusImageView(this.B);
                    plusImageView.a(this.p);
                    float applyDimension = TypedValue.applyDimension(1, 32.0f, getResources().getDisplayMetrics());
                    iqu iqu = new iqu(b);
                    iqu.a((int) applyDimension);
                    plusImageView.a(ytz.a(iqu.a()));
                    ((FrameLayout) a2.findViewWithTag("profile_image")).addView(plusImageView, 0);
                    ((TextView) a2.findViewWithTag("text")).setText(c);
                    a(b(a2));
                    return;
                }
            }
            b(3);
        }
    }

    public final boolean f() {
        return this.p.l();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!f() && !this.p.m()) {
            this.p.t();
        }
        this.n = true;
    }

    public void onClick(View view) {
        this.c.toggle();
        if (this.v) {
            return;
        }
        if (!this.x) {
            this.u = true;
            if (!g()) {
                this.u = false;
                if (this.g != null && f()) {
                    this.p.a(this.y, this.g);
                    this.v = true;
                }
            } else if (!g() || !this.s.a()) {
                if (this.g != null && f()) {
                    this.p.a(this.y, this.g, this.s.b());
                    this.v = true;
                }
            } else if (f()) {
                this.p.b(this.y, this.g);
                this.v = true;
            }
            a(view);
            return;
        }
        a(view);
        this.w = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (f() || this.p.m()) {
            this.p.j();
        }
        this.n = false;
        PopupWindow popupWindow = this.m;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.m = null;
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        if (onClickListener != this) {
            this.D = onClickListener;
        } else {
            super.setOnClickListener(this);
        }
    }

    public final void b() {
        super.b();
        h();
        i();
    }

    /* access modifiers changed from: protected */
    public final void a(View view) {
        View.OnClickListener onClickListener = this.D;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
