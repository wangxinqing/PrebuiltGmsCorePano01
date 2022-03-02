package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aayc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aayc {
    public static final String[] a = {"os.config.ppgl.dir", "os.config.ppgl.version", "os.config.ppgl.status", "os.config.ppgl.cd"};
    public final aayb b;

    static {
        aayc.class.getSimpleName();
    }

    public aayc(Bundle bundle) {
        this.b = new aayb(bundle);
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        aayb aayb = this.b;
        int i = aayb.a.getInt("snet_max_setuid_files_chars");
        return i == 0 ? aayb.a.getInt("max_setuid_files_chars", 2000) : i;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.b.b("report_non_system_apps");
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        return this.b.b("report_system_apps");
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return this.b.a("debug_status");
    }

    /* access modifiers changed from: package-private */
    public final List e() {
        aayb aayb = this.b;
        ArrayList<String> stringArrayList = aayb.a.getStringArrayList("snet_verify_apps_api_usage");
        return (stringArrayList == null || stringArrayList.isEmpty()) ? aayb.a.getStringArrayList("verify_apps_api_usage") : stringArrayList;
    }

    /* access modifiers changed from: package-private */
    public final byte[] f() {
        byte[] c = this.b.c("cached_logs");
        return c == null ? this.b.c("snet.intent.extra.CACHED_LOGS") : c;
    }
}
