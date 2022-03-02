package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import java.util.EnumMap;

/* renamed from: lts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lts {
    static final EnumMap a = new EnumMap(anxu.class);
    static final EnumMap b = new EnumMap(anxt.class);
    static final EnumMap c = new EnumMap(anxx.class);
    static final EnumMap d = new EnumMap(anxw.class);
    private static final EnumMap e = new EnumMap(anxx.class);
    private static final EnumMap f = new EnumMap(anxu.class);
    private final hol g;

    static {
        e.put(anxx.DRIVING_MODE, anxx.DRIVING_MODE_LOCATION);
        e.put(anxx.DRIVING_MODE_FRX_INTRO, anxx.DRIVING_MODE_FRX_INTRO_LOCATION);
        e.put(anxx.DRIVING_MODE_FRX_SUCCESS, anxx.DRIVING_MODE_FRX_SUCCESS_LOCATION);
        e.put(anxx.DRIVING_MODE_FRX_CHOOSE_BEHAVIOR, anxx.DRIVING_MODE_FRX_CHOOSE_BEHAVIOR_LOCATION);
        e.put(anxx.DRIVING_MODE_FRX_DND_ACCESS_REQUEST, anxx.DRIVING_MODE_FRX_DND_ACCESS_REQUEST_LOCATION);
        e.put(anxx.DRIVING_MODE_FRX_DOWNLOAD, anxx.DRIVING_MODE_FRX_DOWNLOAD_LOCATION);
        e.put(anxx.DRIVING_MODE_FRX_ERROR, anxx.DRIVING_MODE_FRX_ERROR_LOCATION);
        e.put(anxx.DRIVING_MODE_FRX_AUTOLAUNCH_TRIGGER, anxx.DRIVING_MODE_FRX_AUTOLAUNCH_TRIGGER_LOCATION);
        e.put(anxx.DRIVING_MODE_FRX_GEARHEAD_SETUP, anxx.DRIVING_MODE_FRX_GEARHEAD_SETUP_LOCATION);
        f.put(anxu.DRIVING_MODE, anxu.DRIVING_MODE_LOCATION);
        c.put(anxx.UNKNOWN_CONTEXT, arfu.UNKNOWN_UI_CONTEXT);
        c.put(anxx.DRIVING_MODE, arfu.DRIVING_MODE);
        c.put(anxx.DRIVING_MODE_FRX_INTRO, arfu.DRIVING_MODE_FRX_INTRO);
        c.put(anxx.DRIVING_MODE_FRX_SUCCESS, arfu.DRIVING_MODE_FRX_SUCCESS);
        c.put(anxx.DRIVING_MODE_FRX_CHOOSE_BEHAVIOR, arfu.DRIVING_MODE_FRX_CHOOSE_BEHAVIOR);
        c.put(anxx.DRIVING_MODE_FRX_DND_ACCESS_REQUEST, arfu.DRIVING_MODE_FRX_DND_ACCESS_REQUEST);
        c.put(anxx.DRIVING_MODE_FRX_DOWNLOAD, arfu.DRIVING_MODE_FRX_DOWNLOAD);
        c.put(anxx.DRIVING_MODE_FRX_ERROR, arfu.DRIVING_MODE_FRX_ERROR);
        c.put(anxx.DRIVING_MODE_FRX_AUTOLAUNCH_TRIGGER, arfu.DRIVING_MODE_FRX_AUTOLAUNCH_TRIGGER);
        c.put(anxx.DRIVING_MODE_FRX_GEARHEAD_SETUP, arfu.DRIVING_MODE_FRX_GEARHEAD_SETUP);
        d.put(anxw.UNKNOWN_ACTION, arfs.UNKNOWN_UI_ACTION);
        d.put(anxw.DRIVING_MODE_SETTINGS, arfs.DRIVING_MODE_SETTINGS);
        d.put(anxw.DRIVING_MODE_BEHAVIOR_SETTINGS, arfs.DRIVING_MODE_BEHAVIOR_SETTINGS);
        d.put(anxw.DRIVING_MODE_MANUAL_TOGGLE_ENABLED, arfs.DRIVING_MODE_MANUAL_TOGGLE_ENABLED);
        d.put(anxw.DRIVING_MODE_MANUAL_TOGGLE_DISABLED, arfs.DRIVING_MODE_MANUAL_TOGGLE_DISABLED);
        d.put(anxw.DRIVING_MODE_PREFERENCE_GEAR_CLICKED, arfs.DRIVING_MODE_PREFERENCE_GEAR_CLICKED);
        d.put(anxw.DRIVING_MODE_SETTINGS_CHANGED_ACTIVITY_RECOGNITION, arfs.DRIVING_MODE_SETTINGS_CHANGED_ACTIVITY_RECOGNITION);
        d.put(anxw.DRIVING_MODE_SETTINGS_CHANGED_PROMPT_BEFORE_LAUNCH, arfs.DRIVING_MODE_SETTINGS_CHANGED_PROMPT_BEFORE_LAUNCH);
        d.put(anxw.DRIVING_MODE_SETTINGS_CHANGED_POCKET_DETECTION, arfs.DRIVING_MODE_SETTINGS_CHANGED_POCKET_DETECTION);
        d.put(anxw.DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_ON_WHILE_DRIVING, arfs.DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_ON_WHILE_DRIVING);
        d.put(anxw.DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_AUTOLAUNCH, arfs.DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_AUTOLAUNCH);
        d.put(anxw.DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_AUTOLAUNCH_DEVICE, arfs.DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_AUTOLAUNCH_DEVICE);
        d.put(anxw.DRIVING_MODE_AUTOMATIC_RULES_SETTINGS, arfs.DRIVING_MODE_AUTOMATIC_RULES_SETTINGS);
        d.put(anxw.DRIVING_MODE_LAUNCH_NOTIFICATION_SHOW, arfs.DRIVING_MODE_LAUNCH_NOTIFICATION_SHOW);
        d.put(anxw.DRIVING_MODE_LAUNCH_NOTIFICATION_ACCEPT, arfs.DRIVING_MODE_LAUNCH_NOTIFICATION_ACCEPT);
        d.put(anxw.DRIVING_MODE_LAUNCH_NOTIFICATION_CANCEL, arfs.DRIVING_MODE_LAUNCH_NOTIFICATION_CANCEL);
        d.put(anxw.DRIVING_MODE_LAUNCH_NOTIFICATION_SNOOZE, arfs.DRIVING_MODE_LAUNCH_NOTIFICATION_SNOOZE);
        d.put(anxw.DRIVING_MODE_BLUETOOTH_AUTOLAUNCH_SETTINGS, arfs.DRIVING_MODE_BLUETOOTH_AUTOLAUNCH_SETTINGS);
        d.put(anxw.DRIVING_MODE_START_GEARHEAD_BEHAVIOR, arfs.DRIVING_MODE_START_GEARHEAD_BEHAVIOR);
        d.put(anxw.DRIVING_MODE_START_DND_BEHAVIOR, arfs.DRIVING_MODE_START_DND_BEHAVIOR);
        d.put(anxw.DRIVING_MODE_START_THIRDPARTY_BEHAVIOR, arfs.DRIVING_MODE_START_THIRDPARTY_BEHAVIOR);
        d.put(anxw.DRIVING_MODE_START_EMPTY_BEHAVIOR, arfs.DRIVING_MODE_START_EMPTY_BEHAVIOR);
        d.put(anxw.DRIVING_MODE_STOP_GEARHEAD_BEHAVIOR, arfs.DRIVING_MODE_STOP_GEARHEAD_BEHAVIOR);
        d.put(anxw.DRIVING_MODE_STOP_DND_BEHAVIOR, arfs.DRIVING_MODE_STOP_DND_BEHAVIOR);
        d.put(anxw.DRIVING_MODE_STOP_THIRDPARTY_BEHAVIOR, arfs.DRIVING_MODE_STOP_THIRDPARTY_BEHAVIOR);
        d.put(anxw.DRIVING_MODE_STOP_EMPTY_BEHAVIOR, arfs.DRIVING_MODE_STOP_EMPTY_BEHAVIOR);
        d.put(anxw.DRIVING_MODE_SETTINGS_CHANGED_AUTOMATIC_RULES, arfs.DRIVING_MODE_SETTINGS_CHANGED_AUTOMATIC_RULES);
        d.put(anxw.DRIVING_MODE_LAUNCH_NOTIFICATION_TIMEOUT, arfs.DRIVING_MODE_LAUNCH_NOTIFICATION_TIMEOUT);
        d.put(anxw.DRIVING_MODE_SETTINGS_FROM_SEARCH, arfs.DRIVING_MODE_SETTINGS_FROM_SEARCH);
        d.put(anxw.DRIVING_MODE_START_MORRIS_BEHAVIOR, arfs.DRIVING_MODE_START_MORRIS_BEHAVIOR);
        d.put(anxw.DRIVING_MODE_STOP_MORRIS_BEHAVIOR, arfs.DRIVING_MODE_STOP_MORRIS_BEHAVIOR);
        d.put(anxw.DRIVING_MODE_LAUNCH_NOTIFICATION_AUTO_DISMISS, arfs.DRIVING_MODE_LAUNCH_NOTIFICATION_AUTO_DISMISS);
        d.put(anxw.DRIVING_MODE_FRX_NEXT_BUTTON, arfs.DRIVING_MODE_FRX_NEXT_BUTTON);
        d.put(anxw.DRIVING_MODE_FRX_BACK_BUTTON, arfs.DRIVING_MODE_FRX_BACK_BUTTON);
        d.put(anxw.DRIVING_MODE_FRX_TERTIARY_BUTTON, arfs.DRIVING_MODE_FRX_TERTIARY_BUTTON);
        d.put(anxw.DRIVING_MODE_FRX_SWITCH_TOGGLED, arfs.DRIVING_MODE_FRX_SWITCH_TOGGLED);
        d.put(anxw.DRIVING_MODE_FRX_READY, arfs.DRIVING_MODE_FRX_READY);
        d.put(anxw.DRIVING_MODE_FRX_STARTED_BY_SETTING_ACCESS, arfs.DRIVING_MODE_FRX_STARTED_BY_SETTING_ACCESS);
        d.put(anxw.DRIVING_MODE_FRX_LAUNCHES_GEARHEAD_FRX, arfs.DRIVING_MODE_FRX_LAUNCHES_GEARHEAD_FRX);
        d.put(anxw.DRIVING_MODE_FRX_STARTED_BY_LEAVE_BEHIND_NOTIFICATION, arfs.DRIVING_MODE_FRX_STARTED_BY_LEAVE_BEHIND_NOTIFICATION);
        a.put(anxu.UNKNOWN_CONTEXT, arfq.UNKNOWN_NON_UI_CONTEXT);
        a.put(anxu.DRIVING_MODE_GEARHEAD_SETTING_COPIER, arfq.DRIVING_MODE_GEARHEAD_SETTING_COPIER);
        a.put(anxu.DRIVING_MODE_DND_SETTING_COPIER, arfq.DRIVING_MODE_DND_SETTING_COPIER);
        a.put(anxu.DRIVING_MODE_LOCATION, arfq.DRIVING_MODE_LOCATION);
        b.put(anxt.UNKNOWN_ACTION, arfo.UNKNOWN_NON_UI_ACTION);
        b.put(anxt.DRIVING_MODE_SETTINGS_COPY_STARTED, arfo.DRIVING_MODE_SETTINGS_COPY_STARTED);
        b.put(anxt.DRIVING_MODE_SETTINGS_COPY_ON_PACKAGE_REPLACED, arfo.DRIVING_MODE_SETTINGS_COPY_ON_PACKAGE_REPLACED);
        b.put(anxt.DRIVING_MODE_SETTINGS_COPY_ON_LIFETIME_END, arfo.DRIVING_MODE_SETTINGS_COPY_ON_LIFETIME_END);
        b.put(anxt.DRIVING_MODE_SETTINGS_COPY_SUCCESS, arfo.DRIVING_MODE_SETTINGS_COPY_SUCCESS);
        b.put(anxt.DRIVING_MODE_SETTINGS_COPY_FAILED, arfo.DRIVING_MODE_SETTINGS_COPY_FAILED);
        b.put(anxt.DRIVING_MODE_GEARHEAD_LAUNCH_SUCCESS, arfo.DRIVING_MODE_GEARHEAD_LAUNCH_SUCCESS);
        b.put(anxt.DRIVING_MODE_GEARHEAD_DISABLED_SUCCESS, arfo.DRIVING_MODE_GEARHEAD_DISABLED_SUCCESS);
        b.put(anxt.DRIVING_MODE_GEARHEAD_LAUNCH_FAILED_INVALID_CALLING_PACKAGE, arfo.DRIVING_MODE_GEARHEAD_LAUNCH_FAILED_INVALID_CALLING_PACKAGE);
        b.put(anxt.DRIVING_MODE_TOGGLE_ENABLED_BY_THIRD_PARTY, arfo.DRIVING_MODE_TOGGLE_ENABLED_BY_THIRD_PARTY);
        b.put(anxt.DRIVING_MODE_TOGGLE_DISABLED_BY_THIRD_PARTY, arfo.DRIVING_MODE_TOGGLE_DISABLED_BY_THIRD_PARTY);
        b.put(anxt.DRIVING_MODE_NO_BLUETOOTH_PERMISSION, arfo.DRIVING_MODE_NO_BLUETOOTH_PERMISSION);
        b.put(anxt.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_CONNECTED, arfo.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_CONNECTED);
        b.put(anxt.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_LAUNCH, arfo.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_LAUNCH);
        b.put(anxt.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_DISCONNECTED, arfo.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_DISCONNECTED);
        b.put(anxt.DRIVING_MODE_AUTOLAUNCH_POCKET_TIMEOUT, arfo.DRIVING_MODE_AUTOLAUNCH_POCKET_TIMEOUT);
        b.put(anxt.DRIVING_MODE_AUTOLAUNCH_SKIPPED_IN_CALL, arfo.DRIVING_MODE_AUTOLAUNCH_SKIPPED_IN_CALL);
        b.put(anxt.DRIVING_MODE_SETTINGS_RESET_INVALID_BEHAVIOR, arfo.DRIVING_MODE_SETTINGS_RESET_INVALID_BEHAVIOR);
        b.put(anxt.DRIVING_MODE_GEARHEAD_INSTALL_START, arfo.DRIVING_MODE_GEARHEAD_INSTALL_START);
        b.put(anxt.DRIVING_MODE_GEARHEAD_INSTALL_START_UPDATE, arfo.DRIVING_MODE_GEARHEAD_INSTALL_START_UPDATE);
        b.put(anxt.DRIVING_MODE_GEARHEAD_INSTALL_SUCCESS, arfo.DRIVING_MODE_GEARHEAD_INSTALL_SUCCESS);
        b.put(anxt.DRIVING_MODE_GEARHEAD_INSTALL_FAILURE, arfo.DRIVING_MODE_GEARHEAD_INSTALL_FAILURE);
        b.put(anxt.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_CONNECTED_WIRELESS, arfo.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_CONNECTED_WIRELESS);
        b.put(anxt.DRIVING_MODE_CAR_SERVICE_SETTINGS_COPY_STARTED, arfo.DRIVING_MODE_CAR_SERVICE_SETTINGS_COPY_STARTED);
        b.put(anxt.DRIVING_MODE_CAR_SERVICE_SETTINGS_COPY_SUCCESS, arfo.DRIVING_MODE_CAR_SERVICE_SETTINGS_COPY_SUCCESS);
        b.put(anxt.DRIVING_MODE_CAR_SERVICE_SETTINGS_COPY_FAILED, arfo.DRIVING_MODE_CAR_SERVICE_SETTINGS_COPY_FAILED);
        b.put(anxt.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_CONNECTED, arfo.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_CONNECTED);
        b.put(anxt.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_DISCONNECTED, arfo.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_DISCONNECTED);
        b.put(anxt.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_LAUNCH, arfo.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_LAUNCH);
        b.put(anxt.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_TERMINATE, arfo.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_TERMINATE);
        b.put(anxt.DRIVING_MODE_AUTOLAUNCH_SKIPPED, arfo.DRIVING_MODE_AUTOLAUNCH_SKIPPED);
        b.put(anxt.DRIVING_MODE_AUTOLAUNCH_AUDIO_ACTIVITY_RECOGNITION_CONNECTED, arfo.DRIVING_MODE_AUTOLAUNCH_AUDIO_ACTIVITY_RECOGNITION_CONNECTED);
        b.put(anxt.DRIVING_MODE_AUTOLAUNCH_AUDIO_ACTIVITY_RECOGNITION_DISCONNECTED, arfo.DRIVING_MODE_AUTOLAUNCH_AUDIO_ACTIVITY_RECOGNITION_DISCONNECTED);
        b.put(anxt.DRIVING_MODE_CAR_SERVICE_SETTINGS_COPY_ABORTED, arfo.DRIVING_MODE_CAR_SERVICE_SETTINGS_COPY_ABORTED);
        b.put(anxt.DRIVING_MODE_LIFETIME_START, arfo.DRIVING_MODE_LIFETIME_START);
        b.put(anxt.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_DISCONNECT_IGNORED, arfo.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_DISCONNECT_IGNORED);
        b.put(anxt.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_DISCONNECT_IGNORED, arfo.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_DISCONNECT_IGNORED);
        b.put(anxt.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_SUPPRESSED, arfo.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_SUPPRESSED);
        b.put(anxt.DRIVING_MODE_CANNOT_RESOLVE_APP_LAUNCH_INTENT, arfo.DRIVING_MODE_CANNOT_RESOLVE_APP_LAUNCH_INTENT);
        b.put(anxt.DRIVING_MODE_MISSING_TRIGGER_SOURCE, arfo.DRIVING_MODE_MISSING_TRIGGER_SOURCE);
        b.put(anxt.DRIVING_MODE_MISSING_PENDING_TRIGGER_SOURCE, arfo.DRIVING_MODE_MISSING_PENDING_TRIGGER_SOURCE);
        b.put(anxt.DRIVING_MODE_NULL_PROXIMITY_SENSOR, arfo.DRIVING_MODE_NULL_PROXIMITY_SENSOR);
    }

    public lts(Context context) {
        String str;
        Context applicationContext = context.getApplicationContext();
        if (!aycw.e()) {
            str = "DRIVINGMODE";
        } else {
            str = "CAR";
        }
        this.g = new hol(applicationContext, str, (String) null);
    }

    private final void a(anxs anxs, int i) {
        int i2 = i - 1;
        String valueOf = String.valueOf(Integer.toString(i2));
        String valueOf2 = String.valueOf(anxs);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17 + String.valueOf(valueOf2).length());
        sb.append("Logging ");
        sb.append(valueOf);
        sb.append(", event: ");
        sb.append(valueOf2);
        sb.toString();
        hoi a2 = this.g.a(anxs.k());
        a2.a("com.google.android.projection.gearhead");
        a2.b(i2);
        a2.b();
    }

    private final void a(arec arec, int i) {
        hoi a2 = this.g.a(arec.k());
        a2.a("com.google.android.gms.location");
        a2.b(i - 1);
        a2.b();
    }

    public final void a(anxu anxu, anxt anxt) {
        if (!aycw.e()) {
            aucd o = anxs.d.o();
            aucd o2 = anxv.d.o();
            anxu anxu2 = (anxu) f.get(anxu);
            if (awqm.b() && anxu2 != null) {
                int i = anxu2.K;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anxv anxv = (anxv) o2.b;
                anxv.a |= 1;
                anxv.b = i;
            } else {
                int i2 = anxu.K;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anxv anxv2 = (anxv) o2.b;
                anxv2.a |= 1;
                anxv2.b = i2;
            }
            int i3 = anxt.em;
            anxv anxv3 = (anxv) o2.b;
            anxv3.a |= 2;
            anxv3.c = i3;
            anxv anxv4 = (anxv) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anxs anxs = (anxs) o.b;
            anxv4.getClass();
            anxs.c = anxv4;
            anxs.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            a((anxs) o.i(), 38);
            return;
        }
        aucd o3 = arfl.d.o();
        arfq arfq = (arfq) a.get(anxu);
        arfo arfo = (arfo) b.get(anxt);
        if (arfq == null || arfo == null) {
            Log.wtf("CAR.DRIVINGMODE", "Error of generating location non-UI event clearcut log");
            return;
        }
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        arfl arfl = (arfl) o3.b;
        arfl.b = arfq.e;
        int i4 = arfl.a | 1;
        arfl.a = i4;
        arfl.c = arfo.Q;
        arfl.a = i4 | 2;
        aucd o4 = arec.q.o();
        arfl arfl2 = (arfl) o3.i();
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        arec arec = (arec) o4.b;
        arfl2.getClass();
        arec.p = arfl2;
        arec.a |= 65536;
        a((arec) o4.i(), 19);
    }

    public final void a(anxx anxx, anxw anxw) {
        if (aycw.e()) {
            aucd o = arfm.d.o();
            arfu arfu = (arfu) c.get(anxx);
            arfs arfs = (arfs) d.get(anxw);
            System.out.println("sj - log location UI event ");
            if (arfu == null || arfs == null) {
                Log.wtf("CAR.DRIVINGMODE", "Error of generating location UI event clearcut log");
                return;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            arfm arfm = (arfm) o.b;
            arfm.b = arfu.k;
            int i = arfm.a | 1;
            arfm.a = i;
            arfm.c = arfs.O;
            arfm.a = i | 2;
            aucd o2 = arec.q.o();
            arfm arfm2 = (arfm) o.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arec arec = (arec) o2.b;
            arfm2.getClass();
            arec.o = arfm2;
            arec.a |= 32768;
            a((arec) o2.i(), 18);
            return;
        }
        aucd o3 = anxs.d.o();
        aucd o4 = anxy.d.o();
        anxx anxx2 = (anxx) e.get(anxx);
        if (awqm.b() && anxx2 != null) {
            int i2 = anxx2.cp;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            anxy anxy = (anxy) o4.b;
            anxy.a |= 1;
            anxy.b = i2;
        } else {
            int i3 = anxx.cp;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            anxy anxy2 = (anxy) o4.b;
            anxy2.a |= 1;
            anxy2.b = i3;
        }
        int i4 = anxw.jd;
        anxy anxy3 = (anxy) o4.b;
        anxy3.a |= 2;
        anxy3.c = i4;
        anxy anxy4 = (anxy) o4.i();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        anxs anxs = (anxs) o3.b;
        anxy4.getClass();
        anxs.b = anxy4;
        anxs.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        a((anxs) o3.i(), 37);
    }
}
