package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;

/* renamed from: lkd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lkd extends nis {
    private final lkk a;
    private final lku b;
    private final boolean c;

    public lkd(lkk lkk, lku lku, boolean z) {
        super(11, "CloseCacheOperation");
        this.a = lkk;
        this.b = lku;
        this.c = z;
    }

    /* JADX INFO: finally extract failed */
    public final void a(Context context) {
        if (!this.a.e()) {
            SQLiteDatabase g = this.a.g();
            kpf h = this.a.h();
            h.g = lld.d.a(g);
            h.t();
            llg llg = llg.d;
            int i = 0;
            Cursor query = g.query(llg.b(), new String[]{llg.a.a()}, (String) null, (String[]) null, (String) null, (String) null, (String) null, "1");
            try {
                int count = query.getCount();
                query.close();
                int i2 = h.g;
                String a2 = lla.d.a(g, "snapshotLength");
                if (a2 != null) {
                    i = Integer.parseInt(a2);
                }
                int i3 = i2 - i;
                int intValue = ((Integer) jzq.ap.c()).intValue();
                this.a.f();
                if (!this.c) {
                    return;
                }
                if (count > 0 || i3 >= intValue) {
                    this.b.a();
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
    }

    public final void a(Status status) {
    }
}
