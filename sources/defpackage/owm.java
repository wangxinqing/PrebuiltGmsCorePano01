package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.internal.MutateRequest;

/* renamed from: owm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class owm extends oxu implements owt {
    public final oxl a;
    final /* synthetic */ apms b;
    private final Context c;
    private final ovw d;
    private final owf e;
    private final oyb f;
    private final ifu g;
    private owv h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public owm(apms apms, Context context, oxc oxc, ifu ifu, MutateRequest mutateRequest, ovw ovw, owf owf, oyb oyb) {
        super(apms.c, oxc, apms.b, apms.d);
        boolean z;
        oxl oxl;
        this.b = apms;
        if (ovw != null) {
            z = true;
        } else if (owf == null) {
            z = false;
        } else {
            z = true;
        }
        iva.b(z);
        this.c = context;
        int i = mutateRequest.a;
        if (i == 1) {
            oxl = new oxs(mutateRequest.b);
        } else if (i == 2) {
            oxl = new oxm(mutateRequest.b);
        } else if (i == 3) {
            oxl = new oxo(mutateRequest.c);
        } else if (i == 4) {
            oxl = new oxn();
        } else if (i == 6) {
            oxl = new oxp(mutateRequest.d);
        } else if (i == 7) {
            oxl = new oxr(mutateRequest.e, mutateRequest.f, mutateRequest.g);
        } else {
            throw new IllegalArgumentException();
        }
        this.a = oxl;
        this.d = ovw;
        this.e = owf;
        this.f = oyb;
        this.g = ifu;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        if (this.e != null) {
            String str = this.b.e;
            if ("*".equals(axsm.d()) || jhx.a((Object[]) axsm.d().split(","), (Object) str)) {
                osf b2 = this.b.a.b();
                this.a.a(this.b.f, b2, this.f);
                this.a.a(b2, this.b.f, this.e);
                return null;
            }
        }
        this.b.a(this.d, this.f);
        osf b3 = this.b.a.b();
        this.a.a(this.b.f, b3, this.f);
        this.a.a(this.b.f, b3);
        SQLiteDatabase writableDatabase = this.d.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            int a2 = this.a.a();
            if (a2 > 0) {
                this.d.a(writableDatabase, this.b.f, b3, this.f, a2);
            }
            this.a.a(this.c, writableDatabase, this.d, this.b.f, this.f);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            this.a.a(this.d, this.b.f, b3);
            return null;
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Status status, Object obj) {
        Void voidR = (Void) obj;
        this.g.a(status);
    }

    public final void a(String str, aolx aolx) {
        super.a(str, aolx, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(String str, aolx aolx, Object obj) {
        Void voidR = (Void) obj;
        if (!ibt.b(oxz.a(aolx)) || !this.h.b()) {
            this.h.a();
            super.a(str, aolx, voidR);
        }
    }

    public final void a(owv owv) {
        this.h = owv;
        b();
        this.h = null;
    }
}
