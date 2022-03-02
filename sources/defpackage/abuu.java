package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: abuu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abuu implements Runnable {
    final /* synthetic */ abuv a;

    public abuu(abuv abuv) {
        this.a = abuv;
    }

    public final void run() {
        abuv abuv = this.a;
        abvc abvc = abuv.a;
        abxq abxq = abuv.b;
        abvc.a.c(2);
        acal.a(abvc.a, 14);
        abug abug = abvc.b;
        String str = null;
        if (abug.j && abug.g != null) {
            Status status = new Status(8);
            try {
                String str2 = ((abuc) abug.g).j;
                if (str2 != null) {
                    str = str2;
                } else {
                    abuc.a.a("Token is null. Returning dummy token: 12345", new Object[0]);
                    str = "12345";
                }
                try {
                    abug.a(abxq, Status.a, str);
                } catch (Throwable th) {
                    th = th;
                    abug.a(abxq, status, str);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                abug.a(abxq, status, str);
                throw th;
            }
        } else {
            abug.a(abxq, new Status(10552), (String) null);
        }
    }
}
