package defpackage;

/* renamed from: afon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afon implements aoqb {
    private final aflf a;

    public afon(aflf aflf) {
        this.a = aflf;
    }

    public final aorr a(Object obj) {
        aflf aflf = this.a;
        afkr afkr = (afkr) obj;
        if (afkr != null) {
            return aorl.a((Object) afkr);
        }
        afkd a2 = afkf.a();
        a2.a = afke.GROUP_NOT_FOUND_ERROR;
        String valueOf = String.valueOf(aflf.b);
        a2.b = valueOf.length() == 0 ? new String("Nothing to download for file group: ") : "Nothing to download for file group: ".concat(valueOf);
        return aorl.a((Throwable) a2.a());
    }
}
