package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: qlz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qlz extends jba {
    private final qlx a;
    private final qfy d;
    private final String e;

    public qlz(qlx qlx, qfy qfy, String str) {
        super(121, "FetchStorageOperation");
        this.a = qlx;
        this.d = qfy;
        this.e = str;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        try {
            qfy qfy = this.d;
            Status status = Status.a;
            qlx qlx = this.a;
            String str = this.e;
            iva.c(str);
            qlx.a();
            byte[] a2 = qlx.d.a(str.getBytes(qlx.b));
            if (a2 != null) {
                qix qix = (qix) aucj.a((aucj) qix.b, a2, aubs.b());
                Signature[] signatureArr = qlx.c.getPackageInfo(str, 64).signatures;
                for (byte[] bArr : auga.a.a((Iterable) qix.a)) {
                    int length = signatureArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            qlx.a.b("Installed app key is different from the instant app.", new Object[0]);
                            throw new qlw("Installed app doesn't have the same signature as the instant app.");
                        } else if (!Arrays.equals(bArr, signatureArr[i].toByteArray())) {
                            i++;
                        }
                    }
                }
                File b = qlx.b(str);
                if (b.exists()) {
                    qfy.a(status, ParcelFileDescriptor.open(b, 268435456));
                    return;
                }
                throw new qlw("No app data found.");
            }
            qlx.a(str);
            throw new qlw("Unknown package.");
        } catch (PackageManager.NameNotFoundException e2) {
            throw new qlw("App not installed.");
        } catch (IOException e3) {
            qmb.a.a(e3, "Unexpected fetch app data error.", new Object[0]);
            this.d.a(Status.c, (ParcelFileDescriptor) null);
        } catch (qlw e4) {
            qmb.a.a(e4, "Failed to fetch app data.", new Object[0]);
            this.d.a(Status.c, (ParcelFileDescriptor) null);
        }
    }
}
