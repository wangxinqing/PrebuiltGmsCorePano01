package defpackage;

import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView;
import java.util.List;

/* renamed from: daz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class daz implements ax {
    private final dbi a;

    public daz(dbi dbi) {
        this.a = dbi;
    }

    public final void a(Object obj) {
        List list = (List) obj;
        CardDeckView cardDeckView = (CardDeckView) this.a.j;
        if (!amqx.a(cardDeckView.j, list)) {
            cardDeckView.j = list;
            cardDeckView.a();
        }
    }
}
