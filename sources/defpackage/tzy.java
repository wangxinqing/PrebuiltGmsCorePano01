package defpackage;

/* renamed from: tzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tzy implements Runnable {
    private final uac a;
    private final uaa b;
    private final String c;

    public tzy(uac uac, uaa uaa, String str) {
        this.a = uac;
        this.b = uaa;
        this.c = str;
    }

    public final void run() {
        uac uac = this.a;
        uaa uaa = this.b;
        String str = this.c;
        if (uac.a == null) {
            uac.a = new txj();
        }
        uaa.a = txj.a(str, 0, 0);
        uaa.countDown();
    }
}
