package defpackage;

import java.io.PrintWriter;
import java.util.List;

/* renamed from: aiqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiqr extends aicl {
    final /* synthetic */ int a;
    final /* synthetic */ long b;
    final /* synthetic */ String c;
    final /* synthetic */ List d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiqr(aico aico, long j, Object obj, int i, int i2, int i3, int i4, long j2, String str, List list) {
        super(aico, j, (String) null, obj, i, i2, i3);
        this.a = i4;
        this.b = j2;
        this.c = str;
        this.d = list;
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        int i = this.a;
        StringBuilder sb = new StringBuilder(25);
        sb.append("pendingIntent=");
        sb.append(i);
        printWriter.print(sb.toString());
        long j = this.b;
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append(", fullPowerPeriodMillis=");
        sb2.append(j);
        printWriter.print(sb2.toString());
        String valueOf = String.valueOf(this.c);
        printWriter.print(valueOf.length() == 0 ? new String(", tag=") : ", tag=".concat(valueOf));
        String valueOf2 = String.valueOf(this.d);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 14);
        sb3.append(", workSources=");
        sb3.append(valueOf2);
        printWriter.print(sb3.toString());
    }
}
