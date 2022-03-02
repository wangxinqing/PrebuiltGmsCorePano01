package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* renamed from: lka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class lka extends nis {
    private static final ith b = new ith("CachingOp", "");
    protected final lkk a;

    public lka(String str, lkk lkk) {
        super(11, str);
        this.a = lkk;
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: protected */
    public abstract void a(SQLiteDatabase sQLiteDatabase);

    /* access modifiers changed from: protected */
    public final kpf b() {
        return this.a.h();
    }

    public final void a(Context context) {
        SQLiteDatabase g;
        synchronized (this.a) {
            if (!this.a.e()) {
                try {
                    g = this.a.g();
                    g.beginTransaction();
                    a(g);
                    if (this.a.e()) {
                        g.endTransaction();
                        return;
                    }
                    g.setTransactionSuccessful();
                    g.endTransaction();
                    a();
                } catch (Exception e) {
                    throw new nja(8, String.format(Locale.US, "Unexpected exception while applying operation %s for %s", new Object[]{this.m, this.a}), (PendingIntent) null, e);
                } catch (Throwable th) {
                    g.endTransaction();
                    throw th;
                }
            }
        }
    }

    public final void a(Status status) {
        b.b("CachingOp", "Operation failed: %s", status);
    }
}
