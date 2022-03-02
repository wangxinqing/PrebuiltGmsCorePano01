package defpackage;

/* renamed from: abtr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abtr implements acvv {
    private final abty a;

    public abtr(abty abty) {
        this.a = abty;
    }

    public final void a(Object obj) {
        acwa acwa;
        abty abty = this.a;
        Void voidR = (Void) obj;
        if (abty.a.a("target_nearby_api")) {
            acwa = abty.a.b(abty, "target_nearby_api");
        } else {
            acwa = acws.a((Object) null);
        }
        acwa.a((acvp) new abtq(abty, "target_nearby_api"));
    }
}
