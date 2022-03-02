package defpackage;

import android.accounts.Account;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: pzp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pzp extends bl implements pzq {
    public static final iwd c = new iwd("CommonAccount", "AccountPickerViewModel");
    private static final wls k;
    public final Context d;
    public final LinkedHashMap e;
    public final int f;
    public final aw g;
    public final aw h;
    public final aw i;
    int j = 0;
    private final String l;
    private final amzy m;
    private final boolean n;
    private final ArrayList o;
    private final String p;
    private final Bundle q;
    private final boolean r;
    private final qub s;
    private final iby t;
    private final iby u;

    static {
        wlr wlr = new wlr();
        wlr.a = 80;
        k = wlr.a();
    }

    public pzp(Context context, String str, boolean z, boolean z2, amzy amzy, boolean z3, ArrayList arrayList, String str2, Bundle bundle) {
        iby a = wlt.a(context, k);
        iby d2 = wlt.d(context, k);
        this.d = context.getApplicationContext();
        this.m = amzy;
        this.n = z3;
        this.o = arrayList;
        this.p = str2;
        this.q = bundle;
        this.l = str;
        this.t = a;
        this.u = d2;
        this.r = z2;
        this.g = new aw();
        this.h = new qci();
        this.i = new qci();
        this.f = this.d.getResources().getDimensionPixelSize(R.dimen.identity_common_account_picker_chip_avatar_size);
        this.e = new LinkedHashMap();
        this.s = qub.a(this.d);
        List c2 = c();
        int size = c2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Account account = (Account) c2.get(i2);
            this.e.put(account, pzh.a(account.name, account.type));
        }
        if (z) {
            qaq qaq = new qaq(new qvr(Looper.getMainLooper()));
            ArrayList arrayList2 = new ArrayList(this.e.size() + 1);
            if (!this.e.isEmpty()) {
                anaf a2 = anet.a((Iterable) this.e.keySet(), pzk.a);
                iby iby = this.u;
                wkz wkz = new wkz();
                wkz.b = false;
                aorr a3 = qbc.a(iby.a(wkz));
                aorl.a(a3, new pzm(this, a2), qaq);
                arrayList2.add(a3);
                for (Map.Entry key : this.e.entrySet()) {
                    Account account2 = (Account) key.getKey();
                    aorr a4 = qbc.a(this.t.a(account2.name, 1, this.r ? 1 : 0));
                    aorl.a(a4, new pzl(this, account2), qaq);
                    arrayList2.add(a4);
                }
            }
            aorl.b((Iterable) arrayList2).a((Runnable) new pzj(this), (Executor) qaq);
        }
    }

    private final void a(String str) {
        qub.a(this.d).a(str, (String) null, (String[]) null, this.q, (Activity) null, new pzi(this));
    }

    public final void b() {
        String[] strArr;
        if (this.j == 0) {
            List c2 = c();
            if (!c2.isEmpty()) {
                qub a = qub.a(this.d);
                if (!this.n && c2.size() == 1 && pys.a(this.d, a, (Account) c2.get(0), this.l)) {
                    Account account = (Account) c2.get(0);
                    a(account.name, account.type);
                }
            } else if (!jgu.g(this.d)) {
                this.h.c(new pzo(10, (Intent) null));
            } else {
                qub a2 = qub.a(this.d);
                amzy amzy = this.m;
                if (amzy != null) {
                    strArr = (String[]) amzy.toArray(new String[amzy.size()]);
                } else {
                    strArr = null;
                }
                Set a3 = pys.a(a2, strArr);
                if (a3 == null || a3.size() != 1) {
                    this.j = 1;
                    this.i.c(new pzo(1, (Intent) null));
                    return;
                }
                a((String) a3.iterator().next());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final List c() {
        String[] strArr;
        qub qub = this.s;
        amzy amzy = this.m;
        if (amzy != null) {
            strArr = (String[]) amzy.toArray(new String[amzy.size()]);
        } else {
            strArr = null;
        }
        ArrayList a = pys.a(qub, strArr, this.o, this.l);
        String str = this.p;
        return (a.isEmpty() || TextUtils.isEmpty(str)) ? a : jgu.a((List) a, str);
    }

    private final void a(String str, String str2) {
        if (jkr.e() && anbs.b((Iterable) Arrays.asList(iri.a), amrs.a((Object) str2)) && str != null && str2 != null) {
            Account account = new Account(str, str2);
            qub a = qub.a(this.d);
            if (a.b(account, this.l) == 4) {
                a.a(account, this.l, 2);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putString("accountType", str2);
        bundle.putBoolean("pickedFromAccountChips", true);
        this.h.c(new pzo(-1, new Intent().putExtras(bundle)));
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.e.values());
        this.g.c(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            r0 = 0
            r6.j = r0
            r1 = 0
            if (r8 != 0) goto L_0x001b
            java.util.List r7 = r6.c()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x001a
            aw r7 = r6.h
            pzo r8 = new pzo
            r8.<init>(r0, r1)
            r7.c(r8)
        L_0x001a:
            return
        L_0x001b:
            r2 = -1
            if (r8 == r2) goto L_0x0020
            goto L_0x0093
        L_0x0020:
            java.lang.String r8 = "accountType"
            r2 = 1
            if (r7 == r2) goto L_0x0073
            r2 = 2
            if (r7 == r2) goto L_0x002a
            goto L_0x008a
        L_0x002a:
            if (r9 == 0) goto L_0x0037
            java.lang.String r7 = "authAccount"
            java.lang.String r7 = r9.getStringExtra(r7)
            java.lang.String r8 = r9.getStringExtra(r8)
            goto L_0x0039
        L_0x0037:
            r7 = r1
            r8 = r7
        L_0x0039:
            if (r7 != 0) goto L_0x003c
            goto L_0x003f
        L_0x003c:
            if (r8 == 0) goto L_0x003f
        L_0x003e:
            goto L_0x006a
        L_0x003f:
            java.util.LinkedHashMap r9 = r6.e
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0063
            java.util.List r9 = r6.c()
            int r2 = r9.size()
            r3 = 0
        L_0x0050:
            if (r3 >= r2) goto L_0x0063
            java.lang.Object r4 = r9.get(r3)
            android.accounts.Account r4 = (android.accounts.Account) r4
            int r3 = r3 + 1
            java.util.LinkedHashMap r5 = r6.e
            boolean r5 = r5.containsKey(r4)
            if (r5 != 0) goto L_0x0050
            goto L_0x0064
        L_0x0063:
            r4 = r1
        L_0x0064:
            if (r4 == 0) goto L_0x003e
            java.lang.String r7 = r4.name
            java.lang.String r8 = r4.type
        L_0x006a:
            if (r7 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            if (r8 == 0) goto L_0x008a
        L_0x006f:
            r6.a(r7, r8)
            return
        L_0x0073:
            if (r9 != 0) goto L_0x0076
            goto L_0x0081
        L_0x0076:
            java.lang.String r7 = r9.getStringExtra(r8)
            if (r7 == 0) goto L_0x0081
            r6.a((java.lang.String) r7)
            return
        L_0x0081:
            iwd r7 = c
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.String r9 = "Unable to find account type, pretending the request was canceled"
            r7.b(r9, r8)
        L_0x008a:
            iwd r7 = c
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.String r9 = "Unable to find added account, pretending the request was canceled"
            r7.b(r9, r8)
        L_0x0093:
            iwd r7 = c
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.String r9 = "Canceled"
            r7.a(r9, r8)
            aw r7 = r6.h
            pzo r8 = new pzo
            r8.<init>(r0, r1)
            r7.c(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pzp.a(int, int, android.content.Intent):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(AccountManagerFuture accountManagerFuture) {
        if (accountManagerFuture != null) {
            try {
                Intent intent = (Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent");
                if (intent == null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("errorMessage", "error communicating with server");
                    this.h.c(new pzo(-1, new Intent().putExtras(bundle)));
                    return;
                }
                this.j = 2;
                intent.setFlags(intent.getFlags() & -268435457);
                this.i.c(new pzo(2, intent));
            } catch (OperationCanceledException e2) {
                this.h.c(new pzo(0, (Intent) null));
            } catch (AuthenticatorException | IOException e3) {
                c.e("Authenticator returned an exception", e3, new Object[0]);
            }
        } else {
            c.e("Got a null future while adding an account!", new Object[0]);
        }
    }

    public final void a(pzh pzh) {
        int i2 = pzh.a;
        if (i2 == 0) {
            a(pzh.c, pzh.b);
        } else if (i2 == 2) {
            this.j = 1;
            this.i.c(new pzo(1, (Intent) null));
        } else if (i2 == 3) {
            this.j = 3;
            this.i.c(new pzo(3, (Intent) null));
        }
    }
}
