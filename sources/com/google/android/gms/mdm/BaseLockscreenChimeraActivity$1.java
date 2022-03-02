package com.google.android.gms.mdm;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BaseLockscreenChimeraActivity$1 extends nla {
    final /* synthetic */ smf a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseLockscreenChimeraActivity$1(smf smf, String str) {
        super(str);
        this.a = smf;
    }

    public final void a(Context context, Intent intent) {
        this.a.finish();
    }
}
