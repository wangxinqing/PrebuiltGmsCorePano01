package defpackage;

import android.accounts.Account;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: aexq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aexq implements Callable {
    private static final int a = aulx.d.a();
    private final int b;
    private final byte[] c;
    private final aexs d;

    public aexq(aext aext, String str, Account account, int i) {
        this.b = i;
        this.c = String.valueOf(i).getBytes(amqn.c);
        aesz b2 = aeta.b();
        b2.a(this.c, 1);
        aext aext2 = aext;
        String str2 = str;
        Account account2 = account;
        this.d = aext2.a(str2, account2, 553, a, b2.a());
    }

    /* renamed from: a */
    public final aete call() {
        for (aetb aetb : this.d.call()) {
            if (Arrays.equals(this.c, aetb.b())) {
                try {
                    aulx a2 = aeuz.a(aetb.a());
                    aetd aetd = new aetd();
                    aetd.a = Integer.valueOf(this.b);
                    aetd.b = Boolean.valueOf(a2.a);
                    aetd.c = Boolean.valueOf(a2.b);
                    aetd.d = Long.valueOf(aetb.c());
                    String str = aetd.a == null ? " corpusGroup" : "";
                    if (aetd.b == null) {
                        str = str.concat(" enabled");
                    }
                    if (aetd.c == null) {
                        str = String.valueOf(str).concat(" unset");
                    }
                    if (aetd.d == null) {
                        str = String.valueOf(str).concat(" lastModifiedTimeMicros");
                    }
                    if (str.isEmpty()) {
                        return new aesu(aetd.a.intValue(), aetd.b.booleanValue(), aetd.c.booleanValue(), aetd.d.longValue());
                    }
                    String valueOf = String.valueOf(str);
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                } catch (auda e) {
                    throw new aepg(3, String.format(Locale.ENGLISH, "Failed to parse RecordingSetting footprint.", new Object[0]), e);
                }
            }
        }
        return null;
    }
}
