package defpackage;

/* renamed from: aqcb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqcb {
    public static final aqcb a = new aqcb(aqbz.PROCEED, (aqbw) null, (aorr) null, (azxh) null);
    public static final aqcb b = new aqcb(aqbz.DELAY_START, (aqbw) null, (aorr) null, (azxh) null);
    public final aqbz c;
    public final aqca d = null;
    public final aqbw e;
    public final azxh f;
    private final aorr g;

    private aqcb(aqbz aqbz, aqbw aqbw, aorr aorr, azxh azxh) {
        amrl.a((Object) aqbz);
        this.c = aqbz;
        this.e = aqbw;
        this.g = aorr;
        this.f = azxh;
    }

    public static aqcb a(aorr aorr) {
        amrl.a((Object) aorr);
        return new aqcb(aqbz.CONTINUE_AFTER, (aqbw) null, aorr, (azxh) null);
    }

    public static aqcb a(azxh azxh) {
        amrl.a((Object) azxh);
        return new aqcb(aqbz.PROCEED, (aqbw) null, (aorr) null, azxh);
    }

    public static aqcb a(babj babj, baaf baaf) {
        amrl.a((Object) babj);
        amrl.a((Object) baaf);
        amrl.b(!babj.a(), (Object) "Error status must not be ok");
        return new aqcb(aqbz.ABORT_WITH_EXCEPTION, new aqbw(babj, baaf), (aorr) null, (azxh) null);
    }

    public final aorr a() {
        amrl.b(this.c == aqbz.CONTINUE_AFTER);
        return this.g;
    }
}
