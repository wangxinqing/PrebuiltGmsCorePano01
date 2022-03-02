package defpackage;

import android.app.AutomaticZenRule;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.R;

/* renamed from: ajom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajom {
    public static Uri a(Context context, boolean z) {
        return new Uri.Builder().scheme("condition").authority(context.getPackageName()).appendPath(Boolean.toString(z)).appendPath(Integer.toString((int) aycw.c())).appendQueryParameter("provider", a(context)).appendQueryParameter("rule_source", "driving_mode").appendQueryParameter("driving_mode_enable_dnd_rule", !z ? "false" : "true").build();
    }

    static String a(Context context) {
        return context.getString(R.string.driving_mode_driving);
    }

    public static void a(Context context, iwq iwq, boolean z) {
        iwq.a(new AutomaticZenRule(a(context), new ComponentName(context.getPackageName(), "com.google.android.location.settings.DrivingConditionProvider"), a(context, z), (int) aycw.c(), true));
    }
}
