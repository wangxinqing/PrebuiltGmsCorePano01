package defpackage;

import android.content.Context;
import android.database.Cursor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.DogfoodsToken;

/* renamed from: yhf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yhf extends ygu {
    private final ygj a;

    public yhf(ygj ygj) {
        super("GetDogfoodsTokenOperationCall", avtj.GET_DOGFOODS_TOKEN);
        iva.a((Object) ygj);
        this.a = ygj;
    }

    public final avst a() {
        return null;
    }

    public final void b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public final void a(Status status) {
        this.a.a(status, (DogfoodsToken) null);
    }

    public final void b(Context context, yfw yfw) {
        byte[] bArr;
        Cursor query = yfw.getWritableDatabase().query("DogfoodsToken", new String[]{"token"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        try {
            if (query.moveToFirst()) {
                bArr = query.getBlob(0);
            } else {
                bArr = null;
            }
            if (query != null) {
                query.close();
            }
            this.a.a(Status.a, new DogfoodsToken(bArr));
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
