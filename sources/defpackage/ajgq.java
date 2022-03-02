package defpackage;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.location.quake.stages.SettingsChangeListener$1;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ajgq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ajgq extends ajgo {
    public static final /* synthetic */ int b = 0;
    protected final Context a;
    private BroadcastReceiver c;

    static {
        jjg.a("QStage");
    }

    public ajgq(Context context, ajgd ajgd) {
        super(ajgd);
        this.a = context;
    }

    protected static boolean c(Context context) {
        List<Account> d = jgu.d(context, context.getPackageName());
        if (d != null && !d.isEmpty()) {
            for (Account a2 : d) {
                try {
                    ReportingState reportingState = (ReportingState) acws.a(rmf.a(context).a(a2), ayab.a.a().connectionlessTimeoutSeconds(), TimeUnit.SECONDS);
                    if (reportingState != null && reportingState.b) {
                        return true;
                    }
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                }
            }
        }
        return false;
    }

    protected static boolean d(Context context) {
        List<Account> d = jgu.d(context, context.getPackageName());
        if (d != null && !d.isEmpty()) {
            for (Account account : d) {
                if (jgu.e(context, account.name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String g() {
        int i = Build.VERSION.SDK_INT;
        return "android.location.MODE_CHANGED";
    }

    public final int a() {
        if (!e()) {
            return !f() ? 3 : 2;
        }
        return 1;
    }

    public final void b() {
        SettingsChangeListener$1 settingsChangeListener$1 = new SettingsChangeListener$1(this, "location");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(g());
        intentFilter.addAction("com.google.android.gms.phenotype.COMMITTED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        intentFilter.addAction("com.google.android.gms.location.reporting.SETTINGS_CHANGED");
        this.a.registerReceiver(settingsChangeListener$1, intentFilter);
        this.c = settingsChangeListener$1;
    }

    public final void c() {
        BroadcastReceiver broadcastReceiver = this.c;
        if (broadcastReceiver != null) {
            this.a.unregisterReceiver(broadcastReceiver);
        }
    }

    public boolean e() {
        if (aeed.a(this.a.getContentResolver(), "network_location_opt_in", -1) != 1 || !jgu.f(ihs.b()) || !jjm.a(this.a)) {
            return true;
        }
        return false;
    }

    public boolean f() {
        if (!rns.b(this.a) || rns.e(this.a)) {
            return true;
        }
        return false;
    }
}
