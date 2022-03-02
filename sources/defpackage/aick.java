package defpackage;

import java.io.PrintWriter;

/* renamed from: aick  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aick extends aicl {
    final /* synthetic */ String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aick(aico aico, long j, Object obj, int i, String str) {
        super(aico, j, (String) null, obj, i, -1, -1);
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        int i = this.f;
        StringBuilder sb = new StringBuilder(25);
        sb.append("pendingIntent=");
        sb.append(i);
        printWriter.print(sb.toString());
        String valueOf = String.valueOf(this.a);
        printWriter.print(valueOf.length() == 0 ? new String(", packageName=") : ", packageName=".concat(valueOf));
    }
}
