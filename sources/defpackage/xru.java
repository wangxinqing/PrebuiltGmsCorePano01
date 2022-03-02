package defpackage;

/* renamed from: xru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xru implements icm {
    final /* synthetic */ xry a;

    public xru(xry xry) {
        this.a = xry;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        wlq wlq = (wlq) icl;
        if (wlq.b() != null) {
            int i = wlq.b().getInt("internal_call_result", 0);
            this.a.a.setEnabled(true);
            this.a.a.setSelection(i);
        }
    }
}
