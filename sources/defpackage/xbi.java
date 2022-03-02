package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: xbi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xbi extends isy {
    public static final /* synthetic */ int x = 0;
    private static volatile Bundle y;
    private static volatile Bundle z;
    public final String a;
    public final String u;
    public final Context v;
    public final HashMap w = new HashMap();

    public xbi(Context context, Looper looper, ica ica, icb icb, String str, ise ise) {
        super(context.getApplicationContext(), looper, 5, ise, ica, icb);
        this.v = context;
        this.a = str;
        this.u = ise.e;
    }

    public static PendingIntent a(Bundle bundle) {
        if (bundle != null) {
            return (PendingIntent) bundle.getParcelable("pendingIntent");
        }
        return null;
    }

    public static final synchronized void b(Bundle bundle) {
        synchronized (xbi.class) {
            if (bundle != null) {
                xbw.l = bundle.getBoolean("use_contactables_api", true);
                ycb.a.a(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
                y = bundle.getBundle("config.email_type_map");
                z = bundle.getBundle("config.phone_type_map");
            }
        }
    }

    public final wzy A() {
        return (wzy) super.x();
    }

    public final Feature[] D() {
        return wku.g;
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.people.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    public final int d() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", this.a);
        bundle.putString("real_client_package_name", this.u);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }

    public final void j() {
        String str;
        String str2;
        synchronized (this.w) {
            if (l()) {
                for (xaq xaq : this.w.values()) {
                    xaq.a();
                    try {
                        A().a((wzv) xaq, false, (String) null, (String) null, 0);
                    } catch (RemoteException e) {
                        e = e;
                        str2 = "PeopleClient";
                        str = "Failed to unregister listener";
                    } catch (IllegalStateException e2) {
                        e = e2;
                        str2 = "PeopleClient";
                        str = "PeopleService is in unexpected state";
                    }
                }
            }
            this.w.clear();
        }
        super.j();
        return;
        Log.w(str2, str, e);
    }

    static /* synthetic */ Status a(int i, Bundle bundle) {
        return new Status(i, (String) null, a(bundle));
    }

    public static xfk a(DataHolder dataHolder) {
        if (dataHolder != null) {
            return new xfk(dataHolder, new xcb(z), new xca(y));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
        if (queryLocalInterface instanceof wzy) {
            return (wzy) queryLocalInterface;
        }
        return new wzw(iBinder);
    }

    public final void b(idg idg, String str, String str2) {
        super.w();
        xav xav = new xav(idg);
        try {
            A().c((wzv) xav, str, str2);
        } catch (RemoteException e) {
            xav.a(8, (Bundle) null, (Bundle) null);
        }
    }

    public final itp a(idg idg, AvatarReference avatarReference, wli wli) {
        super.w();
        xay xay = new xay(idg);
        try {
            wzy A = A();
            if (wli == null) {
                wli = wli.a;
            }
            return A.a((wzv) xay, avatarReference, new ParcelableLoadImageOptions(wli.b, wli.c, false));
        } catch (RemoteException e) {
            xay.a(8, (Bundle) null, (ParcelFileDescriptor) null, (Bundle) null);
            return null;
        }
    }

    public final itp a(idg idg, String str) {
        super.w();
        xay xay = new xay(idg);
        try {
            return A().a((wzv) xay, str);
        } catch (RemoteException e) {
            xay.a(8, (Bundle) null, (ParcelFileDescriptor) null, (Bundle) null);
            return null;
        }
    }

    public final itp a(idg idg, String str, int i, int i2) {
        super.w();
        xay xay = new xay(idg);
        try {
            return A().b((wzv) xay, str, i, i2);
        } catch (RemoteException e) {
            xay.a(8, (Bundle) null, (ParcelFileDescriptor) null, (Bundle) null);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        Bundle bundle2;
        if (i == 0 && bundle != null) {
            b(bundle.getBundle("post_init_configuration"));
        }
        if (bundle != null) {
            bundle2 = bundle.getBundle("post_init_resolution");
        } else {
            bundle2 = null;
        }
        super.a(i, iBinder, bundle2, i2);
    }

    public final void a(idg idg, Bundle bundle) {
        super.w();
        xat xat = new xat(idg);
        try {
            A().a((wzv) xat, bundle);
        } catch (RemoteException e) {
            xat.a(8, (Bundle) null, (Bundle) null);
        }
    }

    public final void a(idg idg, String str, String str2) {
        super.w();
        xak xak = new xak(idg);
        try {
            A().b((wzv) xak, str, str2);
        } catch (RemoteException e) {
            xak.a(8, (Bundle) null, (Bundle) null);
        }
    }

    public final void a(idg idg, String str, String str2, int i, String str3, boolean z2) {
        super.w();
        xap xap = new xap(idg);
        try {
            A().a((wzv) xap, str, str2, (String) null, i, str3, z2);
        } catch (RemoteException e) {
            xap.a(8, (Bundle) null, (DataHolder) null);
        }
    }

    public final void a(idg idg, String str, String str2, Uri uri, boolean z2) {
        super.w();
        xan xan = new xan(idg);
        try {
            A().a((wzv) xan, str, str2, uri, z2);
        } catch (RemoteException e) {
            xan.a(8, (Bundle) null, (Bundle) null);
        }
    }

    public final void a(idg idg, String str, String str2, String str3) {
        super.w();
        xag xag = new xag(idg);
        try {
            A().a((wzv) xag, str, str2, str3);
        } catch (RemoteException e) {
            xag.a(8, (Bundle) null, (Bundle) null);
        }
    }

    @Deprecated
    public final void a(idg idg, String str, String str2, String str3, List list) {
        super.w();
        xai xai = new xai(idg);
        try {
            A().a((wzv) xai, str, str2, str3, list);
        } catch (RemoteException e) {
            xai.a(8, (Bundle) null, (Bundle) null);
        }
    }

    public final void a(idg idg, String str, String str2, String str3, List list, List list2, FavaDiagnosticsEntity favaDiagnosticsEntity) {
        super.w();
        idg idg2 = idg;
        xbb xbb = new xbb(idg);
        try {
            A().a((wzv) xbb, str, str2, str3, list, list2, favaDiagnosticsEntity);
        } catch (RemoteException e) {
            xbb.a(8, (Bundle) null, (Bundle) null);
        }
    }

    public final void a(idg idg, String str, String str2, wlb wlb) {
        wlb wlb2;
        xaz xaz;
        ArrayList arrayList;
        if (wlb != null) {
            wlb2 = wlb;
        } else {
            wlb2 = wlb.a;
        }
        Collection collection = wlb2.b;
        String str3 = wlb2.c;
        super.w();
        xaz xaz2 = new xaz(idg);
        try {
            wzy A = A();
            if (collection != null) {
                arrayList = new ArrayList(collection);
            } else {
                arrayList = null;
            }
            xaz = xaz2;
            try {
                A.a((wzv) xaz2, str, str2, (String) null, (List) arrayList, 2097151, false, 0, str3, 7, 0, 0);
            } catch (RemoteException e) {
                xaz.a(8, (Bundle) null, (DataHolder) null);
            }
        } catch (RemoteException e2) {
            xaz = xaz2;
            xaz.a(8, (Bundle) null, (DataHolder) null);
        }
    }

    public final void a(idg idg, String str, String str2, wll wll) {
        String str3 = wll.a;
        int i = wll.c;
        String str4 = wll.b;
        super.w();
        xba xba = new xba(idg);
        try {
            A().b(xba, str, str2, str3, i, str4);
        } catch (RemoteException e) {
            xba.a(8, (Bundle) null, (DataHolder) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.idg r17, java.lang.String r18, java.lang.String r19, boolean r20, int r21, boolean r22, int r23) {
        /*
            r16 = this;
            super.w()
            r1 = 0
            if (r23 == 0) goto L_0x0016
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "PeopleClient"
            java.lang.String r2 = "Ignoring custom sort order for all aggregation."
            android.util.Log.w(r0, r2)
            r0 = 0
            r13 = 0
            goto L_0x0018
        L_0x0016:
            r13 = r23
        L_0x0018:
            r15 = r16
            android.content.Context r0 = r15.c
            xbf r2 = new xbf
            r3 = r17
            r2.<init>(r3)
            android.os.Bundle r3 = z
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x0032
            xbx r4 = new xbx
            r4.<init>(r0, r2, r3)
            r14 = r4
            goto L_0x003f
        L_0x0032:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x0072
            xbz r4 = new xbz
            r4.<init>(r0, r2, r3)
            r14 = r4
        L_0x003f:
            xam r12 = new xam
            r12.<init>(r14)
            wzy r2 = r16.A()     // Catch:{ RemoteException -> 0x0061 }
            r6 = 0
            r7 = 7
            r10 = 0
            r11 = 0
            r0 = 3
            r3 = r12
            r4 = r18
            r5 = r19
            r8 = r20
            r9 = r21
            r1 = r12
            r12 = r22
            r15 = r14
            r14 = r0
            r2.a((defpackage.wzv) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (int) r7, (boolean) r8, (int) r9, (int) r10, (java.lang.String) r11, (boolean) r12, (int) r13, (int) r14)     // Catch:{ RemoteException -> 0x005f }
            goto L_0x006a
        L_0x005f:
            r0 = move-exception
            goto L_0x0064
        L_0x0061:
            r0 = move-exception
            r1 = r12
            r15 = r14
        L_0x0064:
            r0 = 8
            r2 = 0
            r1.a((int) r0, (android.os.Bundle) r2, (com.google.android.gms.common.data.DataHolder[]) r2)
        L_0x006a:
            boolean r0 = r15.d
            if (r0 != 0) goto L_0x0071
            r15.a()
        L_0x0071:
            return
        L_0x0072:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Search aggregation doesn't support filtering by gaia-id"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbi.a(idg, java.lang.String, java.lang.String, boolean, int, boolean, int):void");
    }

    public final void a(idg idg, boolean z2, boolean z3, String str, String str2, int i) {
        super.w();
        xax xax = new xax(idg);
        try {
            A().a((wzv) xax, z2, z3, str, str2, i);
        } catch (RemoteException e) {
            xax.a(8, (Bundle) null, (DataHolder) null);
        }
    }

    public final void a(String str, String str2, long j, boolean z2) {
        super.w();
        A().a(str, str2, j, z2, false);
    }

    public final void a(wln wln) {
        synchronized (this.w) {
            try {
                super.w();
                if (this.w.containsKey(wln)) {
                    xaq xaq = (xaq) this.w.get(wln);
                    xaq.a();
                    A().a((wzv) xaq, false, (String) null, (String) null, 0);
                    this.w.remove(wln);
                    return;
                }
                this.w.remove(wln);
            } catch (Throwable th) {
                this.w.remove(wln);
                throw th;
            }
        }
    }

    public final void a(wxv wxv, wvy wvy) {
        super.w();
        xas xas = new xas(wxv);
        wvu wvu = wvy.a;
        AccountToken accountToken = new AccountToken(wvu.a, wvu.b);
        try {
            wzy A = A();
            boolean z2 = wvy.b;
            boolean z3 = wvy.c;
            boolean z4 = wvy.d;
            wvu wvu2 = wvy.a;
            A.a((wzv) xas, accountToken, new ParcelableListOptions(z2, z3, z4, wvu2.c, wvu2.d));
        } catch (RemoteException e) {
            xas.a(8, (Bundle) null, new Bundle());
        }
    }

    public final void a(xaf xaf, wvw wvw, String... strArr) {
        iva.a((Object) strArr);
        super.w();
        xar xar = new xar(xaf);
        wvu wvu = wvw.a;
        AccountToken accountToken = new AccountToken(wvu.a, wvu.b);
        List asList = Arrays.asList(strArr);
        try {
            wzy A = A();
            boolean z2 = wvw.b;
            boolean z3 = wvw.c;
            boolean z4 = wvw.d;
            wvu wvu2 = wvw.a;
            A.a((wzv) xar, accountToken, asList, new ParcelableGetOptions(z2, false, z4, wvu2.c, wvu2.d));
        } catch (RemoteException e) {
            xar.a(8, (Bundle) null, new Bundle());
        }
    }

    public final void a(xaq xaq, String str, String str2, int i) {
        super.w();
        synchronized (this.w) {
            A().a((wzv) xaq, true, str, str2, i);
        }
    }
}
