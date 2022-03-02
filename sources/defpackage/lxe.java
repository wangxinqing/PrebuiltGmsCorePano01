package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.R;

/* renamed from: lxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lxe extends luj {
    public final CharSequence a(Context context) {
        return context.getString(R.string.car_driving_mode_behavior_morris_pref_option_title);
    }

    public final String a() {
        return "car_pref_key_driving_mode_behavior_morris_preference";
    }

    public final ComponentName b(Context context) {
        return a(context, aycw.f());
    }

    public final Intent b() {
        return null;
    }

    public final int c() {
        return 4;
    }

    public final boolean c(Context context) {
        return true;
    }

    public final boolean d(Context context) {
        return awqj.b();
    }
}
