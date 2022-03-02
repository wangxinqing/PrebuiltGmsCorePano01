package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.ContactsContract;

/* renamed from: ablq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ablq extends jta {
    private final String c;

    public ablq(Context context, String str) {
        super(context);
        this.c = str;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        Context context = getContext();
        Cursor query = context.getContentResolver().query(Uri.withAppendedPath(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.valueOf(this.c).longValue()), "photo"), new String[]{"data15"}, (String) null, (String[]) null, (String) null);
        byte[] bArr = null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    bArr = query.getBlob(query.getColumnIndex("data15"));
                }
            } finally {
                query.close();
            }
        }
        return bArr != null ? amri.c(iqw.a(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, jpr.a()))) : ampu.a;
    }
}
