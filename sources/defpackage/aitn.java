package defpackage;

import java.io.PrintWriter;

/* renamed from: aitn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aitn extends aicl {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aitn(aico aico, long j, Object obj, int i, int i2, int i3, long j2, long j3, long j4, boolean z) {
        super(aico, j, (String) null, obj, i, i2, i3);
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = z;
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        printWriter.print(this.a);
        printWriter.print(" low power period ");
        printWriter.print(this.b);
        printWriter.print(" batch period ");
        printWriter.print(this.c);
        printWriter.print(" trigger ");
        printWriter.print(this.d);
    }
}
