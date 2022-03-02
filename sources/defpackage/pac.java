package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: pac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pac {
    public pan a;
    public final Map b = new HashMap();

    public final String a(ContentResolver contentResolver, Uri uri, String str, String[] strArr, String[] strArr2, long j, String str2) {
        pan pan;
        e();
        String[] strArr3 = {str, Long.toString(j), str2};
        try {
            ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
            if (acquireUnstableContentProviderClient == null) {
                oso.e("Could not connect to content provider %s", (Object) uri);
                pan = null;
            } else {
                try {
                    Cursor query = acquireUnstableContentProviderClient.query(uri, (String[]) null, (String) null, strArr3, (String) null);
                    if (query != null) {
                        pan = new pan(acquireUnstableContentProviderClient, query);
                    } else {
                        acquireUnstableContentProviderClient.release();
                        pan = null;
                    }
                } catch (Throwable th) {
                    acquireUnstableContentProviderClient.release();
                    throw new pam(th);
                }
            }
            this.a = pan;
            if (pan != null) {
                try {
                    String a2 = dun.a(pan.b);
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            String str3 = strArr[i];
                            int a3 = this.a.a(str3);
                            if (a3 == -1) {
                                oso.b("Column %s was not returned by client, refusing to index", (Object) str3);
                                e();
                                break;
                            }
                            this.b.put(str3, Integer.valueOf(a3));
                            i++;
                        } else {
                            for (String str4 : strArr2) {
                                int a4 = this.a.a(str4);
                                if (a4 != -1) {
                                    this.b.put(str4, Integer.valueOf(a4));
                                }
                            }
                            d();
                        }
                    }
                    return a2;
                } catch (Throwable th2) {
                    throw new pam(th2);
                }
            } else {
                oso.a("Cursor for %s is null, %s", (Object) str, (Object) uri);
                return null;
            }
        } finally {
            pam pam = new pam(th2);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.a == null;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.a != null;
    }

    public final long c() {
        pan pan = this.a;
        if (pan != null) {
            return pan.a(((Integer) this.b.get("seqno")).intValue());
        }
        return Long.MAX_VALUE;
    }

    public final boolean d() {
        pan pan = this.a;
        if (pan == null) {
            return false;
        }
        try {
            if (pan.b.moveToNext()) {
                return true;
            }
            e();
            return false;
        } catch (Throwable th) {
            throw new pam(th);
        }
    }

    public final void e() {
        this.b.clear();
        pan pan = this.a;
        if (pan != null) {
            try {
                pan.b.close();
                pan.a.release();
                this.a = null;
            } catch (Throwable th) {
                pan.a.release();
                throw th;
            }
        }
    }

    public final byte[] b(String str) {
        Integer num;
        if (this.a == null || (num = (Integer) this.b.get(str)) == null) {
            return null;
        }
        pan pan = this.a;
        try {
            return pan.b.getBlob(num.intValue());
        } catch (Throwable th) {
            throw new pam(th);
        }
    }

    public final String a(String str) {
        Integer num;
        if (this.a == null || (num = (Integer) this.b.get(str)) == null) {
            return null;
        }
        pan pan = this.a;
        try {
            return pan.b.getString(num.intValue());
        } catch (Throwable th) {
            throw new pam(th);
        }
    }
}
