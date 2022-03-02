package com.google.android.location.fused;

import android.os.Build;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FusionEngine$AlarmListener extends jgw {
    final /* synthetic */ aien b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FusionEngine$AlarmListener(aien aien) {
        super("location");
        this.b = aien;
    }

    public final void a() {
        int i = Build.VERSION.SDK_INT;
        this.b.f();
        this.b.c();
    }
}
