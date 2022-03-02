package defpackage;

import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;

/* renamed from: pgq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pgq {
    public final aulf a;
    public final MdhFootprint b;
    public final TimeSeriesFootprintsSubscriptionFilter c;
    public final amzy d;
    public final aesm e;

    public pgq(aesm aesm) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = aesm;
    }

    public pgq(aulf aulf, MdhFootprint mdhFootprint) {
        this.a = aulf;
        this.b = mdhFootprint;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public pgq(TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, Iterable iterable) {
        this.a = null;
        this.b = null;
        this.c = timeSeriesFootprintsSubscriptionFilter;
        this.d = amzy.a(iterable);
        this.e = null;
    }
}
