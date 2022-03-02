package com.google.android.gms.scheduler.reachability;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ReachabilityObserver$AlarmReceiver extends nla {
    public final /* synthetic */ aadt a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReachabilityObserver$AlarmReceiver(aadt aadt) {
        super("scheduler");
        this.a = aadt;
    }

    public final void a(Context context, Intent intent) {
        aadt aadt = this.a;
        int i = aadt.d;
        aadt.a.execute(new aads(this));
    }
}
