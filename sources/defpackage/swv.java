package defpackage;

import android.os.Bundle;

/* renamed from: swv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class swv implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ Bundle d;
    final /* synthetic */ String e;
    final /* synthetic */ sxd f;

    public swv(sxd sxd, String str, String str2, long j, Bundle bundle, String str3) {
        this.f = sxd;
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = bundle;
        this.e = str3;
    }

    public final void run() {
        this.f.a(this.a, this.b, this.c, this.d, this.e);
    }
}
