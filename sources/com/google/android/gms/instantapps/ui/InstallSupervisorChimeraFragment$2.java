package com.google.android.gms.instantapps.ui;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InstallSupervisorChimeraFragment$2 extends nla {
    final /* synthetic */ qme a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstallSupervisorChimeraFragment$2(qme qme, String str) {
        super(str);
        this.a = qme;
    }

    public final void a(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("package_event", -1);
        qfn qfn = qme.a;
        new Object[1][0] = Integer.valueOf(intExtra);
        this.a.a(intExtra);
    }
}
