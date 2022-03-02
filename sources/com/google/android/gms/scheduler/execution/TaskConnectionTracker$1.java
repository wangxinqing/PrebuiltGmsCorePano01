package com.google.android.gms.scheduler.execution;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TaskConnectionTracker$1 extends nla {
    final /* synthetic */ acwd a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TaskConnectionTracker$1(String str, acwd acwd) {
        super(str);
        this.a = acwd;
    }

    public final void a(Context context, Intent intent) {
        this.a.a((Object) getResultExtras(false));
    }
}
