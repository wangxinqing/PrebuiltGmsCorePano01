package com.google.android.gms.common.util;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ClientListeners$UserReceiver extends nla {
    final /* synthetic */ jip a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClientListeners$UserReceiver(jip jip) {
        super("common-base");
        this.a = jip;
    }

    public final void a(Context context, Intent intent) {
        if ("android.intent.action.USER_SWITCHED".equals(intent.getAction())) {
            this.a.a(false);
        }
    }
}
