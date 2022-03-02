package defpackage;

import android.os.Handler;

/* renamed from: ahuc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahuc {
    public final Handler a;
    public ahsu b;
    public ahuj c;
    public ahsr d;
    public final ajrh e;
    public String f;
    public ahrx g;
    public final ajbg h;
    public ahsg i;

    public ahuc(ajbg ajbg, Handler handler, ajrh ajrh) {
        this.a = handler;
        this.e = ahvx.a(ajrh);
        this.h = ajbg;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ahsr ahsr;
        ahsu ahsu = this.b;
        if (ahsu != null && (ahsr = this.d) != null) {
            ahsr.post(new ahsi(ahsu));
        }
    }
}
