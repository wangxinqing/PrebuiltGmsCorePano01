package defpackage;

import java.util.ArrayList;

/* renamed from: arp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arp extends aro {
    final /* synthetic */ nz a;
    final /* synthetic */ arq b;

    public arp(arq arq, nz nzVar) {
        this.b = arq;
        this.a = nzVar;
    }

    public final void a(arn arn) {
        ((ArrayList) this.a.get(this.b.b)).remove(arn);
        arn.b((arm) this);
    }
}
