package defpackage;

import android.content.Context;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: onw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class onw extends ons {
    private final GoogleHelp f;

    public onw(GoogleHelpChimeraService googleHelpChimeraService, String str, ojq ojq, GoogleHelp googleHelp) {
        super("ProcessGoogleHelpAndPipOperation", googleHelpChimeraService, str, ojq);
        this.f = googleHelp;
    }

    public static void a(GoogleHelp googleHelp, String str, Context context) {
        nyt nyt = new nyt(googleHelp);
        nyt.a.C = (int) axmj.a.a().P();
        if (googleHelp.v != null) {
            ErrorReport i = nyt.i();
            hya.a(context).a(str);
            ErrorReport errorReport = new ErrorReport();
            ofx.a(errorReport, i, context);
            errorReport.a.packageName = str;
            errorReport.R = str;
            errorReport.a.type = 11;
            errorReport.a.installerPackageName = context.getPackageManager().getInstallerPackageName(str);
            errorReport.X = i.X;
            nyt.a.v = errorReport;
        }
    }

    public final void a(Context context) {
        a(this.f, this.d, this.a);
        this.e.a(this.f);
    }
}
