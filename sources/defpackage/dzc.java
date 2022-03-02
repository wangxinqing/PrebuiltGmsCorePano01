package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import java.util.HashMap;

/* renamed from: dzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dzc {
    public static final String[] d = {"_id", "contact_id", "mimetype", "is_primary", "is_super_primary", "data1", "data2", "data3"};
    public static final String[] f = {"_id", "contact_id"};
    public final Context a;
    public final HashMap b;
    final Uri c = ContactsContract.Data.CONTENT_URI;
    final Uri e = ContactsContract.RawContacts.CONTENT_URI;

    public dzc(Context context, HashMap hashMap) {
        this.a = context;
        this.b = hashMap;
    }
}
