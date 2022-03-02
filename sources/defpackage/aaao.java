package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: aaao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaao {
    public static final Feature a = new Feature("handle_scheduling_request", 1);
    public static final Feature b;
    public static final Feature[] c;

    static {
        Feature feature = new Feature("send_wakeup_event", 1);
        b = feature;
        c = new Feature[]{a, feature};
    }
}
