package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import java.util.Arrays;

/* renamed from: abem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abem extends nis {
    private final String a;
    private final int b;
    private final String c;
    private final RecordConsentRequest d;
    private final abdr e;

    public abem(String str, int i, String str2, RecordConsentRequest recordConsentRequest, abdr abdr) {
        super(44, "RecordConsent");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = recordConsentRequest;
        this.e = abdr;
    }

    public final void a(Context context) {
        RecordConsentRequest recordConsentRequest = this.d;
        qah a2 = qah.a(recordConsentRequest.b, (Iterable) Arrays.asList(recordConsentRequest.c));
        a2.a(this.a, this.b);
        a2.a(4);
        a2.a(gda.GRANTED);
        a2.b(this.c);
        this.e.b(!abfa.a(context).a(a2.a()).a() ? new Status(13) : Status.a);
    }

    public final void a(Status status) {
        this.e.b(status);
    }
}
