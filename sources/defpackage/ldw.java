package defpackage;

/* renamed from: ldw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ldw extends lec {
    private Long a;

    public ldw(ldz ldz) {
        super(ldz);
    }

    public final void a(krk krk) {
        boolean z;
        if (this.a != null) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        if (this.a.longValue() > ((klb) krk.a()).e) {
            ((klb) krk.a()).e = this.a.longValue();
            krk.c();
        }
        this.a = null;
        super.a(krk);
    }

    public final void a(krk krk, lno lno) {
        super.a(krk, lno);
        iva.a(this.a == null);
        Long l = lno.c;
        iva.a((Object) l);
        this.a = l;
    }
}
