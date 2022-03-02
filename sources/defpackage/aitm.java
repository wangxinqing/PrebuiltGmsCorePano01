package defpackage;

import java.io.PrintWriter;

/* renamed from: aitm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aitm extends aicl {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aitm(aico aico, long j, int i, int i2, int i3, int i4) {
        super(aico, j, i, i2);
        this.a = i3;
        this.b = i4;
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        int i = this.a;
        StringBuilder sb = new StringBuilder(27);
        sb.append("fusion activity=");
        sb.append(i);
        printWriter.print(sb.toString());
        int i2 = this.b;
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(", fusion event type =");
        sb2.append(i2);
        printWriter.print(sb2.toString());
    }
}
