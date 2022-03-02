package defpackage;

import android.accounts.Account;
import com.google.android.gms.leveldb.LevelDb;
import java.nio.ByteBuffer;

/* renamed from: ajir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajir {
    public final long a;

    public ajir(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.a = wrap.getLong();
        wrap.getLong();
    }

    public static byte[] a(Account account, long j) {
        return a(account, j, 0);
    }

    private static long b(Account account) {
        long j = 1125899906842597L;
        for (int i = 0; i < account.name.length(); i++) {
            j = (j * 31) + ((long) account.name.charAt(i));
        }
        return j;
    }

    private static byte[] a(Account account, long j, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        allocate.putLong(b(account));
        allocate.putLong(j ^ Long.MAX_VALUE);
        allocate.putInt(i);
        return allocate.array();
    }

    static byte[] b(Account account, long j) {
        return a(account, j, -1);
    }

    public static byte[] a(Account account, long j, ajjr ajjr) {
        return a(account, j, System.identityHashCode(ajjr));
    }

    /* access modifiers changed from: package-private */
    public final byte[] b() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        allocate.putLong(this.a);
        allocate.putLong(-1);
        allocate.putInt(-1);
        return allocate.array();
    }

    public static byte[] a(Account account, long j, ajjs ajjs) {
        return a(account, j, System.identityHashCode(ajjs));
    }

    /* access modifiers changed from: package-private */
    public final void a(LevelDb.Iterator iterator) {
        if (this.a != -1) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putLong(this.a + 1);
            iterator.seek(allocate.array());
            return;
        }
        iterator.seekToLast();
        if (iterator.isValid()) {
            iterator.next();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Account account) {
        return this.a == b(account);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.List, java.lang.Iterable] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.Iterable r5) {
        /*
            r4 = this;
            int r0 = r5.size()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x001a
            int r3 = r2 + 1
            java.lang.Object r2 = r5.get(r2)
            android.accounts.Account r2 = (android.accounts.Account) r2
            boolean r2 = r4.a((android.accounts.Account) r2)
            if (r2 != 0) goto L_0x0018
            r2 = r3
            goto L_0x0006
        L_0x0018:
            r5 = 1
            return r5
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajir.a(java.lang.Iterable):boolean");
    }

    /* access modifiers changed from: package-private */
    public final byte[] a() {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(this.a);
        return allocate.array();
    }
}
