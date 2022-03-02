package defpackage;

import android.content.ContentProviderOperation;
import android.database.Cursor;
import android.os.SystemClock;

/* renamed from: xwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xwd extends xwa {
    public static final String[] b = {"sourceid", "_id", "data_version", "data14", "data_sync2", "starred", "data_sync1"};
    private final yaz c;
    private final xvp d;
    private final amri e;
    private final xwt f;

    public xwd(Cursor cursor, xwt xwt, yaz yaz, xvp xvp, amri amri) {
        super(cursor);
        this.f = xwt;
        this.c = yaz;
        this.d = xvp;
        this.e = amri;
    }

    public final /* bridge */ /* synthetic */ Object b() {
        byte[] bArr;
        byte[] bArr2;
        int length;
        xip.a();
        while (d()) {
            this.d.a();
            long a = this.c.a();
            String a2 = a("sourceid");
            long longValue = b("_id").longValue();
            long longValue2 = b("data_version").longValue();
            String a3 = a("data_sync2");
            String a4 = a("data_sync1");
            this.c.a(xnd.UPDATE, xjo.PHOTO, true, 1, 1);
            SystemClock.elapsedRealtime();
            try {
                if (xwz.c(a4)) {
                    if (Boolean.valueOf(ayrj.a.a().N()).booleanValue()) {
                        this.c.a(xnd.UPDATE, xjo.PHOTO_HIGH_RES, true, 1, 1);
                    }
                    bArr = this.f.a(a2, 2);
                } else {
                    bArr = this.f.a(a2, 1);
                }
            } catch (babk | eif | xya e2) {
                xyi.a(true, xjo.PHOTO, xnd.UPDATE, e2, this.c, 1);
                if ((e2 instanceof xya) && !Boolean.valueOf(ayrj.a.a().aj()).booleanValue()) {
                    bArr = null;
                }
            }
            if (bArr == null || (length = bArr.length) <= 800000) {
                bArr2 = bArr;
            } else {
                xdt.b("FSA2_SyncDownPhotoCursor", "Contact %s photo too large {size=%d bytes}", a2, Integer.valueOf(length));
                this.c.a(xjo.PHOTO, xnd.UPDATE, "IMAGE_TOO_LARGE", (Exception) null);
                this.c.a(xnd.UPDATE, xjo.PHOTO, true, 2, 1);
                ((ybh) this.c).a.stats.numIoExceptions++;
                bArr2 = null;
            }
            SystemClock.elapsedRealtime();
            if (bArr2 != null) {
                int length2 = bArr2.length;
            }
            long j = longValue2 + 1;
            ContentProviderOperation.Builder a5 = xwc.a(longValue, longValue2);
            a5.withValue("data_sync1", xwz.a(a4, "REGENERATE_HASH_KEY"));
            long a6 = this.c.a();
            if (this.e.a() && ((Boolean) xgk.a.a()).booleanValue() && a6 == a) {
                ((xxg) this.e.b()).e(1);
            }
            return a5.withValue("data15", bArr2).withValue("data_sync3", a3).withValue("data_sync4", Long.valueOf(yau.a(j))).withValue("data_version", Long.valueOf(j));
        }
        return null;
    }
}
