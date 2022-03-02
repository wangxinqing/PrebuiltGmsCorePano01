package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.people.internal.MatrixCursorParcelable;

/* renamed from: xqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xqp extends xqg {
    private final wzv a;
    private final Uri b;
    private final String[] c;
    private final String d;
    private final String[] e;
    private final String f;

    public xqp(String str, int i, wzv wzv, Uri uri, String[] strArr, String str2, String[] strArr2, String str3) {
        super(str, i, (String) null, "QueryGalProvider");
        this.a = wzv;
        this.b = uri;
        this.c = strArr;
        this.d = str2;
        this.e = strArr2;
        this.f = str3;
    }

    private final void a(xqy xqy, MatrixCursorParcelable matrixCursorParcelable) {
        wzv wzv = this.a;
        if (wzv != null) {
            try {
                wzv.a(xqy.a, matrixCursorParcelable);
            } catch (RemoteException e2) {
                Log.e("QueryGalProviderOperation", "Operation failed remotely: ", e2);
            }
        }
    }

    public final void b(Context context) {
        Cursor query;
        if (ayxm.b()) {
            try {
                query = context.getContentResolver().query(this.b, this.c, this.d, this.e, this.f);
                a(xqy.c, new MatrixCursorParcelable(query));
                if (query != null) {
                    query.close();
                    return;
                }
                return;
            } catch (UnsupportedOperationException e2) {
                a(xqy.i, (MatrixCursorParcelable) null);
                return;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            Log.w("QueryGalProviderOperation", "GalProvider delegation disabled.");
            a(xqy.i, (MatrixCursorParcelable) null);
            return;
        }
        throw th;
    }
}
