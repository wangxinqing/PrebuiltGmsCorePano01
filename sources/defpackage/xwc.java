package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.ContactsContract;

/* renamed from: xwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xwc {
    public static ContentProviderOperation.Builder a(long j) {
        return ContentProviderOperation.newDelete(ContentUris.withAppendedId(xvw.a(ContactsContract.Data.CONTENT_URI), j));
    }

    public static ContentProviderOperation.Builder a(long j, long j2) {
        Uri withAppendedId = ContentUris.withAppendedId(xvw.a(ContactsContract.Data.CONTENT_URI), j);
        StringBuilder sb = new StringBuilder(33);
        sb.append("data_version=");
        sb.append(j2);
        return ContentProviderOperation.newUpdate(withAppendedId).withSelection(sb.toString(), (String[]) null);
    }
}
