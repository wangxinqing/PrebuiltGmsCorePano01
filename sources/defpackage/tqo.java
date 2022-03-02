package defpackage;

import java.util.Map;

/* renamed from: tqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tqo implements toz {
    final tlh a;
    final String b;
    final byte[] c;
    final Map d = new nz();
    final /* synthetic */ tqs e;

    public tqo(tqs tqs, tlh tlh, String str) {
        this.e = tqs;
        this.a = tlh;
        this.b = str;
        this.c = tql.a(str);
    }

    public final void a(uvy uvy) {
        this.e.a((Runnable) new tqn(this, uvy));
    }

    public final void a(uvy uvy, byte[] bArr) {
        this.e.a((Runnable) new tqm(this, uvy, bArr));
    }
}
