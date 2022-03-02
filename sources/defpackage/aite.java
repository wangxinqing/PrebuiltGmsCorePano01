package defpackage;

import java.io.PrintWriter;

/* renamed from: aite  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aite extends aicl {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aite(aico aico, long j, String str, String str2, String str3) {
        super(aico, j);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        printWriter.print(this.a);
        printWriter.print('/');
        printWriter.print(this.b);
        printWriter.print(' ');
        printWriter.print(this.c);
    }
}
