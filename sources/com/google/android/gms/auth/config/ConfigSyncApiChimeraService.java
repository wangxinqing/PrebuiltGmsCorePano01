package com.google.android.gms.auth.config;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConfigSyncApiChimeraService extends nio {
    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        nit.a(new fzr(new nix(this, this.e, this.f), new gaa(yef.a((Context) this), new goj(this), new fzx(ModuleManager.get(this))), getServiceRequest.d));
    }

    public ConfigSyncApiChimeraService() {
        super(221, "com.google.android.gms.auth.config.service.START", (Set) anfv.a, 1, 9);
    }
}
