package defpackage;

/* renamed from: agjv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agjv {
    public final agkp a;
    public final aekn b;
    public final bapu c;
    public final aggl d;

    public agjv(bapu bapu, agkp agkp, aekn aekn, amri amri) {
        this.a = agkp;
        this.b = aekn;
        aggm aggm = new aggm();
        aggm.b = aggl.a;
        aggm.a = false;
        String str = aggm.a == null ? " enabled" : "";
        str = aggm.b == null ? str.concat(" metricExtensionProvider") : str;
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        this.d = ((aggn) amri.a((Object) new agdc(aggm.a.booleanValue(), aggm.b))).b();
        this.c = bapu;
    }
}
