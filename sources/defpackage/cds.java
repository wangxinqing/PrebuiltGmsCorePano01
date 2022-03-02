package defpackage;

import com.google.android.gms.nearby.messages.Message;

/* renamed from: cds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cds extends uxh {
    final /* synthetic */ cdu a;

    public cds(cdu cdu) {
        this.a = cdu;
    }

    public final void a(Message message) {
        this.a.a.a(new cdq(this, message), bvq.a("BeaconMessageListener_onFound"));
    }

    public final void b(Message message) {
        this.a.a.a(new cdr(this, message), bvq.a("BeaconMessageListener_onLost"));
    }
}
