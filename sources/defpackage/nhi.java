package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.fonts.FontFetchResult;
import com.google.android.gms.fonts.FontMatchSpec;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: nhi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nhi implements Runnable {
    final FontMatchSpec a;
    final String b;
    final ngh c;
    final nhf d;

    public nhi(String str, FontMatchSpec fontMatchSpec, ngh ngh, nhf nhf) {
        this.b = str;
        this.a = fontMatchSpec;
        this.c = ngh;
        this.d = nhf;
    }

    public final void run() {
        ngz.c("FontsPackageChangeOp", "Requesting download of font %s to satisfy manifest dependency.", this.a);
        try {
            if (((FontFetchResult) this.d.a(this.a, this.b).get(10, TimeUnit.SECONDS)).b.c()) {
                ngh ngh = this.c;
                String str = this.b;
                FontMatchSpec fontMatchSpec = this.a;
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    sQLiteDatabase = ngh.getWritableDatabase();
                    try {
                        boolean a2 = ngh.a(str, fontMatchSpec, sQLiteDatabase);
                        ngh.c(sQLiteDatabase);
                        if (!a2) {
                            ngz.a("FontsPackageChangeOp", "Error adding manifest dependency for newly downloaded font %s", this.a);
                        }
                        ngz.c("FontsPackageChangeOp", "Download success: %s", this.a);
                    } catch (SQLiteException e) {
                        ngh.c(sQLiteDatabase);
                        ngz.a("FontsPackageChangeOp", "Error adding manifest dependency for newly downloaded font %s", this.a);
                    } catch (Throwable th) {
                        th = th;
                        ngh.c(sQLiteDatabase);
                        throw th;
                    }
                } catch (SQLiteException e2) {
                    ngh.c(sQLiteDatabase);
                    ngz.a("FontsPackageChangeOp", "Error adding manifest dependency for newly downloaded font %s", this.a);
                } catch (Throwable th2) {
                    th = th2;
                    ngh.c(sQLiteDatabase);
                    throw th;
                }
            } else {
                ngz.a("FontsPackageChangeOp", "Failure downloading font %s for manifest dependency.", this.a);
            }
        } catch (TimeoutException e3) {
            ngz.a("FontsPackageChangeOp", (Throwable) e3, "Failure downloading font %s for manifest dependency.", this.a);
        } catch (InterruptedException | ExecutionException e4) {
            ngz.a("FontsPackageChangeOp", e4, "Failure downloading font %s for manifest dependency.", this.a);
        }
    }
}
