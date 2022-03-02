package defpackage;

import java.io.IOException;

/* renamed from: afov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afov implements aoqb {
    private final afpf a;
    private final aflf b;
    private final afkr c;

    public afov(afpf afpf, aflf aflf, afkr afkr) {
        this.a = afpf;
        this.b = aflf;
        this.c = afkr;
    }

    public final aorr a(Object obj) {
        afpf afpf = this.a;
        aflf aflf = this.b;
        afkr afkr = this.c;
        if (((Boolean) obj).booleanValue()) {
            aucd aucd = (aucd) aflf.c(5);
            aucd.a((aucj) aflf);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aflf aflf2 = (aflf) aucd.b;
            aflf aflf3 = aflf.f;
            aflf2.a |= 8;
            aflf2.e = false;
            return aopr.a(afpf.d.a((aflf) aucd.i(), afkr), (aoqb) new afow(afpf), afpf.h);
        }
        throw new IOException("Subscribing to group failed");
    }
}
