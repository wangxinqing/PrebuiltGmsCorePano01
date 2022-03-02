package defpackage;

import com.google.android.gms.nearby.connection.AdvertisingOptions;

/* renamed from: ufn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ufn extends igi {
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ ige e;
    final /* synthetic */ AdvertisingOptions f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ufn(ige ige, String str, String str2, ige ige2, AdvertisingOptions advertisingOptions) {
        super(ige);
        this.c = str;
        this.d = str2;
        this.e = ige2;
        this.f = advertisingOptions;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        ueq ueq = (ueq) ibf;
        ufs ufs = new ufs(acwd);
        String str = this.c;
        String str2 = this.d;
        ige ige = this.e;
        AdvertisingOptions advertisingOptions = this.f;
        ueb ueb = new ueb(ige);
        ueq.v.add(ueb);
        uit uit = new uit();
        uit.a((uhd) new uep(ufs));
        uit.a(str);
        uit.b(str2);
        uit.a(advertisingOptions);
        uit.a((ugh) ueb);
        ((ugu) ueq.x()).a(uit.a);
    }
}
