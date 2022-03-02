package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: muw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class muw {
    public static final Feature a = new Feature("new_send_silent_feedback", 1);
    public static final Feature b;
    public static final Feature[] c;

    static {
        Feature feature = new Feature("new_start_feedback_activity", 1);
        b = feature;
        c = new Feature[]{a, feature};
    }
}
