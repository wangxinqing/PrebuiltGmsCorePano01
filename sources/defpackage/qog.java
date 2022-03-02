package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* renamed from: qog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qog {
    private final ContentResolver a;
    private final qoh b = qoh.a();
    private final qof c;

    public qog(ContentResolver contentResolver, qof qof) {
        this.a = contentResolver;
        this.c = qof;
    }

    public final Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        CancellationSignal cancellationSignal;
        try {
            ContentResolver contentResolver = this.a;
            qof qof = this.c;
            if (qof != null) {
                cancellationSignal = qof.a();
            } else {
                cancellationSignal = null;
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        } catch (SecurityException e) {
            new Object[1][0] = e;
            this.b.a(1);
            return null;
        } catch (SQLiteException e2) {
            new Object[1][0] = e2;
            this.b.a(2);
            return null;
        } catch (NullPointerException e3) {
            new Object[1][0] = e3;
            this.b.a(3);
            return null;
        } catch (NoClassDefFoundError e4) {
            new Object[1][0] = e4;
            this.b.a(4);
            return null;
        } catch (OperationCanceledException e5) {
            new Object[1][0] = e5;
            this.b.a(5);
            return null;
        }
    }
}
