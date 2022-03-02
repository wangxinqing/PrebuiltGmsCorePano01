package com.google.android.location.internal.server;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ServiceThread$LogRequestReceiver extends nla {
    public final aicj a;
    public final /* synthetic */ aire b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceThread$LogRequestReceiver(aire aire, aicj aicj) {
        super("location");
        this.b = aire;
        this.a = aicj;
    }

    public final void a(Context context, Intent intent) {
        new jfz(1, 10).execute(new airc(this, context, intent));
    }
}
