package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: hkt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hkt extends hkf {
    private final ifu b;
    private final byte[] c;

    public hkt(ifu ifu, Account account, Bundle bundle) {
        super("VerifyEncryptionKey", account);
        iva.a((Object) ifu);
        this.b = ifu;
        this.c = (byte[]) iva.a((Object) bundle.getByteArray("encryption_key"));
    }

    public final void a(Status status) {
        this.b.a(status);
    }

    public final void b(Context context) {
        boolean a;
        try {
            hmg hmg = (hmg) aucj.a((aucj) hmg.e, this.c, aubs.c());
            try {
                hnh hnh = (hnh) hnh.a.b();
                pyv pyv = this.a;
                hiw a2 = hiw.a(hmg);
                synchronized (hnh.d) {
                    a = hnh.a(pyv, a2);
                }
                if (a) {
                    ((hnl) hnl.a.b()).a(this.a);
                    this.b.a(Status.a);
                    return;
                }
                throw new hjm(1795, "Wrong passphrase.");
            } catch (hit e) {
                throw new hjm(1025, "Error when verifying passphrase cryptographer.", e);
            }
        } catch (auda e2) {
            throw new hjm(1793, "Error parsing the proto.", e2);
        }
    }
}
