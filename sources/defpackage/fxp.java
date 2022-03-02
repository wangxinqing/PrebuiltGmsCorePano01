package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: fxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fxp implements aoqa {
    public static final anaf a;
    private final Context b;
    private final GoogleSignInOptions c;
    private final String d;
    private final amri e;

    static {
        anab h = anaf.h();
        h.a(5, 5);
        h.a(4, 4);
        h.a(17, 12500);
        h.a(16, 12500);
        h.a(7, 7);
        h.a(13, 12501);
        h.a(10, 10);
        a = h.a();
    }

    public fxp(Context context, GoogleSignInOptions googleSignInOptions, String str, amri amri) {
        this.b = context;
        this.c = googleSignInOptions;
        this.d = str;
        this.e = amri;
    }

    public static final aorr a(icc icc) {
        return aopr.a(qbc.a((icf) icc.a((idf) new abcr(icc))), fxm.a, (Executor) aoqm.a);
    }

    public final aorr a() {
        aorr aorr;
        GoogleSignInOptions googleSignInOptions = this.c;
        HashSet hashSet = new HashSet(googleSignInOptions.a());
        boolean z = true;
        if (!hashSet.contains(nlj.a) && !hashSet.contains(nlj.b) && !hashSet.contains(nlj.d) && !googleSignInOptions.q.containsKey(1)) {
            z = false;
        }
        ibz a2 = a(z);
        if (this.e.a()) {
            aorr = new qbb(a2, (FragmentActivity) this.e.b()).a;
        } else {
            aorr = qbc.a(a2);
        }
        return aopr.a(aooz.a(aorr, ibr.class, fxn.a, (Executor) aoqm.a), (aoqb) new fxk(this, z), (Executor) aoqm.a);
    }

    public final ibz a(boolean z) {
        amri amri;
        ibq ibq;
        Context context = this.b;
        GoogleSignInOptions googleSignInOptions = this.c;
        String str = this.d;
        abah abah = new abah();
        abah.g = true;
        abah.e = googleSignInOptions.n;
        abah.f = googleSignInOptions.p;
        if (googleSignInOptions.j) {
            String str2 = googleSignInOptions.m;
            abah.b = true;
            abah.a(str2);
            abah.c = str2;
        }
        if (googleSignInOptions.k) {
            String str3 = googleSignInOptions.m;
            abah.d = googleSignInOptions.l;
            abah.a = true;
            abah.a(str3);
            abah.c = str3;
        }
        ibz ibz = new ibz(context);
        ibz.a(abaf.c, (ibj) abah.a());
        ibz.b = str;
        ibz.a = googleSignInOptions.i;
        Set<Scope> hashSet = new HashSet<>(googleSignInOptions.a());
        if (fxj.a(googleSignInOptions)) {
            hashSet = fxj.a(hashSet);
        }
        for (Scope a2 : hashSet) {
            ibz.a(a2);
        }
        if (!z) {
            return ibz;
        }
        GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) this.c.q.get(1);
        if (googleSignInOptionsExtensionParcelable == null) {
            amri = ampu.a;
        } else {
            Bundle bundle = googleSignInOptionsExtensionParcelable.c;
            if (bundle != null) {
                iva.a((Object) bundle);
                nlh nlh = new nlh();
                if (bundle.containsKey("com.google.android.gms.games.key.isHeadless")) {
                    nlh.a = bundle.getBoolean("com.google.android.gms.games.key.isHeadless");
                }
                if (bundle.containsKey("com.google.android.gms.games.key.showConnectingPopup")) {
                    if (bundle.containsKey("com.google.android.gms.games.key.connectingPopupGravity")) {
                        boolean z2 = bundle.getBoolean("com.google.android.gms.games.key.showConnectingPopup");
                        int i = bundle.getInt("com.google.android.gms.games.key.connectingPopupGravity");
                        nlh.b = z2;
                        nlh.c = i;
                    } else {
                        nlh.b = bundle.getBoolean("com.google.android.gms.games.key.showConnectingPopup");
                        nlh.c = 17;
                    }
                }
                if (bundle.containsKey("com.google.android.gms.games.key.retryingSignIn")) {
                    nlh.d = bundle.getBoolean("com.google.android.gms.games.key.retryingSignIn");
                }
                if (bundle.containsKey("com.google.android.gms.games.key.sdkVariant")) {
                    nlh.e = bundle.getInt("com.google.android.gms.games.key.sdkVariant");
                }
                if (bundle.containsKey("com.google.android.gms.games.key.unauthenticated")) {
                    nlh.h = bundle.getBoolean("com.google.android.gms.games.key.unauthenticated");
                }
                String string = bundle.getString("com.google.android.gms.games.key.forceResolveAccountKey");
                if (string != null) {
                    iva.a((Object) string);
                    nlh.f = string;
                }
                if (bundle.containsKey("com.google.android.gms.games.key.skipWelcomePopup")) {
                    nlh.a(Boolean.valueOf(bundle.getBoolean("com.google.android.gms.games.key.skipWelcomePopup")));
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList("com.google.android.gms.games.key.proxyApis");
                if (stringArrayList != null) {
                    int size = stringArrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        nlh.g.add(stringArrayList.get(i2));
                    }
                }
                nlh.j = (GoogleSignInAccount) bundle.getParcelable("com.google.android.gms.games.key.googleSignInAccount");
                nlh.k = bundle.getString("com.google.android.gms.games.key.realClientPackageName", (String) null);
                if (bundle.containsKey("com.google.android.gms.games.key.API_VERSION")) {
                    nlh.l = bundle.getInt("com.google.android.gms.games.key.API_VERSION");
                }
                amri = amri.b(nlh.a());
            } else {
                amri = ampu.a;
            }
        }
        if (!this.c.a().contains(nlj.d)) {
            ibq = nlj.c;
        } else {
            ibq = nlj.e;
        }
        nlh nlh2 = new nlh((nli) amri.c());
        nlh2.a(true);
        ibz.a(ibq, (ibj) nlh2.a());
        return ibz;
    }
}
