package defpackage;

/* renamed from: acnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acnr implements acox {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ acnt c;

    public acnr(acnt acnt, String str, int i) {
        this.c = acnt;
        this.a = str;
        this.b = i;
    }

    public final void a(Exception exc) {
        acnt.a.e("Error while fetching PSK from backup.", exc, new Object[0]);
        this.c.a(this.a);
    }

    public final void a(String str) {
        if (this.c.getActivity() == null) {
            return;
        }
        if (str != null) {
            acnt acnt = this.c;
            acnt.c.a(this.a, str, 4, this.b, acnt.b.getCount());
            return;
        }
        this.c.a(this.a);
    }
}
