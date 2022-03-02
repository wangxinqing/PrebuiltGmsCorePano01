package defpackage;

/* renamed from: zxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class zxv implements acvs {
    static final acvs a = new zxv();

    private zxv() {
    }

    public final void a(Exception exc) {
        zsg zsg = zyg.c;
        if (azfa.g()) {
            zyg.c.a((Throwable) exc, "Fetch current backup account failed.");
            return;
        }
        zyg.c.e("Fetch current backup account failed. ", exc);
    }
}
