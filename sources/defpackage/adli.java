package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.update.SystemUpdateStatus;
import java.util.Locale;

/* renamed from: adli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adli {
    public static final iwd a = adnt.d("NotificationControl");
    public static final adrl b = new adrl("control.notification.notified_at");
    public static final adrg c = new adrg("control.notification.last_notified_status", -1);
    public static final adqz d = new adlh();
    protected final Context e;
    public final iwq f;
    public final adrn g;
    public final adlj h;
    private final jbs i;

    protected adli(Context context) {
        this.e = context;
        iwq a2 = iwq.a(context);
        if (a2 != null) {
            this.f = a2;
            this.i = new jbs(context);
            this.g = (adrn) adrn.a.b();
            this.h = new adlj(context);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public Notification a(SystemUpdateStatus systemUpdateStatus, boolean z) {
        String str;
        je jeVar = new je(this.e, "system_update.default_notification_channel");
        jeVar.d(a(systemUpdateStatus));
        jeVar.c(true);
        int i2 = systemUpdateStatus.c;
        int i3 = R.drawable.ic_error;
        switch (i2) {
            case 2:
            case 272:
            case 528:
            case 1043:
            case 1296:
            case 1547:
            case 1803:
                if (jkr.d()) {
                    i3 = R.drawable.quantum_ic_system_update_white_24;
                    break;
                } else {
                    i3 = R.drawable.notification_system_update_available;
                    break;
                }
            case 263:
            case 274:
            case 275:
            case 518:
            case 775:
            case 1031:
            case 1040:
            case 1042:
            case 1298:
            case 2059:
            case 2315:
                if (jkr.d()) {
                    if (hdg.a(this.e, R.drawable.ic_error) == 0) {
                        i3 = R.drawable.notification_system_update_download_failure;
                        break;
                    }
                } else {
                    i3 = R.drawable.notification_system_update_download_failure;
                    break;
                }
                break;
            default:
                throw new IllegalStateException(String.format(Locale.US, "Unable to handle the status: %d.", new Object[]{Integer.valueOf(systemUpdateStatus.c)}));
        }
        jeVar.b(hdg.a(this.e, i3));
        jeVar.a(false);
        jeVar.b(z);
        jeVar.e(a(systemUpdateStatus));
        switch (systemUpdateStatus.c) {
            case 2:
                str = this.e.getString(R.string.system_update_downloading_title_text);
                break;
            case 263:
            case 274:
            case 775:
            case 1031:
            case 1042:
            case 1298:
                str = this.e.getString(R.string.system_update_tv_general_notification_message);
                break;
            case 272:
            case 528:
            case 1043:
            case 1296:
                str = this.e.getString(R.string.system_update_tv_install_notification_message);
                break;
            case 275:
            case 1040:
            case 2315:
                str = this.e.getString(R.string.system_update_low_battery_text);
                break;
            case 518:
                str = this.e.getString(R.string.system_update_download_error_no_space_notification_message);
                break;
            case 1547:
                str = this.e.getString(R.string.system_update_download_paused_title_text);
                break;
            case 1803:
                str = this.e.getString(R.string.system_update_tv_download_notification_message);
                break;
            case 2059:
                str = this.e.getString(R.string.system_update_notification_message_wifi_disconnected);
                break;
            default:
                throw new IllegalStateException(String.format(Locale.US, "Unable to handle the status: %d.", new Object[]{Integer.valueOf(systemUpdateStatus.c)}));
        }
        jeVar.b((CharSequence) str);
        Context context = this.e;
        Intent intent = new Intent("android.settings.SYSTEM_UPDATE_SETTINGS").setPackage("com.google.android.gms");
        intent.putExtra("triggered_by_notification", true);
        jeVar.f = PendingIntent.getActivity(context, 0, intent, 134217728);
        int i4 = Build.VERSION.SDK_INT;
        jeVar.u = kf.b(this.e, R.color.system_update_notification_color);
        if (jkr.c()) {
            Bundle bundle = new Bundle();
            bundle.putString("android.substName", this.e.getString(R.string.system_update_module_name));
            jeVar.a(bundle);
        }
        if (jkr.e()) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("flags", 1);
            jeVar.a().putBundle("android.tv.EXTENSIONS", bundle2);
        }
        return jeVar.b();
    }

    protected adli(Context context, byte[] bArr) {
        this(context);
    }

    /* access modifiers changed from: protected */
    public final String a(SystemUpdateStatus systemUpdateStatus) {
        switch (systemUpdateStatus.c) {
            case 2:
                return this.e.getString(R.string.system_update_downloading_title_text);
            case 263:
            case 274:
            case 775:
            case 1031:
            case 1042:
            case 1298:
                return this.e.getString(R.string.system_update_installation_error_notification_title);
            case 272:
            case 528:
            case 1296:
                return amrk.a((String) adke.a.a()) ? this.e.getString(R.string.system_update_installation_notification_title) : (String) adke.a.a();
            case 275:
            case 1040:
            case 1547:
            case 2059:
            case 2315:
                return this.e.getString(R.string.system_update_notification_title_update_paused);
            case 518:
                return this.e.getString(R.string.system_update_download_error_notification_title);
            case 1043:
            case 1803:
                return amrk.a((String) adke.a.a()) ? this.e.getString(R.string.system_update_update_available_title_text) : (String) adke.a.a();
            default:
                throw new IllegalStateException(String.format(Locale.US, "Unable to handle the status: %d.", new Object[]{Integer.valueOf(systemUpdateStatus.c)}));
        }
    }

    public final void a() {
        this.f.a("com.google.android.gms.update.control.NotificationControl", 1);
    }

    public final void a(long j) {
        this.i.a("NotificationControl-Alarm", 1, j, adlk.a(this.e, 1), (String) null);
    }
}
