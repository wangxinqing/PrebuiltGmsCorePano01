package com.google.android.gms.nearby.messages;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CopresenceBroadcastReceiver extends nla {
    public final vav a;
    private final arwg b;

    public CopresenceBroadcastReceiver(vav vav, arwg arwg) {
        super("nearby");
        this.a = vav;
        this.b = arwg;
    }

    public final void a(Context context, Intent intent) {
        this.b.c(new uwn(this, "CopresenceBroadcast", intent.getAction()));
    }
}
