package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* renamed from: gyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gyp {
    public static final gyz a = new gyo();
    private final Object b = new Object();
    private final ivk c;

    public gyp(Context context) {
        this.c = gxv.a(context, "checkin_scheduled_checkin_storage");
    }

    public final void a() {
        synchronized (this.b) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.clear();
            edit.commit();
        }
    }

    public final amri b() {
        Bundle bundle;
        synchronized (this.b) {
            if (this.c.contains("key_scheduled_checkin_time")) {
                long j = this.c.getLong("key_scheduled_checkin_time", -1);
                synchronized (this.b) {
                    bundle = new Bundle();
                    if (this.c.contains("CheckinService_fetchSystemUpdates")) {
                        bundle.putBoolean("CheckinService_fetchSystemUpdates", this.c.getBoolean("CheckinService_fetchSystemUpdates", false));
                    }
                    if (this.c.contains("CheckinService_forceCheckin")) {
                        bundle.putBoolean("CheckinService_forceCheckin", this.c.getBoolean("CheckinService_forceCheckin", false));
                    }
                    if (this.c.contains("CheckinService_logUploadPolicy")) {
                        bundle.putString("CheckinService_logUploadPolicy", this.c.getString("CheckinService_logUploadPolicy", ""));
                    }
                    if (this.c.contains("checkin_source_package")) {
                        bundle.putString("checkin_source_package", this.c.getString("checkin_source_package", ""));
                    }
                    if (this.c.contains("checkin_source_class")) {
                        bundle.putString("checkin_source_class", this.c.getString("checkin_source_class", ""));
                    }
                    if (this.c.contains("checkin_source_force")) {
                        bundle.putBoolean("checkin_source_force", this.c.getBoolean("checkin_source_force", false));
                    }
                    if (this.c.contains("checkin_task_tag")) {
                        bundle.putString("checkin_task_tag", this.c.getString("checkin_task_tag", ""));
                    }
                    if (this.c.contains("CheckinService_onStart_checkinReason")) {
                        bundle.putInt("CheckinService_onStart_checkinReason", this.c.getInt("CheckinService_onStart_checkinReason", 0));
                    }
                }
                amri b2 = amri.b(new gyn(j, bundle));
                return b2;
            }
            ampu ampu = ampu.a;
            return ampu;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(gyn gyn) {
        synchronized (this.b) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putLong("key_scheduled_checkin_time", gyn.a);
            edit.commit();
            Bundle bundle = gyn.b;
            synchronized (this.b) {
                SharedPreferences.Editor edit2 = this.c.edit();
                if (bundle.containsKey("CheckinService_fetchSystemUpdates")) {
                    edit2.putBoolean("CheckinService_fetchSystemUpdates", bundle.getBoolean("CheckinService_fetchSystemUpdates"));
                }
                if (bundle.containsKey("CheckinService_forceCheckin")) {
                    edit2.putBoolean("CheckinService_forceCheckin", bundle.getBoolean("CheckinService_forceCheckin"));
                }
                if (bundle.containsKey("CheckinService_logUploadPolicy")) {
                    edit2.putString("CheckinService_logUploadPolicy", bundle.getString("CheckinService_logUploadPolicy"));
                }
                if (bundle.containsKey("checkin_source_package")) {
                    edit2.putString("checkin_source_package", bundle.getString("checkin_source_package"));
                }
                if (bundle.containsKey("checkin_source_class")) {
                    edit2.putString("checkin_source_class", bundle.getString("checkin_source_class"));
                }
                if (bundle.containsKey("checkin_source_force")) {
                    edit2.putBoolean("checkin_source_force", bundle.getBoolean("checkin_source_force"));
                }
                if (bundle.containsKey("checkin_task_tag")) {
                    edit2.putString("checkin_task_tag", bundle.getString("checkin_task_tag"));
                }
                if (bundle.containsKey("CheckinService_onStart_checkinReason")) {
                    edit2.putInt("CheckinService_onStart_checkinReason", bundle.getInt("CheckinService_onStart_checkinReason"));
                }
                edit2.commit();
            }
        }
    }
}
