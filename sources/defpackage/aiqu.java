package defpackage;

import java.io.PrintWriter;

/* renamed from: aiqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiqu extends aicl {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    final /* synthetic */ int m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiqu(aico aico, long j, Object obj, int i, int i2, int i3, int i4, String str, String str2, int i5, int i6) {
        super(aico, j, (String) null, obj, i, i2, i3);
        this.a = i4;
        this.b = str;
        this.c = str2;
        this.d = i5;
        this.m = i6;
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
        int i2 = this.d;
        StringBuilder sb2 = new StringBuilder(22);
        sb2.append(", activity=");
        sb2.append(i2);
        printWriter.print(sb2.toString());
        int i3 = this.m;
        StringBuilder sb3 = new StringBuilder(24);
        sb3.append(", transition=");
        sb3.append(i3);
        printWriter.print(sb3.toString());
    }
}
