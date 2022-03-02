package com.google.android.gms.instantapps.ui;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.ScrollView;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OptInChimeraActivity extends bjs implements qne, qnf, qng {
    public static final qfn a = new qfn("OptInChimeraActivity");
    public qna b;
    public FragmentManager c;
    qex d;
    public qev e;
    long f;
    private View g;
    private View h;
    private ScrollView i;
    private View j;
    private Button k;
    private Button l;
    private int m;

    private final void a(boolean z) {
        acwa e2 = qdy.a(getContainerActivity()).e();
        e2.a((acvs) new qmh(this));
        e2.a((acvv) new qmg(this, z));
    }

    private final Intent q() {
        return (Intent) getIntent().getParcelableExtra("downloadSupervisorRedirectIntent");
    }

    public final void b(int i2, View.OnClickListener onClickListener) {
        this.l.setVisibility(0);
        this.l.setText(i2);
        this.l.setOnClickListener(onClickListener);
    }

    public final void e() {
        a((qnh) new qme());
    }

    public final void f() {
        o();
    }

    public final void h() {
        setResult(1);
        m();
    }

    public final void i() {
        setResult(0);
        m();
    }

    public final void j() {
        setResult(2);
        m();
    }

    public final void k() {
        this.k.setVisibility(8);
        this.l.setVisibility(8);
    }

    public final boolean l() {
        boolean z;
        int paddingBottom = this.j.getPaddingBottom();
        int measuredHeight = this.i.getMeasuredHeight();
        if (this.i.getScrollY() < (this.j.getMeasuredHeight() - measuredHeight) - paddingBottom) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.i.smoothScrollBy(0, measuredHeight);
        }
        return z;
    }

    public final void m() {
        qna qna = this.b;
        if (qna.f < 3) {
            qna.f = 3;
            float translationY = qna.e.getTranslationY();
            float alpha = qna.d.getAlpha();
            View view = qna.e;
            qna.a(ObjectAnimator.ofFloat(view, "translationY", new float[]{translationY, (float) view.getHeight()}), ObjectAnimator.ofFloat(qna.d, "alpha", new float[]{alpha, 0.0f}), new qmy(qna));
        }
    }

    public final void n() {
        a(true);
    }

    public final void o() {
        if (this.m == 1) {
            m();
        } else if (getIntent().getBooleanExtra("downloadSupervisorShowConfirmation", false)) {
            a((qnh) new qmv());
        } else {
            Intent q = q();
            if (q != null) {
                startActivity(q);
            }
            m();
        }
    }

    public final void onBackPressed() {
        this.e.a("OptInActivity.onBackPressed");
        j();
    }

    public final void onCreate(Bundle bundle) {
        setTheme(2132018524);
        super.onCreate(bundle);
        if (bundle == null || !bundle.getBoolean("stateExising", false)) {
            this.m = qfe.a();
            qex qex = new qex(getApplicationContext());
            this.d = qex;
            qex.b("OptInActivity.onCreate").a();
            setContentView((int) R.layout.setup_activity);
            View findViewById = findViewById(R.id.empty_space);
            this.g = findViewById;
            findViewById.setOnClickListener(new qmf(this));
            View findViewById2 = findViewById(R.id.bottom_sheet);
            this.h = findViewById2;
            findViewById2.setClickable(true);
            this.i = (ScrollView) findViewById(R.id.scroll_view);
            this.j = findViewById(R.id.content_wrapper);
            this.k = (Button) findViewById(R.id.confirm_button);
            this.l = (Button) findViewById(R.id.cancel_button);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.opt_in_button_height);
            this.k.setHeight(this.k.getPaddingTop() + this.k.getPaddingBottom() + dimensionPixelSize);
            this.l.setHeight(dimensionPixelSize + this.l.getPaddingTop() + this.l.getPaddingBottom());
            this.b = new qna(this, this.g, this.h);
            if (this.c == null) {
                this.c = getSupportFragmentManager();
            }
            a(false);
            return;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        qev qev = this.e;
        if (qev != null) {
            this.f = qev.a();
            if (isFinishing()) {
                this.e.a("OptInActivity.foregroundTime");
                hph hph = this.d.a;
                if (hph != null) {
                    hph.d();
                }
            }
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        long j2;
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            j2 = bundle.getLong("stateOptInTotalVisibleMillis", 0);
        } else {
            j2 = 0;
        }
        this.f = j2;
        if (j2 != 0) {
            this.e = this.d.a(j2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        qex qex = this.d;
        if (qex != null) {
            this.e = qex.a(this.f);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putLong("stateOptInTotalVisibleMillis", this.f);
        bundle.putBoolean("stateExising", qna.a.contains(Integer.valueOf(this.b.f)));
        super.onSaveInstanceState(bundle);
    }

    public final Intent p() {
        Intent q;
        String dataString;
        if (this.m == 1 || (q = q()) == null || (dataString = q.getDataString()) == null || !URLUtil.isValidUrl(dataString)) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(dataString));
        intent.setFlags(268435456);
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.putExtra("com.google.android.gms.instantapps.DO_NOT_LAUNCH_INSTANT_APP", true);
        return intent;
    }

    public final void b(String str) {
        setResult(-1, new Intent().putExtra("authAccount", str));
        if (qfm.b(this)) {
            e();
        } else {
            o();
        }
    }

    public final void a(int i2) {
        Intent p = p();
        qnd qnd = new qnd();
        Bundle bundle = new Bundle();
        bundle.putInt("failureReason", i2);
        qnd.a.c("Instant Apps setup failure: %d", Integer.valueOf(i2));
        bundle.putParcelable("browserIntent", p);
        qnd.setArguments(bundle);
        a((qnh) qnd);
    }

    public final void a(int i2, View.OnClickListener onClickListener) {
        this.k.setVisibility(0);
        this.k.setText(i2);
        this.k.setOnClickListener(onClickListener);
    }

    public final void a(String str) {
        qev qev = this.e;
        if (qev != null) {
            qev.a(str);
        }
    }

    public final void a(Throwable th) {
        a.a(th);
        a(2);
    }

    public final void a(qnh qnh) {
        this.c.beginTransaction().replace(R.id.content_wrapper, qnh).commit();
        this.c.executePendingTransactions();
        qna qna = this.b;
        if (qna.f == 0) {
            qna.e.getViewTreeObserver().addOnGlobalLayoutListener(new qmx(qna));
        }
    }
}
