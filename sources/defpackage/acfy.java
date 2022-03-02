package defpackage;

import android.util.Log;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;

/* renamed from: acfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acfy implements aora {
    final /* synthetic */ acga a;

    public acfy(acga acga) {
        this.a = acga;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Assertion assertion = (Assertion) obj;
        acga.a.b("onSuccess", new Object[0]);
        if (assertion != null) {
            acga acga = this.a;
            acfz acfz = acga.f;
            if (acfz == null) {
                acga.h = true;
            } else {
                acfz.a();
            }
        } else {
            acga acga2 = this.a;
            acfz acfz2 = acga2.f;
            if (acfz2 == null) {
                acga2.j = true;
            } else {
                acfz2.b();
            }
        }
    }

    public final void a(Throwable th) {
        acga.a.b("onFailure", new Object[0]);
        iwd iwd = acga.a;
        Object[] objArr = new Object[0];
        if (iwd.a(3) || !acpz.a()) {
            acpz acpz = (acpz) iwd;
            Log.d(acpz.b, acpz.h("Error: ", objArr), th);
        }
        acga acga = this.a;
        acfz acfz = acga.f;
        if (acfz != null) {
            acfz.b();
        } else {
            acga.j = true;
        }
    }
}
