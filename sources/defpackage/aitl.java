package defpackage;

import java.io.PrintWriter;

/* renamed from: aitl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aitl extends aicl {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aitl(aico aico, long j, int i, int i2, int i3, int i4, int i5, int i6) {
        super(aico, j, i, i2, i3);
        this.a = i4;
        this.b = i5;
        this.c = i6;
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        int i = this.a;
        StringBuilder sb = new StringBuilder(18);
        sb.append("reason=");
        sb.append(i);
        printWriter.print(sb.toString());
        int i2 = this.b;
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append(", sampleCount=");
        sb2.append(i2);
        printWriter.print(sb2.toString());
        int i3 = this.c;
        StringBuilder sb3 = new StringBuilder(29);
        sb3.append(", transitionCount=");
        sb3.append(i3);
        printWriter.print(sb3.toString());
    }
}
