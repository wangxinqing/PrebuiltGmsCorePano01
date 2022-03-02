package defpackage;

/* renamed from: iho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class iho implements Runnable {
    private final ihr a;

    public iho(ihr ihr) {
        this.a = ihr;
    }

    public final void run() {
        ihr ihr = this.a;
        if ("com.google.android.gms".equals(jkt.a())) {
            if (axai.c()) {
                ihr.a("com.google.android.gms.common.systemhealthutils.restart.GmsRestartGmsService", "scheduled-restart-gms");
            }
        } else if (jhg.c() && axai.d()) {
            ihr.a("com.google.android.gms.common.systemhealthutils.restart.GmsRestartPersistentService", "scheduled-restart-persistent");
        }
    }
}
