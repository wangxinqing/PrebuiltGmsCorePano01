package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;

/* renamed from: aanu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aanu {
    public final String a;
    public final String b;
    public final int c;
    public final PendingIntent d;
    public final String e;

    public aanu(boolean z, Bundle bundle) {
        int i;
        this.a = bundle.getString("package_name");
        String string = bundle.getString("warning_string_text");
        this.b = string;
        if (string == null) {
            i = bundle.getInt("warning_string_id");
        } else {
            i = 0;
        }
        this.c = i;
        long j = -1;
        if (z) {
            this.e = bundle.getString("app_title");
            this.d = (PendingIntent) bundle.getParcelable("hide_removed_app_intent");
            j = bundle.getLong("removed_time_ms", -1);
        } else {
            this.e = null;
            this.d = (PendingIntent) bundle.getParcelable("remove_app_intent");
        }
        if (!(this.a == null || this.d == null)) {
            if (!z) {
                return;
            }
            if (this.e != null && j >= 0) {
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
