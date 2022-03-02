package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.connection.AdvertisingOptions;

/* renamed from: ufl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ufl extends igi {
    final /* synthetic */ byte[] c;
    final /* synthetic */ String d;
    final /* synthetic */ ige e;
    final /* synthetic */ AdvertisingOptions f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ufl(ige ige, Feature[] featureArr, byte[] bArr, String str, ige ige2, AdvertisingOptions advertisingOptions) {
        super(ige, featureArr);
        this.c = bArr;
        this.d = str;
        this.e = ige2;
        this.f = advertisingOptions;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        ueq ueq = (ueq) ibf;
        ufs ufs = new ufs(acwd);
        byte[] bArr = this.c;
        String str = this.d;
        ige ige = this.e;
        AdvertisingOptions advertisingOptions = this.f;
        ueb ueb = new ueb(ige);
        ueq.v.add(ueb);
        uit uit = new uit();
        uit.a((uhd) new uep(ufs));
        uit.a.h = bArr;
        uit.b(str);
        uit.a(advertisingOptions);
        uit.a((ugh) ueb);
        ((ugu) ueq.x()).a(uit.a);
    }
}
