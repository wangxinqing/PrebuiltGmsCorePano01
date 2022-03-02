package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: maz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class maz {
    public final mbb a;
    public final aucd b;
    private final lyp c;

    public maz(mbb mbb, lyp lyp) {
        byte[] bArr;
        Cursor query;
        this.a = mbb;
        this.c = lyp;
        try {
            SQLiteDatabase readableDatabase = mbb.a.getReadableDatabase();
            readableDatabase.beginTransaction();
            try {
                query = readableDatabase.query("t", new String[]{"a"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                if (query.moveToNext()) {
                    bArr = query.getBlob(0);
                    query.close();
                    readableDatabase.endTransaction();
                } else {
                    bArr = new byte[0];
                    query.close();
                    readableDatabase.endTransaction();
                }
                readableDatabase.close();
            } catch (Throwable th) {
                readableDatabase.endTransaction();
                readableDatabase.close();
                throw th;
            }
        } catch (RuntimeException e) {
            mbb.b.a((Throwable) e);
            bArr = new byte[0];
        }
        aucd o = lym.h.o();
        this.b = o;
        if (bArr != null) {
            try {
                o.b(bArr, aubs.b());
            } catch (auda e2) {
                this.c.a((Throwable) e2);
            }
        }
    }

    public static maz a(Context context) {
        return new maz(new mbb(context, "dgp.db"), lyp.a(context));
    }

    public final long b() {
        return ((lym) this.b.b).c;
    }

    /* access modifiers changed from: package-private */
    public final long c() {
        return Math.max(0, b() - System.currentTimeMillis()) / 1000;
    }

    public final int d() {
        return ((lym) this.b.b).g;
    }

    /* access modifiers changed from: package-private */
    public final long e() {
        if (f() <= 1) {
            return 0;
        }
        long d = axew.a.a().d();
        return Math.max(Math.min(axew.b(), d << ((int) Math.min((long) (f() - 2), ((long) Long.numberOfLeadingZeros(d)) - 1))) - Math.max(0, (System.currentTimeMillis() - ((lym) this.b.b).d) / 1000), 0);
    }

    public final int f() {
        return ((lym) this.b.b).e;
    }

    public final long a() {
        return ((lym) this.b.b).b;
    }

    public final void a(Integer num) {
        if (num != null) {
            aucd aucd = this.b;
            int intValue = num.intValue();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            lym lym = (lym) aucd.b;
            lym lym2 = lym.h;
            lym.a |= 32;
            lym.g = intValue;
            return;
        }
        aucd aucd2 = this.b;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        lym lym3 = (lym) aucd2.b;
        lym lym4 = lym.h;
        lym3.a &= -33;
        lym3.g = 0;
    }

    public final void a(Throwable th) {
        aucd aucd = this.b;
        lyi b2 = lyp.b(th);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        lym lym = (lym) aucd.b;
        lym lym2 = lym.h;
        b2.getClass();
        lym.f = b2;
        lym.a |= 16;
        this.a.a(((lym) this.b.i()).k());
    }
}
