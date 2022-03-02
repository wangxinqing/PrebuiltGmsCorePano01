package defpackage;

import com.google.android.gms.ipa.base.IpaInitIntentOperation;

/* renamed from: qoc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class qoc implements Runnable {
    private final qns a;

    public qoc(qns qns) {
        this.a = qns;
    }

    public final void run() {
        qns qns = this.a;
        int i = IpaInitIntentOperation.a;
        try {
            qns.a();
        } catch (Exception e) {
            qoh.a().a(49);
        }
    }
}
