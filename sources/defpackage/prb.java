package defpackage;

import com.google.android.gms.icing.service.IndexChimeraService;

/* renamed from: prb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class prb extends ppr {
    final /* synthetic */ jbb a;
    final /* synthetic */ String b;
    final /* synthetic */ iyc c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ String f;
    final /* synthetic */ IndexChimeraService n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public prb(IndexChimeraService indexChimeraService, aonk aonk, String str, jbb jbb, String str2, iyc iyc, int i, int i2, String str3) {
        super(aonk, 1, str);
        this.n = indexChimeraService;
        this.a = jbb;
        this.b = str2;
        this.c = iyc;
        this.d = i;
        this.e = i2;
        this.f = str3;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        aajn aajn;
        IndexChimeraService indexChimeraService = this.n;
        jbb jbb = this.a;
        String str = this.b;
        iyc iyc = this.c;
        int i = this.d;
        int i2 = this.e;
        String str2 = this.f;
        boolean z = true;
        indexChimeraService.b().b(1);
        oso.d("IndexChimeraService.getServiceInterface callingPackage=%s componentName=%s serviceId=%s", str, str2, iyc);
        if (!indexChimeraService.a().d()) {
            oso.e("IndexManager failed to initialize. SearchIndex.API is unavailable.");
            indexChimeraService.a(jbb, 16, (jbh) null);
        } else {
            ozc a2 = indexChimeraService.a().m.a(i2, str, i, str2);
            int ordinal = iyc.ordinal();
            if (ordinal == 21) {
                aajn = new dsh(indexChimeraService.a(), a2);
            } else if (ordinal == 30) {
                aajn = new aagx(indexChimeraService.a(), a2);
            } else if (ordinal == 36) {
                aajn = new aain(indexChimeraService.a(), a2);
            } else if (ordinal == 65) {
                indexChimeraService.a();
                aajn = new aaki();
            } else if (ordinal == 77) {
                indexChimeraService.a();
                aajn = new aakt();
            } else if (ordinal == 32) {
                aajn = new aamc(indexChimeraService.a(), a2);
            } else if (ordinal == 33) {
                aajn = new aajn(indexChimeraService.a(), a2);
            } else {
                throw new IllegalArgumentException("Invalid service id in the request.");
            }
            oyz c2 = indexChimeraService.a().m.c(str);
            c2.d();
            if (c2.o()) {
                indexChimeraService.b().d(new prc(indexChimeraService, aonk.CHECK_CLIENT_RESOURCES, str, str, c2, jbb, aajn));
            } else {
                indexChimeraService.a(c2, jbb, aajn);
            }
            if (!((Boolean) ozx.R.c()).booleanValue() || !indexChimeraService.a().m.b(str)) {
                z = false;
            }
            indexChimeraService.b().d(new ovi(indexChimeraService.a(), false, z));
        }
        return null;
    }
}
