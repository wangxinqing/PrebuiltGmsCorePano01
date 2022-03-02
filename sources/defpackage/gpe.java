package defpackage;

/* renamed from: gpe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class gpe implements acvs {
    private final String a;

    public gpe(String str) {
        this.a = str;
    }

    public final void a(Exception exc) {
        String str = this.a;
        gqa.d.d("Unable to update the transaction for UserAction %s - %s ", exc, str, exc.getMessage());
    }
}
