package defpackage;

import java.io.PrintWriter;

/* renamed from: ahja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahja extends aicl {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahja(aico aico, long j, Object obj, int i, int i2, int i3, long j2, long j3, long j4, boolean z) {
        super(aico, j, (String) null, obj, i, i2, i3);
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = z;
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        long j = this.a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("minPeriodMillis=");
        sb.append(j);
        printWriter.print(sb.toString());
        long j2 = this.b;
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append(", maxReportLatencyMillis=");
        sb2.append(j2);
        printWriter.print(sb2.toString());
        long j3 = this.c;
        StringBuilder sb3 = new StringBuilder(50);
        sb3.append(", minPeriodTiltDetectorMillis=");
        sb3.append(j3);
        printWriter.print(sb3.toString());
        boolean z = this.d;
        StringBuilder sb4 = new StringBuilder(25);
        sb4.append(", forceDetectionNow=");
        sb4.append(z);
        printWriter.print(sb4.toString());
    }
}
