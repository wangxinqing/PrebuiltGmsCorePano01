package defpackage;

import java.io.PrintWriter;

/* renamed from: aiqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiqt extends aicl {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiqt(aico aico, long j, Object obj, int i, int i2, String str, String str2) {
        super(aico, j, (String) null, obj, i, -1, -1);
        this.a = i2;
        this.b = str;
        this.c = str2;
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
    }
}
