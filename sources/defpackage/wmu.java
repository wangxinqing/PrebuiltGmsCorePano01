package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.api.PeopleChimeraService;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;
import java.util.List;

/* renamed from: wmu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wmu extends wzx implements niz {
    private final PeopleChimeraService a;
    private final nix b;
    private final String c;
    private final int d;
    private final boolean e;
    private final String f;
    private final String g;
    private final boolean h;

    public wmu(PeopleChimeraService peopleChimeraService, nix nix, String str, String str2, String str3, boolean z, boolean z2) {
        int callingUid = Binder.getCallingUid();
        this.a = peopleChimeraService;
        this.b = nix;
        this.c = str;
        this.g = str3;
        this.f = str2;
        this.h = z;
        this.e = z2;
        this.d = callingUid;
    }

    private final void a(xqg xqg) {
        nix nix = this.b;
        PeopleChimeraService peopleChimeraService = this.a;
        xqg.o = this.e;
        nix.a(peopleChimeraService, xqg);
    }

    public final void a(wzv wzv, String str, String str2, String str3) {
    }

    public final void a(wzv wzv, String str, String str2, String str3, List list) {
    }

    public final void a(wzv wzv, String str, String str2, String str3, List list, List list2, FavaDiagnosticsEntity favaDiagnosticsEntity) {
    }

    public final Bundle b(String str, String str2) {
        a(str, str2, 0);
        return null;
    }

    public final void b(wzv wzv, String str, String str2) {
    }

    public final void b(wzv wzv, String str, String str2, String str3, int i, String str4) {
    }

    public final itp c(wzv wzv, String str, String str2, int i) {
        boolean z;
        iva.a((Object) wzv, (Object) "callbacks");
        iva.a(str, (Object) "account");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        wpp wpp = new wpp(this.c, this.d, a(wzv), str, str2);
        a((xqg) wpp);
        return wpp.h;
    }

    public final void c(wzv wzv, String str, String str2) {
    }

    public final void d(wzv wzv, Account account, String str) {
        a((xqg) new wng(this.c, this.d, wzv, account, str, wss.a((Context) this.a)));
    }

    public final itp e(wzv wzv, String str, String str2) {
        iva.a((Object) wzv, (Object) "callbacks");
        iva.a(str, (Object) "account");
        if (ayvl.f() == 2) {
            throw new UnsupportedOperationException(ayuz.b());
        } else if (ayvl.f() == 1) {
            try {
                wzv.a(xqy.c.a, xqy.c.b, (DataHolder) null);
                return null;
            } catch (RemoteException e2) {
                throw e2;
            }
        } else {
            won won = new won(this.c, this.d, wzv, str, str2);
            a((xqg) won);
            return won.h;
        }
    }

    public final Bundle a(String str, String str2) {
        a();
        return b(str, str2);
    }

    public final itp b(wzv wzv, String str, int i, int i2) {
        wow wow;
        wzv wzv2 = wzv;
        iva.a((Object) wzv, (Object) "callbacks");
        String str2 = str;
        iva.a(str, (Object) "avatarUrl");
        int i3 = i;
        wlv.a(i, "avatarSize");
        if (ayvu.d() == 2) {
            throw new UnsupportedOperationException(ayuz.b());
        } else if (ayvu.d() == 1) {
            return null;
        } else {
            PeopleChimeraService peopleChimeraService = this.a;
            String str3 = this.c;
            int i4 = this.d;
            xip.a();
            if (((Boolean) xib.a.a()).booleanValue()) {
                wow = wow.a((Context) this.a);
            } else {
                wow = null;
            }
            wpl wpl = new wpl(peopleChimeraService, str3, i4, wow, a(wzv), str, i, i2);
            a((xqg) wpl);
            return wpl.h;
        }
    }

    @Deprecated
    public final void d(wzv wzv, String str, String str2) {
        a();
        iva.a((Object) wzv, (Object) "callbacks");
        iva.a(str, (Object) "account");
        iva.a((Object) str2, (Object) "deviceId");
        a((xqg) new wpt(wzv, this.c, this.d, str, str2));
    }

    public final Bundle a(String str, String str2, long j) {
        a(str, str2, j, false);
        return null;
    }

    public final Bundle a(String str, String str2, long j, boolean z) {
        a(str, str2, j, z, false);
        return null;
    }

    public final void c() {
        boolean z;
        if (ycz.c == null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                ycz.c = new ycz(aywy.a.a().ds());
                new ycz(aywy.a.a().dt());
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        ycz ycz = ycz.c;
        String str = this.c;
        synchronized (ycz.b) {
            Boolean bool = (Boolean) ycz.b.get(str);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                String str2 = ycz.a;
                boolean z2 = true;
                if (!TextUtils.isEmpty(str)) {
                    if ("com.google.android.gms".equals(str) || str.startsWith("com.google.android.gms.")) {
                        ycz.b.put(str, Boolean.valueOf(z2));
                        z = z2;
                    } else {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
                        sb.append(',');
                        sb.append(str);
                        sb.append(',');
                        if (str2.indexOf(sb.toString()) >= 0) {
                            ycz.b.put(str, Boolean.valueOf(z2));
                            z = z2;
                        }
                    }
                }
                z2 = false;
                ycz.b.put(str, Boolean.valueOf(z2));
                z = z2;
            }
        }
        if (!z) {
            throw new SecurityException("This API can only be called by whitelisted apps.");
        }
    }

    public final Bundle a(String str, String str2, long j, boolean z, boolean z2) {
        String str3;
        a();
        String str4 = str;
        iva.a(str, (Object) "account");
        aucx aucx = ayuz.a.a().f().a;
        if (!TextUtils.isEmpty(this.f)) {
            str3 = this.f;
        } else {
            str3 = this.c;
        }
        if (!aucx.contains(str3)) {
            if (aywp.d() == 2) {
                throw new UnsupportedOperationException(ayuz.b());
            } else if (aywp.d() == 1) {
                return null;
            }
        }
        a((xqg) new woq(str3, this.d, this.g, str, str2, j, z, z2));
        return null;
    }

    public final itp b(wzv wzv, String str, String str2, int i, int i2) {
        iva.a((Object) wzv, (Object) "callbacks");
        iva.a(str, (Object) "account");
        wlv.a(i, "avatarSize");
        wpo wpo = new wpo(this.c, this.d, a(wzv), str, str2, i, i2);
        a((xqg) wpo);
        return wpo.h;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [int] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle a(defpackage.wzv r5, boolean r6, java.lang.String r7, java.lang.String r8, int r9) {
        /*
            r4 = this;
            java.lang.String r0 = "callbacks"
            defpackage.iva.a((java.lang.Object) r5, (java.lang.Object) r0)
            com.google.android.gms.people.api.PeopleChimeraService r0 = r4.a
            wmy r0 = defpackage.wmy.a((android.content.Context) r0)
            r1 = 0
            r2 = 1
            if (r6 != 0) goto L_0x0048
            r5.asBinder()
            java.lang.Object r6 = r0.a
            monitor-enter(r6)
            r7 = 0
        L_0x0016:
            java.util.ArrayList r8 = r0.c     // Catch:{ all -> 0x0045 }
            int r8 = r8.size()     // Catch:{ all -> 0x0045 }
            if (r1 >= r8) goto L_0x003e
            java.util.ArrayList r8 = r0.c     // Catch:{ all -> 0x0045 }
            java.lang.Object r8 = r8.get(r1)     // Catch:{ all -> 0x0045 }
            wmx r8 = (defpackage.wmx) r8     // Catch:{ all -> 0x0045 }
            wzv r8 = r8.d     // Catch:{ all -> 0x0045 }
            android.os.IBinder r8 = r8.asBinder()     // Catch:{ all -> 0x0045 }
            android.os.IBinder r9 = r5.asBinder()     // Catch:{ all -> 0x0045 }
            if (r8 != r9) goto L_0x003b
            java.util.ArrayList r7 = r0.c     // Catch:{ all -> 0x0045 }
            r7.remove(r1)     // Catch:{ all -> 0x0045 }
            int r1 = r1 + -1
            r7 = 1
            goto L_0x003c
        L_0x003b:
        L_0x003c:
            int r1 = r1 + r2
            goto L_0x0016
        L_0x003e:
            if (r7 == 0) goto L_0x0043
            r0.a()     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r6)     // Catch:{ all -> 0x0045 }
            goto L_0x007b
        L_0x0045:
            r5 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0045 }
            throw r5
        L_0x0048:
            if (r9 == 0) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x004c:
        L_0x004d:
            java.lang.String r6 = "scopes"
            defpackage.iva.b(r1, r6)
            r5.asBinder()
            java.lang.Object r6 = r0.a
            monitor-enter(r6)
            java.util.ArrayList r1 = r0.c     // Catch:{ all -> 0x007d }
            wmx r3 = new wmx     // Catch:{ all -> 0x007d }
            r3.<init>(r5, r7, r8, r9)     // Catch:{ all -> 0x007d }
            r1.add(r3)     // Catch:{ all -> 0x007d }
            r5 = r9 & 8
            if (r5 == 0) goto L_0x007a
            boolean r5 = r0.e     // Catch:{ all -> 0x007d }
            if (r5 != 0) goto L_0x007a
            android.content.Context r5 = r0.b     // Catch:{ all -> 0x007d }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x007d }
            android.net.Uri r7 = android.provider.ContactsContract.AUTHORITY_URI     // Catch:{ all -> 0x007d }
            android.database.ContentObserver r8 = r0.d     // Catch:{ all -> 0x007d }
            r5.registerContentObserver(r7, r2, r8)     // Catch:{ all -> 0x007d }
            r0.e = r2     // Catch:{ all -> 0x007d }
        L_0x007a:
            monitor-exit(r6)     // Catch:{ all -> 0x007d }
        L_0x007b:
            r5 = 0
            return r5
        L_0x007d:
            r5 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x007d }
            goto L_0x0081
        L_0x0080:
            throw r5
        L_0x0081:
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wmu.a(wzv, boolean, java.lang.String, java.lang.String, int):android.os.Bundle");
    }

    public final void b() {
        iva.a(false);
    }

    public final void b(wzv wzv, Account account, String str) {
        a((xqg) new xqs(this.c, this.d, wzv, account, str, wss.a((Context) this.a)));
    }

    public final void b(wzv wzv, String str) {
        iva.a((Object) wzv, (Object) "callbacks");
        iva.a(str, (Object) "account");
        if (!ayuz.a.a().b().a.contains(this.c)) {
            if (ayvi.b() == 2) {
                throw new UnsupportedOperationException(ayuz.b());
            } else if (ayvi.b() == 1) {
                return;
            }
        }
        a((xqg) new wni(this.a, this.c, this.d, wzv, str));
    }

    public final void c(wzv wzv, Account account, String str) {
        a((xqg) new wnj(this.c, this.d, wzv, account, str, wss.a((Context) this.a)));
    }

    public final void b(wzv wzv, String str, String str2, int i) {
        c(wzv, str, str2, i);
    }

    public final itp a(wzv wzv, AccountToken accountToken, ParcelableListOptions parcelableListOptions) {
        AccountToken accountToken2 = accountToken;
        if (ayvo.b() == 2) {
            throw new UnsupportedOperationException(ayuz.b());
        } else if (ayvo.b() == 1) {
            return null;
        } else {
            wnz wnz = new wnz(this.c, this.d, this.g, wzv, accountToken2.a, accountToken2.b, parcelableListOptions);
            a((xqg) wnz);
            return wnz.h;
        }
    }

    public final itp a(wzv wzv, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        iva.a((Object) wzv, (Object) "callbacks");
        iva.a((Object) avatarReference, (Object) "avatarReference");
        iva.a((Object) parcelableLoadImageOptions, (Object) "options");
        if (ayvu.c() == 2) {
            throw new UnsupportedOperationException(ayuz.b());
        } else if (ayvu.c() == 1) {
            return null;
        } else {
            wpk wpk = new wpk(this.c, this.d, a(wzv), avatarReference, parcelableLoadImageOptions);
            a((xqg) wpk);
            return wpk.h;
        }
    }

    public final itp a(wzv wzv, String str) {
        iva.a((Object) wzv, (Object) "callbacks");
        iva.a(str, (Object) "url");
        if (ayvu.b() == 2) {
            throw new UnsupportedOperationException(ayuz.b());
        } else if (ayvu.b() == 1) {
            return null;
        } else {
            woy woy = new woy(this.c, this.d, str, a(wzv), false, "BaseLoadRemoteImageOperation");
            a((xqg) woy);
            return woy.h;
        }
    }

    public final itp a(wzv wzv, String str, int i) {
        iva.b(!TextUtils.isEmpty(str));
        if (aywg.b() == 2) {
            throw new UnsupportedOperationException(ayuz.b());
        } else if (aywg.b() == 1) {
            return null;
        } else {
            wor wor = new wor(this.c, this.d, wzv, ycm.e.split(str), i);
            a((xqg) wor);
            return wor.h;
        }
    }

    public final itp a(wzv wzv, String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, boolean z2) {
        int i4 = i;
        boolean z3 = false;
        Object[] objArr = {str, str2, Boolean.valueOf(z), str3, str4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z2)};
        wzv wzv2 = wzv;
        iva.a((Object) wzv, (Object) "callbacks");
        if (i4 == 2) {
            iva.b(woe.a(this.f), "Unsupported autocomplete type");
        } else {
            iva.a(str, (Object) "account");
        }
        iva.b(i4 == 0 ? true : i4 == 1 || i4 == 2, "Unsupported autocomplete type");
        iva.b(!z, "Directory search not supported yet");
        iva.b(!TextUtils.isEmpty(str4), "Query mustn't be empty");
        if (i3 > 0) {
            z3 = true;
        }
        iva.b(z3, "Invalid numberOfResults");
        if (!ayuz.a.a().c().a.contains(this.c)) {
            if (ayvx.b() == 2) {
                throw new UnsupportedOperationException(ayuz.b());
            } else if (ayvx.b() == 1) {
                return null;
            }
        }
        woe woe = new woe(this.c, this.d, wzv, str, str2, z, str4, i, i3, z2);
        a((xqg) woe);
        return woe.h;
    }

    /* access modifiers changed from: package-private */
    public final wmq a(wzv wzv) {
        return new wmq(wzv, this.h);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (jgu.e(this.a)) {
            throw new IllegalArgumentException("account");
        }
    }

    public final void a(wzv wzv, Account account, String str) {
        a((xqg) new xqr(this.c, this.d, wzv, account, str, wss.a((Context) this.a)));
    }

    public final void a(wzv wzv, Uri uri) {
        a((xqg) new xqo(this.c, this.d, wzv, uri));
    }

    public final void a(wzv wzv, Uri uri, String str) {
        a((xqg) new wnh(this.c, this.d, a(wzv), uri, str));
    }

    public final void a(wzv wzv, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        a((xqg) new xqp(this.c, this.d, a(wzv), uri, strArr, str, strArr2, str2));
    }

    public final void a(wzv wzv, Bundle bundle) {
        a((xqg) new wob(this.c, this.d, wzv, bundle));
    }

    public final void a(wzv wzv, AccountToken accountToken, List list, ParcelableGetOptions parcelableGetOptions) {
        a((xqg) new wnw(this.c, this.d, this.g, wzv, accountToken.a, accountToken.b, list, parcelableGetOptions));
    }

    public final void a(wzv wzv, String str, int i, int i2) {
        b(wzv, str, i, i2);
    }

    public final void a(wzv wzv, String str, String str2) {
        a(wzv, str, str2, 3);
    }

    public final void a(wzv wzv, String str, String str2, int i) {
        iva.a((Object) wzv, (Object) "callbacks");
        if (ayvl.c() == 2) {
            throw new UnsupportedOperationException(ayuz.b());
        } else if (ayvl.c() != 1) {
            a((xqg) new wog(this.c, this.d, wzv, str, str2, i));
        }
    }

    public final void a(wzv wzv, String str, String str2, int i, int i2) {
        b(wzv, str, str2, i, i2);
    }

    @Deprecated
    public final void a(wzv wzv, String str, String str2, Uri uri) {
        a();
        a(wzv, str, str2, uri, true);
    }

    public final void a(wzv wzv, String str, String str2, Uri uri, boolean z) {
        a();
        iva.a((Object) wzv, (Object) "callbacks");
        iva.a(str, (Object) "account");
        iva.a((Object) uri, (Object) "uri");
        if (!ayuz.a.a().g().a.contains(this.c)) {
            if (aywj.b() == 2) {
                throw new UnsupportedOperationException(ayuz.b());
            } else if (aywj.b() == 1) {
                return;
            }
        }
        a((xqg) new wos(this.c, this.d, this.g, wzv, str, str2, uri, z));
    }

    @Deprecated
    public final void a(wzv wzv, String str, String str2, String str3, int i, String str4) {
        wzv wzv2 = wzv;
        iva.a((Object) wzv, (Object) "callbacks");
        String str5 = str;
        iva.a(str, (Object) "account");
        if (!ayuz.c().a.contains(this.c)) {
            if (ayvl.b() == 2) {
                throw new UnsupportedOperationException(ayuz.b());
            } else if (ayvl.b() == 1) {
                return;
            }
        }
        a((xqg) new wof(this.c, this.g, this.d, wzv, str, str2, str3, i, str4, false));
    }

    public final void a(wzv wzv, String str, String str2, String str3, int i, String str4, boolean z) {
        wzv wzv2 = wzv;
        iva.a((Object) wzv, (Object) "callbacks");
        String str5 = str;
        iva.a(str, (Object) "account");
        if (!ayuz.c().a.contains(this.c)) {
            if (ayvl.b() == 2) {
                throw new UnsupportedOperationException(ayuz.b());
            } else if (ayvl.b() == 1) {
                return;
            }
        }
        wof wof = new wof(this.c, this.g, this.d, wzv, str, str2, str3, i, str4, z);
        wof.o = this.e;
        a((xqg) wof);
    }

    public final void a(wzv wzv, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), str4};
        a(wzv, str, str2, str3, i, z, i2, i3, str4, false);
    }

    public final void a(wzv wzv, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), str4, Boolean.valueOf(z2)};
        a(wzv, str, str2, str3, i, z, i2, i3, str4, false, 0, 3);
    }

    public final void a(wzv wzv, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, int i4, int i5) {
        String str5 = str;
        Object[] objArr = {str5, str2, str3, Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), str4, Boolean.valueOf(z2), Integer.valueOf(i4), Integer.valueOf(i5)};
        iva.a((Object) wzv, (Object) "callbacks");
        iva.a(str5, (Object) "account");
        if (ayvl.d() == 2) {
            throw new UnsupportedOperationException(ayuz.b());
        } else if (ayvl.d() != 1) {
            a((xqg) new wol(this.c, this.d, wzv, str, str2, str3, i, z, i2, i3, str4, i4, i5));
        }
    }

    public final void a(wzv wzv, String str, String str2, String str3, List list, int i, boolean z, long j) {
        Object[] objArr = {str, str2, str3, list, Integer.valueOf(i), Boolean.valueOf(z), Long.valueOf(j)};
        a(wzv, str, str2, str3, list, i, z, j, (String) null, 0);
    }

    public final void a(wzv wzv, String str, String str2, String str3, List list, int i, boolean z, long j, String str4, int i2) {
        Object[] objArr = {str, str2, str3, list, Integer.valueOf(i), Boolean.valueOf(z), Long.valueOf(j), str4, Integer.valueOf(i2)};
        a(wzv, str, str2, str3, list, i, z, j, str4, i2, 0);
    }

    public final void a(wzv wzv, String str, String str2, String str3, List list, int i, boolean z, long j, String str4, int i2, int i3) {
        Object[] objArr = {str, str2, str3, list, Integer.valueOf(i), Boolean.valueOf(z), Long.valueOf(j), str4, Integer.valueOf(i2), Integer.valueOf(i3)};
        a(wzv, str, str2, str3, list, i, z, j, str4, i2, i3, 0);
    }

    public final void a(wzv wzv, String str, String str2, String str3, List list, int i, boolean z, long j, String str4, int i2, int i3, int i4) {
        boolean z2;
        String str5 = str;
        boolean z3 = false;
        Object[] objArr = {str5, str2, str3, list, Integer.valueOf(i), Boolean.valueOf(z), Long.valueOf(j), str4, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        iva.a((Object) wzv, (Object) "callbacks");
        iva.a(str5, (Object) "account");
        if ((i & 2097151) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.b(z2, "projection");
        if (!TextUtils.isEmpty(str4)) {
            if (i2 != 0) {
                z3 = true;
            }
            iva.b(z3, "searchFields");
        }
        if (ayvl.e() == 2) {
            throw new UnsupportedOperationException(ayuz.b());
        } else if (ayvl.e() != 1) {
            wom wom = r1;
            wom wom2 = new wom(this.c, this.d, wzv, str, str2, str3, list, i, z, j, str4, i2, i4, i3);
            a((xqg) wom);
        }
    }

    public final void a(wzv wzv, String str, String str2, String str3, boolean z, int i) {
        a(wzv, str, str2, str3, z, i, 0);
    }

    public final void a(wzv wzv, String str, String str2, String str3, boolean z, int i, int i2) {
        a(wzv, str, str2, str3, 7, z, i, i2, (String) null);
    }

    @Deprecated
    public final void a(wzv wzv, String str, String str2, String[] strArr) {
        a();
        iva.a((Object) wzv, (Object) "callbacks");
        iva.a(str, (Object) "account");
        iva.a((Object) str2, (Object) "deviceId");
        iva.a((Object) strArr, (Object) "sources");
        a((xqg) new wpv(wzv, this.c, this.d, str, str2, strArr));
    }

    public final void a(wzv wzv, boolean z, boolean z2, String str, String str2) {
        a(wzv, z, z2, str, str2, 0);
    }

    public final void a(wzv wzv, boolean z, boolean z2, String str, String str2, int i) {
        int i2 = i;
        wzv wzv2 = wzv;
        iva.a((Object) wzv, (Object) "callbacks");
        boolean z3 = true;
        if (!(i2 == 0 || i2 == 1)) {
            z3 = false;
        }
        iva.b(z3);
        if (z) {
            String str3 = str;
            iva.a(str, (Object) "account");
        } else {
            String str4 = str;
        }
        if (!ayuz.a.a().e().a.contains(this.c)) {
            if (aywa.b() == 2) {
                throw new UnsupportedOperationException(ayuz.b());
            } else if (aywa.b() == 1) {
                return;
            }
        }
        a((xqg) new wok(this.c, this.d, wzv, z, z2, str, str2, i));
    }
}
