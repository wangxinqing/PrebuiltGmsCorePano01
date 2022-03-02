package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcSettingsListActivityRequest;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;
import com.google.android.gms.udc.service.UdcApiChimeraService;

/* renamed from: addm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class addm extends adbz implements niz {
    final ClientContext a;
    final aczg b;
    private final UdcApiChimeraService c;
    private final nix d;
    private final String e;

    public addm(UdcApiChimeraService udcApiChimeraService, nix nix, Account account, String str, int i) {
        this.c = udcApiChimeraService;
        this.d = nix;
        this.e = str;
        ClientContext clientContext = new ClientContext();
        clientContext.e = "com.google.android.gms";
        clientContext.f = this.e;
        clientContext.b = i;
        clientContext.d = account;
        clientContext.c = account;
        clientContext.d(azrh.a.a().g());
        this.a = clientContext;
        this.b = new aczg(new aczf(new iyn(udcApiChimeraService, azrh.e(), azrh.d(), azrh.a.a().b(), azrh.a.a().l(), azrh.a.a().a(), azrh.a.a().h())), account != null ? new adhv(this.c, account.name) : null);
    }

    public final void a(adbx adbx) {
        a(adbx, new UdcSettingsListActivityRequest((String) null, false));
    }

    public final void b(adbx adbx) {
        this.d.a(this.c, new aczw(this.c, adbx, this.a, this.e, new addl(this)));
    }

    public final void c(adbx adbx) {
        this.d.a(this.c, new aczx(this.c, adbx, this.a, this.e));
    }

    public final void d(adbx adbx, byte[] bArr) {
        this.d.a(this.c, new adaj(this.c, adbx, this.a, this.e, this.b, bArr));
    }

    public final void e(adbx adbx, byte[] bArr) {
        this.d.a(this.c, new aczo(this.c, adbx, this.a, this.e, this.b, bArr));
    }

    public final void f(adbx adbx, byte[] bArr) {
        this.d.a(this.c, new aczr(this.c, adbx, this.a, this.e, this.b, bArr));
    }

    public final void a(adbx adbx, UdcCacheRequest udcCacheRequest) {
        this.d.a(this.c, new aczz(this.c, adbx, this.a, this.e, udcCacheRequest));
    }

    public final void b(adbx adbx, byte[] bArr) {
        this.d.a(this.c, new aczq(this.c, adbx, this.a, this.e, this.b, bArr));
    }

    public final void c(adbx adbx, byte[] bArr) {
        this.d.a(this.c, new aczp(this.c, adbx, this.a, this.e, this.b, bArr));
    }

    public final void a(adbx adbx, UdcSettingsListActivityRequest udcSettingsListActivityRequest) {
        this.d.a(this.c, new adaa(this.c, adbx, this.a, this.e, udcSettingsListActivityRequest));
    }

    public final void a(adbx adbx, UdcWriteLocalSettingsRequest udcWriteLocalSettingsRequest) {
        this.d.a(this.c, new adal(this.c, adbx, this.a, this.e, new addk(this), udcWriteLocalSettingsRequest));
    }

    public final void a(adbx adbx, byte[] bArr) {
        this.d.a(this.c, new aczs(this.c, adbx, this.a, this.e, this.b, bArr));
    }
}
