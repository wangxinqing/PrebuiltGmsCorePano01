package defpackage;

import com.google.android.gms.nearby.messages.CopresenceBroadcastReceiver;

/* renamed from: uwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uwn extends arwm {
    final /* synthetic */ String a;
    final /* synthetic */ CopresenceBroadcastReceiver b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uwn(CopresenceBroadcastReceiver copresenceBroadcastReceiver, String str, String str2) {
        super(str);
        this.b = copresenceBroadcastReceiver;
        this.a = str2;
    }

    public final void run() {
        CopresenceBroadcastReceiver copresenceBroadcastReceiver = this.b;
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(this.a)) {
            jjg jjg = tgc.a;
            vav vav = copresenceBroadcastReceiver.a;
            auyt c = vav.c();
            if (c != null) {
                vav.e = c;
                vav.b();
            }
        }
    }
}
