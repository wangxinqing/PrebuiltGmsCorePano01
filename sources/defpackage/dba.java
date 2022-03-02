package defpackage;

import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView;

/* renamed from: dba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dba implements ax {
    private final dbi a;

    public dba(dbi dbi) {
        this.a = dbi;
    }

    public final void a(Object obj) {
        CardDeckView cardDeckView = (CardDeckView) this.a.j;
        dii dii = (dii) ((amri) obj).c();
        if (!amqx.a(cardDeckView.i, dii)) {
            cardDeckView.i = dii;
            cardDeckView.a();
        }
    }
}
