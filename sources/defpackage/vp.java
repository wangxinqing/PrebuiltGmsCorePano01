package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import com.google.android.gms.R;

/* renamed from: vp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vp {
    public final Context a;

    private vp(Context context) {
        this.a = context;
    }

    public static vp a(Context context) {
        return new vp(context);
    }

    public final boolean b() {
        return this.a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    public final int a() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i < 360 ? 2 : 3;
        }
        return 4;
    }
}
