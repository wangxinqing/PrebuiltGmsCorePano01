package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: wwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wwv implements Runnable {
    private final wwr a;
    private final Context b;
    private final String c;
    private final Set d;

    public wwv(wwr wwr, Context context, String str, Set set) {
        this.a = wwr;
        this.b = context;
        this.c = str;
        this.d = set;
    }

    public final void run() {
        Cursor query;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            HashSet hashSet = new HashSet();
            for (String str2 : this.d) {
                if (ycm.i(str2)) {
                    hashSet.addAll(wwx.a(this.b, ycm.g(str2)));
                } else if (ycm.j(str2)) {
                    ycm.e(str2);
                    hashSet.addAll(Collections.emptySet());
                } else if (wxh.e(str2)) {
                    hashSet.addAll(wwx.b(this.b, wxh.h(str2)));
                } else if (wxh.d(str2)) {
                    hashSet.addAll(wwx.a(this.b, this.c, wxh.f(str2)));
                } else if (wxh.a(str2)) {
                    hashSet.addAll(wxh.c(wxh.b(str2)));
                } else {
                    if (!ycm.k(str2)) {
                        str = "Invalid qualified ID";
                    } else {
                        str = "Unknown qualified ID type";
                    }
                    Log.w("ContactsDataLoader", str);
                }
            }
            query = this.b.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, wwu.a, (String) null, (String[]) null, (String) null);
            query.move(-1);
            while (query.moveToNext()) {
                int i = 0;
                if (!hashSet.contains(query.getString(0))) {
                    String[] strArr = new String[wwu.a.length];
                    int i2 = 0;
                    while (i2 < wwu.a.length) {
                        strArr[i2] = query.getString(i2);
                        i2++;
                        i = 0;
                    }
                    arrayList.add(new wvz(new wwj(query.getString(i), (String) null, (String) null, 0, strArr, true, true, (wwa) null)));
                }
            }
            query.close();
            this.a.a(Status.a, (wvz[]) arrayList.toArray(new wvz[arrayList.size()]));
        } catch (SecurityException e) {
            try {
                Log.e("ContactsDataLoader", "Error querying contact data:", e);
            } finally {
                this.a.a(Status.a, (wvz[]) arrayList.toArray(new wvz[arrayList.size()]));
            }
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
