package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService;

/* renamed from: yib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yib extends ygu {
    private final ygj a;
    private final byte[] b;
    private final avta c = ((avta) avtd.h.o());

    public yib(ygj ygj, byte[] bArr) {
        super("SetDogfoodsTokenOperationCall", avtj.SET_DOGFOODS_TOKEN);
        iva.a((Object) ygj);
        this.a = ygj;
        this.b = bArr;
    }

    public final avst a() {
        return null;
    }

    public final void b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public final avtd c() {
        return (avtd) this.c.i();
    }

    public final void a(Status status) {
        this.a.f(status);
    }

    public final void b(Context context, yfw yfw) {
        SQLiteDatabase writableDatabase = yfw.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", 0);
            contentValues.put("token", this.b);
            writableDatabase.insertWithOnConflict("DogfoodsToken", (String) null, contentValues, 5);
            writableDatabase.setTransactionSuccessful();
            try {
                HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = new HeterodyneSyncTaskChimeraService();
                heterodyneSyncTaskChimeraService.a(context);
                heterodyneSyncTaskChimeraService.a(10, (String) null, this.c, "Mobdog");
                this.a.f(Status.a);
            } catch (Exception e) {
                throw new yfy(29504, "Sync failed", e);
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }
}
