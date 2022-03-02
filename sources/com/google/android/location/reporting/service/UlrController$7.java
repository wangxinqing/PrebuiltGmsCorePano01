package com.google.android.location.reporting.service;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UlrController$7 extends nla {
    final /* synthetic */ ajme a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UlrController$7(ajme ajme, String str) {
        super(str);
        this.a = ajme;
    }

    public final void a(Context context, Intent intent) {
        ajme ajme = this.a;
        int i = ajme.v;
        ajma ajma = ajme.k;
        ajma.sendMessage(ajma.obtainMessage(1, intent));
    }
}
