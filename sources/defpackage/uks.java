package defpackage;

/* renamed from: uks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uks implements acvs {
    private final ukw a;
    private final aosh b;

    public uks(ukw ukw, aosh aosh) {
        this.a = ukw;
        this.b = aosh;
    }

    public final void a(Exception exc) {
        ukw ukw = this.a;
        this.b.a((Throwable) new RuntimeException(String.format("Failed to start BLE scan with settings: %s", new Object[]{ukw.a}), exc));
    }
}
