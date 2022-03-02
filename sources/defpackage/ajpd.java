package defpackage;

import android.app.AutomaticZenRule;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.R;

/* renamed from: ajpd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajpd {
    public String a;
    public boolean b;
    public int c;

    public ajpd(boolean z, int i) {
        this.b = z;
        this.c = i;
    }

    public static ajpd a(Uri uri) {
        try {
            return new ajpd(Boolean.parseBoolean(uri.getPathSegments().get(0)), Integer.parseInt(uri.getPathSegments().get(1)));
        } catch (IndexOutOfBoundsException | NullPointerException | NumberFormatException e) {
            String valueOf = String.valueOf(uri.toString());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Could not parse ") : "Could not parse ".concat(valueOf));
        }
    }

    public static String b(Context context) {
        if (ajpe.a(context)) {
            return context.getString(R.string.driving_mode_driving);
        }
        return context.getString(R.string.dnd_driving);
    }

    public final AutomaticZenRule a(Context context) {
        return new AutomaticZenRule(b(context), new ComponentName(context.getPackageName(), "com.google.android.location.settings.DrivingConditionProvider"), new Uri.Builder().scheme("condition").authority(context.getPackageName()).appendPath(Boolean.toString(this.b)).appendPath(Integer.toString(this.c)).appendQueryParameter("provider", b(context)).build(), this.c, this.b);
    }
}
