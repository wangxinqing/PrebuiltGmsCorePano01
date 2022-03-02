package defpackage;

import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: appb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class appb implements appd {
    final /* synthetic */ appf a;

    public appb(appf appf) {
        this.a = appf;
    }

    public final void a(aptg aptg, Object... objArr) {
        appf appf = this.a;
        aptg.a(new PhoneAuthCredential(appf.i, appf.j, false, (String) null, true, (String) null, (String) null));
    }
}
