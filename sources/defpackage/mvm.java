package defpackage;

import android.content.Context;
import com.google.android.gms.feedback.ErrorReport;

/* renamed from: mvm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mvm implements myb {
    private final mvr a;
    private final ErrorReport b;
    private final long c;

    public mvm(mvr mvr, ErrorReport errorReport, long j) {
        this.a = mvr;
        this.b = errorReport;
        this.c = j;
    }

    public final void a(Object obj) {
        mvr mvr = this.a;
        Context context = (Context) obj;
        context.startActivity(mvr.a((Context) mvr.a, this.b, Long.valueOf(this.c)));
    }
}
