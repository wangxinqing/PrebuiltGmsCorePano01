package defpackage;

import android.content.Context;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: roa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class roa extends rny implements rnr {
    public static final /* synthetic */ int i = 0;
    private static final amsk j = amsk.a(',').a();
    private final rnp k;

    public roa(Context context, rns rns) {
        super(context, rns);
        this.k = new rnp(context, rnz.a);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.k.a(Settings.Secure.getUriFor("location_providers_allowed"), this, new jls(Looper.getMainLooper()));
        String string = Settings.Secure.getString(this.a.getContentResolver(), "location_providers_allowed");
        if (!TextUtils.isEmpty(string)) {
            for (String a : j.a((CharSequence) string)) {
                a(a, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.k.a(this);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Set set;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            set = new ob();
        } else {
            set = angm.a(j.a((CharSequence) str));
        }
        synchronized (this.c) {
            Iterator it = new HashSet(angm.d(this.f, set)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                a(str2, set.contains(str2));
            }
        }
    }
}
