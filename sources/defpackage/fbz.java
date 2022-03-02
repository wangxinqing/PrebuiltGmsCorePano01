package defpackage;

import java.util.Comparator;

/* renamed from: fbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fbz implements Comparator {
    private final amqy a;

    public fbz(amqy amqy) {
        this.a = amqy;
    }

    public final int compare(Object obj, Object obj2) {
        amqy amqy = this.a;
        return (((Long) amqy.a(obj)).longValue() > ((Long) amqy.a(obj2)).longValue() ? 1 : (((Long) amqy.a(obj)).longValue() == ((Long) amqy.a(obj2)).longValue() ? 0 : -1));
    }
}
