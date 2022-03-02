package com.google.android.location.fused.providers;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GpsPulseProviderController$StatePulseWait$AlarmListener extends jgw {
    final /* synthetic */ aiiw b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GpsPulseProviderController$StatePulseWait$AlarmListener(aiiw aiiw) {
        super("location");
        this.b = aiiw;
    }

    public final void a() {
        if (this.b.d()) {
            aiix aiix = this.b.c;
            int i = aiix.q;
            aiix.a(aiix.l);
        }
    }
}
