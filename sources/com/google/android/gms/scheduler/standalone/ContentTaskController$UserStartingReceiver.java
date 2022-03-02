package com.google.android.gms.scheduler.standalone;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContentTaskController$UserStartingReceiver extends nla {
    final /* synthetic */ aaee a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentTaskController$UserStartingReceiver(aaee aaee) {
        super("scheduler");
        this.a = aaee;
    }

    public final void a(Context context, Intent intent) {
        this.a.a(nqw.b(intent.getIntExtra("android.intent.extra.user_handle", -1)));
    }
}
