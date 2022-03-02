package defpackage;

import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

/* renamed from: abto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abto implements igp {
    private final abty a;
    private final BootstrapOptions b;
    private final abtb c;

    public abto(abty abty, BootstrapOptions bootstrapOptions, abtb abtb) {
        this.a = abty;
        this.b = bootstrapOptions;
        this.c = abtb;
    }

    public final void a(Object obj, Object obj2) {
        abty abty = this.a;
        BootstrapOptions bootstrapOptions = this.b;
        abtb abtb = this.c;
        abzn abzn = new abzn((acwd) obj2);
        abxm abxm = new abxm(new abtx(abty, abtb));
        iva.a((Object) bootstrapOptions, (Object) "bootstrapOptions cannot be null.");
        iva.a((Object) abxm, (Object) "bootstrapListener cannot be null.");
        ((abxt) ((abzl) obj).x()).a(new abzj(abzn), bootstrapOptions, abxm);
    }
}
