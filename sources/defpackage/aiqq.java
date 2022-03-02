package defpackage;

import java.io.PrintWriter;

/* renamed from: aiqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiqq extends aicl {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ long d;
    final /* synthetic */ long m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiqq(aico aico, long j, Object obj, int i, int i2, int i3, int i4, String str, String str2, long j2, long j3) {
        super(aico, j, (String) null, obj, i, i2, i3);
        this.a = i4;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.m = j3;
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        int i = this.a;
        StringBuilder sb = new StringBuilder(25);
        sb.append("pendingIntent=");
        sb.append(i);
        printWriter.print(sb.toString());
        String valueOf = String.valueOf(this.b);
        printWriter.print(valueOf.length() == 0 ? new String(", packageName=") : ", packageName=".concat(valueOf));
        String valueOf2 = String.valueOf(this.c);
        printWriter.print(valueOf2.length() == 0 ? new String(", tag=") : ", tag=".concat(valueOf2));
        long j = this.d;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append(", periodMillis=");
        sb2.append(j);
        printWriter.print(sb2.toString());
        long j2 = this.m;
        StringBuilder sb3 = new StringBuilder(45);
        sb3.append(", maxReportLatencyMillis=");
        sb3.append(j2);
        printWriter.print(sb3.toString());
    }
}
