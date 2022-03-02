package defpackage;

import java.io.PrintWriter;

/* renamed from: airw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class airw extends aicl {
    final /* synthetic */ aiax a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public airw(aico aico, long j, int i, int i2, int i3, aiax aiax) {
        super(aico, j, (String) null, (Object) null, i, i2, i3);
        this.a = aiax;
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        aiax aiax = this.a;
        printWriter.print("NetworkLocation [\n bestResult=");
        aiav aiav = aiax.a;
        if (aiav == null) {
            printWriter.print("null");
        } else if (aiav == aiax.b) {
            printWriter.print("WIFI");
        } else if (aiav == aiax.c) {
            printWriter.print("CELL");
        }
        printWriter.print("\n wifiResult=");
        aibo aibo = aiax.b;
        if (aibo == null) {
            printWriter.print("null");
        } else {
            printWriter.print(aibo.toString());
        }
        printWriter.print("\n cellResult=");
        aiah aiah = aiax.c;
        StringBuilder sb = new StringBuilder();
        aiah.a(sb, aiah);
        printWriter.print(sb);
        printWriter.print("\n isLowPower=");
        printWriter.print(aiax.d);
        printWriter.print("\n]");
    }
}
