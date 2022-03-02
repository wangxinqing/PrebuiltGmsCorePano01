package defpackage;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;

/* renamed from: lzk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lzk extends lzl {
    final /* synthetic */ Map a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lzk(lzm lzm, String str, DroidGuardResultsRequest droidGuardResultsRequest, Map map) {
        super(lzm, str, droidGuardResultsRequest);
        this.a = map;
    }

    public final /* bridge */ /* synthetic */ Object a(lya lya) {
        String a2 = lya.a(this.a);
        lya.b();
        return a2;
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        String valueOf = String.valueOf(str);
        return mae.b(valueOf.length() == 0 ? new String("getResults ") : "getResults ".concat(valueOf));
    }
}
