package com.google.android.gms.nearby.sharing.provider.connections;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContactBookUpdater$1 extends nla {
    public final /* synthetic */ wcp a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactBookUpdater$1(wcp wcp, String str) {
        super(str);
        this.a = wcp;
    }

    public final void a(Context context, Intent intent) {
        this.a.a((Runnable) new wcm(this, context));
    }
}
