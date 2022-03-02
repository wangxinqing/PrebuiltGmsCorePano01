package defpackage;

import android.content.SharedPreferences;

/* renamed from: yap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yap {
    public final wss a;
    public final String b;

    public final void a(boolean z, long j) {
        wss wss = this.a;
        String str = this.b;
        iva.b((String) null);
        SharedPreferences.Editor edit = wss.a.edit();
        String valueOf = String.valueOf(str);
        edit.putBoolean(valueOf.length() == 0 ? new String("focus_conditionally_reduce_page_size_enabled_") : "focus_conditionally_reduce_page_size_enabled_".concat(valueOf), z).commit();
        this.a.b(this.b);
        if (ayrk.b()) {
            this.a.d(this.b);
        }
        wss wss2 = this.a;
        String str2 = this.b;
        SharedPreferences.Editor edit2 = wss2.a.edit();
        String valueOf2 = String.valueOf(str2);
        edit2.putLong(valueOf2.length() == 0 ? new String("focus_timestamp_of_page_size_change_") : "focus_timestamp_of_page_size_change_".concat(valueOf2), j).commit();
    }

    public yap(wss wss, String str) {
        this.a = wss;
        this.b = str;
    }
}
