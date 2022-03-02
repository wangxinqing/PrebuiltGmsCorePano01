package com.google.android.gms.feedback;

import android.accounts.Account;
import android.app.ApplicationErrorReport;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.webkit.WebView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SuggestionsChimeraActivity extends bjs implements nzu {
    private ErrorReport a;
    private ohd b = null;
    private okc c = null;

    public final void e() {
        a(45, this.a.b, 1);
        setResult(-1);
        finish();
    }

    public final HelpConfig f() {
        return FeedbackChimeraActivity.j;
    }

    public final okc h() {
        if (this.c == null) {
            this.c = new okc(this);
        }
        return this.c;
    }

    public final ofn i() {
        throw null;
    }

    public final oar j() {
        throw null;
    }

    public final Context k() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public final ohd l() {
        if (this.b == null) {
            this.b = new ohd();
        }
        return this.b;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        okc okc = this.c;
        if (okc != null) {
            okc.close();
        }
        super.onDestroy();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        e();
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            e();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, String str, int i2) {
        Account account;
        String str2;
        ApplicationErrorReport applicationErrorReport;
        if (!ofq.b(axhn.a.a().a()) || ((((applicationErrorReport = this.a.a) != null && !TextUtils.isEmpty(applicationErrorReport.packageName)) || !TextUtils.isEmpty(this.a.R)) && !TextUtils.isEmpty(this.a.ag))) {
            if (FeedbackChimeraActivity.j != null) {
                account = FeedbackChimeraActivity.j.d;
            } else {
                account = null;
            }
            ErrorReport errorReport = this.a;
            if (FeedbackChimeraActivity.k != null) {
                str2 = FeedbackChimeraActivity.k.e;
            } else {
                str2 = null;
            }
            myc.a(this, errorReport, i, account, str2, str, i2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        ErrorReport j = FeedbackChimeraActivity.j();
        this.a = j;
        if (j == null || j.E) {
            e();
            return;
        }
        boolean a2 = ofy.a();
        int i3 = R.style.gf_DarkActivityStyle;
        if (a2) {
            ofy.a((Activity) this, this.a, (int) R.style.gf_LightActivityStyle, (int) R.style.gf_DarkActivityStyle, (int) R.style.gf_DayNightActivityStyle);
        } else if (ofy.b()) {
            if (!ofy.a(this.a)) {
                i3 = R.style.gf_LightActivityStyle;
            }
            setTheme(i3);
        } else {
            ThemeSettings themeSettings = this.a.Y;
            if (themeSettings != null) {
                if (themeSettings.a == 0) {
                    i2 = 2132017336;
                } else {
                    i2 = 2132017337;
                }
                setTheme(i2);
            }
        }
        super.onCreate(bundle);
        setContentView((int) R.layout.gf_suggestions_ui);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add((int) R.id.gf_suggestions_parent, (Fragment) l());
        beginTransaction.commit();
        sg aE = aE();
        if (aE != null) {
            if (ofy.b()) {
                aE.c(true);
            } else {
                ThemeSettings themeSettings2 = this.a.Y;
                if (!(themeSettings2 == null || (i = themeSettings2.b) == 0)) {
                    aE.b((Drawable) new ColorDrawable(i));
                }
            }
            String string = getResources().getString(R.string.gf_report_feedback);
            String str = this.a.a.packageName;
            FeedbackChimeraActivity.p();
            FeedbackChimeraActivity.a(aE, string);
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        l().a(true);
        nzv a2 = nzv.a(FeedbackChimeraActivity.k, 44, 0, this.a.b, -1.0f);
        a(44, a2.c, a2.b + 1);
        l().a(a2, false);
        ((WebView) l().getView().findViewById(R.id.gh_answer_content)).setWebViewClient(new mxm(this, this));
    }
}
