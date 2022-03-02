package defpackage;

import java.io.PrintWriter;

/* renamed from: aitk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aitk extends aicl {
    final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aitk(aico aico, long j, int i, int i2) {
        super(aico, j, 1, Integer.MAX_VALUE, i);
        this.a = i2;
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        printWriter.print("command=1");
        StringBuilder sb = new StringBuilder(23);
        sb.append(", latencyMs=2147483647");
        printWriter.print(sb.toString());
        int i = this.a;
        StringBuilder sb2 = new StringBuilder(28);
        sb2.append(", transitionSize=");
        sb2.append(i);
        printWriter.print(sb2.toString());
    }
}
