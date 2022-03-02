package defpackage;

import java.util.concurrent.Executor;

/* renamed from: afhe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afhe implements aoqb {
    private final awdn a;
    private final afhn b;
    private final Executor c;

    public afhe(awdn awdn, afhn afhn, Executor executor) {
        this.a = awdn;
        this.b = afhn;
        this.c = executor;
    }

    public final aorr a(Object obj) {
        awdn awdn = this.a;
        afhn afhn = this.b;
        return aopr.a(((pdd) awdn.a()).a(), (amqy) new afhi(afhn, (auke) obj), this.c);
    }
}
