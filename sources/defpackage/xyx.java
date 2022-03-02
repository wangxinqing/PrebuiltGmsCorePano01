package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import java.util.zip.CRC32;

/* renamed from: xyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xyx {
    public final Account a;
    public final ContentResolver b;
    public final xvw c;
    public final xvp d;

    public xyx(Account account, ContentResolver contentResolver, xvw xvw, xvp xvp) {
        this.a = account;
        this.b = contentResolver;
        this.c = xvw;
        this.d = xvp;
    }

    public static long a(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        return crc32.getValue();
    }
}
