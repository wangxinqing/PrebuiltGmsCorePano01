package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.HttpStack;

/* renamed from: athc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class athc extends BasicNetwork {
    private final Context a;

    public athc(Context context, HttpStack httpStack) {
        super(httpStack);
        this.a = context;
    }

    public final NetworkResponse performRequest(Request request) {
        try {
            atgw.a(this.a, 4353);
            return super.performRequest(request);
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
