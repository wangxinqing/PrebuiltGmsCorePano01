package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: ixm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ixm {
    public static final Map a = jir.a((Object[]) new String[]{"android.permission-group.SENSORS", "android.permission-group.CALENDAR", "android.permission-group.CAMERA", "android.permission-group.CONTACTS", "android.permission-group.MICROPHONE", "android.permission-group.PHONE", "android.permission-group.SMS", "android.permission-group.STORAGE"}, (Object[]) new Integer[]{Integer.valueOf(R.string.permgrouplab_sensors), Integer.valueOf(R.string.permgrouplab_calendar), Integer.valueOf(R.string.permgrouplab_camera), Integer.valueOf(R.string.permgrouplab_contacts), Integer.valueOf(R.string.permgrouplab_microphone), Integer.valueOf(R.string.permgrouplab_phone), Integer.valueOf(R.string.permgrouplab_sms), Integer.valueOf(R.string.permgrouplab_storage)});
    public static final ixm b = new ixm();
    private static final Map d = jir.a((Object[]) new String[]{"android.permission-group.SENSORS", "android.permission-group.CALENDAR", "android.permission-group.CAMERA", "android.permission-group.CONTACTS", "android.permission-group.MICROPHONE", "android.permission-group.PHONE", "android.permission-group.SMS", "android.permission-group.STORAGE"}, (Object[]) new String[]{"android.permission.BODY_SENSORS", "android.permission.READ_CALENDAR", "android.permission.CAMERA", "android.permission.READ_CONTACTS", "android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE", "android.permission.SEND_SMS", "android.permission.READ_EXTERNAL_STORAGE"});
    private static final Map e = new nz();
    volatile Set c = null;

    static {
        new nz();
        e.putAll(d);
        e.remove("android.permission-group.SENSORS");
    }

    private ixm() {
    }

    @Deprecated
    public static Set c() {
        return e.keySet();
    }

    public final PendingIntent a(Context context, Set set) {
        return a(context, set, (Map) null);
    }

    public final synchronized void b() {
        this.c = null;
    }

    public final PendingIntent a(Context context, Set set, Map map) {
        jix.i(context);
        Intent intent = new Intent("com.google.android.gms.RECOVER_PERMISSION");
        if (set == null) {
            return PendingIntent.getActivity(context, 0, intent, 134217728);
        }
        intent.putStringArrayListExtra("requiredGroups", new ArrayList(set));
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (set.contains(entry.getKey())) {
                    intent.putExtra((String) entry.getKey(), entry.getValue() != null ? ((Integer) entry.getValue()).intValue() : 0);
                }
            }
        }
        return PendingIntent.getActivity(context, 0, intent, 134217728);
    }

    public final Set a() {
        Set set = this.c;
        if (set == null) {
            synchronized (this) {
                set = this.c;
                if (set == null) {
                    HashSet hashSet = new HashSet();
                    ihs b2 = ihs.b();
                    if (jkr.b()) {
                        for (Map.Entry entry : e.entrySet()) {
                            if (b2.checkSelfPermission((String) entry.getValue()) == -1) {
                                hashSet.add((String) entry.getKey());
                            }
                        }
                    }
                    set = Collections.unmodifiableSet(hashSet);
                    this.c = set;
                }
            }
        }
        return set;
    }

    public final Set a(Set set) {
        if (set == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(a());
        hashSet.retainAll(set);
        return hashSet;
    }

    public final void a(PackageManager packageManager) {
        packageManager.addOnPermissionsChangeListener(new ixl(this));
    }
}
