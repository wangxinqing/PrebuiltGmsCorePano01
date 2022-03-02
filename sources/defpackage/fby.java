package defpackage;

import java.util.Comparator;

/* renamed from: fby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fby implements Comparator {
    private final amqy a;

    public fby(amqy amqy) {
        this.a = amqy;
    }

    public final int compare(Object obj, Object obj2) {
        amqy amqy = this.a;
        return Integer.compare(((Integer) amqy.a(obj)).intValue(), ((Integer) amqy.a(obj2)).intValue());
    }
}
