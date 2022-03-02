package defpackage;

/* renamed from: fzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fzy implements acvz {
    private final gaa a;
    private final int b;

    public fzy(gaa gaa, int i) {
        this.a = gaa;
        this.b = i;
    }

    public final acwa a(Object obj) {
        gaa gaa = this.a;
        int i = this.b;
        Void voidR = (Void) obj;
        gaa.a.b("bulkRegister was successful, trying registerSync", new Object[0]);
        return gaa.b.a("com.google.android.gms.auth_account", i, new String[]{"ANDROID_AUTH"}, (byte[]) null, "").b(new fzz(gaa));
    }
}
