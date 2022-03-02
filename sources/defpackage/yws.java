package defpackage;

import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: yws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yws extends ilj implements yxi {
    public yws(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public final String a() {
        return d("display_name");
    }

    public final String b() {
        return d("icon_url");
    }

    public final String c() {
        return d("application_id");
    }

    public final ApplicationInfo d() {
        byte[] e = e("application_info");
        if (e == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(e, 0, e.length);
            obtain.setDataPosition(0);
            return (ApplicationInfo) obtain.readParcelable(ApplicationInfo.class.getClassLoader());
        } finally {
            obtain.recycle();
        }
    }

    public final boolean e() {
        return c("is_aspen");
    }

    public final boolean f() {
        return c("is_fitness");
    }

    public final String g() {
        return d("scopes");
    }

    public final String h() {
        return d("revoke_handle");
    }

    public final String i() {
        return d("revoke_message");
    }

    public final boolean j() {
        return c("has_conn_read");
    }

    public final /* bridge */ /* synthetic */ Object r() {
        throw new UnsupportedOperationException("Please use ApplicationEntity.from(application)");
    }
}
