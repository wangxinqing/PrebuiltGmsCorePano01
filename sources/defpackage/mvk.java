package defpackage;

import android.content.Context;
import com.google.android.gms.feedback.ErrorReport;

/* renamed from: mvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mvk implements myb {
    private final mvr a;
    private final ErrorReport b;

    public mvk(mvr mvr, ErrorReport errorReport) {
        this.a = mvr;
        this.b = errorReport;
    }

    public final void a(Object obj) {
        mvr mvr = this.a;
        Context context = (Context) obj;
        context.startActivity(mvr.a((Context) mvr.a, this.b, (Long) null));
    }
}
