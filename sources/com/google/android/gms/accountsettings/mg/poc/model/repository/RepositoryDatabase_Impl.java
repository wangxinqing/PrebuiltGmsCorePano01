package com.google.android.gms.accountsettings.mg.poc.model.repository;

import android.content.Context;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class RepositoryDatabase_Impl extends RepositoryDatabase {
    private volatile cub k;
    private volatile csr l;
    private volatile ctj m;

    /* access modifiers changed from: protected */
    public final de a(dp dpVar) {
        db dbVar = new db(dpVar, new cua(this), "670f3d20202cb8e1b2a07d18cf889162", "2de9fd33e29273c90009d60c5beb7d43");
        dc dcVar = new dc(dpVar.a);
        dcVar.b = dpVar.b;
        dcVar.c = dbVar;
        db dbVar2 = dcVar.c;
        if (dbVar2 != null) {
            Context context = dcVar.a;
            if (context != null) {
                dd ddVar = new dd(context, dcVar.b, dbVar2);
                return new dl(ddVar.a, ddVar.b, ddVar.c);
            }
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
    }

    /* access modifiers changed from: protected */
    public final dw b() {
        HashMap hashMap = new HashMap(0);
        new HashMap(0);
        return new dw(this, hashMap, "resource_info", "dismissed_prompt_item", "per_device_dismissed_onboarding_flow");
    }

    public final cub k() {
        cub cub;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new cuh(this);
            }
            cub = this.k;
        }
        return cub;
    }

    public final csr l() {
        csr csr;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new csv(this);
            }
            csr = this.l;
        }
        return csr;
    }

    public final ctj m() {
        ctj ctj;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new ctn(this);
            }
            ctj = this.m;
        }
        return ctj;
    }
}
