package com.google.android.contextmanager.acl;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UserConsentManager$1 extends nla {
    public final /* synthetic */ btw a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserConsentManager$1(btw btw, String str) {
        super(str);
        this.a = btw;
    }

    public final void a(Context context, Intent intent) {
        cbi.k().a(new bts(this, intent), bvq.a("ulrUdcConsentChangeIntent"));
    }
}
