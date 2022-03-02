package defpackage;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import java.util.Set;

/* renamed from: ablw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ablw extends jta {
    private final Set c;
    private final boolean d;

    public ablw(Context context, Set set, boolean z) {
        super(context);
        this.c = set;
        this.d = z;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        for (String parseLong : this.c) {
            Uri withAppendedId = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.parseLong(parseLong));
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("starred", Integer.valueOf(this.d ? 1 : 0));
            getContext().getContentResolver().update(withAppendedId, contentValues, (String) null, (String[]) null);
        }
        return Boolean.valueOf(this.d);
    }
}
