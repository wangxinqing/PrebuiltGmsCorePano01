package defpackage;

import java.io.PrintWriter;

/* renamed from: aith  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aith extends aicl {
    final /* synthetic */ int a;
    final /* synthetic */ aiaf b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aith(aico aico, long j, Object obj, int i, int i2, int i3, aiaf aiaf) {
        super(aico, j, (String) null, obj, i, i2, -1);
        this.a = i3;
        this.b = aiaf;
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        printWriter.print(this.a);
        String valueOf = String.valueOf(this.b.c());
        printWriter.print(valueOf.length() == 0 ? new String(" deviceAddress=") : " deviceAddress=".concat(valueOf));
        String valueOf2 = String.valueOf(this.b.a());
        printWriter.print(valueOf2.length() == 0 ? new String(", deviceName=") : ", deviceName=".concat(valueOf2));
    }
}
