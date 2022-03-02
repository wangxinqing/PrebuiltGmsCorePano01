package defpackage;

import android.database.Cursor;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: kks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kks implements kkp {
    public static final kks a = new kks();

    private kks() {
    }

    public final /* bridge */ /* synthetic */ Object a(kqg kqg, Cursor cursor) {
        lro lro;
        int i = knh.g;
        String a2 = knj.CONTENT_HASH.k.a(cursor);
        long longValue = knj.LAST_ACCESSED.k.b(cursor).longValue();
        long longValue2 = knj.SIZE_BYTES.k.b(cursor).longValue();
        String a3 = knj.INTERNAL_FILE_NAME.k.a(cursor);
        String a4 = knj.SHARED_FILE_NAME.k.a(cursor);
        if (a4 != null) {
            lro = new lro(new SecretKeySpec(cursor.getBlob(cursor.getColumnIndexOrThrow(knj.ENCRYPTION_KEY.k.a())), knj.ENCRYPTION_ALGORITHM.k.a(cursor)), knj.ENCRYPTION_ALGORITHM_PARAMETERS.k.a(cursor), cursor.getBlob(cursor.getColumnIndexOrThrow(knj.ENCRYPTION_ALGORITHM_IV.k.a())));
        } else {
            lro = null;
        }
        kng a5 = knh.a(kqg, a2, longValue, longValue2);
        a5.c = a3;
        iva.b(true, "encryptionSpec must be set if and only if sharedFilename is set.");
        a5.d = a4;
        a5.e = lro;
        return new knh(a5, true);
    }
}
