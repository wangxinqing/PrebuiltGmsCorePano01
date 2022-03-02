package defpackage;

/* renamed from: gpu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gpu implements acvs {
    final /* synthetic */ gqa a;

    public gpu(gqa gqa) {
        this.a = gqa;
    }

    public final void a(Exception exc) {
        gqa gqa = this.a;
        int a2 = ((ibr) exc).a();
        StringBuilder sb = new StringBuilder(49);
        sb.append("window.onFetchPhoneNumberInfo(");
        sb.append(a2);
        sb.append(" , null)");
        gqa.f(sb.toString());
    }
}
