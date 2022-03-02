package defpackage;

import com.google.android.gms.fonts.FontMatchSpec;

/* renamed from: nhe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nhe implements Runnable {
    final /* synthetic */ nhf a;
    private final FontMatchSpec b;
    private final String c;
    private final aosh d;

    public nhe(nhf nhf, FontMatchSpec fontMatchSpec, String str, aosh aosh) {
        this.a = nhf;
        this.b = fontMatchSpec;
        this.c = str;
        this.d = aosh;
    }

    public final void run() {
        nhf nhf = this.a;
        nhf.a(nhf.j, this.b, this.c, this.d);
    }
}
