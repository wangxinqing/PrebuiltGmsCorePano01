package defpackage;

import com.google.android.gms.nearby.connection.DiscoveryOptions;

/* renamed from: ufp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ufp extends igi {
    final /* synthetic */ String c;
    final /* synthetic */ ige d;
    final /* synthetic */ DiscoveryOptions e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ufp(ige ige, String str, ige ige2, DiscoveryOptions discoveryOptions) {
        super(ige);
        this.c = str;
        this.d = ige2;
        this.e = discoveryOptions;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        ueq ueq = (ueq) ibf;
        ufs ufs = new ufs(acwd);
        String str = this.c;
        ige ige = this.d;
        DiscoveryOptions discoveryOptions = this.e;
        ueg ueg = new ueg(ige);
        ueq.a.add(ueg);
        uiv uiv = new uiv();
        uiv.a((uha) new uen(ufs));
        uiv.a(str);
        uiv.a(discoveryOptions);
        uiv.a((ugq) ueg);
        ((ugu) ueq.x()).a(uiv.a);
    }
}
