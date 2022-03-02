package defpackage;

import android.content.Context;
import java.io.Closeable;

/* renamed from: cmo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cmo implements Closeable {
    public bapu a;
    private bapu b;
    private bapu c;
    private bapu d;
    private bapu e;
    private bapu f;
    private bapu g;
    private bapu h;
    private bapu i;
    private bapu j;
    private bapu k;

    cmo() {
    }

    public final void close() {
        ((coh) this.g.a()).close();
    }

    public cmo(Context context) {
        this.b = awds.a(cmj.a);
        awdt a2 = awdu.a(context);
        this.c = a2;
        cmz cmz = new cmz(a2);
        this.d = cmz;
        this.e = awds.a(new cnc(this.c, cmz));
        cpl cpl = new cpl(this.c);
        this.f = cpl;
        bapu a3 = awds.a(new cpf(cpl));
        this.g = a3;
        cni cni = new cni(this.c, a3);
        this.h = cni;
        bapu bapu = this.b;
        bapu bapu2 = this.e;
        bapu bapu3 = this.g;
        this.i = new cng(bapu, bapu2, cni, bapu3, bapu3);
        bapu bapu4 = this.c;
        bapu bapu5 = this.e;
        bapu bapu6 = this.g;
        this.j = new cnz(bapu4, bapu5, bapu6, this.h, this.b, bapu6);
        bapu bapu7 = this.b;
        bapu bapu8 = this.g;
        cod cod = new cod(bapu7, bapu8, this.h, bapu8);
        this.k = cod;
        this.a = awds.a(new cmp(this.i, this.j, cod));
    }
}
