package defpackage;

import java.util.List;

/* renamed from: afoq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afoq implements aoqa {
    private final afpf a;
    private final aflf b;
    private final afkr c;
    private final List d;

    public afoq(afpf afpf, aflf aflf, afkr afkr, List list) {
        this.a = afpf;
        this.b = aflf;
        this.c = afkr;
        this.d = list;
    }

    public final aorr a() {
        afpf afpf = this.a;
        aflf aflf = this.b;
        afkr afkr = this.c;
        return aopr.a(afpf.a(aflf, afkr), (aoqb) new afos(this.d, afkr, aflf), afpf.h);
    }
}
