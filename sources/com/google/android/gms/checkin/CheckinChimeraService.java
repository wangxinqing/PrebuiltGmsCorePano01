package com.google.android.gms.checkin;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.checkin.eventlog.EventLogChimeraService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CheckinChimeraService extends qwf {
    public static final iwd a = gzk.a("CheckinChimeraService");
    private static final String b = String.format("https://%s/checkin", new Object[]{jli.a("gms.checkin.sw_domain", "android.clients.google.com")});
    private static volatile boolean h = false;
    private static final Object i = new Object();
    private static final ReentrantLock j = new ReentrantLock();
    private static Bundle k = null;
    private amri c = ampu.a;
    private final Object d = new Object();
    private gxz e;
    private int g = 0;
    private gyk l;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ImposeReceiver extends acsb {
        public final void onReceive(Context context, Intent intent) {
            iwd iwd = CheckinChimeraService.a;
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("launching from ImposeReceiver: ");
            sb.append(valueOf);
            iwd.a(sb.toString(), new Object[0]);
            CheckinChimeraService.a(6, intent);
            CheckinChimeraService.a(context, false, 10, false, true, intent);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SecretCodeReceiver extends acsb {
        public final void onReceive(Context context, Intent intent) {
            CheckinChimeraService.a(5, intent);
            CheckinChimeraService.a(context, true, 8, false, false, intent);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class TriggerReceiver extends acsb {
        public final void onReceive(Context context, Intent intent) {
            boolean z;
            boolean z2;
            int i;
            if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction()) || intent.hasCategory("android.server.checkin.CHECKIN")) {
                if ("android.intent.action.SIM_STATE_CHANGED".equals(intent.getAction())) {
                    if (aeeg.a(context.getContentResolver(), "checkin_trigger_on_sim_change", false)) {
                        String stringExtra = intent.getStringExtra("ss");
                        if (!"LOADED".equals(stringExtra) && !"ABSENT".equals(stringExtra)) {
                            iwd iwd = CheckinChimeraService.a;
                            String valueOf = String.valueOf(intent);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(stringExtra).length());
                            sb.append("Ignored SIM state change trigger: ");
                            sb.append(valueOf);
                            sb.append(" sim state: ");
                            sb.append(stringExtra);
                            iwd.a(sb.toString(), new Object[0]);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                iwd iwd2 = CheckinChimeraService.a;
                String valueOf2 = String.valueOf(intent);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                sb2.append("launching from TriggerReceiver: ");
                sb2.append(valueOf2);
                iwd2.a(sb2.toString(), new Object[0]);
                String action = intent.getAction();
                int i2 = 9;
                if (action != null) {
                    boolean z3 = true;
                    if ("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(action)) {
                        i2 = 5;
                    } else if ("com.google.android.c2dm.intent.RECEIVE".equals(action)) {
                        if ("UPLOAD_NONE".equals(intent.getStringExtra("CheckinService_logUploadPolicy"))) {
                            i2 = 17;
                            z3 = false;
                        } else {
                            i2 = 11;
                            z3 = false;
                        }
                    } else if (!"android.app.action.DEVICE_OWNER_CHANGED".equals(action)) {
                        if (intent.hasExtra("CheckinService_onStart_checkinReason")) {
                            i2 = haf.a(intent.getIntExtra("CheckinService_onStart_checkinReason", 8));
                        }
                        z3 = false;
                    } else if (!jhg.g(context)) {
                        i2 = 16;
                    } else {
                        CheckinChimeraService.a.b("Ignoring ACTION_DEVICE_OWNER_CHANGED for ARC++ device", new Object[0]);
                        return;
                    }
                    if ("android.server.checkin.CHECKIN".equals(action)) {
                        z2 = intent.getBooleanExtra("fetchSystemUpdates", false);
                        i = i2;
                        z = z3;
                    } else {
                        i = i2;
                        z = z3;
                        z2 = false;
                    }
                } else {
                    i = 9;
                    z2 = false;
                    z = false;
                }
                CheckinChimeraService.a(4, intent);
                CheckinChimeraService.a(context, false, i, z2, z, intent);
                return;
            }
            iwd iwd3 = CheckinChimeraService.a;
            String valueOf3 = String.valueOf(intent);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 19);
            sb3.append("Ignored a trigger: ");
            sb3.append(valueOf3);
            iwd3.a(sb3.toString(), new Object[0]);
        }
    }

    static final Bundle a(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null || bundle2.isEmpty()) {
            return bundle;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (bundle2.getBoolean("CheckinService_fetchSystemUpdates", false)) {
            bundle.putBoolean("CheckinService_fetchSystemUpdates", true);
        }
        if (bundle2.getBoolean("CheckinService_forceCheckin", false)) {
            bundle.putBoolean("CheckinService_forceCheckin", true);
        }
        if (bundle2.getBoolean("checkin_source_force")) {
            bundle.putBoolean("checkin_source_force", true);
            if (bundle2.containsKey("checkin_source_package")) {
                bundle.putString("checkin_source_package", bundle2.getString("checkin_source_package"));
            }
            if (bundle2.containsKey("checkin_source_class")) {
                bundle.putString("checkin_source_class", bundle2.getString("checkin_source_class"));
            }
        }
        if (bundle2.containsKey("CheckinService_networkRequest") && d()) {
            bundle.putParcelable("CheckinService_networkRequest", bundle2.getParcelable("CheckinService_networkRequest"));
        }
        return bundle;
    }

    private static String b(Bundle bundle) {
        return bundle.getString("checkin_task_tag", "Default Task");
    }

    private static int c(Bundle bundle) {
        return bundle.getInt("checkin_start_id", 0);
    }

    public static String d(Context context) {
        return Long.toString(gwk.b(context));
    }

    private final boolean e() {
        if (jkr.e()) {
            try {
                if (Settings.Global.getInt(getContentResolver(), "euicc_provisioned") == 1) {
                    return true;
                }
                return false;
            } catch (Settings.SettingNotFoundException e2) {
            }
        }
        return false;
    }

    private final String f() {
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
        String simSerialNumber = telephonyManager.getSimSerialNumber();
        String subscriberId = telephonyManager.getSubscriberId();
        if (simSerialNumber == null) {
            simSerialNumber = "no-sim";
        }
        if (subscriberId == null) {
            subscriberId = "no-imsi";
        }
        StringBuilder sb = new StringBuilder(simSerialNumber.length() + 1 + subscriberId.length());
        sb.append(simSerialNumber);
        sb.append("\n");
        sb.append(subscriberId);
        return sb.toString();
    }

    public final void aH() {
        a.b("onInitializeTasks", new Object[0]);
        a((Context) this);
        EventLogChimeraService.a(false, (Context) this);
    }

    public final IBinder onBind(Intent intent) {
        if (intent != null) {
            iwd iwd = a;
            String valueOf = String.valueOf(intent.getAction());
            iwd.a(valueOf.length() == 0 ? new String("onBind: ") : "onBind: ".concat(valueOf), new Object[0]);
            if (amrk.b(intent.getAction()).equals("com.google.android.gms.checkin.BIND_TO_SERVICE")) {
                gyk gyk = this.l;
                gyk.asBinder();
                return gyk;
            } else if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction()) || "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(intent.getAction())) {
                return super.onBind(intent);
            }
        }
        a.d("onBind is called with an unexpected intent, returning null.", new Object[0]);
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.l = new gyk(this);
        this.e = new gxz();
    }

    public final void onDestroy() {
        c();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        Intent intent2 = intent;
        int i4 = i3;
        a.c("onStartCommand", new Object[0]);
        Context applicationContext = getApplicationContext();
        jnl.b(applicationContext);
        boolean a2 = aeeg.a(applicationContext.getContentResolver(), "checkin_services_start_not_sticky", false);
        if (!jnl.a(applicationContext)) {
            a.c("notEnabled return:%d", 2);
            return 2;
        } else if (intent2 == null) {
            Bundle bundle = new Bundle();
            if (a2) {
                a(bundle, (Context) this, "com.google.android.gms.checkin.CheckinService");
                a.c("Start not sticky return:%d", 2);
                return 2;
            }
            a(bundle, "AutoRestartTaskTag");
            a(bundle, i4);
            f(bundle);
            a.c("Run checkin on new thread with null intent return:%d", 1);
            return 1;
        } else {
            Bundle bundle2 = intent.getExtras() == null ? new Bundle() : intent.getExtras();
            if ("com.google.android.gms.checkin.SHOW_NOTIFICATION".equals(intent.getAction())) {
                String string = bundle2.getString("show_notification_message", "checkin finished");
                je jeVar = new je(this);
                jeVar.b(17301642);
                jeVar.a(System.currentTimeMillis());
                jeVar.d(string);
                jeVar.a(true);
                jeVar.e(string);
                iwq.a((Context) this).a(17301642, jeVar.b());
                if (bundle2.containsKey("show_notification_start_id")) {
                    stopSelfResult(bundle2.getInt("show_notification_start_id"));
                }
                if (a2) {
                    a.c("Notification non-sticky return:%d", 2);
                    return 2;
                }
                a.c("Notification sticky return:%d", 1);
                return 1;
            } else if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction()) || "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(intent.getAction())) {
                int onStartCommand = super.onStartCommand(intent, i2, i3);
                a.c("Gcm task onStartCommand return:%d", Integer.valueOf(onStartCommand));
                return onStartCommand;
            } else {
                if (haf.a(bundle2.getInt("CheckinService_onStart_checkinReason", 0)) == 2) {
                    a(gwk.l(this), 0, 0, 0);
                }
                a(bundle2, i4);
                if (intent2.getBooleanExtra("CheckinService_runRequestQueue", false)) {
                    gvn a3 = gvn.a();
                    gxy gxy = null;
                    while (true) {
                        guy guy = (guy) a3.a.poll();
                        if (guy == null) {
                            break;
                        }
                        if (guy.a != null) {
                            gxy = this.e.a();
                            Bundle bundle3 = guy.a;
                            a(bundle3, "RunRequestQueueTaskTag");
                            bundle3.putInt("CheckinService_onStart_checkinReason", 8);
                            f(bundle3);
                        } else if (j.isLocked()) {
                            gxy = this.e.a();
                        }
                        if (gxy == null) {
                            guy.a(21042);
                        } else {
                            if (guy.c == null) {
                                gxy.a();
                            }
                            gxy.a(guy);
                            if (!guy.b) {
                                gxy.a(true, System.currentTimeMillis());
                            }
                        }
                    }
                    if (!a2) {
                        a.c("Run API request return:%d", 3);
                        return 3;
                    }
                    a.c("Run API request return:%d", 2);
                    return 2;
                }
                a(bundle2, "CheckinNowTaskTag");
                b();
                acsb.a(this, intent);
                f(bundle2);
                a.c("Run checkin on new thread return:%d", 1);
                return 1;
            }
        }
    }

    private final void b() {
        synchronized (this.d) {
            if (!this.c.a()) {
                this.c = amri.b(new acrz(this, 1, "Checkin Service", (String) null, "com.google.android.gms"));
            }
            if (this.c.a() && ((acrz) this.c.b()).e()) {
                a.c("Acquire service wakelock.", new Object[0]);
                long o = awrq.o();
                ((acrz) this.c.b()).a(false);
                ((acrz) this.c.b()).a(o);
            }
        }
    }

    private final void c() {
        synchronized (this.d) {
            if (this.c.a()) {
                try {
                    if (((acrz) this.c.b()).e()) {
                        a.c("Release service wakelock.", new Object[0]);
                        ((acrz) this.c.b()).c();
                    }
                } catch (RuntimeException e2) {
                    iwd iwd = a;
                    String valueOf = String.valueOf(e2.getMessage());
                    iwd.d(valueOf.length() == 0 ? new String("Caught exception releasing Checkin Service Wakelock: ") : "Caught exception releasing Checkin Service Wakelock: ".concat(valueOf), new Object[0]);
                }
                this.c = ampu.a;
            }
        }
    }

    private final void f(Bundle bundle) {
        a.c("runCheckinOnNewThread", new Object[0]);
        if (!e(bundle)) {
            a.c("Checkin is not queued to run.", new Object[0]);
            return;
        }
        gvr.a();
        gvr.a.execute(new gvp(this, bundle));
    }

    private static boolean d() {
        int i2 = Build.VERSION.SDK_INT;
        return awrq.s();
    }

    private final boolean e(Bundle bundle) {
        Bundle bundle2 = bundle;
        synchronized (i) {
            a.c("Check queued to run. Is task waiting: %s", Boolean.valueOf(h));
            if (!h) {
                int i2 = bundle2.getInt("CheckinService_onStart_checkinReason", 0);
                if (aeeg.a(getContentResolver(), "checkin_enable_package_level_rate_limiting", false)) {
                    String string = bundle2.getString("checkin_source_package", "unspecified");
                    SharedPreferences l2 = gwk.l(getApplicationContext());
                    String valueOf = String.valueOf(string);
                    long j2 = l2.getLong(valueOf.length() == 0 ? new String("CheckinService_last_checkin_ms_") : "CheckinService_last_checkin_ms_".concat(valueOf), 0);
                    ContentResolver contentResolver = getContentResolver();
                    String valueOf2 = String.valueOf(string);
                    long a2 = aeeg.a(contentResolver, valueOf2.length() == 0 ? new String("checkin_min_interval_ms_") : "checkin_min_interval_ms_".concat(valueOf2), 0);
                    long max = Math.max(System.currentTimeMillis() - j2, 0);
                    a.c("CheckinChimeraService", String.format("Checkin interval check for package: %s last checkin: %s min interval config: %s actual interval: %s", new Object[]{string, Long.valueOf(j2), Long.valueOf(a2), Long.valueOf(max)}));
                    if (max < a2) {
                        if (awrq.i()) {
                            int i3 = 19;
                            if (string != null) {
                                if (!string.equals("unspecified")) {
                                    i3 = 275;
                                }
                            }
                            gwd.a((i2 << 9) | i3);
                        }
                        a.c("High frequency skip needed", new Object[0]);
                    }
                }
                long a3 = aeeg.a(getContentResolver(), "checkin_high_frequency_limit_ms", 30000);
                int a4 = aeeg.a(getContentResolver(), "checkin_high_frequency_allowance", 3);
                SharedPreferences l3 = gwk.l(getApplicationContext());
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = l3.getLong("HighFrequency_LastTimestampMs", 0);
                Long valueOf3 = Long.valueOf(l3.getLong("HighFrequency_SumMs", 0));
                int i4 = l3.getInt("HighFrequency_Count", 0);
                long j4 = currentTimeMillis - j3;
                if (i4 != 0) {
                    if (j4 <= a3) {
                        Long valueOf4 = Long.valueOf(valueOf3.longValue() + j4);
                        int i5 = i4 + 1;
                        long max2 = Math.max(0, ((((long) (i5 - a4)) * a3) - ((long) valueOf4.intValue())) / ((long) i5));
                        a(l3, currentTimeMillis, i5, (long) Long.valueOf(valueOf4.longValue() + max2).intValue());
                        if (d(bundle)) {
                            max2 = 0;
                        }
                        a(bundle2, max2, a3);
                        h = true;
                        return true;
                    }
                }
                a(l3, currentTimeMillis, 1, 0);
                a(bundle2, 0, a3);
                h = true;
                return true;
            }
            k = a(k, bundle2);
            return false;
        }
    }

    public static void b(Context context) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.checkin.CheckinService");
        className.putExtra("CheckinService_runRequestQueue", true);
        acsb.b(context, className);
    }

    private static boolean d(Bundle bundle) {
        return bundle != null && bundle.getBoolean("CheckinService_forceCheckin", false);
    }

    public static boolean c(Context context) {
        return !gwk.l(context).getStringSet("CheckinService_accountsReceivedByServer", Collections.emptySet()).isEmpty();
    }

    private static String a(Account account) {
        return new JSONObject().put("authAccount", account.name).put("accountType", account.type).toString();
    }

    static qxj a(Bundle bundle, boolean z, Context context, String str) {
        long a2 = aeeg.a(context.getContentResolver(), "checkin_interval", 43200);
        long min = Math.min(aeeg.a(context.getContentResolver(), "checkin_interval_flex_sec", 10800), a2);
        SharedPreferences.Editor edit = gwk.l(context).edit();
        edit.putLong("CheckinInterval_IntervalSeconds", a2);
        edit.putLong("CheckinInterval_FlexSec", min);
        edit.apply();
        qxi qxi = new qxi();
        qxi.k = "PeriodicTaskTag";
        qxi.b(z);
        qxi.i = str;
        qxi.n = true;
        qxi.b(0, 0);
        qxi.a(0, 0);
        qxi.a(false);
        qxi.a = a2;
        qxi.b = min;
        qxi.s = bundle;
        return qxi.b();
    }

    public static void a(int i2, Intent intent) {
        String str;
        if (awrq.i()) {
            int i3 = 4;
            int i4 = (i2 << 4) | 1;
            if (intent != null) {
                str = intent.getAction();
            } else {
                str = null;
            }
            if (str == null) {
                i3 = 1;
            } else if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(str)) {
                i3 = 3;
            } else if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(str)) {
                i3 = !"android.net.conn.BACKGROUND_DATA_SETTING_CHANGED".equals(str) ? !"com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(str) ? !"com.google.android.c2dm.intent.RECEIVE".equals(str) ? !"android.app.action.DEVICE_OWNER_CHANGED".equals(str) ? "android.intent.action.SIM_STATE_CHANGED".equals(str) ? 9 : 2 : 8 : 6 : 7 : 5;
            }
            gwd.a(i4 | (i3 << 8));
        }
    }

    static void a(Context context) {
        qwq a2 = qwq.a(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("CheckinService_onStart_showNotification", false);
        bundle.putInt("CheckinService_onStart_checkinReason", 8);
        a2.a((qxx) a(bundle, false, context, "com.google.android.gms.checkin.CheckinService"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qvz(Uri.parse("content://com.google.android.gsf.gservices"), 1));
        qwa qwa = new qwa();
        qwa.k = "GServicesObserverTaskTag";
        qwa.b(1);
        qwa.i = "com.google.android.gms.checkin.CheckinService";
        qwa.n = false;
        qwa.b(0, 0);
        qwa.a(0, 0);
        qwa.a(false);
        qwa.a((Collection) arrayList);
        qwa.s = bundle;
        a2.a((qxx) qwa.b());
    }

    public static void a(Context context, String str) {
        String string = gwk.l(context).getString("CheckinService_lastSimOperator", "");
        if (str != null && !string.equals(str)) {
            gwk.l(context).edit().putString("CheckinService_lastSimOperator", str).apply();
        }
    }

    static void a(Context context, boolean z, int i2, boolean z2, boolean z3, Intent intent) {
        boolean z4;
        String str;
        String str2;
        boolean z5;
        Context context2 = context;
        boolean z6 = z;
        boolean z7 = z2;
        Intent intent2 = intent;
        Intent className = new Intent().setClassName(context2, "com.google.android.gms.checkin.CheckinService");
        className.putExtra("CheckinService_onStart_showNotification", z6);
        int i3 = i2 - 1;
        if (i2 != 0) {
            className.putExtra("CheckinService_onStart_checkinReason", i3);
            className.putExtra("CheckinService_fetchSystemUpdates", z7);
            String str3 = "";
            if (intent2 == null) {
                str2 = "UPLOAD_ALL";
                str = "unspecified";
                z4 = false;
            } else {
                if (intent2.hasExtra("checkin_source_package")) {
                    str = amrk.b(intent2.getStringExtra("checkin_source_package"));
                } else {
                    str = "unspecified";
                }
                if (intent2.hasExtra("checkin_source_class")) {
                    str3 = amrk.b(intent2.getStringExtra("checkin_source_class"));
                }
                if (intent2.hasExtra("checkin_source_force")) {
                    z4 = intent2.getBooleanExtra("checkin_source_force", false);
                } else {
                    z4 = false;
                }
                str2 = intent2.hasExtra("CheckinService_logUploadPolicy") ? amrk.b(intent2.getStringExtra("CheckinService_logUploadPolicy")) : "UPLOAD_ALL";
            }
            className.putExtra("checkin_source_package", str);
            className.putExtra("checkin_source_class", str3);
            className.putExtra("checkin_source_force", z4);
            if (intent2 != null) {
                className.putExtra("checkin_source_intent_action", amrk.b(intent.getAction()));
            }
            if (z3) {
                z5 = true;
            } else {
                z5 = z4;
            }
            className.putExtra("CheckinService_forceCheckin", z5);
            className.putExtra("CheckinService_logUploadPolicy", str2);
            if (awrq.i()) {
                int i4 = i3 == 1 ? 18 : 2;
                if (!str2.equals("UPLOAD_ALL")) {
                    str2.equals("UPLOAD_NONE");
                }
                if (z4) {
                    i4 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                if (!str.equals("unspecified")) {
                    i4 |= 512;
                }
                if (!TextUtils.isEmpty(str3)) {
                    i4 |= 1024;
                }
                int i5 = i4 | 14336;
                if (z6) {
                    i5 |= 16384;
                }
                int i6 = 32768 | i5 | ((i3 << 16) & 255);
                if (z7) {
                    i6 |= 16777216;
                }
                gwd.a(i6);
            }
            if (awrq.t()) {
                Bundle extras = className.getExtras();
                if (extras == null) {
                    acsb.b(context2, gyx.a(context));
                } else {
                    acsb.b(context2, gyx.a(context2, extras));
                }
            } else {
                acsb.b(context2, className);
            }
        } else {
            throw null;
        }
    }

    private static void a(SharedPreferences sharedPreferences, long j2, int i2, long j3) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("HighFrequency_Count", i2);
        edit.putLong("HighFrequency_SumMs", j3);
        edit.putLong("HighFrequency_LastTimestampMs", j2);
        edit.apply();
    }

    private static void a(Bundle bundle, int i2) {
        bundle.putInt("checkin_start_id", i2);
    }

    private static void a(Bundle bundle, long j2, long j3) {
        bundle.putLong("high_frequency_delay", Math.min(j2, j3));
    }

    static final void a(Bundle bundle, Context context, String str) {
        qwq a2 = qwq.a(context);
        ContentResolver contentResolver = context.getContentResolver();
        long a3 = aeeg.a(contentResolver, "checkin_retry_task_start_delay_secs", 30);
        long a4 = aeeg.a(contentResolver, "checkin_retry_task_end_delay_secs", 120);
        int a5 = aeeg.a(contentResolver, "checkin_retry_task_initial_backoff_secs", 7200);
        int a6 = aeeg.a(contentResolver, "checkin_retry_task_max_backoff_secs", 82800);
        qxk qxk = new qxk();
        qxk.b = a5;
        qxk.c = a6;
        qxk.a = 0;
        qxl a7 = qxk.a();
        qxf qxf = new qxf();
        qxf.a(a3, a4);
        qxf.k = "RetryTaskTag";
        qxf.i = str;
        qxf.b(1);
        qxf.n = true;
        qxf.b(0, 0);
        qxf.a(0, 0);
        qxf.a(false);
        qxf.s = bundle;
        qxf.r = a7;
        a2.a((qxx) qxf.b());
    }

    private static void a(Bundle bundle, String str) {
        bundle.putString("checkin_task_tag", str);
    }

    public static boolean a(Context context, Account account) {
        try {
            return gwk.l(context).getStringSet("CheckinService_accountsReceivedByServer", Collections.emptySet()).contains(a(account));
        } catch (JSONException e2) {
            return false;
        }
    }

    public final int a(qxz qxz) {
        String str = qxz.a;
        iwd iwd = a;
        String valueOf = String.valueOf(str);
        iwd.b(valueOf.length() == 0 ? new String("onRunTask with tag: ") : "onRunTask with tag: ".concat(valueOf), new Object[0]);
        Bundle bundle = qxz.b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        a(bundle, str);
        if ("GServicesObserverTaskTag".equals(str)) {
            SharedPreferences l2 = gwk.l(this);
            long j2 = l2.getLong("CheckinInterval_IntervalSeconds", 0);
            long j3 = l2.getLong("CheckinInterval_FlexSec", 0);
            long a2 = aeeg.a(getContentResolver(), "checkin_interval", j2);
            long a3 = aeeg.a(getContentResolver(), "checkin_interval_flex_sec", j3);
            if (!(j2 == a2 && j3 == a3)) {
                qwq.a((Context) this).a((qxx) a((Bundle) null, true, (Context) this, "com.google.android.gms.checkin.CheckinService"));
            }
            EventLogChimeraService.a(l2, (Context) this);
            return 1;
        } else if (awrq.t()) {
            startService(gyx.a(this, bundle));
            return 0;
        } else if (e(bundle)) {
            a(bundle);
            return 0;
        } else if (!"RetryTaskTag".equals(str)) {
            return 0;
        } else {
            return 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2.putLong("start_timestamp", java.lang.System.currentTimeMillis());
        r13 = r2.getLong("high_frequency_delay", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c3, code lost:
        if (r13 > 0) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        java.lang.Thread.sleep(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r15 = a;
        r11 = new java.lang.StringBuilder(72);
        r11.append("Error in sleep during high frequency request delay: ");
        r11.append(r13);
        r15.d(r11.toString(), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0905, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0906, code lost:
        r18 = r4;
        r17 = r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0349 A[Catch:{ NoSuchMethodException -> 0x0322, IllegalAccessException -> 0x0303, InvocationTargetException -> 0x02ec, all -> 0x01b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0358 A[Catch:{ NoSuchMethodException -> 0x0322, IllegalAccessException -> 0x0303, InvocationTargetException -> 0x02ec, all -> 0x01b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x037c A[SYNTHETIC, Splitter:B:155:0x037c] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03ad A[Catch:{ NoSuchMethodException -> 0x0322, IllegalAccessException -> 0x0303, InvocationTargetException -> 0x02ec, all -> 0x01b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0445 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0446 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x047a A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x047c A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x047f A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x048a A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x048f A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04a2 A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04ea A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x04eb A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04fd A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0505 A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x051f A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0520 A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x053d A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x056f A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0593 A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x05be A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x05df A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x05e9 A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x05f8 A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x06d2 A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x06d3 A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0745 A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x074c A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0773 A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x07c2 A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x07c3 A[Catch:{ all -> 0x0901 }] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x07df A[Catch:{ all -> 0x08f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x07e1 A[Catch:{ all -> 0x08f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x07e6 A[Catch:{ all -> 0x08f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x083c A[Catch:{ all -> 0x08f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x0888  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x08aa  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x08b3  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x094e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0182 A[SYNTHETIC, Splitter:B:60:0x0182] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019f A[SYNTHETIC, Splitter:B:73:0x019f] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b2 A[SYNTHETIC, Splitter:B:77:0x01b2] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01fb A[Catch:{ NoSuchMethodException -> 0x0322, IllegalAccessException -> 0x0303, InvocationTargetException -> 0x02ec, all -> 0x01b0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.os.Bundle r31) {
        /*
            r30 = this;
            r1 = r30
            r2 = r31
            java.lang.String r3 = b((android.os.Bundle) r31)
            jnl r4 = defpackage.jnl.a()
            iwd r5 = a
            java.lang.String r6 = "CheckinService_onStart_checkinReason"
            r7 = -1
            int r6 = r2.getInt(r6, r7)
            boolean r7 = d((android.os.Bundle) r31)
            int r4 = r4.c()
            java.lang.String r8 = java.lang.String.valueOf(r3)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r8 = r8 + 78
            r9.<init>(r8)
            java.lang.String r8 = "Starting Checkin Task: "
            r9.append(r8)
            r9.append(r3)
            java.lang.String r8 = " Reason : "
            r9.append(r8)
            r9.append(r6)
            java.lang.String r6 = " Force : "
            r9.append(r6)
            r9.append(r7)
            java.lang.String r6 = " UserId: "
            r9.append(r6)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r5.c(r4, r7)
            r30.b()
            long r4 = android.os.SystemClock.elapsedRealtime()
            iwd r7 = a
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            r9[r6] = r10
            java.lang.String r10 = "CheckinTask started at: %d."
            r7.b(r10, r9)
            gvx r7 = new gvx
            r7.<init>()
            gzh r9 = new gzh
            amtd r10 = defpackage.ampt.a
            r9.<init>(r1, r10)
            r9.a((android.os.Bundle) r2)
            r10 = 2
            r9.b(r10)
            java.util.concurrent.locks.ReentrantLock r11 = j
            r11.lock()
            r11 = 0
            r9.g()     // Catch:{ all -> 0x0905 }
            java.lang.Object r13 = i     // Catch:{ all -> 0x0905 }
            monitor-enter(r13)     // Catch:{ all -> 0x0905 }
            android.os.Bundle r14 = k     // Catch:{ all -> 0x08f9 }
            android.os.Bundle r14 = a((android.os.Bundle) r2, (android.os.Bundle) r14)     // Catch:{ all -> 0x08f9 }
            amri r14 = defpackage.amri.c(r14)     // Catch:{ all -> 0x08f9 }
            boolean r15 = r14.a()     // Catch:{ all -> 0x08f9 }
            if (r15 == 0) goto L_0x00ac
            java.lang.Object r2 = r14.b()     // Catch:{ all -> 0x00a4 }
            android.os.Bundle r2 = (android.os.Bundle) r2     // Catch:{ all -> 0x00a4 }
            goto L_0x00ac
        L_0x00a4:
            r0 = move-exception
            r2 = r0
            r18 = r4
            r17 = r7
            goto L_0x08ff
        L_0x00ac:
            r14 = 0
            k = r14     // Catch:{ all -> 0x08f9 }
            h = r6     // Catch:{ all -> 0x08f9 }
            monitor-exit(r13)     // Catch:{ all -> 0x08f9 }
            java.lang.String r13 = "start_timestamp"
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0905 }
            r2.putLong(r13, r14)     // Catch:{ all -> 0x0905 }
            java.lang.String r13 = "high_frequency_delay"
            long r13 = r2.getLong(r13, r11)     // Catch:{ all -> 0x0905 }
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 > 0) goto L_0x00c6
            goto L_0x00ed
        L_0x00c6:
            java.lang.Thread.sleep(r13)     // Catch:{ InterruptedException -> 0x00d2 }
            goto L_0x00ed
        L_0x00ca:
            r0 = move-exception
            r2 = r0
            r18 = r4
            r17 = r7
            goto L_0x090b
        L_0x00d2:
            r0 = move-exception
            iwd r15 = a     // Catch:{ all -> 0x0905 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0905 }
            r12 = 72
            r11.<init>(r12)     // Catch:{ all -> 0x0905 }
            java.lang.String r12 = "Error in sleep during high frequency request delay: "
            r11.append(r12)     // Catch:{ all -> 0x0905 }
            r11.append(r13)     // Catch:{ all -> 0x0905 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0905 }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x0905 }
            r15.d(r11, r12)     // Catch:{ all -> 0x0905 }
        L_0x00ed:
            android.content.ContentResolver r11 = r30.getContentResolver()     // Catch:{ all -> 0x0905 }
            java.lang.String r12 = "checkin_network_available_test_enabled"
            boolean r11 = defpackage.aeeg.a((android.content.ContentResolver) r11, (java.lang.String) r12, (boolean) r6)     // Catch:{ all -> 0x0905 }
            if (r11 == 0) goto L_0x0155
            java.lang.String r11 = "connectivity"
            java.lang.Object r11 = r1.getSystemService(r11)     // Catch:{ all -> 0x00ca }
            android.net.ConnectivityManager r11 = (android.net.ConnectivityManager) r11     // Catch:{ all -> 0x00ca }
            if (r11 != 0) goto L_0x0104
            goto L_0x013b
        L_0x0104:
            android.net.NetworkInfo r11 = r11.getActiveNetworkInfo()     // Catch:{ all -> 0x00ca }
            if (r11 == 0) goto L_0x0129
            iwd r13 = a     // Catch:{ all -> 0x00ca }
            boolean r14 = r11.isConnected()     // Catch:{ all -> 0x00ca }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ca }
            r10 = 46
            r15.<init>(r10)     // Catch:{ all -> 0x00ca }
            java.lang.String r10 = "checked scheduled: connected/background: "
            r15.append(r10)     // Catch:{ all -> 0x00ca }
            r15.append(r14)     // Catch:{ all -> 0x00ca }
            java.lang.String r10 = r15.toString()     // Catch:{ all -> 0x00ca }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x00ca }
            r13.a(r10, r14)     // Catch:{ all -> 0x00ca }
            goto L_0x0132
        L_0x0129:
            iwd r10 = a     // Catch:{ all -> 0x00ca }
            java.lang.String r13 = "checkin scheduled: no active network"
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x00ca }
            r10.a(r13, r14)     // Catch:{ all -> 0x00ca }
        L_0x0132:
            if (r11 == 0) goto L_0x013b
            boolean r10 = r11.isConnected()     // Catch:{ all -> 0x00ca }
            if (r10 == 0) goto L_0x013b
            goto L_0x0155
        L_0x013b:
            gvx r10 = new gvx     // Catch:{ all -> 0x00ca }
            r10.<init>()     // Catch:{ all -> 0x00ca }
            iwd r7 = a     // Catch:{ all -> 0x014e }
            java.lang.String r11 = "Checkin will retry later, network is not available"
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x014e }
            r7.d(r11, r13)     // Catch:{ all -> 0x014e }
            r18 = r4
            r7 = r10
            goto L_0x07db
        L_0x014e:
            r0 = move-exception
            r2 = r0
            r18 = r4
            r7 = r10
            goto L_0x090d
        L_0x0155:
            r9.c()     // Catch:{ all -> 0x0905 }
            android.content.Context r10 = r30.getApplicationContext()     // Catch:{ all -> 0x0905 }
            android.content.SharedPreferences r11 = defpackage.gwk.l(r10)     // Catch:{ all -> 0x0905 }
            java.lang.String r13 = "unspecified"
            java.lang.String r14 = ""
            java.lang.String r15 = "UPLOAD_ALL"
            if (r2 == 0) goto L_0x017b
            java.lang.String r12 = "CheckinService_onStart_checkinReason"
            boolean r12 = r2.containsKey(r12)     // Catch:{ all -> 0x00ca }
            if (r12 == 0) goto L_0x017b
            java.lang.String r12 = "CheckinService_onStart_checkinReason"
            int r12 = r2.getInt(r12, r6)     // Catch:{ all -> 0x00ca }
            int r12 = defpackage.haf.a(r12)     // Catch:{ all -> 0x00ca }
            goto L_0x017c
        L_0x017b:
            r12 = 1
        L_0x017c:
            boolean r16 = defpackage.jiw.a((android.content.Context) r30)     // Catch:{ all -> 0x0905 }
            if (r16 == 0) goto L_0x0197
            iwd r12 = a     // Catch:{ all -> 0x018f }
            java.lang.String r8 = "system was upgraded"
            r17 = r7
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x01b0 }
            r12.a(r8, r7)     // Catch:{ all -> 0x01b0 }
            r12 = 7
            goto L_0x0199
        L_0x018f:
            r0 = move-exception
            r17 = r7
        L_0x0192:
            r2 = r0
            r18 = r4
            goto L_0x090b
        L_0x0197:
            r17 = r7
        L_0x0199:
            boolean r7 = defpackage.gwd.f(r30)     // Catch:{ all -> 0x08f5 }
            if (r7 != 0) goto L_0x01b2
            iwd r7 = a     // Catch:{ all -> 0x01b0 }
            java.lang.String r8 = "Gms missing READ_PHONE_STATE permission, cannot read hw info."
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x01b0 }
            r7.d(r8, r11)     // Catch:{ all -> 0x01b0 }
            r19 = r12
            r22 = r13
            r23 = r14
            goto L_0x03a9
        L_0x01b0:
            r0 = move-exception
            goto L_0x0192
        L_0x01b2:
            boolean r7 = defpackage.jkr.a()     // Catch:{ all -> 0x08f5 }
            if (r7 == 0) goto L_0x0365
            java.lang.String r7 = "phone"
            java.lang.Object r7 = r1.getSystemService(r7)     // Catch:{ all -> 0x01b0 }
            android.telephony.TelephonyManager r7 = (android.telephony.TelephonyManager) r7     // Catch:{ all -> 0x01b0 }
            java.lang.String r8 = "telephony_subscription_service"
            java.lang.Object r8 = r1.getSystemService(r8)     // Catch:{ all -> 0x01b0 }
            android.telephony.SubscriptionManager r8 = (android.telephony.SubscriptionManager) r8     // Catch:{ all -> 0x01b0 }
            java.lang.String r18 = ""
            if (r8 != 0) goto L_0x01d4
            r19 = r12
            r22 = r13
            r23 = r14
            goto L_0x0360
        L_0x01d4:
            if (r7 == 0) goto L_0x035a
            java.util.List r8 = r8.getActiveSubscriptionInfoList()     // Catch:{ all -> 0x01b0 }
            if (r8 != 0) goto L_0x01ef
            iwd r7 = a     // Catch:{ all -> 0x01b0 }
            java.lang.String r8 = "No Subscriptions found on the device"
            r19 = r12
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x01b0 }
            r7.a(r8, r12)     // Catch:{ all -> 0x01b0 }
            java.lang.String r7 = "no-sim"
            r22 = r13
            r23 = r14
            goto L_0x0343
        L_0x01ef:
            r19 = r12
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x01b0 }
        L_0x01f5:
            boolean r12 = r8.hasNext()     // Catch:{ all -> 0x01b0 }
            if (r12 == 0) goto L_0x033d
            java.lang.Object r12 = r8.next()     // Catch:{ all -> 0x01b0 }
            android.telephony.SubscriptionInfo r12 = (android.telephony.SubscriptionInfo) r12     // Catch:{ all -> 0x01b0 }
            if (r12 != 0) goto L_0x0215
            iwd r12 = a     // Catch:{ all -> 0x01b0 }
            java.lang.String r6 = "Null subscription info."
            r21 = r8
            r22 = r13
            r8 = 0
            java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch:{ all -> 0x01b0 }
            r12.a(r6, r13)     // Catch:{ all -> 0x01b0 }
            r23 = r14
            goto L_0x0319
        L_0x0215:
            r21 = r8
            r22 = r13
            int r6 = r12.getSubscriptionId()     // Catch:{ all -> 0x01b0 }
            boolean r8 = defpackage.jkr.c()     // Catch:{ NoSuchMethodException -> 0x0322, IllegalAccessException -> 0x0303, InvocationTargetException -> 0x02ec }
            if (r8 == 0) goto L_0x023e
            android.telephony.TelephonyManager r8 = r7.createForSubscriptionId(r6)     // Catch:{ NoSuchMethodException -> 0x0238, IllegalAccessException -> 0x0232, InvocationTargetException -> 0x022c }
            java.lang.String r8 = r8.getSimSerialNumber()     // Catch:{ NoSuchMethodException -> 0x0238, IllegalAccessException -> 0x0232, InvocationTargetException -> 0x022c }
            goto L_0x0263
        L_0x022c:
            r0 = move-exception
            r6 = r0
            r23 = r14
            goto L_0x02f0
        L_0x0232:
            r0 = move-exception
            r6 = r0
            r23 = r14
            goto L_0x0307
        L_0x0238:
            r0 = move-exception
            r6 = r0
            r23 = r14
            goto L_0x0326
        L_0x023e:
            java.lang.Class<android.telephony.TelephonyManager> r8 = android.telephony.TelephonyManager.class
            r12 = 1
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ NoSuchMethodException -> 0x0322, IllegalAccessException -> 0x0303, InvocationTargetException -> 0x02ec }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0322, IllegalAccessException -> 0x0303, InvocationTargetException -> 0x02ec }
            r20 = 0
            r13[r20] = r12     // Catch:{ NoSuchMethodException -> 0x0322, IllegalAccessException -> 0x0303, InvocationTargetException -> 0x02ec }
            java.lang.String r12 = "getSimSerialNumber"
            java.lang.reflect.Method r8 = r8.getDeclaredMethod(r12, r13)     // Catch:{ NoSuchMethodException -> 0x0322, IllegalAccessException -> 0x0303, InvocationTargetException -> 0x02ec }
            r12 = 1
            r8.setAccessible(r12)     // Catch:{ NoSuchMethodException -> 0x0322, IllegalAccessException -> 0x0303, InvocationTargetException -> 0x02ec }
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ NoSuchMethodException -> 0x0322, IllegalAccessException -> 0x0303, InvocationTargetException -> 0x02ec }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ NoSuchMethodException -> 0x0322, IllegalAccessException -> 0x0303, InvocationTargetException -> 0x02ec }
            r20 = 0
            r13[r20] = r12     // Catch:{ NoSuchMethodException -> 0x0322, IllegalAccessException -> 0x0303, InvocationTargetException -> 0x02ec }
            java.lang.Object r8 = r8.invoke(r7, r13)     // Catch:{ NoSuchMethodException -> 0x0322, IllegalAccessException -> 0x0303, InvocationTargetException -> 0x02ec }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NoSuchMethodException -> 0x0322, IllegalAccessException -> 0x0303, InvocationTargetException -> 0x02ec }
        L_0x0263:
            if (r8 == 0) goto L_0x0266
            goto L_0x0268
        L_0x0266:
            java.lang.String r8 = "no-sim"
        L_0x0268:
            boolean r12 = defpackage.jkr.c()     // Catch:{ NoSuchMethodException -> 0x0322, IllegalAccessException -> 0x0303, InvocationTargetException -> 0x02ec }
            if (r12 == 0) goto L_0x0279
            android.telephony.TelephonyManager r6 = r7.createForSubscriptionId(r6)     // Catch:{ NoSuchMethodException -> 0x0238, IllegalAccessException -> 0x0232, InvocationTargetException -> 0x022c }
            java.lang.String r6 = r6.getSubscriberId()     // Catch:{ NoSuchMethodException -> 0x0238, IllegalAccessException -> 0x0232, InvocationTargetException -> 0x022c }
            r23 = r14
            goto L_0x029f
        L_0x0279:
            java.lang.Class<android.telephony.TelephonyManager> r12 = android.telephony.TelephonyManager.class
            r23 = r14
            r13 = 1
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            r20 = 0
            r14[r20] = r13     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            java.lang.String r13 = "getSubscriberId"
            java.lang.reflect.Method r12 = r12.getDeclaredMethod(r13, r14)     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            r13 = 1
            r12.setAccessible(r13)     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            r13 = 0
            r14[r13] = r6     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            java.lang.Object r6 = r12.invoke(r7, r14)     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
        L_0x029f:
            if (r6 == 0) goto L_0x02a2
            goto L_0x02a4
        L_0x02a2:
            java.lang.String r6 = "no-imsi"
        L_0x02a4:
            java.lang.String r12 = java.lang.String.valueOf(r18)     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            java.lang.String r13 = java.lang.String.valueOf(r12)     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            int r13 = r13.length()     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            r14 = 3
            int r13 = r13 + r14
            int r14 = r8.length()     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            int r13 = r13 + r14
            int r14 = r6.length()     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            int r13 = r13 + r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            r14.<init>(r13)     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            r14.append(r12)     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            java.lang.String r12 = "["
            r14.append(r12)     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            r14.append(r8)     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            java.lang.String r8 = ":"
            r14.append(r8)     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            r14.append(r6)     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            java.lang.String r6 = "]"
            r14.append(r6)     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            java.lang.String r18 = r14.toString()     // Catch:{ NoSuchMethodException -> 0x02ea, IllegalAccessException -> 0x02e8, InvocationTargetException -> 0x02e6 }
            r8 = r21
            r13 = r22
            r14 = r23
            r6 = 0
            goto L_0x01f5
        L_0x02e6:
            r0 = move-exception
            goto L_0x02ef
        L_0x02e8:
            r0 = move-exception
            goto L_0x0306
        L_0x02ea:
            r0 = move-exception
            goto L_0x0325
        L_0x02ec:
            r0 = move-exception
            r23 = r14
        L_0x02ef:
            r6 = r0
        L_0x02f0:
            iwd r8 = a     // Catch:{ all -> 0x01b0 }
            r12 = 2
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ all -> 0x01b0 }
            java.lang.String r12 = "Invocation target exception from TelephonyManager methods for getting SIM IDs"
            r14 = 0
            r13[r14] = r12     // Catch:{ all -> 0x01b0 }
            r12 = 1
            r13[r12] = r6     // Catch:{ all -> 0x01b0 }
            java.lang.String r6 = "CheckinChimeraService"
            r8.d(r6, r13)     // Catch:{ all -> 0x01b0 }
            goto L_0x0319
        L_0x0303:
            r0 = move-exception
            r23 = r14
        L_0x0306:
            r6 = r0
        L_0x0307:
            iwd r8 = a     // Catch:{ all -> 0x01b0 }
            r12 = 2
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ all -> 0x01b0 }
            java.lang.String r12 = "Illegal access exception from TelephonyManager methods for getting SIM IDs"
            r14 = 0
            r13[r14] = r12     // Catch:{ all -> 0x01b0 }
            r12 = 1
            r13[r12] = r6     // Catch:{ all -> 0x01b0 }
            java.lang.String r6 = "CheckinChimeraService"
            r8.d(r6, r13)     // Catch:{ all -> 0x01b0 }
        L_0x0319:
            r8 = r21
            r13 = r22
            r14 = r23
            r6 = 0
            goto L_0x01f5
        L_0x0322:
            r0 = move-exception
            r23 = r14
        L_0x0325:
            r6 = r0
        L_0x0326:
            iwd r7 = a     // Catch:{ all -> 0x01b0 }
            r8 = 2
            java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch:{ all -> 0x01b0 }
            java.lang.String r8 = "NoSuchMethodException from TelephonyManager methods for getting SIM IDs"
            r13 = 0
            r12[r13] = r8     // Catch:{ all -> 0x01b0 }
            r8 = 1
            r12[r8] = r6     // Catch:{ all -> 0x01b0 }
            java.lang.String r6 = "CheckinChimeraService"
            r7.d(r6, r12)     // Catch:{ all -> 0x01b0 }
            java.lang.String r6 = r30.f()     // Catch:{ all -> 0x01b0 }
            goto L_0x036f
        L_0x033d:
            r22 = r13
            r23 = r14
            r7 = r18
        L_0x0343:
            boolean r6 = r7.isEmpty()     // Catch:{ all -> 0x01b0 }
            if (r6 == 0) goto L_0x0358
            iwd r6 = a     // Catch:{ all -> 0x01b0 }
            java.lang.String r7 = "SIM IDs not available by subscription"
            r8 = 0
            java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch:{ all -> 0x01b0 }
            r6.d(r7, r12)     // Catch:{ all -> 0x01b0 }
            java.lang.String r6 = r30.f()     // Catch:{ all -> 0x01b0 }
            goto L_0x036f
        L_0x0358:
            r6 = r7
            goto L_0x036f
        L_0x035a:
            r19 = r12
            r22 = r13
            r23 = r14
        L_0x0360:
            java.lang.String r6 = r30.f()     // Catch:{ all -> 0x01b0 }
            goto L_0x036f
        L_0x0365:
            r19 = r12
            r22 = r13
            r23 = r14
            java.lang.String r6 = r30.f()     // Catch:{ all -> 0x08f5 }
        L_0x036f:
            java.lang.String r7 = "CheckinService_lastSim"
            r8 = 0
            java.lang.String r7 = r11.getString(r7, r8)     // Catch:{ all -> 0x08f5 }
            boolean r7 = r6.equals(r7)     // Catch:{ all -> 0x08f5 }
            if (r7 != 0) goto L_0x03a9
            iwd r7 = a     // Catch:{ all -> 0x01b0 }
            java.lang.String r8 = "subscriberid changed to "
            java.lang.String r12 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x01b0 }
            int r13 = r12.length()     // Catch:{ all -> 0x01b0 }
            if (r13 != 0) goto L_0x0390
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x01b0 }
            r12.<init>(r8)     // Catch:{ all -> 0x01b0 }
            goto L_0x0394
        L_0x0390:
            java.lang.String r12 = r8.concat(r12)     // Catch:{ all -> 0x01b0 }
        L_0x0394:
            r8 = 0
            java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch:{ all -> 0x01b0 }
            r7.a(r12, r13)     // Catch:{ all -> 0x01b0 }
            android.content.SharedPreferences$Editor r7 = r11.edit()     // Catch:{ all -> 0x01b0 }
            java.lang.String r8 = "CheckinService_lastSim"
            android.content.SharedPreferences$Editor r6 = r7.putString(r8, r6)     // Catch:{ all -> 0x01b0 }
            r6.apply()     // Catch:{ all -> 0x01b0 }
            r12 = 6
            goto L_0x03ab
        L_0x03a9:
            r12 = r19
        L_0x03ab:
            if (r2 != 0) goto L_0x03c1
            iwd r6 = a     // Catch:{ all -> 0x01b0 }
            java.lang.String r7 = "System re-creates CheckinService with null intent."
            r8 = 0
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ all -> 0x01b0 }
            r6.c(r7, r11)     // Catch:{ all -> 0x01b0 }
            r27 = r22
            r28 = r23
            r7 = 0
            r8 = 0
            r29 = 0
            goto L_0x0438
        L_0x03c1:
            java.lang.String r6 = "checkin_source_package"
            boolean r6 = r2.containsKey(r6)     // Catch:{ all -> 0x08f5 }
            if (r6 == 0) goto L_0x03d2
            java.lang.String r6 = "checkin_source_package"
            java.lang.String r7 = ""
            java.lang.String r13 = r2.getString(r6, r7)     // Catch:{ all -> 0x01b0 }
            goto L_0x03d4
        L_0x03d2:
            r13 = r22
        L_0x03d4:
            java.lang.String r6 = "checkin_source_class"
            boolean r6 = r2.containsKey(r6)     // Catch:{ all -> 0x08f5 }
            if (r6 == 0) goto L_0x03e5
            java.lang.String r6 = "checkin_source_class"
            java.lang.String r7 = ""
            java.lang.String r14 = r2.getString(r6, r7)     // Catch:{ all -> 0x01b0 }
            goto L_0x03e7
        L_0x03e5:
            r14 = r23
        L_0x03e7:
            java.lang.String r6 = "checkin_source_force"
            boolean r6 = r2.containsKey(r6)     // Catch:{ all -> 0x08f5 }
            if (r6 == 0) goto L_0x03f7
            java.lang.String r6 = "checkin_source_force"
            r7 = 0
            boolean r6 = r2.getBoolean(r6, r7)     // Catch:{ all -> 0x01b0 }
            goto L_0x03f8
        L_0x03f7:
            r6 = 0
        L_0x03f8:
            java.lang.String r7 = "CheckinService_logUploadPolicy"
            boolean r7 = r2.containsKey(r7)     // Catch:{ all -> 0x08f5 }
            if (r7 == 0) goto L_0x0409
            java.lang.String r7 = "CheckinService_logUploadPolicy"
            java.lang.String r8 = "UPLOAD_ALL"
            java.lang.String r15 = r2.getString(r7, r8)     // Catch:{ all -> 0x01b0 }
            goto L_0x040a
        L_0x0409:
        L_0x040a:
            java.lang.String r7 = "CheckinService_fetchSystemUpdates"
            boolean r7 = r2.containsKey(r7)     // Catch:{ all -> 0x08f5 }
            if (r7 == 0) goto L_0x041a
            java.lang.String r7 = "CheckinService_fetchSystemUpdates"
            r8 = 0
            boolean r7 = r2.getBoolean(r7, r8)     // Catch:{ all -> 0x01b0 }
            goto L_0x041b
        L_0x041a:
            r7 = 0
        L_0x041b:
            java.lang.String r8 = "CheckinService_forceCheckin"
            boolean r8 = r2.containsKey(r8)     // Catch:{ all -> 0x08f5 }
            if (r8 != 0) goto L_0x042b
            r29 = r6
            r27 = r13
            r28 = r14
            r8 = 0
            goto L_0x0438
        L_0x042b:
            java.lang.String r8 = "CheckinService_forceCheckin"
            r11 = 0
            boolean r8 = r2.getBoolean(r8, r11)     // Catch:{ all -> 0x08f5 }
            r29 = r6
            r27 = r13
            r28 = r14
        L_0x0438:
            android.content.ContentResolver r6 = r30.getContentResolver()     // Catch:{ all -> 0x08f5 }
            java.lang.String r11 = "Checkin_Init_Last_Sim_To_Null"
            r13 = 0
            boolean r11 = defpackage.aeeg.a((android.content.ContentResolver) r6, (java.lang.String) r11, (boolean) r13)     // Catch:{ all -> 0x08f5 }
            if (r11 != 0) goto L_0x0446
            goto L_0x044b
        L_0x0446:
            java.lang.String r11 = ""
            a((android.content.Context) r10, (java.lang.String) r11)     // Catch:{ all -> 0x08f5 }
        L_0x044b:
            gwp r11 = defpackage.gwr.a((android.content.Context) r10)     // Catch:{ all -> 0x08f5 }
            long r13 = android.os.Build.TIME     // Catch:{ all -> 0x08f5 }
            r18 = r4
            r4 = 1587020400000(0x17181c98580, double:7.84092258889E-312)
            long r4 = java.lang.Math.max(r13, r4)     // Catch:{ all -> 0x0901 }
            r11.a((long) r4)     // Catch:{ all -> 0x0901 }
            boolean r4 = com.google.android.gms.checkin.eventlog.EventLogChimeraService.a((android.content.Context) r10)     // Catch:{ all -> 0x0901 }
            r11.m = r4     // Catch:{ all -> 0x0901 }
            java.lang.String r4 = "Checkin_includedFields"
            r5 = 16383(0x3fff, float:2.2957E-41)
            int r4 = defpackage.aeeg.a((android.content.ContentResolver) r6, (java.lang.String) r4, (int) r5)     // Catch:{ all -> 0x0901 }
            r11.u = r4     // Catch:{ all -> 0x0901 }
            if (r8 == 0) goto L_0x047c
            java.lang.String r4 = "Checkin_Disabled_Streamlined_Mode"
            r5 = 0
            boolean r4 = defpackage.aeeg.a((android.content.ContentResolver) r6, (java.lang.String) r4, (boolean) r5)     // Catch:{ all -> 0x0901 }
            if (r4 != 0) goto L_0x047c
            r4 = 1
            goto L_0x047d
        L_0x047c:
            r4 = 0
        L_0x047d:
            if (r4 == 0) goto L_0x0484
            r5 = 1
            r11.j = r5     // Catch:{ all -> 0x0901 }
            java.lang.String r15 = "UPLOAD_NONE"
        L_0x0484:
            boolean r5 = defpackage.jix.a((android.content.Context) r30)     // Catch:{ all -> 0x0901 }
            if (r5 == 0) goto L_0x048f
            java.lang.String r5 = b     // Catch:{ all -> 0x0901 }
            r11.k = r5     // Catch:{ all -> 0x0901 }
            goto L_0x0499
        L_0x048f:
            boolean r5 = defpackage.jix.b(r30)     // Catch:{ all -> 0x0901 }
            if (r5 == 0) goto L_0x0499
            java.lang.String r5 = "https://checkin.gstatic.com/checkin"
            r11.k = r5     // Catch:{ all -> 0x0901 }
        L_0x0499:
            java.lang.String r5 = "checkin_enable_dnspatcher"
            r8 = 0
            boolean r5 = defpackage.aeeg.a((android.content.ContentResolver) r6, (java.lang.String) r5, (boolean) r8)     // Catch:{ all -> 0x0901 }
            if (r5 == 0) goto L_0x04b5
            gwq r5 = new gwq     // Catch:{ all -> 0x0901 }
            r5.<init>()     // Catch:{ all -> 0x0901 }
            r6 = 1
            r5.b = r6     // Catch:{ all -> 0x0901 }
            java.lang.String r6 = "dns_patcher"
            r8 = 0
            android.content.SharedPreferences r6 = r1.getSharedPreferences(r6, r8)     // Catch:{ all -> 0x0901 }
            r5.a = r6     // Catch:{ all -> 0x0901 }
            r11.h = r5     // Catch:{ all -> 0x0901 }
        L_0x04b5:
            android.content.SharedPreferences r5 = defpackage.gwk.l(r10)     // Catch:{ all -> 0x0901 }
            r11.c = r5     // Catch:{ all -> 0x0901 }
            int r5 = r1.g     // Catch:{ all -> 0x0901 }
            r6 = 1
            int r5 = r5 + r6
            r1.g = r5     // Catch:{ all -> 0x0901 }
            r24 = r11
            r25 = r12
            r26 = r5
            r24.a(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0901 }
            r11.a((java.lang.String) r15)     // Catch:{ all -> 0x0901 }
            r11.f = r7     // Catch:{ all -> 0x0901 }
            boolean r5 = defpackage.awrq.i()     // Catch:{ all -> 0x0901 }
            r6 = 1
            r5 = r5 ^ r6
            r11.g = r5     // Catch:{ all -> 0x0901 }
            java.lang.String r5 = b((android.os.Bundle) r2)     // Catch:{ all -> 0x0901 }
            r11.i = r5     // Catch:{ all -> 0x0901 }
            android.content.ContentResolver r5 = r10.getContentResolver()     // Catch:{ all -> 0x0901 }
            java.lang.String r6 = "checkin_send_euicc_provisioned"
            r7 = 0
            boolean r5 = defpackage.aeeg.a((android.content.ContentResolver) r5, (java.lang.String) r6, (boolean) r7)     // Catch:{ all -> 0x0901 }
            if (r5 != 0) goto L_0x04eb
            goto L_0x04f1
        L_0x04eb:
            boolean r5 = r30.e()     // Catch:{ all -> 0x0901 }
            r11.r = r5     // Catch:{ all -> 0x0901 }
        L_0x04f1:
            amtd r5 = defpackage.ampt.a     // Catch:{ all -> 0x0901 }
            amsn r5 = defpackage.amsn.a((defpackage.amtd) r5)     // Catch:{ all -> 0x0901 }
            boolean r6 = defpackage.awrq.i()     // Catch:{ all -> 0x0901 }
            if (r6 == 0) goto L_0x0500
            r5.d()     // Catch:{ all -> 0x0901 }
        L_0x0500:
            r9.a()     // Catch:{ all -> 0x0901 }
            if (r4 != 0) goto L_0x0516
            java.lang.String r4 = "dropbox"
            java.lang.Object r4 = r1.getSystemService(r4)     // Catch:{ all -> 0x0901 }
            android.os.DropBoxManager r4 = (android.os.DropBoxManager) r4     // Catch:{ all -> 0x0901 }
            r11.b = r4     // Catch:{ all -> 0x0901 }
            boolean r4 = com.google.android.gms.checkin.eventlog.EventLogChimeraService.a((android.content.Context) r30)     // Catch:{ all -> 0x0901 }
            com.google.android.gms.checkin.eventlog.EventLogChimeraService.a((android.content.Context) r1, (boolean) r4)     // Catch:{ all -> 0x0901 }
        L_0x0516:
            r9.b()     // Catch:{ all -> 0x0901 }
            boolean r4 = d()     // Catch:{ all -> 0x0901 }
            if (r4 != 0) goto L_0x0520
            goto L_0x0533
        L_0x0520:
            java.lang.String r4 = "CheckinService_networkRequest"
            boolean r4 = r2.containsKey(r4)     // Catch:{ all -> 0x0901 }
            if (r4 == 0) goto L_0x0533
            java.lang.String r4 = "CheckinService_networkRequest"
            android.os.Parcelable r4 = r2.getParcelable(r4)     // Catch:{ all -> 0x0901 }
            android.net.NetworkRequest r4 = (android.net.NetworkRequest) r4     // Catch:{ all -> 0x0901 }
            r11.a((android.net.NetworkRequest) r4)     // Catch:{ all -> 0x0901 }
        L_0x0533:
            gwr r4 = r11.a()     // Catch:{ all -> 0x0901 }
            boolean r6 = defpackage.awrq.i()     // Catch:{ all -> 0x0901 }
            if (r6 == 0) goto L_0x0566
            r5.e()     // Catch:{ all -> 0x0901 }
            int r6 = r12 + -1
            if (r12 == 0) goto L_0x0563
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0901 }
            long r7 = r5.a((java.util.concurrent.TimeUnit) r7)     // Catch:{ all -> 0x0901 }
            r5 = 2
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x0901 }
            int r5 = r6 << 4
            r5 = r5 | 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0901 }
            r6 = 0
            r10[r6] = r5     // Catch:{ all -> 0x0901 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0901 }
            r6 = 1
            r10[r6] = r5     // Catch:{ all -> 0x0901 }
            defpackage.gwd.a((java.lang.Object[]) r10)     // Catch:{ all -> 0x0901 }
            goto L_0x0566
        L_0x0563:
            r2 = 0
            throw r2     // Catch:{ all -> 0x0901 }
        L_0x0566:
            r9.d()     // Catch:{ all -> 0x0901 }
            boolean r5 = defpackage.awrt.b()     // Catch:{ all -> 0x0901 }
            if (r5 != 0) goto L_0x0593
            gwa r5 = new gwa     // Catch:{ all -> 0x0901 }
            android.content.Context r6 = r30.getApplicationContext()     // Catch:{ all -> 0x0901 }
            boolean r7 = d()     // Catch:{ all -> 0x0901 }
            if (r7 == 0) goto L_0x0581
            gwo r7 = new gwo     // Catch:{ all -> 0x0901 }
            r7.<init>(r4)     // Catch:{ all -> 0x0901 }
            goto L_0x0586
        L_0x0581:
            gwf r7 = new gwf     // Catch:{ all -> 0x0901 }
            r7.<init>(r4)     // Catch:{ all -> 0x0901 }
        L_0x0586:
            gvy r8 = new gvy     // Catch:{ all -> 0x0901 }
            android.content.Context r10 = r30.getApplicationContext()     // Catch:{ all -> 0x0901 }
            r8.<init>(r10)     // Catch:{ all -> 0x0901 }
            r5.<init>(r6, r7, r8)     // Catch:{ all -> 0x0901 }
            goto L_0x05ad
        L_0x0593:
            gwa r5 = new gwa     // Catch:{ all -> 0x0901 }
            android.content.Context r6 = r30.getApplicationContext()     // Catch:{ all -> 0x0901 }
            boolean r7 = d()     // Catch:{ all -> 0x0901 }
            if (r7 == 0) goto L_0x05a5
            gwo r7 = new gwo     // Catch:{ all -> 0x0901 }
            r7.<init>(r4)     // Catch:{ all -> 0x0901 }
            goto L_0x05aa
        L_0x05a5:
            gwf r7 = new gwf     // Catch:{ all -> 0x0901 }
            r7.<init>(r4)     // Catch:{ all -> 0x0901 }
        L_0x05aa:
            r5.<init>(r6, r7)     // Catch:{ all -> 0x0901 }
        L_0x05ad:
            gvx r5 = r5.a((defpackage.gwr) r4)     // Catch:{ all -> 0x0901 }
            r9.e()     // Catch:{ all -> 0x0901 }
            gzr r6 = r5.d     // Catch:{ all -> 0x0901 }
            gzs r7 = r5.b     // Catch:{ all -> 0x0901 }
            int r8 = r5.e     // Catch:{ all -> 0x0901 }
            java.util.List r10 = r5.c     // Catch:{ all -> 0x0901 }
            if (r8 != 0) goto L_0x05d7
            android.content.Context r11 = r30.getApplicationContext()     // Catch:{ all -> 0x0901 }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0901 }
            android.content.SharedPreferences r11 = defpackage.gwk.l(r11)     // Catch:{ all -> 0x0901 }
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch:{ all -> 0x0901 }
            java.lang.String r14 = "CheckinService_lastCheckinSuccessTime"
            android.content.SharedPreferences$Editor r11 = r11.putLong(r14, r12)     // Catch:{ all -> 0x0901 }
            r11.apply()     // Catch:{ all -> 0x0901 }
        L_0x05d7:
            android.content.Context r11 = r30.getApplicationContext()     // Catch:{ all -> 0x0901 }
            gzr r12 = r5.d     // Catch:{ all -> 0x0901 }
            if (r12 == 0) goto L_0x05e9
            had r12 = r12.l     // Catch:{ all -> 0x0901 }
            if (r12 == 0) goto L_0x05e4
            goto L_0x05e6
        L_0x05e4:
            had r12 = defpackage.had.o     // Catch:{ all -> 0x0901 }
        L_0x05e6:
            java.lang.String r12 = r12.g     // Catch:{ all -> 0x0901 }
            goto L_0x05eb
        L_0x05e9:
            java.lang.String r12 = ""
        L_0x05eb:
            a((android.content.Context) r11, (java.lang.String) r12)     // Catch:{ all -> 0x0901 }
            android.content.Context r11 = r30.getApplicationContext()     // Catch:{ all -> 0x0901 }
            android.content.SharedPreferences r11 = defpackage.gwk.l(r11)     // Catch:{ all -> 0x0901 }
            if (r7 == 0) goto L_0x06d0
            android.content.Intent[] r12 = defpackage.gwb.a(r7)     // Catch:{ all -> 0x0901 }
            int r13 = r12.length     // Catch:{ all -> 0x0901 }
            r14 = 0
        L_0x05fe:
            if (r14 >= r13) goto L_0x0631
            r15 = r12[r14]     // Catch:{ all -> 0x0901 }
            r31 = r12
            java.lang.String r12 = "com.google.android.checkin.INVALIDATE"
            r21 = r13
            java.lang.String r13 = r15.getAction()     // Catch:{ all -> 0x0901 }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0901 }
            if (r12 == 0) goto L_0x0627
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0901 }
            r12.<init>()     // Catch:{ all -> 0x0901 }
            if (r6 == 0) goto L_0x0623
            aucx r13 = r6.m     // Catch:{ all -> 0x0901 }
            int r13 = r13.size()     // Catch:{ all -> 0x0901 }
            if (r13 == 0) goto L_0x0623
            aucx r12 = r6.m     // Catch:{ all -> 0x0901 }
        L_0x0623:
            defpackage.gvu.a((android.content.Context) r1, (java.util.List) r12)     // Catch:{ all -> 0x0901 }
            goto L_0x062a
        L_0x0627:
            r1.sendBroadcast(r15)     // Catch:{ all -> 0x0901 }
        L_0x062a:
            int r14 = r14 + 1
            r12 = r31
            r13 = r21
            goto L_0x05fe
        L_0x0631:
            int r6 = r7.a     // Catch:{ all -> 0x0901 }
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x0656
            java.lang.String r6 = r7.i     // Catch:{ all -> 0x0901 }
            java.lang.String r12 = "CheckinService_versionInfo"
            java.lang.String r13 = ""
            java.lang.String r12 = r11.getString(r12, r13)     // Catch:{ all -> 0x0901 }
            boolean r6 = r6.equals(r12)     // Catch:{ all -> 0x0901 }
            if (r6 != 0) goto L_0x0656
            android.content.SharedPreferences$Editor r6 = r11.edit()     // Catch:{ all -> 0x0901 }
            java.lang.String r12 = "CheckinService_versionInfo"
            java.lang.String r13 = r7.i     // Catch:{ all -> 0x0901 }
            android.content.SharedPreferences$Editor r6 = r6.putString(r12, r13)     // Catch:{ all -> 0x0901 }
            r6.apply()     // Catch:{ all -> 0x0901 }
        L_0x0656:
            int r6 = r7.a     // Catch:{ all -> 0x0901 }
            r6 = r6 & 256(0x100, float:3.59E-43)
            if (r6 != 0) goto L_0x0674
            iwd r6 = a     // Catch:{ all -> 0x0901 }
            java.lang.String r12 = "Clearing the deviceDataVersionInfo."
            r13 = 0
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ all -> 0x0901 }
            r6.a(r12, r14)     // Catch:{ all -> 0x0901 }
            android.content.SharedPreferences$Editor r6 = r11.edit()     // Catch:{ all -> 0x0901 }
            java.lang.String r11 = "CheckinService_deviceDataVersionInfo"
            android.content.SharedPreferences$Editor r6 = r6.remove(r11)     // Catch:{ all -> 0x0901 }
            r6.apply()     // Catch:{ all -> 0x0901 }
            goto L_0x069d
        L_0x0674:
            java.lang.String r6 = r7.j     // Catch:{ all -> 0x0901 }
            java.lang.String r12 = "CheckinService_deviceDataVersionInfo"
            java.lang.String r13 = ""
            java.lang.String r12 = r11.getString(r12, r13)     // Catch:{ all -> 0x0901 }
            boolean r6 = r6.equals(r12)     // Catch:{ all -> 0x0901 }
            if (r6 != 0) goto L_0x069d
            iwd r6 = a     // Catch:{ all -> 0x0901 }
            java.lang.String r12 = "Storing the new deviceDataVersionInfo."
            r13 = 0
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ all -> 0x0901 }
            r6.a(r12, r14)     // Catch:{ all -> 0x0901 }
            android.content.SharedPreferences$Editor r6 = r11.edit()     // Catch:{ all -> 0x0901 }
            java.lang.String r11 = "CheckinService_deviceDataVersionInfo"
            java.lang.String r12 = r7.j     // Catch:{ all -> 0x0901 }
            android.content.SharedPreferences$Editor r6 = r6.putString(r11, r12)     // Catch:{ all -> 0x0901 }
            r6.apply()     // Catch:{ all -> 0x0901 }
        L_0x069d:
            aucx r6 = r7.k     // Catch:{ all -> 0x0901 }
            int r6 = r6.size()     // Catch:{ all -> 0x0901 }
            if (r6 <= 0) goto L_0x06d0
            iwd r6 = a     // Catch:{ all -> 0x0901 }
            aucx r11 = r7.k     // Catch:{ all -> 0x0901 }
            int r11 = r11.size()     // Catch:{ all -> 0x0901 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0901 }
            r13 = 32
            r12.<init>(r13)     // Catch:{ all -> 0x0901 }
            java.lang.String r13 = "Invalidating "
            r12.append(r13)     // Catch:{ all -> 0x0901 }
            r12.append(r11)     // Catch:{ all -> 0x0901 }
            java.lang.String r11 = " tokens."
            r12.append(r11)     // Catch:{ all -> 0x0901 }
            java.lang.String r11 = r12.toString()     // Catch:{ all -> 0x0901 }
            r12 = 0
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ all -> 0x0901 }
            r6.a(r11, r13)     // Catch:{ all -> 0x0901 }
            aucx r6 = r7.k     // Catch:{ all -> 0x0901 }
            defpackage.gvu.a((android.content.Context) r1, (java.util.List) r6)     // Catch:{ all -> 0x0901 }
        L_0x06d0:
            if (r8 == 0) goto L_0x06d3
            goto L_0x0738
        L_0x06d3:
            android.content.Context r6 = r30.getApplicationContext()     // Catch:{ all -> 0x0901 }
            android.content.SharedPreferences r6 = defpackage.gwk.l(r6)     // Catch:{ all -> 0x0901 }
            hag r7 = r4.p     // Catch:{ all -> 0x0901 }
            int r11 = r7.a     // Catch:{ all -> 0x0901 }
            r11 = r11 & 4
            if (r11 == 0) goto L_0x06e6
            java.lang.String r7 = r7.d     // Catch:{ all -> 0x0901 }
            goto L_0x06e8
        L_0x06e6:
            java.lang.String r7 = "unspecified"
        L_0x06e8:
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0901 }
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ all -> 0x0901 }
            java.lang.String r13 = "CheckinService_last_checkin_ms_"
            java.lang.String r14 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0901 }
            int r15 = r14.length()     // Catch:{ all -> 0x0901 }
            if (r15 != 0) goto L_0x0702
            java.lang.String r14 = new java.lang.String     // Catch:{ all -> 0x0901 }
            r14.<init>(r13)     // Catch:{ all -> 0x0901 }
            goto L_0x0706
        L_0x0702:
            java.lang.String r14 = r13.concat(r14)     // Catch:{ all -> 0x0901 }
        L_0x0706:
            android.content.SharedPreferences$Editor r6 = r6.putLong(r14, r11)     // Catch:{ all -> 0x0901 }
            r6.apply()     // Catch:{ all -> 0x0901 }
            iwd r6 = a     // Catch:{ all -> 0x0901 }
            java.lang.String r13 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0901 }
            int r13 = r13.length()     // Catch:{ all -> 0x0901 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0901 }
            int r13 = r13 + 64
            r14.<init>(r13)     // Catch:{ all -> 0x0901 }
            java.lang.String r13 = "Recording last checkin time for package "
            r14.append(r13)     // Catch:{ all -> 0x0901 }
            r14.append(r7)     // Catch:{ all -> 0x0901 }
            java.lang.String r7 = " as "
            r14.append(r7)     // Catch:{ all -> 0x0901 }
            r14.append(r11)     // Catch:{ all -> 0x0901 }
            java.lang.String r7 = r14.toString()     // Catch:{ all -> 0x0901 }
            r11 = 0
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ all -> 0x0901 }
            r6.b(r7, r12)     // Catch:{ all -> 0x0901 }
        L_0x0738:
            android.content.SharedPreferences r6 = defpackage.gwk.l(r30)     // Catch:{ all -> 0x0901 }
            android.content.Intent r7 = new android.content.Intent     // Catch:{ all -> 0x0901 }
            java.lang.String r11 = "com.google.android.checkin.CHECKIN_COMPLETE"
            r7.<init>(r11)     // Catch:{ all -> 0x0901 }
            if (r8 == 0) goto L_0x074c
            java.lang.String r11 = "success"
            r12 = 0
            r7.putExtra(r11, r12)     // Catch:{ all -> 0x0901 }
            goto L_0x075d
        L_0x074c:
            java.lang.String r11 = "success"
            r12 = 1
            r7.putExtra(r11, r12)     // Catch:{ all -> 0x0901 }
            if (r10 == 0) goto L_0x075d
            boolean r11 = r10.isEmpty()     // Catch:{ all -> 0x0901 }
            if (r11 != 0) goto L_0x075d
            defpackage.gyc.a(r30)     // Catch:{ all -> 0x0901 }
        L_0x075d:
            r1.sendBroadcast(r7)     // Catch:{ all -> 0x0901 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0901 }
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ all -> 0x0901 }
            java.lang.String r7 = "CheckinService_checkinCompleteBroadcastTime"
            android.content.SharedPreferences$Editor r6 = r6.putLong(r7, r11)     // Catch:{ all -> 0x0901 }
            r6.apply()     // Catch:{ all -> 0x0901 }
            if (r8 != 0) goto L_0x07be
            android.content.SharedPreferences r6 = defpackage.gwk.l(r30)     // Catch:{ all -> 0x0901 }
            if (r10 != 0) goto L_0x077a
            goto L_0x07b1
        L_0x077a:
            boolean r7 = r10.isEmpty()     // Catch:{ all -> 0x0901 }
            if (r7 != 0) goto L_0x07b1
            ob r7 = new ob     // Catch:{ all -> 0x0901 }
            int r11 = r10.size()     // Catch:{ all -> 0x0901 }
            r7.<init>((int) r11)     // Catch:{ all -> 0x0901 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0901 }
        L_0x078d:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x0901 }
            if (r11 != 0) goto L_0x07a1
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ all -> 0x0901 }
            java.lang.String r10 = "CheckinService_accountsReceivedByServer"
            android.content.SharedPreferences$Editor r6 = r6.putStringSet(r10, r7)     // Catch:{ all -> 0x0901 }
            r6.apply()     // Catch:{ all -> 0x0901 }
            goto L_0x07be
        L_0x07a1:
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x0901 }
            android.accounts.Account r11 = (android.accounts.Account) r11     // Catch:{ all -> 0x0901 }
            java.lang.String r11 = a((android.accounts.Account) r11)     // Catch:{ JSONException -> 0x07af }
            r7.add(r11)     // Catch:{ JSONException -> 0x07af }
            goto L_0x078d
        L_0x07af:
            r0 = move-exception
            goto L_0x078d
        L_0x07b1:
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ all -> 0x0901 }
            java.lang.String r7 = "CheckinService_accountsReceivedByServer"
            android.content.SharedPreferences$Editor r6 = r6.remove(r7)     // Catch:{ all -> 0x0901 }
            r6.apply()     // Catch:{ all -> 0x0901 }
        L_0x07be:
            boolean r4 = r4.d     // Catch:{ all -> 0x0901 }
            if (r4 == 0) goto L_0x07c3
            goto L_0x07cd
        L_0x07c3:
            if (r8 == 0) goto L_0x07c8
            r4 = 8
            goto L_0x07ca
        L_0x07c8:
            r4 = 24
        L_0x07ca:
            defpackage.gwd.a((int) r4)     // Catch:{ all -> 0x0901 }
        L_0x07cd:
            r9.f()     // Catch:{ all -> 0x0901 }
            amzy r4 = r5.g     // Catch:{ all -> 0x0901 }
            r9.a((java.util.List) r4)     // Catch:{ all -> 0x0901 }
            gzo r4 = r5.h     // Catch:{ all -> 0x0901 }
            r9.a((defpackage.gzo) r4)     // Catch:{ all -> 0x0901 }
            r7 = r5
        L_0x07db:
            int r4 = r7.e     // Catch:{ all -> 0x08f2 }
            if (r4 != 0) goto L_0x07e1
            r4 = 1
            goto L_0x07e2
        L_0x07e1:
            r4 = 0
        L_0x07e2:
            int r5 = r7.f     // Catch:{ all -> 0x08f2 }
            if (r4 != 0) goto L_0x083c
            android.content.ContentResolver r6 = r30.getContentResolver()     // Catch:{ all -> 0x08f2 }
            java.lang.String r8 = "checkin_no_retry_http_codes"
            java.lang.String r10 = "400,401,403"
            java.lang.String r6 = defpackage.aeeg.a((android.content.ContentResolver) r6, (java.lang.String) r8, (java.lang.String) r10)     // Catch:{ all -> 0x08f2 }
            r8 = 44
            amsk r8 = defpackage.amsk.a((char) r8)     // Catch:{ all -> 0x08f2 }
            java.util.List r6 = r8.c(r6)     // Catch:{ all -> 0x08f2 }
            if (r6 == 0) goto L_0x080a
            java.lang.String r8 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x08f2 }
            boolean r6 = r6.contains(r8)     // Catch:{ all -> 0x08f2 }
            if (r6 == 0) goto L_0x080a
            r6 = 0
            goto L_0x080b
        L_0x080a:
            r6 = 1
        L_0x080b:
            java.lang.String r8 = "RetryTaskTag"
            boolean r3 = r8.equals(r3)     // Catch:{ all -> 0x08f2 }
            if (r3 == 0) goto L_0x0814
            goto L_0x0847
        L_0x0814:
            if (r6 == 0) goto L_0x0847
            iwd r3 = a     // Catch:{ all -> 0x08f2 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x08f2 }
            r8 = 49
            r6.<init>(r8)     // Catch:{ all -> 0x08f2 }
            java.lang.String r8 = "Checkin result code: "
            r6.append(r8)     // Catch:{ all -> 0x08f2 }
            r6.append(r5)     // Catch:{ all -> 0x08f2 }
            java.lang.String r5 = " will be retried."
            r6.append(r5)     // Catch:{ all -> 0x08f2 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x08f2 }
            r6 = 0
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x08f2 }
            r3.c(r5, r8)     // Catch:{ all -> 0x08f2 }
            java.lang.String r3 = "com.google.android.gms.checkin.CheckinService"
            a((android.os.Bundle) r2, (android.content.Context) r1, (java.lang.String) r3)     // Catch:{ all -> 0x08f2 }
            goto L_0x0847
        L_0x083c:
            java.lang.String r3 = "RetryTaskTag"
            qwq r5 = defpackage.qwq.a((android.content.Context) r30)     // Catch:{ all -> 0x08f2 }
            java.lang.String r6 = "com.google.android.gms.checkin.CheckinService"
            r5.a((java.lang.String) r3, (java.lang.String) r6)     // Catch:{ all -> 0x08f2 }
        L_0x0847:
            java.util.concurrent.locks.ReentrantLock r3 = j
            r3.unlock()
            long r5 = android.os.SystemClock.elapsedRealtime()
            iwd r3 = a
            r8 = 1
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            r11 = 0
            r10[r11] = r8
            java.lang.String r8 = "CheckinTask finished at: %d."
            r3.b(r8, r10)
            r3 = 2
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r3 = "CheckinTask:duration"
            r8[r11] = r3
            long r5 = r5 - r18
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r5 = 1
            r8[r5] = r3
            defpackage.gwd.a((java.lang.Object[]) r8)
            r5 = 0
            r9.a((long) r5)
            int r3 = r7.e
            r9.a((int) r3)
            gzg r3 = r9.h()
            boolean r5 = defpackage.awrk.b()
            if (r5 == 0) goto L_0x088f
            gzj r5 = defpackage.gzj.a((android.content.Context) r30)
            r5.a((defpackage.gzg) r3)
        L_0x088f:
            java.lang.String r3 = "start_timestamp"
            long r5 = r2.getLong(r3)
            gxz r3 = r1.e
            r3.a(r4, r5)
            java.lang.String r3 = "CheckinService_onStart_showNotification"
            r4 = 0
            boolean r3 = r2.getBoolean(r3, r4)
            java.lang.String r4 = "checkin_start_id"
            boolean r4 = r2.containsKey(r4)
            if (r4 == 0) goto L_0x08b1
            int r4 = c((android.os.Bundle) r2)
            r1.stopSelfResult(r4)
        L_0x08b1:
            if (r3 == 0) goto L_0x08ee
            int r3 = r7.e
            int r2 = c((android.os.Bundle) r2)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r5 = "com.google.android.gms.checkin.CheckinService"
            android.content.Intent r4 = r4.setClassName(r1, r5)
            java.lang.String r5 = "com.google.android.gms.checkin.SHOW_NOTIFICATION"
            android.content.Intent r4 = r4.setAction(r5)
            if (r3 == 0) goto L_0x08db
            r5 = 2
            if (r3 == r5) goto L_0x08d8
            r5 = 3
            if (r3 == r5) goto L_0x08d5
            java.lang.String r3 = "checkin failed"
            goto L_0x08dd
        L_0x08d5:
            java.lang.String r3 = "checkin rescheduled"
            goto L_0x08dd
        L_0x08d8:
            java.lang.String r3 = "checkin failed"
            goto L_0x08dd
        L_0x08db:
            java.lang.String r3 = "checkin succeeded"
        L_0x08dd:
            java.lang.String r5 = "show_notification_message"
            android.content.Intent r3 = r4.putExtra(r5, r3)
            if (r2 <= 0) goto L_0x08eb
            java.lang.String r4 = "show_notification_start_id"
            r3.putExtra(r4, r2)
        L_0x08eb:
            defpackage.acsb.b(r1, r3)
        L_0x08ee:
            r30.c()
            return
        L_0x08f2:
            r0 = move-exception
            r2 = r0
            goto L_0x090d
        L_0x08f5:
            r0 = move-exception
            r18 = r4
            goto L_0x090a
        L_0x08f9:
            r0 = move-exception
            r18 = r4
            r17 = r7
        L_0x08fe:
            r2 = r0
        L_0x08ff:
            monitor-exit(r13)     // Catch:{ all -> 0x0903 }
            throw r2     // Catch:{ all -> 0x0901 }
        L_0x0901:
            r0 = move-exception
            goto L_0x090a
        L_0x0903:
            r0 = move-exception
            goto L_0x08fe
        L_0x0905:
            r0 = move-exception
            r18 = r4
            r17 = r7
        L_0x090a:
            r2 = r0
        L_0x090b:
            r7 = r17
        L_0x090d:
            java.util.concurrent.locks.ReentrantLock r3 = j
            r3.unlock()
            long r3 = android.os.SystemClock.elapsedRealtime()
            iwd r5 = a
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r10 = 0
            r8[r10] = r6
            java.lang.String r6 = "CheckinTask finished at: %d."
            r5.b(r6, r8)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "CheckinTask:duration"
            r5[r10] = r6
            long r3 = r3 - r18
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 1
            r5[r4] = r3
            defpackage.gwd.a((java.lang.Object[]) r5)
            r3 = 0
            r9.a((long) r3)
            int r3 = r7.e
            r9.a((int) r3)
            gzg r3 = r9.h()
            boolean r4 = defpackage.awrk.b()
            if (r4 == 0) goto L_0x0955
            gzj r4 = defpackage.gzj.a((android.content.Context) r30)
            r4.a((defpackage.gzg) r3)
        L_0x0955:
            goto L_0x0957
        L_0x0956:
            throw r2
        L_0x0957:
            goto L_0x0956
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.checkin.CheckinChimeraService.a(android.os.Bundle):void");
    }
}
