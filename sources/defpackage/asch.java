package defpackage;

/* renamed from: asch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asch extends arwm {
    final /* synthetic */ String a;
    final /* synthetic */ ascj b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asch(ascj ascj, String str, String str2) {
        super(str);
        this.b = ascj;
        this.a = str2;
    }

    public final void run() {
        ascn ascn = this.b.a;
        String str = this.a;
        if (ascn.g()) {
            for (ascl a2 : ascn.e.keySet()) {
                a2.a(str);
            }
        }
    }
}
