package defpackage;

import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView;

/* renamed from: dbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dbc implements ax {
    private final dbi a;

    public dbc(dbi dbi) {
        this.a = dbi;
    }

    public final void a(Object obj) {
        CardDeckView cardDeckView = (CardDeckView) this.a.j;
        aqst aqst = (aqst) ((amri) obj).c();
        if (!amqx.a(cardDeckView.h, aqst)) {
            cardDeckView.h = aqst;
            cardDeckView.a();
        }
    }
}
