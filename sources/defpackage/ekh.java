package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.R;

/* renamed from: ekh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ekh {
    public static final ekh a = new ekh();
    private static final fzk b = fzk.a("is_setup_wizard");

    public final Intent a() {
        return new Intent("com.google.android.gsf.notouch.LAUNCH_AUTH_UI").setPackage("com.google.android.gsf.notouch");
    }

    public final boolean b(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") || context.getPackageManager().hasSystemFeature("android.software.leanback") || a(context);
    }

    public final void a(gmz gmz) {
        gmz.setContentView(LayoutInflater.from(gmz).inflate(R.layout.auth_tv_suw_glif_activity, (ViewGroup) null));
    }

    public final void a(gmz gmz, Intent intent) {
        if ((((Boolean) gmz.f().a(b, false)).booleanValue() || (intent != null && intent.getBooleanExtra("is_setup_wizard", false))) && jkr.g()) {
            hxj hxj = hxj.a;
            if (hxz.j(gmz) >= 12800000) {
                gmz.setTheme(R.style.TvMinuteMaidOpaqueSuw);
                return;
            }
        }
        gmz.setTheme(R.style.TvMinuteMaidOpaque);
    }

    @Deprecated
    public final boolean a(Context context) {
        return context.getPackageManager().resolveService(a(), 65536) != null;
    }
}
