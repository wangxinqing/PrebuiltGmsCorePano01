package defpackage;

/* renamed from: oyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class oyr implements acvp {
    static final acvp a = new oyr();

    private oyr() {
    }

    public final void a(acwa acwa) {
        int i = oyt.b;
        if (acwa.b()) {
            oso.d("Silent feedback sent successfully");
        } else {
            oso.c((Throwable) acwa.e(), "Failed to send silent feedback", new Object[0]);
        }
    }
}
