package defpackage;

import android.content.Intent;

/* renamed from: adkk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adkk {
    public static Intent a(String str) {
        return new Intent("android.settings.SYSTEM_UPDATE_COMPLETE").setPackage("com.google.android.gms").addFlags(268730368).putExtra("type", 1).putExtra("message", str);
    }

    public static Intent a(String str, String str2, int i, int i2, boolean z, boolean z2) {
        return new Intent("android.settings.SYSTEM_UPDATE_COMPLETE").setPackage("com.google.android.gms").addFlags(268730368).putExtra("type", 3).putExtra("message", str).putExtra("device_detail_update_url", str2).putExtra("overdue_phase", i2).putExtra("device_system_update_status", i).putExtra("is_security_update", z).putExtra("is_glif", z2);
    }
}
