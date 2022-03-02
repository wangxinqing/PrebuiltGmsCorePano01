package defpackage;

import android.content.ContentValues;
import com.google.android.gms.drive.Permission;

/* renamed from: kmu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kmu extends kqq {
    public static final /* synthetic */ int l = 0;
    public String a;
    public String b;
    public String c;
    public int d;
    public String e;
    public int f;
    public Integer g;
    public Long h;
    public boolean i;
    public Boolean j;
    public Long k;
    private long n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kmu(kqg kqg, long j2, long j3, String str, String str2, String str3, int i2, String str4, int i3, Long l2, Long l3, boolean z, Boolean bool, Long l4) {
        super(kqg, kmx.a, j2);
        kqg kqg2 = kqg;
        long j4 = j2;
        iva.a(Permission.a(i2));
        boolean z2 = true;
        if (!Permission.b(this.f) && this.f != -100) {
            z2 = false;
        }
        iva.a(z2);
        this.n = j3;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i2;
        this.e = str4;
        this.f = i3;
        this.g = l2 != null ? Integer.valueOf(l2.intValue()) : null;
        this.h = l3;
        this.i = z;
        this.j = bool;
        this.k = l4;
    }

    public final void a(int i2, long j2) {
        boolean z = true;
        if (!Permission.b(i2) && i2 != -100) {
            z = false;
        }
        iva.a(z);
        if (this.h == null) {
            this.g = Integer.valueOf(this.f);
        }
        this.f = i2;
        this.h = Long.valueOf(j2);
    }

    public final boolean b() {
        return this.f == -100;
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        contentValues.put(kmw.ENTRY_ID.m.a(), Long.valueOf(this.n));
        contentValues.put(kmw.PERMISSION_ID.m.a(), this.a);
        contentValues.put(kmw.ACCOUNT_IDENTIFIER.m.a(), this.b);
        contentValues.put(kmw.ACCOUNT_NAME.m.a(), this.c);
        contentValues.put(kmw.ACCOUNT_TYPE.m.a(), Integer.valueOf(this.d));
        contentValues.put(kmw.PHOTO_LINK.m.a(), this.e);
        contentValues.put(kmw.ROLE.m.a(), Integer.valueOf(this.f));
        contentValues.put(kmw.GENOA_ROLE_VALUE.m.a(), this.g);
        contentValues.put(kmw.GENOA_ROLE_ACTION_ID.m.a(), this.h);
        contentValues.put(kmw.IS_LINK_REQUIRED.m.a(), Boolean.valueOf(this.i));
        contentValues.put(kmw.GENOA_IS_LINK_REQUIRED_VALUE.m.a(), this.j);
        contentValues.put(kmw.GENOA_IS_LINK_REQUIRED_ACTION_ID.m.a(), this.k);
    }

    public kmu(kqg kqg, long j2, String str, String str2, String str3, int i2, String str4, int i3, Long l2, Long l3, boolean z, Boolean bool, Long l4) {
        this(kqg, -1, j2, str, str2, str3, i2, str4, i3, l2, l3, z, bool, l4);
    }

    public final void a(kke kke) {
        iva.a(kke.b());
        if (this.h == null) {
            kke.b(this);
            return;
        }
        this.g = -100;
        kke.a((kqi) this);
    }

    public final void a(kke kke, com.google.android.gms.drive.internal.model.Permission permission) {
        int b2;
        int a2 = lrz.a(permission);
        if (a2 != -1 && (b2 = lrz.b(permission)) != -1) {
            this.a = permission.e;
            this.d = b2;
            this.b = lrz.c(permission);
            this.c = permission.f;
            this.e = permission.g;
            if (this.h != null) {
                this.g = Integer.valueOf(a2);
            } else {
                this.f = a2;
            }
            boolean z = permission.k;
            if (this.k != null) {
                this.j = Boolean.valueOf(z);
            } else {
                this.i = z;
            }
            kke.a((kqi) this);
        }
    }

    public final void a(boolean z, long j2) {
        if (this.k == null) {
            this.j = Boolean.valueOf(this.i);
        }
        this.i = z;
        this.k = Long.valueOf(j2);
    }
}
