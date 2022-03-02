package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;

/* renamed from: yhq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yhq extends ygu {
    private final ygj a;
    private final yhr b;

    public yhq(ygj ygj, apgu[] apguArr) {
        super("BulkRegisterOperationCall", avtj.BULK_REGISTER);
        iva.a((Object) ygj);
        this.a = ygj;
        this.b = new yhr(apguArr);
    }

    private final void a(Context context, yhx[] yhxArr) {
        String str = null;
        int i = 1;
        boolean z = true;
        for (yhx yhx : yhxArr) {
            if (yhx != null) {
                int i2 = yhx.c;
                if (i2 - 1 > i - 1 && yhs.a(yhx.a, i2)) {
                    i = yhx.c;
                    str = yhx.a;
                }
            } else {
                z = false;
            }
        }
        if (i != 1) {
            yij.a(context, i, str);
        }
        if (z) {
            this.a.a(Status.a);
            return;
        }
        throw new yfy(29507);
    }

    public final void b(Context context) {
        yhr yhr = this.b;
        yhr.a();
        apgu[] apguArr = yhr.a;
        yhx[] yhxArr = new yhx[apguArr.length];
        boolean z = false;
        for (int i = 0; i < apguArr.length; i++) {
            try {
                yhx b2 = yhy.b(context, apguArr[i], (String) null);
                yhxArr[i] = b2;
                boolean z2 = true;
                if (!b2.b && !apguArr[i].i) {
                    z2 = false;
                }
                z |= z2;
            } catch (yfy e) {
            }
        }
        if (z) {
            yhj.a();
        }
        yhr.b = yhxArr;
        a(context, yhr.b);
    }

    public final avst a() {
        int i;
        yhx[] yhxArr = this.b.b;
        String str = null;
        if (yhxArr != null) {
            i = 1;
            for (yhx yhx : yhxArr) {
                if (yhx != null) {
                    int i2 = yhx.c;
                    if (i2 - 1 > i - 1) {
                        str = yhx.a;
                        i = i2;
                    }
                }
            }
        } else {
            i = 1;
        }
        avss avss = (avss) avst.m.o();
        if (str != null) {
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst = (avst) avss.b;
            str.getClass();
            avst.a = 1 | avst.a;
            avst.b = str;
        }
        int i3 = i - 1;
        if (avss.c) {
            avss.c();
            avss.c = false;
        }
        avst avst2 = (avst) avss.b;
        avst2.a |= 64;
        avst2.j = i3;
        return (avst) avss.i();
    }

    public final void b(Context context, yfw yfw) {
        yhr yhr = this.b;
        yhr.a();
        apgu[] apguArr = yhr.a;
        yhx[] yhxArr = new yhx[apguArr.length];
        SQLiteDatabase writableDatabase = yfw.getWritableDatabase();
        writableDatabase.beginTransaction();
        int i = 0;
        boolean z = false;
        while (i < apguArr.length) {
            try {
                try {
                    yhx a2 = yhy.a(context, writableDatabase, apguArr[i], (String) null);
                    yhxArr[i] = a2;
                    boolean z2 = true;
                    if (!a2.b && !apguArr[i].i) {
                        z2 = false;
                    }
                    z |= z2;
                } catch (yfy e) {
                }
                i++;
            } finally {
                writableDatabase.endTransaction();
            }
        }
        writableDatabase.setTransactionSuccessful();
        if (z) {
            yhj.a();
        }
        yhr.b = yhxArr;
        a(context, yhr.b);
    }

    public final void a(Status status) {
        this.a.a(status);
    }

    public final avst[] b() {
        apgu[] apguArr = this.b.a;
        if (apguArr == null) {
            return null;
        }
        int length = apguArr.length;
        avst[] avstArr = new avst[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            apgu apgu = apguArr[i];
            if (apgu == null) {
                return null;
            }
            int i3 = i2 + 1;
            avss avss = (avss) avst.m.o();
            String str = apgu.d;
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst = (avst) avss.b;
            str.getClass();
            int i4 = avst.a | 1;
            avst.a = i4;
            avst.b = str;
            int i5 = apgu.e;
            avst.a = i4 | 2;
            avst.c = i5;
            avss.a(apgu.f);
            avss.b(apgu.g);
            avstArr[i2] = (avst) avss.i();
            i++;
            i2 = i3;
        }
        return avstArr;
    }
}
