package defpackage;

import java.io.PrintWriter;

/* renamed from: aitg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aitg extends aicl {
    final /* synthetic */ int a;
    final /* synthetic */ long b;
    final /* synthetic */ boolean c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aitg(aico aico, long j, int i, int i2, int i3, int i4, long j2, boolean z) {
        super(aico, j, (String) null, (Object) null, i, i2, i3);
        this.a = i4;
        this.b = j2;
        this.c = z;
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        printWriter.print(this.a);
        printWriter.print(' ');
        printWriter.print(this.b);
        printWriter.print(' ');
        printWriter.print(this.c);
    }
}
