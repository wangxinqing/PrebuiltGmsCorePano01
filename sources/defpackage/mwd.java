package defpackage;

import android.app.ApplicationErrorReport;
import android.text.TextUtils;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: mwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mwd extends mwc {
    public String i;

    public mwd() {
        this.h = new ApplicationErrorReport();
        this.h.crashInfo = new ApplicationErrorReport.CrashInfo();
        this.h.crashInfo.throwLineNumber = -1;
    }

    public final FeedbackOptions a() {
        iva.a((Object) this.h.crashInfo.exceptionClassName);
        iva.a((Object) this.h.crashInfo.throwClassName);
        iva.a((Object) this.h.crashInfo.throwMethodName);
        iva.a((Object) this.h.crashInfo.stackTrace);
        if (TextUtils.isEmpty(this.h.crashInfo.throwFileName)) {
            this.h.crashInfo.throwFileName = "unknown";
        }
        FeedbackOptions a = super.a();
        a.d.crashInfo = this.h.crashInfo;
        a.g = this.i;
        return a;
    }

    public mwd(Throwable th) {
        this.h = new ApplicationErrorReport();
        this.h.crashInfo = new ApplicationErrorReport.CrashInfo();
        this.h.crashInfo.throwLineNumber = -1;
        this.h.crashInfo = new ApplicationErrorReport.CrashInfo(th);
    }
}
