package com.google.android.gms.mdisync.service;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MdiSyncApiChimeraService extends nio {
    private static final anij a = sjk.b();
    private final amsv b;
    private final amqy k;

    public MdiSyncApiChimeraService() {
        this(skc.a);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        a.d().a("com.google.android.gms.mdisync.service.MdiSyncApiChimeraService", "a", 59, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Receiving API connection from package '%s'...", (Object) getServiceRequest.d);
        if (!aygr.f()) {
            nit.a(16, (Bundle) null);
            a.c().a("com.google.android.gms.mdisync.service.MdiSyncApiChimeraService", "a", 63, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("API connection rejected!");
            return;
        }
        Account account = getServiceRequest.h;
        String str = getServiceRequest.d;
        sho sho = (sho) this.k.a(account);
        nix nix = (nix) this.b.a();
        awdx.a(nix);
        sho.a = nix;
        awdx.a(str);
        sho.b = str;
        awdx.a((Object) sho.a, nix.class);
        awdx.a((Object) sho.b, String.class);
        nit.a((skr) new shp(sho.c, sho.a, sho.b).a.a());
        a.d().a("com.google.android.gms.mdisync.service.MdiSyncApiChimeraService", "a", 70, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("API connection successful!");
    }

    public MdiSyncApiChimeraService(amqy amqy) {
        super(215, "com.google.android.gms.mdisync.service.START", (Set) anfv.a, 1, 9);
        this.b = amta.a((amsv) new skb(this));
        this.k = amqy;
    }
}
