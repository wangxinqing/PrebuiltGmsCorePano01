package defpackage;

import android.content.Context;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;

/* renamed from: lxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lxz {
    private final lzm a;

    public lxz(Context context) {
        agvx.b(context);
        this.a = new lzm(context);
    }

    public static String a(Context context, String str, Map map) {
        return new lxz(context).a(str, map, (DroidGuardResultsRequest) null);
    }

    public static lya a(Context context, String str) {
        return new lxz(context).a(str, (DroidGuardResultsRequest) null);
    }

    public final String a(String str, Map map, DroidGuardResultsRequest droidGuardResultsRequest) {
        return (String) new lzk(this.a, str, droidGuardResultsRequest, map).a();
    }

    public final lya a(String str, DroidGuardResultsRequest droidGuardResultsRequest) {
        return (lya) new lzj(this.a, str, droidGuardResultsRequest).a();
    }
}
