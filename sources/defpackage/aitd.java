package defpackage;

import java.io.PrintWriter;

/* renamed from: aitd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aitd extends aicl {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aitd(aico aico, long j, int i, int i2, boolean z, int i3) {
        super(aico, j, (String) null, (Object) null, i, i2, 0);
        this.a = z;
        this.b = i3;
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        printWriter.print(this.a);
        printWriter.print(" osClientId=");
        printWriter.print(this.b);
    }
}
