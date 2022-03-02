package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import java.util.Set;

/* renamed from: ablv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ablv extends jta {
    private final Set c;

    public ablv(Context context, Set set) {
        super(context);
        this.c = set;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        for (String parseLong : this.c) {
            Cursor query = getContext().getContentResolver().query(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.parseLong(parseLong)), new String[]{"starred"}, (String) null, (String[]) null, (String) null);
            if (query != null) {
                try {
                    if (query.moveToFirst() && query.getInt(0) == 1) {
                        query.close();
                        return true;
                    }
                } finally {
                    query.close();
                }
            }
        }
        return false;
    }
}
