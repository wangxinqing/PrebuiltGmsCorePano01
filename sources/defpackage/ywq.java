package defpackage;

import android.content.pm.ApplicationInfo;
import android.os.Parcel;

/* renamed from: ywq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ywq {
    public static final String[] a = {"display_name", "icon_url", "application_id", "application_info", "is_aspen", "scopes", "revoke_handle", "revoke_message", "has_conn_read", "is_fitness"};

    public static final byte[] a(ApplicationInfo applicationInfo) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeParcelable(applicationInfo, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }
}
