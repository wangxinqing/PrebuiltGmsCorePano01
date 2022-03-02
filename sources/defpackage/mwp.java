package defpackage;

import android.app.ApplicationErrorReport;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.feedback.LegacyBugReportChimeraService;
import com.google.android.gms.googlehelp.feedback.Screenshot;

/* renamed from: mwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mwp extends Binder {
    final /* synthetic */ LegacyBugReportChimeraService a;

    public mwp(LegacyBugReportChimeraService legacyBugReportChimeraService) {
        this.a = legacyBugReportChimeraService;
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int callingUid = Binder.getCallingUid();
        PackageManager packageManager = this.a.getPackageManager();
        String[] packagesForUid = packageManager.getPackagesForUid(callingUid);
        if (packagesForUid == null || packagesForUid.length == 0) {
            return false;
        }
        ApplicationErrorReport applicationErrorReport = new ApplicationErrorReport();
        applicationErrorReport.packageName = packagesForUid[0];
        applicationErrorReport.type = 11;
        applicationErrorReport.installerPackageName = packageManager.getInstallerPackageName(applicationErrorReport.packageName);
        LegacyBugReportChimeraService legacyBugReportChimeraService = this.a;
        Intent className = new Intent().setClassName(this.a, "com.google.android.gms.feedback.FeedbackActivity");
        className.putExtra("android.intent.extra.BUG_REPORT", applicationErrorReport);
        className.addFlags(268435456);
        if (parcel.dataSize() > 0) {
            Bitmap bitmap = (Bitmap) Bitmap.CREATOR.createFromParcel(parcel);
            if (!bitmap.isRecycled()) {
                className.putExtra("com.android.feedback.SCREENSHOT_EXTRA", Screenshot.a(bitmap));
            }
        }
        legacyBugReportChimeraService.startActivity(className);
        this.a.stopSelf();
        return true;
    }
}
