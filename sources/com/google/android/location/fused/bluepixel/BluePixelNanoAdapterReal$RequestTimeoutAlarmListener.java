package com.google.android.location.fused.bluepixel;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BluePixelNanoAdapterReal$RequestTimeoutAlarmListener extends jgw {
    final /* synthetic */ aihg b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluePixelNanoAdapterReal$RequestTimeoutAlarmListener(aihg aihg) {
        super("location");
        this.b = aihg;
    }

    public final void a() {
        if (!this.b.c.a.isEmpty()) {
            this.b.e(2);
        }
    }
}
