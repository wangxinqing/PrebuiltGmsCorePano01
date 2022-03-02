package defpackage;

import java.io.PrintWriter;

/* renamed from: aitb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aitb extends aicl {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aitb(aico aico, long j, int i, int i2, int i3, int i4, int i5, boolean z) {
        super(aico, j, (String) null, (Object) null, i, i2, i3);
        this.a = i4;
        this.b = i5;
        this.c = z;
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        printWriter.print("scale ");
        printWriter.print(this.a);
        printWriter.print(" level ");
        printWriter.print(this.b);
        printWriter.print(" plugged ");
        printWriter.print(this.c);
    }
}
