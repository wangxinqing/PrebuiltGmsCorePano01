package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;

/* renamed from: adta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adta extends adso {
    private final adsv a;
    private final String b;
    private final byte[] c;
    private final String d;
    private final int[] e;
    private final int f;
    private final Context g;
    private final acwd h;

    public final void a(Status status, boolean z, ConsentInformation consentInformation) {
        if (z) {
            try {
                this.a.a(this.d, consentInformation, new adtd(this.b, this.c, this.e, this.f, this.g, this.h));
            } catch (RemoteException e2) {
                this.h.a((Exception) e2);
            }
        } else {
            this.h.a((Exception) new IllegalStateException("Not allowed to log."));
        }
    }

    public adta(adsv adsv, String str, byte[] bArr, String str2, int[] iArr, int i, Context context, acwd acwd) {
        this.a = adsv;
        this.b = str;
        this.c = bArr;
        this.d = str2;
        this.e = iArr;
        this.f = i;
        this.h = acwd;
        this.g = context;
        new hol(context, (String) null, (String) null);
    }
}
