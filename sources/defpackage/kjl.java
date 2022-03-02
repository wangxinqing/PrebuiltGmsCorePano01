package defpackage;

import com.google.android.gms.drive.DriveId;

/* renamed from: kjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kjl {
    public final khq a;
    public final String b;
    public final boolean c;
    public final DriveId d;
    public final long e;
    public final String f;
    public String g;
    public final Integer h;
    private final kkf i;
    private final khx j;
    private final lbq k;
    private final long l;
    private final knh m;

    private kjl(String str, khq khq, boolean z, DriveId driveId, long j2, String str2, kkf kkf, khx khx, long j3, knh knh, String str3, Integer num, lbq lbq) {
        lbq lbq2 = lbq;
        iva.a((Object) str, (Object) "Null metadata json provided in upload request.");
        this.b = str;
        this.a = khq;
        this.c = z;
        this.d = driveId;
        this.e = j2;
        this.g = str2;
        this.i = kkf;
        this.j = khx;
        this.l = j3;
        this.m = knh;
        this.f = str3;
        this.h = num;
        iva.a((Object) lbq2, (Object) "Null MIME type provided in upload request.");
        this.k = lbq2;
    }

    public static kjl a(kmp kmp, lsm lsm, long j2, String str, String str2, boolean z, khq khq, Integer num, lbq lbq) {
        DriveId driveId;
        lsm lsm2 = lsm;
        iva.a((Object) lbq);
        String i2 = kmp.i();
        DriveId driveId2 = null;
        if (z) {
            driveId = null;
        } else {
            if (i2 != null) {
                driveId2 = kmp.g();
            }
            driveId = driveId2;
        }
        kkf kkf = lsm2.d;
        kor e2 = kkf.e(j2);
        knh d2 = kkf.d(e2.a);
        return new kjl(str2, khq, z, driveId, d2.f, e2.c, kkf, lsm2.k, j2, d2, str, num, lbq);
    }

    public final String b() {
        return this.k.a;
    }

    public final lsr a() {
        return this.j.b(this.m.a);
    }

    public final void a(String str) {
        this.g = str;
        kor e2 = this.i.e(this.l);
        e2.c = this.g;
        e2.t();
    }
}
