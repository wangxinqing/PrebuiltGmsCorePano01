package defpackage;

import java.io.PrintWriter;

/* renamed from: aitj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aitj extends aicl {
    final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aitj(aico aico, long j, int i, int i2) {
        super(aico, j, i);
        this.a = i2;
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        int i = this.a;
        StringBuilder sb = new StringBuilder(35);
        sb.append("activityRecognitionMode=");
        sb.append(i);
        printWriter.print(sb.toString());
    }
}
