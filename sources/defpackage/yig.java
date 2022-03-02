package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;

/* renamed from: yig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yig extends ygu {
    private final ygj a;
    private final yih b;

    public yig(ygj ygj, String str, String str2) {
        super("UnregisterOperationCall", avtj.UNREGISTER);
        iva.a((Object) ygj);
        this.a = ygj;
        this.b = new yih(str, str2);
    }

    public final avst a() {
        yih yih = this.b;
        avss avss = (avss) avst.m.o();
        String str = yih.a;
        if (str != null) {
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst = (avst) avss.b;
            str.getClass();
            avst.a |= 1;
            avst.b = str;
        }
        return (avst) avss.i();
    }

    public final void b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /* JADX INFO: finally extract failed */
    public final void b(Context context, yfw yfw) {
        yih yih = this.b;
        if (yih.a != null) {
            SQLiteDatabase writableDatabase = yfw.getWritableDatabase();
            yfw.a(writableDatabase);
            try {
                yih.a = ygb.a(yih.a, yih.b);
                yih.a(writableDatabase, yih.a);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                this.a.d(Status.a);
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } else {
            throw new yfy(29500, "No package name");
        }
    }

    public final void a(Status status) {
        this.a.d(status);
    }
}
