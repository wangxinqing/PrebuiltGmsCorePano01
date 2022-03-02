package defpackage;

import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: okf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class okf implements Runnable {
    private final HelpConfig a;
    private final okc b;
    private final aucd c;

    public okf(HelpConfig helpConfig, aucd aucd, okc okc) {
        this.a = helpConfig;
        this.c = aucd;
        this.b = okc;
    }

    public final void run() {
        HelpConfig helpConfig = this.a;
        aucd aucd = this.c;
        okc okc = this.b;
        int i = okg.b;
        if (helpConfig.h) {
            okc.a((olo) aucd.i());
        }
    }
}
