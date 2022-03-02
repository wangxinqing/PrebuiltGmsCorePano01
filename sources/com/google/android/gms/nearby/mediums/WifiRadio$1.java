package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WifiRadio$1 extends nla {
    public final /* synthetic */ upb a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiRadio$1(upb upb, String str) {
        super(str);
        this.a = upb;
    }

    public final void a(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            jjg jjg = ulh.a;
            return;
        }
        upb upb = this.a;
        upb.a.execute(new upa(this, intent));
    }
}
