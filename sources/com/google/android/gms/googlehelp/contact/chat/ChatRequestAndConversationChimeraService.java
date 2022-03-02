package com.google.android.gms.googlehelp.contact.chat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.volley.Response;
import com.google.android.chimera.Service;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChatRequestAndConversationChimeraService extends Service implements oet, nzc, oat {
    static final String a = "com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationService";
    static Set b = new HashSet();
    public static final /* synthetic */ int t = 0;
    private Long A;
    private BroadcastReceiver B;
    private je C;
    iwq c;
    public boolean d;
    public HelpConfig e;
    public okc f;
    public nze g;
    public boolean h;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public oeq m = null;
    public long n = -1;
    public long o = -1;
    public long p = -1;
    public long q = 0;
    public nzx r;
    public boolean s = false;
    private aoru u;
    private nzx v = new nzx();
    private boolean w;
    private boolean x = false;
    private CharSequence y = "";
    private List z;

    public static Intent a(Context context) {
        return new Intent().setClassName(context, a).putExtra("EXTRA_REQUEST_TYPE_CONVERSATION_UPDATE", true);
    }

    public static void b(Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, a).putExtra("EXTRA_HELP_CONFIG", helpConfig).putExtra("EXTRA_REQUEST_TYPE_NOTIFY_IF_UPDATING", true));
    }

    private static boolean b(int i2) {
        return i2 > 0;
    }

    public static void c(Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, a).putExtra("EXTRA_HELP_CONFIG", helpConfig).putExtra("EXTRA_REQUEST_TYPE_CANCEL_REQUEST_OR_LEAVE_CONVERSATION", true));
        int i2 = Build.VERSION.SDK_INT;
    }

    public static void d(Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, a).putExtra("EXTRA_REQUEST_TYPE_UPDATE_CHAT_CONVERSATION", true).putExtra("EXTRA_HELP_CONFIG", helpConfig));
    }

    public static Intent e() {
        return new Intent("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_READY");
    }

    public static long s() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    static final Intent v() {
        return new Intent("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_STATUS_UPDATE");
    }

    private final boolean w() {
        if (this.e == null) {
            Log.w("gH_ChatReq&ConvoSvc", "Got request to update conversation, but no configurations available.");
            return false;
        } else if (b(c())) {
            b();
            return true;
        } else {
            a((nzc) new oek(this));
            return true;
        }
    }

    private static Pair x() {
        return Pair.create(true, 2);
    }

    private static Pair y() {
        return Pair.create(false, 0);
    }

    private static void z() {
        Handler handler;
        Runnable runnable;
        if (ofq.b(axms.b())) {
            for (oeu oeu : b) {
                if (!(!ofq.b(axms.b()) || (handler = oeu.e) == null || (runnable = oeu.f) == null)) {
                    handler.removeCallbacks(runnable);
                    oeu.e = null;
                    oeu.f = null;
                }
            }
            b.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        return c() == 0;
    }

    public final void g() {
        int c2;
        if (this.h && this.e != null && (c2 = c()) >= 0) {
            if (c2 != 0) {
                a(4102, n());
            }
            a(v().putExtra("EXTRA_IS_CHAT_SUPPORT_STATUS_UPDATE", true).putExtra("EXTRA_CHAT_SUPPORT_QUEUE_POSITION", c2));
            l();
        }
    }

    public final void h() {
        Intent intent;
        this.h = false;
        if (this.d) {
            a(v().putExtra("EXTRA_WAS_CHAT_SUPPORT_ENDED", true));
        } else {
            nze nze = this.g;
            if (nze != null && odu.f(nze)) {
                intent = v().putExtra("EXTRA_WAS_CHAT_SUPPORT_ENDED", true);
            } else {
                odu.j(this, this.e);
                a(2014, m());
                intent = v().putExtra("EXTRA_IS_CHAT_SUPPORT_UNAVAILABLE", true);
            }
            a(intent);
        }
        stopSelf();
    }

    public final void i() {
        Intent intent;
        this.h = false;
        nze nze = this.g;
        if (nze != null && odu.f(nze)) {
            intent = v().putExtra("EXTRA_WAS_CHAT_SUPPORT_ENDED", true);
        } else {
            a(2014, m());
            intent = v().putExtra("EXTRA_IS_CHAT_DATA_STALE", true);
        }
        a(intent);
        stopSelf();
    }

    public final void j() {
        if (this.e != null) {
            if (this.k) {
                a(e());
            }
            if (this.e == null) {
                Log.w("gH_ChatReq&ConvoSvc", "Got request to join conversation, but no configurations available.");
            } else if (!this.x) {
                this.x = true;
                a(49);
                a((nzc) new oen(this));
            }
            HelpConfig helpConfig = this.e;
            if (helpConfig == null || !odu.e(this, helpConfig)) {
                a((nzc) new odw(this));
            }
        }
    }

    public final boolean k() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        HelpConfig helpConfig = this.e;
        if (helpConfig != null) {
            ReportBatchedMetricsChimeraGcmTaskService.a((Context) this, helpConfig);
        }
    }

    /* access modifiers changed from: package-private */
    public final Notification m() {
        je a2 = a(false, false);
        a2.e(a((int) R.string.gh_chat_request_error_notification, new Object[0]));
        a2.d(a((int) R.string.gh_chat_request_error_notification, new Object[0]));
        a2.b((CharSequence) p());
        a2.a(r());
        a2.a(q());
        return a2.b();
    }

    /* access modifiers changed from: package-private */
    public final Notification n() {
        int i2;
        String str;
        if (this.e != null) {
            i2 = c();
        } else {
            i2 = -1;
        }
        if (i2 != -1) {
            str = getString(R.string.gh_chat_queue_position, new Object[]{Integer.valueOf(i2)});
        } else {
            str = a((int) R.string.gh_chat_waiting_for_response, new Object[0]);
        }
        je a2 = a(true, false);
        a2.e(str);
        a2.d(str);
        a2.b((CharSequence) p());
        a2.a(r());
        a2.a(System.currentTimeMillis());
        return a2.b();
    }

    public final Notification o() {
        je a2 = a(true, false);
        String a3 = a((int) R.string.gh_chat_ongoing_chat_session, new Object[0]);
        a2.e(p());
        a2.d(a3);
        a2.b((CharSequence) a3);
        a2.a(r());
        a2.a(q());
        a2.a((jh) new jd());
        return a2.b();
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        String str;
        super.onCreate();
        if (axmx.a.a().i()) {
            jfm.a(9).execute(new oep());
        }
        ohj.a(this);
        this.q = s();
        this.B = new nla("googlehelp") {
            public final void a(Context context, Intent intent) {
                if ("android.intent.action.TIME_SET".equals(intent.getAction())) {
                    ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = ChatRequestAndConversationChimeraService.this;
                    int i = ChatRequestAndConversationChimeraService.t;
                    long j = chatRequestAndConversationChimeraService.q;
                    long s = ChatRequestAndConversationChimeraService.s();
                    chatRequestAndConversationChimeraService.q = s;
                    chatRequestAndConversationChimeraService.a((nzc) new oeb(chatRequestAndConversationChimeraService, s - j));
                    ChatRequestAndConversationChimeraService.this.t();
                } else if ("android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction())) {
                    ChatRequestAndConversationChimeraService.this.t();
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        registerReceiver(this.B, intentFilter);
        this.c = iwq.a((Context) this);
        if (Build.VERSION.SDK_INT >= 26) {
            iwq iwq = this.c;
            if (iwq.a("chat_channel_id") == null) {
                if (ofq.b(axqk.b())) {
                    str = getString(R.string.gh_top_appbar_support_label);
                } else {
                    str = "chat channel name";
                }
                iwq.a(new NotificationChannel("chat_channel_id", str, 4));
            }
        }
        this.f = new okc(this);
    }

    public final void onDestroy() {
        if (this.e != null) {
            if ((this.w || !this.h) && this.g != null) {
                d();
            }
            l();
        }
        stopForeground(this.w);
        List list = this.z;
        if (list != null) {
            nzj.a(false, list);
        }
        BroadcastReceiver broadcastReceiver = this.B;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        okc okc = this.f;
        if (okc != null) {
            okc.close();
        }
        super.onDestroy();
    }

    /* JADX INFO: finally extract failed */
    public final int onStartCommand(Intent intent, int i2, int i3) {
        Pair pair;
        HelpConfig helpConfig;
        Map map;
        if (!(intent == null || (helpConfig = (HelpConfig) intent.getParcelableExtra("EXTRA_HELP_CONFIG")) == null)) {
            this.e = helpConfig;
            if (ofq.a(axqt.b()) && ((map = this.e.M) == null || map.isEmpty())) {
                HelpConfig helpConfig2 = this.e;
                helpConfig2.M = nzq.a(this, helpConfig2);
            }
        }
        HelpConfig helpConfig3 = this.e;
        if (helpConfig3 != null) {
            nze.a(a(), this, this, helpConfig3);
            if (intent == null) {
                pair = Pair.create(true, 2);
            } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_NOTIFY_IF_UPDATING", false)) {
                if (b(c())) {
                    g();
                } else if (f()) {
                    j();
                } else {
                    Intent v2 = v();
                    if (nzq.b(this, this.e, "should_notify_of_chat_request_error")) {
                        v2.putExtra("EXTRA_IS_CHAT_SUPPORT_UNAVAILABLE", true);
                    } else {
                        v2.putExtra("EXTRA_NO_PENDING_CHAT_REQUEST", true);
                    }
                    a(v2);
                }
                pair = x();
            } else if (!intent.getBooleanExtra("EXTRA_REQUEST_TYPE_QUEUE_STATUS_UPDATE", false)) {
                if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_CONVERSATION_UPDATE", false)) {
                    HelpConfig helpConfig4 = this.e;
                    if (helpConfig4 != null) {
                        try {
                            odu.f(this, helpConfig4);
                            z();
                            w();
                            acrm.b(this, intent);
                            pair = x();
                        } catch (Throwable th) {
                            acrm.b(this, intent);
                            throw th;
                        }
                    } else {
                        acrm.b(this, intent);
                        pair = x();
                    }
                } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_AGENT_TYPING_STATUS", false)) {
                    HelpConfig helpConfig5 = this.e;
                    if (helpConfig5 != null && this.k) {
                        try {
                            odu.f(this, helpConfig5);
                            z();
                            a(new Intent("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_AGENT_TYPING_STATUS").putExtra("EXTRA_NEW_TYPING_STATUS", intent.getIntExtra("EXTRA_NEW_TYPING_STATUS", 0)).putExtra("EXTRA_NEW_TYPING_STATUS_PARTICIPANT_ID", intent.getStringExtra("EXTRA_NEW_TYPING_STATUS_PARTICIPANT_ID")).putExtra("EXTRA_NEW_TYPING_STATUS_CLIENT_TIME", intent.getLongExtra("EXTRA_NEW_TYPING_STATUS_CLIENT_TIME", -1)));
                            acrm.b(this, intent);
                            pair = x();
                        } catch (Throwable th2) {
                            acrm.b(this, intent);
                            throw th2;
                        }
                    } else {
                        acrm.b(this, intent);
                        pair = x();
                    }
                } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_USER_TYPING_STATUS", false)) {
                    if (!intent.hasExtra("EXTRA_NEW_TYPING_STATUS") || this.e == null) {
                        Log.w("gH_ChatReq&ConvoSvc", String.format("Got request to update user's typing status, but at least one of the following occurred: no typing status provided [%d], or no configurations available [%s].", new Object[]{Integer.valueOf(intent.getIntExtra("EXTRA_NEW_TYPING_STATUS", 0)), this.e}));
                    }
                    a((nzc) new oei(this, (olg) amri.c(olg.a(intent.getIntExtra("EXTRA_NEW_TYPING_STATUS", 0))).a((Object) olg.UNKNOWN_TYPING_STATUS)));
                    pair = x();
                } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_SEND_CHAT_CONVERSATION_MESSAGE", false)) {
                    String stringExtra = intent.getStringExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CONTENT");
                    if (stringExtra == null || this.e == null) {
                        Log.w("gH_ChatReq&ConvoSvc", String.format("Got request to send a message, but at least one of the following occurred: no message provided [%s] or no configurations available [%s].", new Object[]{stringExtra, this.e}));
                        pair = y();
                    } else {
                        long longExtra = intent.getLongExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME", 0);
                        if (!intent.hasExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME")) {
                            Log.w("gH_ChatReq&ConvoSvc", String.format("Got request to send a message, but no client time was provided [%d].", new Object[]{Long.valueOf(longExtra)}));
                        }
                        a(stringExtra, longExtra);
                        pair = x();
                    }
                } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_SEND_CHAT_NOTIFICATION_DIRECT_MESSAGE", false)) {
                    int i4 = Build.VERSION.SDK_INT;
                    Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
                    String valueOf = resultsFromIntent != null ? String.valueOf(resultsFromIntent.getCharSequence("textReply")) : null;
                    if (valueOf == null || this.e == null) {
                        Log.w("gH_ChatReq&ConvoSvc", String.format("Got request to send a message, but at least one of the following occurred: no message provided [%s] or no configurations available [%s].", new Object[]{valueOf, this.e}));
                        pair = y();
                    } else {
                        long longExtra2 = intent.getLongExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME", 0);
                        if (!intent.hasExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME")) {
                            Log.w("gH_ChatReq&ConvoSvc", String.format("Got request to send a message, but no client time was provided [%d].", new Object[]{Long.valueOf(longExtra2)}));
                        }
                        a(valueOf, longExtra2);
                        a(51);
                        axnx.c();
                        if (!intent.hasExtra("EXTRA_NOTIFICATION_SMART_REPLY_PREDICTION_ID") || !intent.hasExtra("EXTRA_NOTIFICATION_SMART_REPLY_TO_RECOMMENDATION_ID_BUNDLE")) {
                            Log.e("gH_ChatReq&ConvoSvc", "Expected the smart reply prediction id and recommendation id map in the direct reply intent.");
                        } else {
                            String stringExtra2 = intent.getStringExtra("EXTRA_NOTIFICATION_SMART_REPLY_PREDICTION_ID");
                            Bundle bundleExtra = intent.getBundleExtra("EXTRA_NOTIFICATION_SMART_REPLY_TO_RECOMMENDATION_ID_BUNDLE");
                            if (!TextUtils.isEmpty(stringExtra2) && bundleExtra.containsKey(valueOf)) {
                                okg.a(stringExtra2, bundleExtra.getString(valueOf), (Context) this, this.e, this.f);
                            }
                        }
                        pair = x();
                    }
                } else if (!intent.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_CHAT_CONVERSATION", false)) {
                    if (!intent.getBooleanExtra("EXTRA_REQUEST_TYPE_CANCEL_REQUEST_OR_LEAVE_CONVERSATION", false)) {
                        if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_IS_CHAT_IN_FOREGROUND", false)) {
                            boolean booleanExtra = intent.getBooleanExtra("EXTRA_IS_CHAT_IN_FOREGROUND", this.i);
                            this.i = booleanExtra;
                            if (!booleanExtra) {
                                a((nzc) new oel(this));
                            } else if (f()) {
                                a(4102, o());
                                this.l = false;
                            }
                            pair = x();
                        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_NOTIFICATION_DISMISSED", false)) {
                            this.h = false;
                            stopSelf();
                            pair = x();
                        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_LAST_SEEN_EVENT_ID", false)) {
                            long longExtra3 = intent.getLongExtra("EXTRA_LAST_SEEN_EVENT_ID", -1);
                            synchronized (this) {
                                odu.a(this.g, longExtra3);
                            }
                            pair = x();
                        } else if (!intent.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_TIMESTAMP_RELATED_OBJECTS", false)) {
                            if (!intent.getBooleanExtra("EXTRA_REQUEST_TYPE_CLEAR_SHOULD_NOTIFY_OF_CHAT_REQUEST_ERROR", false)) {
                                pair = y();
                            } else {
                                odu.k(this, this.e);
                                pair = x();
                            }
                        } else if (this.k) {
                            boolean booleanExtra2 = intent.getBooleanExtra("EXTRA_IS_TIME_DIFFERENCE_ESTIMATE_INITIALIZED", false);
                            nze nze = this.g;
                            boolean z2 = nze != null ? nze.a("time_has_changed", false) : false;
                            nze nze2 = this.g;
                            boolean z3 = nze2 != null ? nze2.a("time_difference_estimate_has_changed", false) : false;
                            if (z2) {
                                odu.b(this.g, false);
                            }
                            if (z3) {
                                odu.a(this.g, false);
                            }
                            if (!booleanExtra2 || z2) {
                                u();
                            } else if (z3) {
                                a(odu.d(this.g));
                            }
                            pair = x();
                        } else {
                            pair = x();
                        }
                    } else if (this.e == null) {
                        Log.w("gH_ChatReq&ConvoSvc", "Got request to leave conversation, but no configurations available.");
                        pair = y();
                    } else {
                        this.h = false;
                        this.w = true;
                        int c2 = c();
                        if (c2 != -1) {
                            if (b(c2)) {
                                a().execute(new oey(getApplicationContext(), this.e, this.f));
                            } else {
                                a((nzc) new odv(this));
                            }
                        }
                        a(v().putExtra("EXTRA_IS_CHAT_REQUEST_CANCELLED", true));
                        stopSelf();
                        pair = x();
                    }
                } else if (!w()) {
                    pair = y();
                } else {
                    pair = x();
                }
            } else if (this.e != null && !this.x) {
                try {
                    String stringExtra3 = intent.getStringExtra("EXTRA_REQUEST_VERSION");
                    if (!TextUtils.isEmpty(stringExtra3)) {
                        a((nzc) new oem(this, stringExtra3));
                    }
                    odu.f(this, this.e);
                    z();
                    b();
                    acrm.b(this, intent);
                    pair = x();
                } catch (Throwable th3) {
                    acrm.b(this, intent);
                    throw th3;
                }
            } else {
                acrm.b(this, intent);
                pair = x();
            }
            if (((Boolean) pair.first).booleanValue()) {
                return ((Integer) pair.second).intValue();
            }
            if (!TextUtils.isEmpty(this.e.p())) {
                this.c.a(2014);
                if (!this.j) {
                    this.d = false;
                    this.h = true;
                    this.w = false;
                    this.x = false;
                    this.k = false;
                    this.n = -1;
                    this.o = -1;
                    this.p = -1;
                    this.A = null;
                    this.q = s();
                    this.C = null;
                    this.s = false;
                    odu.k(this, this.e);
                    a((nzc) new oeh(this));
                    this.r = new nzx();
                    startForeground(4102, n());
                    this.j = true;
                    a((nzc) new oeg(this, intent));
                }
                return 2;
            }
            throw new IllegalStateException("Attempting to start a ChatRequestAndConversationChimeraService with no pool ID provided.");
        }
        Log.w("gH_ChatReq&ConvoSvc", "Attempting to start Chat service, but no configurations provided.");
        return 2;
    }

    /* access modifiers changed from: package-private */
    public final String p() {
        if (TextUtils.isEmpty(this.y)) {
            CharSequence a2 = a(getPackageManager(), this.e);
            this.y = a2;
            if (TextUtils.isEmpty(a2)) {
                return getResources().getString(R.string.gh_chat_google_support);
            }
        }
        return a((int) R.string.gh_hangout_product_specific_subtext, this.y);
    }

    /* access modifiers changed from: package-private */
    public final long q() {
        if (this.A == null) {
            this.A = Long.valueOf(System.currentTimeMillis());
        }
        return this.A.longValue();
    }

    /* access modifiers changed from: package-private */
    public final PendingIntent r() {
        return PendingIntent.getActivity(this, 10101, ChatConversationChimeraActivity.a(this, this.e), 134217728);
    }

    /* access modifiers changed from: package-private */
    public final void t() {
        if (this.i) {
            u();
        } else if (axoo.a.a().b()) {
            a((nzc) new oec(this));
        } else {
            odu.b(this.g, true);
        }
    }

    public final void u() {
        a((nzc) new oee(this));
    }

    public static Intent a(Context context, Intent intent) {
        Intent putExtra = new Intent().setClassName(context, a).putExtra("EXTRA_REQUEST_TYPE_UPDATE_AGENT_TYPING_STATUS", true).putExtra("EXTRA_NEW_TYPING_STATUS", (intent.hasExtra("status") ? (olg) amri.c(olg.a(Integer.parseInt(intent.getStringExtra("status")))).a((Object) olg.UNKNOWN_TYPING_STATUS) : olg.UNKNOWN_TYPING_STATUS).e).putExtra("EXTRA_NEW_TYPING_STATUS_PARTICIPANT_ID", intent.getStringExtra("participantId"));
        if (intent.hasExtra("clientTime")) {
            putExtra.putExtra("EXTRA_NEW_TYPING_STATUS_CLIENT_TIME", Long.parseLong(intent.getStringExtra("clientTime")));
        }
        return putExtra;
    }

    public static void e(Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, a).putExtra("EXTRA_REQUEST_TYPE_CLEAR_SHOULD_NOTIFY_OF_CHAT_REQUEST_ERROR", true).putExtra("EXTRA_HELP_CONFIG", helpConfig));
    }

    public final void d() {
        iva.a((Object) this.e);
        iva.a((Object) this.g);
        odu.a((Context) this, this.e, this.g);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        a(false);
    }

    public final void b(nzj nzj) {
        List list = this.z;
        if (list != null) {
            list.remove(nzj);
            if (this.z.size() == 0) {
                this.z = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int c() {
        iva.a((Object) this.e);
        HelpConfig helpConfig = this.e;
        nze nze = this.g;
        if (nze != null) {
            return nze.a(nzy.d(helpConfig), -1);
        }
        return -1;
    }

    public static Intent a(Context context, String str) {
        return new Intent().setClassName(context, a).putExtra("EXTRA_REQUEST_TYPE_QUEUE_STATUS_UPDATE", true).putExtra("EXTRA_REQUEST_VERSION", str);
    }

    public static CharSequence a(PackageManager packageManager, HelpConfig helpConfig) {
        if (packageManager == null) {
            Log.w("gH_ChatReq&ConvoSvc", "Trying to get an app package name, but packageManager is null");
            return null;
        } else if (helpConfig != null) {
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(helpConfig.b, 0));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("gH_ChatReq&ConvoSvc", String.format("App product name was not found for %s.", new Object[]{helpConfig.b}));
                return null;
            }
        } else {
            Log.w("gH_ChatReq&ConvoSvc", "Trying to get an app package name, but config is null");
            return null;
        }
    }

    private static String a(oky oky) {
        String str = oky.c;
        return (!TextUtils.isEmpty(str) || oky.e.size() <= 0) ? str : ((avlz) oky.e.get(0)).g;
    }

    public static void a(long j2, Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, a).putExtra("EXTRA_REQUEST_TYPE_UPDATE_LAST_SEEN_EVENT_ID", true).putExtra("EXTRA_LAST_SEEN_EVENT_ID", j2).putExtra("EXTRA_HELP_CONFIG", helpConfig));
    }

    public static void a(Context context, HelpConfig helpConfig) {
        a(context, helpConfig, false);
    }

    public static void a(Context context, HelpConfig helpConfig, boolean z2) {
        Intent putExtra = new Intent().setClassName(context, a).putExtra("EXTRA_HELP_CONFIG", helpConfig);
        if (z2) {
            putExtra.putExtra("EXTRA_IGNORE_CHAT_QUEUE_STATUS", true);
        }
        context.startService(putExtra);
    }

    public static void a(Context context, boolean z2, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, a).putExtra("EXTRA_REQUEST_TYPE_UPDATE_TIMESTAMP_RELATED_OBJECTS", true).putExtra("EXTRA_IS_TIME_DIFFERENCE_ESTIMATE_INITIALIZED", z2).putExtra("EXTRA_HELP_CONFIG", helpConfig));
    }

    public static void a(String str, long j2, Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, a).putExtra("EXTRA_REQUEST_TYPE_SEND_CHAT_CONVERSATION_MESSAGE", true).putExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CONTENT", str).putExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME", j2).putExtra("EXTRA_HELP_CONFIG", helpConfig));
    }

    public static void a(olg olg, Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, a).putExtra("EXTRA_REQUEST_TYPE_UPDATE_USER_TYPING_STATUS", true).putExtra("EXTRA_NEW_TYPING_STATUS", olg.e).putExtra("EXTRA_HELP_CONFIG", helpConfig));
    }

    public static void a(boolean z2, Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, a).putExtra("EXTRA_REQUEST_TYPE_UPDATE_IS_CHAT_IN_FOREGROUND", true).putExtra("EXTRA_IS_CHAT_IN_FOREGROUND", z2).putExtra("EXTRA_HELP_CONFIG", helpConfig));
    }

    public final Notification a(List list, boolean z2) {
        oky oky;
        PendingIntent pendingIntent;
        long j2;
        oky oky2;
        oky oky3;
        je a2 = a(true, z2);
        int size = list.size();
        jg jgVar = new jg("");
        for (int i2 = 0; i2 < size; i2++) {
            oko oko = (oko) list.get(i2);
            if ((oko.a & 128) != 0) {
                aufd aufd = oko.f;
                if (aufd == null) {
                    aufd = aufd.b;
                }
                j2 = aufd.a;
            } else {
                j2 = -1;
            }
            if (oko.b == 3) {
                oky2 = (oky) oko.c;
            } else {
                oky2 = oky.g;
            }
            String a3 = a(oky2);
            if (oko.b == 3) {
                oky3 = (oky) oko.c;
            } else {
                oky3 = oky.g;
            }
            jgVar.a(a3, j2, oky3.d);
        }
        if (this.l) {
            jgVar.a(getResources().getString(R.string.gh_chat_notification_message_failed_to_send_text), System.currentTimeMillis(), getResources().getString(R.string.common_google_play_services_error_dialog_title).toUpperCase());
        }
        a2.a((jh) jgVar);
        oko oko2 = (oko) anbs.d(list);
        if (oko2.b == 3) {
            oky = (oky) oko2.c;
        } else {
            oky = oky.g;
        }
        if (!this.l && this.j) {
            int a4 = hdg.a(this, R.drawable.quantum_ic_reply_grey600_24);
            if (!jkr.c()) {
                pendingIntent = r();
            } else {
                if (oky != null && oky.f == null) {
                    olj olj = olj.a;
                }
                Intent putExtra = new Intent().setClassName(this, a).putExtra("EXTRA_REQUEST_TYPE_SEND_CHAT_NOTIFICATION_DIRECT_MESSAGE", true).putExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME", System.currentTimeMillis()).putExtra("EXTRA_HELP_CONFIG", this.e);
                axnx.c();
                pendingIntent = PendingIntent.getService(this, 10101, putExtra, 134217728);
            }
            String string = getResources().getString(R.string.gh_chat_message_input_hint);
            jr jrVar = new jr("textReply");
            jrVar.d = string;
            axnx.c();
            jb jbVar = new jb(a4, getString(R.string.common_reply), pendingIntent);
            js jsVar = new js(jrVar.a, jrVar.d, jrVar.c, jrVar.b);
            if (jbVar.c == null) {
                jbVar.c = new ArrayList();
            }
            jbVar.c.add(jsVar);
            if (jkr.c()) {
                axnx.c();
            }
            a2.a(jbVar.a());
        }
        String a5 = a(oky);
        a2.e(oky.d);
        a2.d(a5);
        a2.b((CharSequence) a5);
        a2.a(r());
        a2.a(System.currentTimeMillis());
        return a2.b();
    }

    public final aoru a() {
        if (this.u == null) {
            this.u = jfm.a(9);
        }
        return this.u;
    }

    /* access modifiers changed from: package-private */
    public final String a(int i2, Object... objArr) {
        return getResources().getString(i2, objArr);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.je a(boolean r5, boolean r6) {
        /*
            r4 = this;
            je r0 = r4.C
            if (r0 != 0) goto L_0x0039
            je r0 = new je
            java.lang.String r1 = "chat_channel_id"
            r0.<init>(r4, r1)
            r4.C = r0
            r1 = 2131100358(0x7f0602c6, float:1.7813095E38)
            int r1 = defpackage.kf.b(r4, r1)
            r0.u = r1
            r1 = 2131231879(0x7f080487, float:1.8079851E38)
            int r1 = defpackage.hdg.a(r4, r1)
            r0.b((int) r1)
            boolean r0 = defpackage.jkr.c()
            if (r0 == 0) goto L_0x0039
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r4.p()
            java.lang.String r2 = "android.substName"
            r0.putString(r2, r1)
            je r1 = r4.C
            r1.a((android.os.Bundle) r0)
        L_0x0039:
            boolean r0 = r4.f()
            je r1 = r4.C
            r2 = r0 ^ 1
            r1.v = r2
            r2 = 0
            r3 = 1
            if (r6 != 0) goto L_0x0054
            boolean r6 = r4.i
            if (r6 == 0) goto L_0x004d
            r6 = 0
            goto L_0x0055
        L_0x004d:
            if (r0 == 0) goto L_0x0051
        L_0x004f:
            r6 = 1
            goto L_0x0055
        L_0x0051:
            if (r5 != 0) goto L_0x0054
            goto L_0x004f
        L_0x0054:
            r6 = 0
        L_0x0055:
            r0 = r6 ^ 1
            r1.c((boolean) r0)
            if (r6 == 0) goto L_0x006a
            je r5 = r4.C
            r6 = 2
            r5.j = r6
            r5.a((int) r6)
            android.net.Uri r6 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            r5.a((android.net.Uri) r6)
            goto L_0x0074
        L_0x006a:
            je r6 = r4.C
            r6.j = r2
            if (r5 != 0) goto L_0x0074
            r5 = 4
            r6.a((int) r5)
        L_0x0074:
            je r5 = r4.C
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            r0 = 10101(0x2775, float:1.4155E-41)
            java.lang.String r1 = a
            android.content.Intent r6 = r6.setClassName(r4, r1)
            com.google.android.gms.googlehelp.common.HelpConfig r1 = r4.e
            java.lang.String r2 = "EXTRA_HELP_CONFIG"
            android.content.Intent r6 = r6.putExtra(r2, r1)
            java.lang.String r1 = "EXTRA_REQUEST_TYPE_NOTIFICATION_DISMISSED"
            android.content.Intent r6 = r6.putExtra(r1, r3)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r6 = android.app.PendingIntent.getService(r4, r0, r6, r1)
            r5.b((android.app.PendingIntent) r6)
            je r5 = r4.C
            java.util.ArrayList r5 = r5.b
            r5.clear()
            je r5 = r4.C
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(boolean, boolean):je");
    }

    public final nzc a(okx okx) {
        return new oea(this, okx);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        okg.a((Context) this, this.e, this.f, i2);
    }

    public final void a(int i2, Notification notification) {
        this.c.a(i2, notification);
    }

    public final void a(long j2) {
        a((nzc) new oed(this, j2));
    }

    public final void a(Intent intent) {
        sendBroadcast(intent.setPackage(getPackageName()));
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, long j2) {
        a((nzc) new oej(this, str, j2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.nzc r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            nze r0 = r2.g     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x0013
            nzx r0 = r2.v     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0011
            oeo r1 = new oeo     // Catch:{ all -> 0x0018 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0018 }
            r0.addObserver(r1)     // Catch:{ all -> 0x0018 }
        L_0x0011:
            monitor-exit(r2)
            return
        L_0x0013:
            r3.a(r0)     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)
            return
        L_0x0018:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(nzc):void");
    }

    public final synchronized void a(nze nze) {
        nzx nzx = this.v;
        if (nzx != null) {
            this.g = nze;
            nzx.a();
            this.v = null;
        }
    }

    public final void a(nze nze, boolean z2) {
        List a2 = odu.a(this.p, nze);
        ArrayList arrayList = new ArrayList();
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((oko) a2.get(i2)).b == 3) {
                arrayList.add((oko) a2.get(i2));
            }
        }
        if (!arrayList.isEmpty()) {
            a(4102, a((List) arrayList, z2));
        }
    }

    public final void a(nzj nzj) {
        if (this.z == null) {
            this.z = new ArrayList();
        }
        this.z.add(nzj);
    }

    public final void a(boolean z2) {
        long j2;
        iva.a((Object) this.e);
        HelpConfig helpConfig = this.e;
        nze nze = this.g;
        if (nze != null) {
            j2 = nze.a(nzy.b(helpConfig), -1);
        } else {
            j2 = -1;
        }
        oeu oeu = new oeu(this, this.e, this.f, this, this.g, z2);
        if (ofq.b(axms.b()) && !odu.e(this, this.e)) {
            b.add(oeu);
        }
        a((nzc) oeu);
        oez.a((Context) this, this.e, this.f, j2, (Response.Listener) oeu, (Response.ErrorListener) oeu, a());
    }
}
