package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;

/* renamed from: xwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xwi {
    public final ContentResolver a;
    public final Account b;

    public xwi(ContentResolver contentResolver, Account account) {
        this.a = contentResolver;
        this.b = account;
    }

    public static void a(String str, int i, yaz yaz) {
        if (i > 0 && ayrj.a.a().S()) {
            if (yaz != null && aysc.a.a().a()) {
                ((ybh) yaz).o += i;
                return;
            }
            wml.a();
            aucd o = xny.w.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            xny xny = (xny) o.b;
            xny.a |= 8;
            xny.e = 80;
            aucd o2 = xnq.h.o();
            aucd o3 = xno.o.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            xno xno = (xno) o3.b;
            xno.a |= 4;
            xno.e = i;
            xno xno2 = (xno) o3.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            xnq xnq = (xnq) o2.b;
            xno2.getClass();
            xnq.f = xno2;
            xnq.b |= 2;
            if (o.c) {
                o.c();
                o.c = false;
            }
            xny xny2 = (xny) o.b;
            xnq xnq2 = (xnq) o2.i();
            xnq2.getClass();
            xny2.n = xnq2;
            xny2.a |= 2048;
            aucd o4 = xol.w.o();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            xol xol = (xol) o4.b;
            xny xny3 = (xny) o.i();
            xny3.getClass();
            xol.d = xny3;
            xol.a |= 4;
            wmm.a(str, o4);
        }
    }

    public final int a(Uri uri, ContentValues contentValues, String str) {
        ContentResolver contentResolver = this.a;
        String[] strArr = xvw.a;
        return contentResolver.update(uri, contentValues, str, (String[]) null);
    }
}
