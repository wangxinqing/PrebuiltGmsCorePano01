package defpackage;

import android.content.Context;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackAsyncChimeraService;

/* renamed from: mvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mvn implements myb {
    private final ErrorReport a;

    public mvn(ErrorReport errorReport) {
        this.a = errorReport;
    }

    public final void a(Object obj) {
        FeedbackAsyncChimeraService.b((Context) obj, this.a);
    }
}
