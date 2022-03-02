package defpackage;

import android.accounts.Account;
import android.app.ApplicationErrorReport;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.CheckBox;
import com.google.android.gms.R;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackChimeraActivity;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: mwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mwg {
    public String[] a;
    public Screenshot b;
    public final FeedbackChimeraActivity c;
    boolean d;
    boolean e;
    public boolean f;
    public muv g;
    private Handler h;
    private final Long i;

    public mwg(FeedbackChimeraActivity feedbackChimeraActivity, Bundle bundle) {
        this(feedbackChimeraActivity, new ErrorReport(), (Screenshot) null, (Long) null);
        a(bundle);
    }

    public final void a() {
        boolean z;
        boolean z2;
        if (FeedbackChimeraActivity.a(this)) {
            muv muv = this.g;
            String n = this.c.n();
            mwb mwb = this.c.b;
            boolean z3 = false;
            if (!ofq.b(axhk.b())) {
                z = ((CheckBox) ((mxc) mwb).a((int) R.id.gf_include_screenshot)).isChecked();
            } else {
                CheckBox checkBox = (CheckBox) ((mxc) mwb).a((int) R.id.gf_include_screenshot);
                z = (checkBox == null || checkBox.getVisibility() != 0) ? false : checkBox.isChecked();
            }
            boolean z4 = !z;
            mwb mwb2 = this.c.b;
            if (!ofq.b(axhk.b())) {
                z2 = ((CheckBox) ((mxc) mwb2).a((int) R.id.gf_include_logs)).isChecked();
            } else {
                CheckBox checkBox2 = (CheckBox) ((mxc) mwb2).a((int) R.id.gf_include_logs);
                z2 = (checkBox2 == null || checkBox2.getVisibility() != 0) ? false : checkBox2.isChecked();
            }
            boolean z5 = !z2;
            muv.d = z4;
            muv.c = z5;
            ErrorReport errorReport = muv.a;
            if (z4) {
                z3 = true;
            } else if (z5) {
                z3 = true;
            }
            errorReport.W = z3;
            errorReport.b = n;
            muv.a();
        }
    }

    public final void b() {
        String string = this.c.getString(R.string.gf_unspecified_email_account);
        ArrayList arrayList = new ArrayList();
        if (!jgu.e(this.c) || axgy.a.a().h()) {
            try {
                FeedbackChimeraActivity feedbackChimeraActivity = this.c;
                for (Account account : jgu.c(feedbackChimeraActivity, feedbackChimeraActivity.getPackageName(), "com.google")) {
                    arrayList.add(account.name);
                }
            } catch (Exception e2) {
            }
        }
        String[] strArr = new String[(arrayList.size() + 1)];
        strArr[0] = string;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2++;
            strArr[i2] = (String) arrayList.get(i3);
        }
        this.a = strArr;
        if (!this.f) {
            mxu.a();
            this.h.postDelayed(new mwf(this), 4000);
        }
    }

    public final void c() {
        a();
        mxu.f = null;
    }

    public final boolean d() {
        Pair pair;
        Bundle bundle;
        if (!this.d) {
            Long l = this.i;
            if (l != null) {
                String a2 = ofx.a(l.longValue());
                bundle = ofx.a((Context) this.c, a2, e());
                if (bundle != null) {
                    this.d = true;
                    a(a2);
                }
            } else {
                bundle = null;
            }
            this.g.a(bundle);
        } else if (this.e) {
            return true;
        }
        if (!this.e) {
            if (this.i != null) {
                GoogleHelp e2 = e();
                String c2 = ofx.c(this.i.longValue());
                String[] b2 = ofx.b((Context) this.c, c2, e2);
                if (b2 != null) {
                    this.e = true;
                    a(c2);
                    String d2 = ofx.d(this.i.longValue());
                    Bundle a3 = ofx.a((Context) this.c, d2, e2);
                    if (a3 != null) {
                        a(d2);
                    }
                    pair = Pair.create(b2, a3);
                } else {
                    pair = Pair.create((Object) null, (Object) null);
                }
            } else {
                pair = Pair.create((Object) null, (Object) null);
            }
            muv muv = this.g;
            String[] strArr = (String[]) pair.first;
            if (!(strArr == null || strArr.length == 0)) {
                muu muu = muv.b;
                String[] strArr2 = muu.e;
                if (strArr2 == null || strArr2.length == 0) {
                    muu.e = strArr;
                } else {
                    muu.e = (String[]) jhx.a((Object[][]) new String[][]{strArr2, strArr});
                }
                ErrorReport errorReport = muv.a;
                errorReport.V = muv.b.b(!errorReport.W);
            }
            this.g.a((Bundle) pair.second);
        }
        if (this.i != null && System.nanoTime() - this.i.longValue() <= axgy.a.a().l() * 1000000) {
            return false;
        }
        Bundle bundle2 = new Bundle();
        if (!this.d) {
            bundle2.putString("gms:feedback:async_feedback_psd_failure", "timeout");
            this.d = true;
        }
        if (!this.e) {
            bundle2.putString("gms:feedback:async_feedback_psbd_failure", "timeout");
            this.e = true;
        }
        this.g.a(bundle2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final GoogleHelp e() {
        String str;
        ApplicationErrorReport applicationErrorReport;
        GoogleHelp googleHelp = new GoogleHelp("feedbackSession");
        ErrorReport g2 = g();
        if (g2 != null) {
            str = g2.B;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            googleHelp.c = new Account(str, "com.google");
        }
        if (g2 == null || (applicationErrorReport = g2.a) == null) {
            HelpConfig helpConfig = FeedbackChimeraActivity.j;
            if (helpConfig != null) {
                googleHelp.e = helpConfig.b;
            }
        } else {
            googleHelp.e = applicationErrorReport.packageName;
        }
        if (g2 != null) {
            new nyt(googleHelp).a(g2.ag);
        }
        return googleHelp;
    }

    public final boolean f() {
        return this.i != null;
    }

    public final ErrorReport g() {
        return this.g.b();
    }

    public mwg(FeedbackChimeraActivity feedbackChimeraActivity, ErrorReport errorReport, Screenshot screenshot, Long l) {
        FeedbackChimeraActivity feedbackChimeraActivity2 = feedbackChimeraActivity;
        ErrorReport errorReport2 = errorReport;
        Screenshot screenshot2 = screenshot;
        this.d = false;
        this.e = false;
        this.c = feedbackChimeraActivity2;
        ErrorReport errorReport3 = r5;
        ErrorReport errorReport4 = new ErrorReport(errorReport2.a, errorReport2.b, errorReport2.c, errorReport2.d, errorReport2.e, errorReport2.f, errorReport2.g, errorReport2.h, errorReport2.i, errorReport2.j, errorReport2.k, errorReport2.l, errorReport2.m, errorReport2.n, errorReport2.o, errorReport2.p, errorReport2.q, errorReport2.r, errorReport2.s, errorReport2.t, errorReport2.u, errorReport2.v, errorReport2.w, errorReport2.x, errorReport2.y, errorReport2.z, errorReport2.A, errorReport2.B, errorReport2.C, errorReport2.D, errorReport2.E, errorReport2.F, errorReport2.G, errorReport2.H, errorReport2.I, errorReport2.J, errorReport2.K, errorReport2.L, errorReport2.M, errorReport2.N, errorReport2.O, errorReport2.P, errorReport2.Q, errorReport2.R, errorReport2.S, errorReport2.T, errorReport2.U, errorReport2.V, errorReport2.W, errorReport2.X, errorReport2.Y, errorReport2.Z, errorReport2.aa, errorReport2.ab, errorReport2.ac, errorReport2.ad, errorReport2.ae, errorReport2.af, errorReport2.ag, errorReport2.ah, errorReport2.ai);
        this.g = new muv(feedbackChimeraActivity2, errorReport3, screenshot2);
        this.b = screenshot2;
        this.i = l;
        this.h = new qvr();
    }

    public final void a(Bundle bundle) {
        muv muv = this.g;
        muv.a = (ErrorReport) bundle.getParcelable("feedback.REPORT");
        if (muv.a == null) {
            muv.a = new ErrorReport();
        }
        muv.b = new muu();
        muv.b.a = bundle.getStringArray("feedback.RUNNING_APPS");
        muv.b.c = (Screenshot) bundle.getParcelable("feedback.SCREENSHOT_KEY");
        muv.b.d = bundle.getBundle("feedback.PSD_BUNDLE_KEY");
        muv.b.e = bundle.getStringArray("feedback.PSBD_FILE_PATH_KEY");
        this.a = bundle.getStringArray("feedback.FOUND_ACCOUNTS");
    }

    public final void a(Screenshot screenshot) {
        this.b = screenshot;
        muv muv = this.g;
        muv.b.c = screenshot;
        muv.a();
        this.c.a(this.b, g());
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        ofx.a(this.c.getFilesDir(), str);
    }

    public final void a(Map map) {
        this.g.a(map);
        this.f = true;
        a();
        if (FeedbackChimeraActivity.a(this)) {
            this.c.a(false);
        }
    }
}
