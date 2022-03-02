package com.google.android.gms.feedback;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.gms.googlehelp.feedback.Screenshot;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class IntentListenerFeedbackChimeraActivity extends Activity {
    private String a;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        String a2 = jhg.a((Activity) this);
        this.a = a2;
        if (!TextUtils.isEmpty(a2)) {
            PackageManager packageManager = getPackageManager();
            ErrorReport errorReport = new ErrorReport();
            errorReport.a.packageName = this.a;
            errorReport.a.type = 11;
            errorReport.a.installerPackageName = packageManager.getInstallerPackageName(this.a);
            Intent className = new Intent().setClassName(this, "com.google.android.gms.feedback.FeedbackActivity");
            className.addFlags(268435456);
            Intent intent = getIntent();
            if (intent.hasExtra("com.android.feedback.SCREENSHOT_EXTRA")) {
                className.putExtra("com.android.feedback.SCREENSHOT_EXTRA", Screenshot.a((Bitmap) intent.getParcelableExtra("com.android.feedback.SCREENSHOT_EXTRA")));
            }
            if (intent.hasExtra("com.android.feedback.GOOGLE_ACCOUNT_EXTRA")) {
                CharSequence charSequenceExtra = intent.getCharSequenceExtra("com.android.feedback.GOOGLE_ACCOUNT_EXTRA");
                if (!TextUtils.isEmpty(charSequenceExtra)) {
                    errorReport.B = charSequenceExtra.toString();
                }
            }
            if (intent.hasExtra("com.android.feedback.PSD_EXTRA") && (bundleExtra = intent.getBundleExtra("com.android.feedback.PSD_EXTRA")) != null && bundleExtra.size() > 0) {
                errorReport.D = bundleExtra;
            }
            className.putExtra("com.android.feedback.SAFEPARCELABLE_REPORT", errorReport);
            startActivity(className);
            finish();
            return;
        }
        finish();
    }
}
