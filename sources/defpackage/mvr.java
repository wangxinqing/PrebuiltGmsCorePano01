package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackBoundService;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: mvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mvr extends myl implements niz {
    public final FeedbackBoundService a;
    public final String b;
    String c;
    private final nix d;

    public mvr(FeedbackBoundService feedbackBoundService, nix nix, String str) {
        this.a = feedbackBoundService;
        this.b = str;
        this.d = nix;
    }

    static final Intent a(Context context, ErrorReport errorReport, Long l) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.feedback.FeedbackActivity");
        className.putExtra("com.android.feedback.SAFEPARCELABLE_REPORT", errorReport);
        if (l != null) {
            className.putExtra("ASYNC_PSD_START_TICK_NANOS", l);
        }
        className.addFlags(268435456);
        return className;
    }

    private final boolean c(ErrorReport errorReport) {
        if (TextUtils.isEmpty(this.b)) {
            Log.e("gf_FeedbackService", "Can't run feedback, no calling package set");
            return false;
        }
        PackageManager packageManager = this.a.getPackageManager();
        errorReport.a.packageName = this.b;
        errorReport.R = this.b;
        errorReport.a.type = 11;
        errorReport.a.installerPackageName = packageManager.getInstallerPackageName(this.b);
        return true;
    }

    public final boolean b(ErrorReport errorReport) {
        ErrorReport errorReport2 = new ErrorReport();
        if (!c(errorReport2)) {
            return false;
        }
        ofx.a(errorReport2, errorReport, (Context) this.a);
        errorReport2.E = true;
        this.c = errorReport2.B;
        this.d.a(new mul("SilentSendFeedbackOperation", new mvn(errorReport2)));
        return true;
    }

    private final boolean c(FeedbackOptions feedbackOptions) {
        if (TextUtils.isEmpty(this.b)) {
            Log.e("gf_FeedbackService", "Can't run feedback, no calling package set");
            return false;
        }
        String str = this.b;
        feedbackOptions.g = str;
        feedbackOptions.d.packageName = str;
        feedbackOptions.d.type = 11;
        feedbackOptions.d.installerPackageName = this.a.getPackageManager().getInstallerPackageName(this.b);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final GoogleHelp a() {
        GoogleHelp a2 = GoogleHelp.a("feedbackBoundService");
        if (!TextUtils.isEmpty(this.c)) {
            a2.c = new Account(this.c, "com.google");
        }
        a2.e = this.b;
        return a2;
    }

    public final boolean b(FeedbackOptions feedbackOptions) {
        if (!c(feedbackOptions)) {
            return false;
        }
        feedbackOptions.o = true;
        this.d.a(new mul("SilentSendFeedbackOperation", new mvo(feedbackOptions)));
        return true;
    }

    public final void a(Bundle bundle, long j) {
        this.d.a(new mul("SaveAsyncFeedbackPsdOperation", new mvp(this, j, bundle)));
    }

    public final void a(ErrorReport errorReport, long j) {
        ErrorReport errorReport2 = new ErrorReport();
        if (c(errorReport2)) {
            ofx.a(errorReport2, errorReport, (Context) this.a);
            this.c = errorReport2.B;
            this.d.a(new mul("StartFeedbackOperation", new mvm(this, errorReport2, j)));
        }
    }

    public final void a(FeedbackOptions feedbackOptions) {
        if (c(feedbackOptions)) {
            this.d.a(new mul("StartFeedbackOperation", new mvl(feedbackOptions)));
        }
    }

    public final void a(FeedbackOptions feedbackOptions, Bundle bundle, long j) {
        this.d.a(new mul("SaveAsyncFeedbackPsbdOperation", new mvq(this, j, feedbackOptions, bundle)));
    }

    public final boolean a(ErrorReport errorReport) {
        ErrorReport errorReport2 = new ErrorReport();
        if (!c(errorReport2)) {
            return false;
        }
        ofx.a(errorReport2, errorReport, (Context) this.a);
        this.c = errorReport2.B;
        this.d.a(new mul("StartFeedbackOperation", new mvk(this, errorReport2)));
        return true;
    }
}
