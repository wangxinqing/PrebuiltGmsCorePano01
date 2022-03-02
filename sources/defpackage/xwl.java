package defpackage;

import android.content.SharedPreferences;

/* renamed from: xwl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xwl {
    public final wss a;
    public final yaz b;
    public final String c;

    public xwl(wss wss, yaz yaz, String str) {
        this.a = wss;
        this.b = yaz;
        this.c = str;
    }

    public final void a(int i) {
        int o = this.a.o(this.c);
        long currentTimeMillis = System.currentTimeMillis();
        wss wss = this.a;
        String str = this.c;
        SharedPreferences sharedPreferences = wss.a;
        String valueOf = String.valueOf(str);
        long j = sharedPreferences.getLong(valueOf.length() == 0 ? new String("focus_first_full_sync_status_last_log_timestamp_") : "focus_first_full_sync_status_last_log_timestamp_".concat(valueOf), 0);
        if (o != i || (currentTimeMillis - j) / 1000 >= ayug.a.a().n()) {
            yaz yaz = this.b;
            wss wss2 = this.a;
            String str2 = this.c;
            SharedPreferences sharedPreferences2 = wss2.a;
            String valueOf2 = String.valueOf(str2);
            long j2 = sharedPreferences2.getLong(valueOf2.length() == 0 ? new String("focus_first_full_sync_initial_timestamp_") : "focus_first_full_sync_initial_timestamp_".concat(valueOf2), 0);
            wss wss3 = this.a;
            String str3 = this.c;
            SharedPreferences sharedPreferences3 = wss3.a;
            String valueOf3 = String.valueOf(str3);
            long j3 = sharedPreferences3.getLong(valueOf3.length() == 0 ? new String("focus_first_full_sync_start_timestamp_") : "focus_first_full_sync_start_timestamp_".concat(valueOf3), 0);
            wss wss4 = this.a;
            String str4 = this.c;
            SharedPreferences sharedPreferences4 = wss4.a;
            String valueOf4 = String.valueOf(str4);
            long j4 = sharedPreferences4.getLong(valueOf4.length() == 0 ? new String("focus_first_full_sync_finish_timestamp_") : "focus_first_full_sync_finish_timestamp_".concat(valueOf4), 0);
            aucd o2 = xnh.f.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            xnh xnh = (xnh) o2.b;
            int i2 = o - 1;
            if (o != 0) {
                xnh.b = i2;
                int i3 = xnh.a | 1;
                xnh.a = i3;
                int i4 = i3 | 2;
                xnh.a = i4;
                xnh.c = j2;
                int i5 = i4 | 4;
                xnh.a = i5;
                xnh.d = j3;
                xnh.a = i5 | 8;
                xnh.e = j4;
                ((ybh) yaz).u = (xnh) o2.i();
                wss wss5 = this.a;
                String str5 = this.c;
                iva.b((String) null);
                SharedPreferences.Editor edit = wss5.a.edit();
                String valueOf5 = String.valueOf(str5);
                edit.putLong(valueOf5.length() == 0 ? new String("focus_first_full_sync_status_last_log_timestamp_") : "focus_first_full_sync_status_last_log_timestamp_".concat(valueOf5), currentTimeMillis).commit();
                return;
            }
            throw null;
        }
    }
}
