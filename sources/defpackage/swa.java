package defpackage;

import java.util.concurrent.Callable;

/* renamed from: swa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class swa implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ suf d;

    public swa(suf suf, String str, String str2, String str3) {
        this.d = suf;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.d.a.y();
        return this.d.a.h().b(this.a, this.b, this.c);
    }
}
