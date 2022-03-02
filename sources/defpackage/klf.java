package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.drive.auth.AppIdentity;

/* renamed from: klf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class klf extends kqq {
    public final long a;
    public final AppIdentity b;
    public int c;
    public int d;
    public boolean e;

    public klf(kqg kqg, long j, long j2, AppIdentity appIdentity, int i, int i2, boolean z) {
        super(kqg, kli.a, j);
        this.a = j2;
        iva.a((Object) appIdentity);
        this.b = appIdentity;
        this.c = i;
        this.d = i2;
        this.e = z;
    }

    public static klf a(kqg kqg, Cursor cursor) {
        return new klf(kqg, kli.a.a.b(cursor).longValue(), klh.DRIVE_APP_ID.j.b(cursor).longValue(), AppIdentity.a(klh.PACKAGE_NAME.j.a(cursor), klh.CERTIFICATE_HASH.j.a(cursor)), klh.NETWORK_TYPE_PREFERENCE.j.b(cursor).intValue(), klh.BATTERY_USAGE_PREFERENCE.j.b(cursor).intValue(), klh.ROAMING_PREFERENCE.j.e(cursor));
    }

    public final String toString() {
        return String.format("AuthenticatedApp [driveAppId=%s, mAppIdentity=%s, networkPreference=%s, batteryPreference=%s, roamingPreference=%s]", new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        contentValues.put(klh.DRIVE_APP_ID.j.a(), Long.valueOf(this.a));
        contentValues.put(klh.PACKAGE_NAME.j.a(), this.b.b);
        contentValues.put(klh.CERTIFICATE_HASH.j.a(), this.b.c);
        contentValues.put(klh.NETWORK_TYPE_PREFERENCE.j.a(), Integer.valueOf(this.c));
        contentValues.put(klh.BATTERY_USAGE_PREFERENCE.j.a(), Integer.valueOf(this.d));
        contentValues.put(klh.ROAMING_PREFERENCE.j.a(), Boolean.valueOf(this.e));
    }
}
