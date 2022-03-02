package defpackage;

import java.io.PrintWriter;

/* renamed from: aitc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aitc extends aicl {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aitc(aico aico, long j, int i, int i2, int i3, boolean z, boolean z2, int i4) {
        super(aico, j, (String) null, (Object) null, i, i2, i3);
        this.a = z;
        this.b = z2;
        this.c = i4;
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        printWriter.printf("onWifi: %s, onCellular: %s, wifiNetworkId: %d", new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c)});
    }
}
