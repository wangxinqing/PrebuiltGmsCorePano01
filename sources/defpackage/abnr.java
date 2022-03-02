package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: abnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abnr implements aora {
    final /* synthetic */ abnu a;

    public abnr(abnu abnu) {
        this.a = abnu;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        abnu abnu = this.a;
        abnu.d = (abwi) obj;
        abnu.c = null;
        abnu.d();
    }

    public final void a(Throwable th) {
        if (!(th instanceof CancellationException)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
            sb.append("Error establishing encrypted connection: ");
            sb.append(valueOf);
            String sb2 = sb.toString();
            abnu.a.e(sb2, th, new Object[0]);
            this.a.a(10577, sb2);
            this.a.a();
        }
    }
}
