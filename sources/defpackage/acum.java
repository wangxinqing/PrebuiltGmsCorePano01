package defpackage;

/* renamed from: acum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class acum {
    public final void a(acud acud) {
        try {
            a(acud.a());
        } catch (avwv e) {
            int i = e.a;
            if (i == 401 || i == 403) {
                acud.b();
                a(acud.a());
                return;
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(String str);
}
