package defpackage;

import com.google.android.gms.udc.ConsentFlowConfig;

/* renamed from: acyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acyd {
    public final ConsentFlowConfig a;

    public acyd() {
        this.a = new ConsentFlowConfig(false, true, false, 0, 0, true, 0);
    }

    public final void a(int i) {
        this.a.e = i;
    }

    public final void b(int i) {
        this.a.d = i;
    }

    public acyd(ConsentFlowConfig consentFlowConfig) {
        this.a = consentFlowConfig;
    }
}
