package com.google.android.gms.smartdevice.setup.ui.views;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLayout;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountChallengeWebView extends LinearLayout {
    public static final iwd a = acqa.a("Setup", "UI", "View", "AccountChallengeWebView");
    public static final String b = azlf.a.a().H();
    public static final String c = azlf.a.a().I();
    private static final int o = R.id.glif_notice;
    private static final String p = azlf.a.a().N();
    public ArrayList d;
    public boolean e;
    public ArrayList f = new ArrayList();
    public int g;
    public Semaphore h;
    public int i;
    public String j;
    public Bundle k;
    public WebView l;
    public boolean m;
    public ackd n;
    private GlifLayout q;
    private CookieManager r;
    private View s;
    private final Runnable t = new acot(this);

    public AccountChallengeWebView(Context context) {
        super(context);
        h();
    }

    public static void a(ivb ivb) {
        boolean z = true;
        int i2 = 0;
        while (i2 <= 2 && z) {
            boolean a2 = ivb.a(Integer.valueOf(i2));
            i2++;
            z = a2;
        }
    }

    private final void h() {
        int i2;
        this.s = inflate(getContext(), R.layout.smartdevice_account_challenge_webview, this);
        this.r = CookieManager.getInstance();
        WebView webView = (WebView) this.s.findViewById(R.id.webview);
        this.l = webView;
        webView.setWebViewClient(new acon(this));
        this.q = (GlifLayout) this.s.findViewById(o);
        if (azmd.c()) {
            GlifLayout glifLayout = this.q;
            Resources resources = getResources();
            ArrayList arrayList = this.d;
            if (arrayList != null) {
                i2 = arrayList.size();
            } else {
                i2 = 0;
            }
            glifLayout.a((CharSequence) resources.getQuantityString(R.plurals.smartdevice_d2d_copying_accounts, i2));
        } else {
            this.q.c(R.string.smartdevice_d2d_target_copying_accounts);
        }
        this.q.a(getContext().getResources().getDrawable(R.drawable.quantum_gm_ic_compare_arrows_gm_blue_36));
        b();
    }

    private final void i() {
        this.i++;
        f();
    }

    public final void b() {
        String str;
        int i2;
        ackd ackd = this.n;
        if (ackd != null && ackd.a.isAdded()) {
            ackh ackh = ackd.a;
            if (azmd.c()) {
                Resources resources = ackd.a.getResources();
                ArrayList arrayList = ackd.a.a;
                if (arrayList != null) {
                    i2 = arrayList.size();
                } else {
                    i2 = 0;
                }
                str = resources.getQuantityString(R.plurals.smartdevice_d2d_copying_accounts, i2);
            } else {
                str = ackd.a.getString(R.string.smartdevice_d2d_target_copying_accounts);
            }
            ackh.a(str);
        }
        this.l.setVisibility(8);
    }

    public final void c() {
        this.h.release();
        i();
    }

    public final void d() {
        if (e()) {
            i();
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final boolean e() {
        return this.i < this.d.size();
    }

    public final void f() {
        b();
        if (e()) {
            Bundle bundle = (Bundle) this.d.get(this.i);
            this.k = bundle;
            String string = bundle.getString("name");
            String string2 = this.k.getString("credential");
            String string3 = this.k.getString("url");
            this.j = string;
            if (!TextUtils.isEmpty(string3)) {
                Uri.Builder buildUpon = Uri.parse(string3).buildUpon();
                if (this.e) {
                    buildUpon.appendQueryParameter(c, "1");
                }
                if (this.m) {
                    buildUpon.appendQueryParameter(p, "1");
                }
                String builder = buildUpon.toString();
                int i2 = Build.VERSION.SDK_INT;
                this.r.removeAllCookies(new acop(this, builder));
                return;
            }
            this.f.add(this.k);
            new acou(this, string, string2, this.k.getString("firstName"), this.k.getString("lastName")).execute(new Void[0]);
            return;
        }
        new acoq(this).execute(new Void[0]);
    }

    public final void g() {
        a.a("Acquiring semaphore.", new Object[0]);
        if (!this.h.tryAcquire()) {
            a.f("This should not happen.", new Object[0]);
            return;
        }
        a.a("Semaphore acquired successfully.", new Object[0]);
        post(this.t);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (azlo.b() && a()) {
            int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.l.getLayoutParams());
            layoutParams.topMargin = systemWindowInsetTop;
            this.l.setLayoutParams(layoutParams);
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("internalState"));
            this.i = bundle.getInt("index");
            this.f = bundle.getParcelableArrayList("processedAccounts");
            if (this.d == null) {
                throw new IllegalStateException("Accounts cannot be null.");
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        a.a("onSaveInstanceState()", new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putInt("index", this.i);
        bundle.putParcelableArrayList("processedAccounts", this.f);
        bundle.putParcelable("internalState", super.onSaveInstanceState());
        return bundle;
    }

    public final boolean a() {
        return this.q.c();
    }

    public AccountChallengeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h();
    }

    public AccountChallengeWebView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        h();
    }

    public AccountChallengeWebView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        h();
    }
}
