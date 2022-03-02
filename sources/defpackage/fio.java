package defpackage;

import com.google.android.gms.auth.api.identity.SignInPassword;

/* renamed from: fio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fio implements amqy {
    private final fiq a;

    public fio(fiq fiq) {
        this.a = fiq;
    }

    public final Object a(Object obj) {
        fiq fiq = this.a;
        pyv pyv = (pyv) obj;
        fjw fjw = fiq.c;
        SignInPassword signInPassword = fiq.a;
        String str = fiq.b;
        aucd o = hmj.m.o();
        String str2 = signInPassword.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        hmj hmj = (hmj) o.b;
        str2.getClass();
        int i = hmj.a | 32;
        hmj.a = i;
        hmj.e = str2;
        str.getClass();
        int i2 = i | 4;
        hmj.a = i2;
        hmj.c = str;
        str.getClass();
        int i3 = i2 | 2;
        hmj.a = i3;
        hmj.b = str;
        "".getClass();
        hmj.a = i3 | 16384;
        hmj.j = "";
        String b = amrk.b(signInPassword.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        hmj hmj2 = (hmj) o.b;
        b.getClass();
        int i4 = hmj2.a | 128;
        hmj2.a = i4;
        hmj2.g = b;
        "".getClass();
        int i5 = 65536 | i4;
        hmj2.a = i5;
        hmj2.l = "";
        "".getClass();
        int i6 = i5 | 32768;
        hmj2.a = i6;
        hmj2.k = "";
        hmj2.a = i6 | 2048;
        hmj2.i = false;
        return fjw.a(pyv, (hmj) o.i());
    }
}
