package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.chimera.Activity;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: why  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class why {
    public static String a(Context context) {
        long j;
        ModuleManager.ModuleApkInfo moduleApkInfo = ModuleManager.get(context).getCurrentModule().moduleApk;
        try {
            j = ((Long) moduleApkInfo.getClass().getDeclaredField("apkTimestamp").get(moduleApkInfo)).longValue();
        } catch (Exception e) {
            j = 0;
        }
        StringBuilder sb = new StringBuilder();
        if (j > 0) {
            sb.append("Build Time: ");
            sb.append(DateFormat.getDateTimeInstance().format(new Date(j)));
            sb.append("\n");
        }
        sb.append("GMSCore Version: ");
        sb.append(moduleApkInfo.apkVersionName);
        sb.append("\nSharing Version: ");
        sb.append(ayni.Q());
        sb.append("\nDevice Type: ");
        sb.append(ayni.j());
        sb.append("\nAccount Type: ");
        sb.append(ayni.b());
        return sb.toString();
    }

    private static ThemeSettings b(Context context) {
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = (!jkr.h() || (context.getResources().getConfiguration().uiMode & 48) != 32) ? 0 : 2;
        return themeSettings;
    }

    private static FeedbackOptions c(Activity activity, Account account) {
        mwc mwc = new mwc();
        mwc.c = "com.google.android.gms.nearby.sharing.FEEDBACK";
        mwc.e = b(activity);
        mwq mwq = new mwq();
        mwq.a = "NearbySharing:* NearbyConnections:* NearbyMediums:* AudioModem:* Nearby:* AndroidRuntime:* *:S";
        mwc.f = new LogOptions(mwq.a, true);
        mwc.a("culprit_module", "nearby", !ayni.v());
        if (account != null) {
            mwc.a = account.name;
        }
        Bitmap a = whr.a(activity);
        if (a != null) {
            mwc.b(a);
        }
        if (ayni.v()) {
            mwc.a((mum) new whx(activity, ".chimera.PersistentApiService", ".nearby.connection.service.NearbyConnectionsAndroidService", ".nearby.sharing.SetupActivity", ".nearby.sharing.ConsentsActivity", ".nearby.sharing.ContactSelectActivity", ".nearby.sharing.DirectShareService", ".nearby.sharing.ShareSheetActivity", ".nearby.sharing.InternalShareSheetActivity", ".nearby.sharing.ReceiveSurfaceActivity", ".nearby.sharing.InternalReceiveSurfaceActivity", ".nearby.sharing.ReceiveSurfaceService", ".nearby.sharing.SharingTileService"), false);
        }
        return mwc.a();
    }

    public static void b(Activity activity, Account account) {
        mvd.a(activity).a(c(activity, account));
    }

    public static void a(Activity activity, Account account) {
        if (!ayni.a.a().aG()) {
            GoogleHelp googleHelp = new GoogleHelp(ayni.a.a().af());
            googleHelp.q = Uri.parse(arzd.a(ayni.t()));
            googleHelp.s = b(activity);
            googleHelp.a(c(activity, account), activity.getContainerActivity().getCacheDir());
            new nyw(activity).a(googleHelp.a());
            return;
        }
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(arzd.a(ayni.t()))));
    }
}
