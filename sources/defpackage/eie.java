package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.ApplicationInformation;

/* renamed from: eie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eie {
    public final Bundle a;

    public eie(Bundle bundle) {
        this.a = bundle;
    }

    public static eie a(Bundle bundle) {
        iva.a((Object) bundle);
        return new eie(bundle);
    }

    public final ApplicationInformation b() {
        Parcelable parcelable;
        if (this.a.containsKey("keyApplicationInformationAuthExtrasBundle")) {
            Bundle bundle = this.a.getBundle("keyApplicationInformationAuthExtrasBundle");
            bundle.setClassLoader(ApplicationInformation.class.getClassLoader());
            parcelable = bundle.getParcelable("keyApplicationInformationWrapperBundle");
        } else {
            parcelable = null;
        }
        return (ApplicationInformation) parcelable;
    }

    public final String c() {
        return this.a.getString("keyRemoteApplicationLabelString");
    }

    public final boolean d() {
        return b() == null;
    }

    public final aqll a() {
        if (!this.a.containsKey("keyTokenRequestOptionsAuthExtrasBundle")) {
            return null;
        }
        Bundle bundle = this.a.getBundle("keyTokenRequestOptionsAuthExtrasBundle");
        if (!bundle.containsKey("keyTokenRequestOptionsWrapperBundle")) {
            return null;
        }
        try {
            return (aqll) aucj.a((aucj) aqll.k, bundle.getByteArray("keyTokenRequestOptionsWrapperBundle"), aubs.c());
        } catch (auda e) {
            throw new IllegalStateException(e);
        }
    }
}
