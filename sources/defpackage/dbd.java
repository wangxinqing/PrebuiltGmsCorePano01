package defpackage;

import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView;

/* renamed from: dbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dbd implements ax {
    private final dbi a;

    public dbd(dbi dbi) {
        this.a = dbi;
    }

    public final void a(Object obj) {
        dbi dbi = this.a;
        boolean d = dbi.d();
        CardDeckView cardDeckView = (CardDeckView) dbi.j;
        cyf cyf = (cyf) ((amri) obj).c();
        dbh dbh = new dbh(dbi);
        cardDeckView.d = cyf;
        cardDeckView.e = dbh;
        if (cardDeckView.b == null) {
            cardDeckView.b();
        }
        cardDeckView.b.a(cyf, (cyh) dbh);
        if (d) {
            ((CardDeckView) dbi.j).getLayoutManager().e(0, 0);
        }
    }
}
