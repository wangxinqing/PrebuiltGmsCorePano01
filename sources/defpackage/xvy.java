package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.provider.ContactsContract;

/* renamed from: xvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xvy extends xvx {
    public final ContentResolver c;

    public xvy(Account account, boolean z, ContentResolver contentResolver, xwp xwp, yaz yaz) {
        super(xvw.a(ContactsContract.RawContacts.CONTENT_URI, account, z), xwp, yaz);
        this.c = contentResolver;
    }
}
