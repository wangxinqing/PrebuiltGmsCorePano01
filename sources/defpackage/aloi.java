package defpackage;

import java.util.logging.Level;

/* renamed from: aloi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aloi implements alpi {
    final /* synthetic */ alov a;
    final /* synthetic */ alok b;

    public aloi(alok alok, alov alov) {
        this.b = alok;
        this.a = alov;
    }

    public final void a(alpj alpj) {
        this.b.a.logp(Level.INFO, "com.google.apps.brix.api.client.managers.NetworkOtProtocolManager$4", "onFailure", "Error sending operation(s) to Realtime server; retrying.");
        alok alok = this.b;
        alok.b = 0;
        alok.d();
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
        if (this.a == null) {
            this.b.a();
        }
    }
}
