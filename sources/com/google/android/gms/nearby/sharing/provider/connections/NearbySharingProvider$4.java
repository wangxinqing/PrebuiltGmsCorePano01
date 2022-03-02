package com.google.android.gms.nearby.sharing.provider.connections;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NearbySharingProvider$4 extends nla {
    public final /* synthetic */ wgu a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbySharingProvider$4(wgu wgu, String str) {
        super(str);
        this.a = wgu;
    }

    public final void a(Context context, Intent intent) {
        this.a.a((Runnable) new wgf(this));
    }
}
