package defpackage;

/* renamed from: btu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class btu extends bva {
    final /* synthetic */ bsz a;
    final /* synthetic */ btw b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public btu(btw btw, String str, Object[] objArr, bsz bsz) {
        super(str, objArr);
        this.b = btw;
        this.a = bsz;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i;
        int i2;
        ick ick = (ick) obj;
        btv btv = (btv) this.b.c.get(this.a);
        if (!ick.o()) {
            i = 2;
        } else {
            i = 1;
        }
        btv.b = i;
        btv btv2 = (btv) this.b.c.get(this.a);
        if (!ick.n()) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        btv2.c = i2;
        Object[] objArr = {Integer.valueOf(((btv) this.b.c.get(this.a)).b), Integer.valueOf(((btv) this.b.c.get(this.a)).c)};
    }
}
