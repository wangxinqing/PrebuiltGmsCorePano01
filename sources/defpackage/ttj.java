package defpackage;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: ttj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ttj extends tti {
    private final jiq b;

    public ttj(Context context) {
        super(context, "nearby_discovery_scan_result_cache.db");
        this.b = (jiq) thl.a(context, jiq.class);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        return ual.k;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        Long l;
        ual ual = (ual) obj;
        long a = this.b.a();
        if ((ual.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            l = Long.valueOf(ual.j);
        } else {
            l = null;
        }
        return ttg.b(a, l);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ String b(Object obj) {
        return ((ual) obj).b;
    }

    public final /* bridge */ /* synthetic */ boolean c(audx audx) {
        Long l;
        ual ual = (ual) audx;
        long a = this.b.a();
        if ((ual.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            l = Long.valueOf(ual.j);
        } else {
            l = null;
        }
        return !ttg.a(a, l);
    }

    public final /* bridge */ /* synthetic */ boolean b(audx audx) {
        ual ual = (ual) audx;
        return false;
    }
}
