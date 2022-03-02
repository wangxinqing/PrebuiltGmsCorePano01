package defpackage;

import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.util.HashSet;
import java.util.Set;

/* renamed from: paj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class paj {
    public final Context a;
    public final orf b;
    public final ppp c;
    public final ozi d;
    public final Set e = new HashSet();
    public final Set f = new HashSet();
    public final Object g = new Object();
    private final ozb h;
    private final oyq i;
    private final pas j;
    private final NativeIndex k;
    private final ovk l;

    public paj(Context context, orf orf, ppp ppp, ozi ozi, ozb ozb, oyq oyq, pas pas, NativeIndex nativeIndex, ovk ovk) {
        this.a = context;
        this.b = orf;
        this.c = ppp;
        this.d = ozi;
        this.h = ozb;
        this.i = oyq;
        this.j = pas;
        this.k = nativeIndex;
        this.l = ovk;
    }

    public final void a(pao pao) {
        a(pao, 300000);
    }

    public final void a(pao pao, long j2) {
        String a2;
        String str;
        String str2;
        pao pao2 = pao;
        ozq ozq = this.d.b;
        synchronized (ozq.a()) {
            a2 = ozq.a(pao2);
            osz d2 = ozq.d(pao2);
            if (d2 != null) {
                String str3 = d2.e;
                str2 = d2.c;
                str = str3;
            } else {
                str2 = null;
                str = null;
            }
        }
        if (pao2 == null) {
            oso.b("Corpus doesn't exist: %s", (Object) null);
        } else if (a2 != null) {
            synchronized (this.g) {
                if (!this.e.contains(a2)) {
                    this.e.add(a2);
                    ppp ppp = this.c;
                    Context context = this.a;
                    ozi ozi = this.d;
                    ozb ozb = this.h;
                    oyq oyq = this.i;
                    pas pas = this.j;
                    NativeIndex nativeIndex = this.k;
                    ovk ovk = this.l;
                    pai pai = new pai(this, str, str2, a2);
                    pag pag = r2;
                    pag pag2 = new pag(context, ppp, ozi, ozb, oyq, pas, nativeIndex, ovk, str, pao, a2, j2, pai, (pae) null);
                    ppp.d(pag);
                }
            }
        } else {
            oso.b("Corpus incarnation doesn't exist: %s", (Object) pao.b());
        }
    }
}
