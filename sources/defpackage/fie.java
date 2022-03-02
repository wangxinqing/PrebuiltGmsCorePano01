package defpackage;

import com.google.android.gms.auth.api.identity.MatchPasswordResult;

/* renamed from: fie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fie implements amqy {
    private final amzy a;

    public fie(amzy amzy) {
        this.a = amzy;
    }

    public final Object a(Object obj) {
        amzy amzy;
        amzy amzy2 = this.a;
        Iterable a2 = anbs.a((Iterable) obj, fig.a);
        boolean hasNext = a2.iterator().hasNext();
        if (!hasNext) {
            amzy = amzy.a(anbs.a((Iterable) amzy2, fii.a));
        } else {
            amzy = amzy.a(anbs.a(a2, fih.a));
        }
        return new MatchPasswordResult(amzy, hasNext);
    }
}
