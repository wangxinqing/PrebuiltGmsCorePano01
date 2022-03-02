package defpackage;

/* renamed from: ucf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ucf extends arwm {
    final /* synthetic */ udb a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ucf(udb udb, String str) {
        super(str);
        this.a = udb;
    }

    public final void run() {
        for (tzi tzi : this.a.b.d()) {
            if (tzi.o) {
                this.a.a(tzi, "android.bluetooth.device.action.ACL_DISCONNECTED");
            }
        }
    }
}
