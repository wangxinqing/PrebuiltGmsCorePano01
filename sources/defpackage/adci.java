package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: adci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adci extends adcj {
    protected final adch a = new adch(this);
    final /* synthetic */ atyw b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adci(icc icc, atyw atyw) {
        super(icc);
        this.b = atyw;
    }

    /* access modifiers changed from: protected */
    public final void a(adca adca) {
        adch adch = this.a;
        atyw atyw = this.b;
        aucd aucd = (aucd) atyw.c(5);
        aucd.a((aucj) atyw);
        atzv atzv = this.b.g;
        if (atzv == null) {
            atzv = atzv.i;
        }
        aucd aucd2 = (aucd) atzv.c(5);
        aucd2.a((aucj) atzv);
        atzs atzs = atzv.g;
        if (atzs == null) {
            atzs = atzs.c;
        }
        aucd aucd3 = (aucd) atzs.c(5);
        aucd3.a((aucj) atzs);
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        atzs atzs2 = (atzs) aucd3.b;
        "201216000".getClass();
        atzs2.a |= 1;
        atzs2.b = "201216000";
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        atzv atzv2 = (atzv) aucd2.b;
        atzs atzs3 = (atzs) aucd3.i();
        atzs3.getClass();
        atzv2.g = atzs3;
        atzv2.a |= 64;
        atzv atzv3 = (atzv) aucd2.i();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        atyw atyw2 = (atyw) aucd.b;
        atyw atyw3 = atyw.j;
        atzv3.getClass();
        atyw2.g = atzv3;
        atyw2.a |= 16;
        adca.c(adch, ((atyw) aucd.i()).k());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final acyu b(Status status) {
        return new adco(status, (atyx) null);
    }
}
