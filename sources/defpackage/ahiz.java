package defpackage;

import java.io.PrintWriter;

/* renamed from: ahiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahiz extends aicl {
    final /* synthetic */ String a;
    final /* synthetic */ int b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahiz(aico aico, long j, int i, int i2, String str, int i3) {
        super(aico, j, i, i2);
        this.a = str;
        this.b = i3;
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        printWriter.print(this.a);
        printWriter.print(' ');
        printWriter.print(this.b);
    }
}
