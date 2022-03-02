package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;

/* renamed from: adsk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adsk extends adso {
    final /* synthetic */ adry a;
    final /* synthetic */ acwd b;

    public adsk(adry adry, acwd acwd) {
        this.a = adry;
        this.b = acwd;
    }

    public final void a(Status status, boolean z, ConsentInformation consentInformation) {
        this.a.a = consentInformation;
        ihd.a(status, Boolean.valueOf(z), this.b);
    }
}
