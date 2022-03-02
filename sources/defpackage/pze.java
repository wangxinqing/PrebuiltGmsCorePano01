package defpackage;

import android.accounts.Account;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: pze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pze extends qcg {
    public static final iwd a = new iwd("CommonAccount", "AccountChooserFragment");
    private static final wls g;
    public Context b;
    public LinkedHashMap c;
    public int d;
    public boolean e = false;
    pzg f;
    private String h;
    private amzy i;
    private boolean j;
    private ArrayList k;
    private String l;
    private Bundle m;
    private boolean n;
    private qub o;
    private iby p;
    private iby q;

    static {
        wlr wlr = new wlr();
        wlr.a = 80;
        g = wlr.a();
    }

    public static pze a(String str, amzy amzy, String str2) {
        String[] strArr;
        Bundle bundle = new Bundle();
        bundle.putString("calling_package", str);
        bundle.putBoolean("use_particle_disc", true);
        if (amzy != null) {
            strArr = (String[]) anbs.a(amym.a((Iterable) amzy).a(), String.class);
        } else {
            strArr = null;
        }
        bundle.putStringArray("allowed_account_types", strArr);
        bundle.putBoolean("force_account_picking", true);
        bundle.putParcelableArrayList("valid_accounts", (ArrayList) null);
        bundle.putString("hosted_domain_filter", str2);
        bundle.putBundle("add_account_options", (Bundle) null);
        pze pze = new pze();
        pze.setArguments(bundle);
        return pze;
    }

    /* access modifiers changed from: package-private */
    public final List b() {
        String[] strArr;
        qub qub = this.o;
        amzy amzy = this.i;
        if (amzy != null) {
            strArr = (String[]) amzy.toArray(new String[0]);
        } else {
            strArr = null;
        }
        ArrayList a2 = pys.a(qub, strArr, this.k, this.h);
        String str = this.l;
        return (a2.isEmpty() || TextUtils.isEmpty(str)) ? a2 : jgu.a((List) a2, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            r0 = 0
            r6.e = r0
            r1 = 0
            if (r8 != 0) goto L_0x002d
            java.util.List r7 = r6.b()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x001b
            pzg r7 = r6.f
            pzd r8 = new pzd
            r8.<init>(r0, r1)
            r7.a((defpackage.pzd) r8)
            return
        L_0x001b:
            pzg r7 = r6.f
            pzd r8 = new pzd
            r9 = 11
            r8.<init>(r9, r1)
            r7.a((defpackage.pzd) r8)
            pzg r7 = r6.f
            r7.a((boolean) r0)
            return
        L_0x002d:
            r2 = -1
            if (r8 == r2) goto L_0x0032
            goto L_0x00a5
        L_0x0032:
            java.lang.String r8 = "accountType"
            r2 = 1
            if (r7 == r2) goto L_0x0085
            r2 = 2
            if (r7 == r2) goto L_0x003c
            goto L_0x009c
        L_0x003c:
            if (r9 == 0) goto L_0x0049
            java.lang.String r7 = "authAccount"
            java.lang.String r7 = r9.getStringExtra(r7)
            java.lang.String r8 = r9.getStringExtra(r8)
            goto L_0x004b
        L_0x0049:
            r7 = r1
            r8 = r7
        L_0x004b:
            if (r7 != 0) goto L_0x004e
            goto L_0x0051
        L_0x004e:
            if (r8 == 0) goto L_0x0051
        L_0x0050:
            goto L_0x007c
        L_0x0051:
            java.util.LinkedHashMap r9 = r6.c
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0075
            java.util.List r9 = r6.b()
            int r2 = r9.size()
            r3 = 0
        L_0x0062:
            if (r3 >= r2) goto L_0x0075
            java.lang.Object r4 = r9.get(r3)
            android.accounts.Account r4 = (android.accounts.Account) r4
            int r3 = r3 + 1
            java.util.LinkedHashMap r5 = r6.c
            boolean r5 = r5.containsKey(r4)
            if (r5 != 0) goto L_0x0062
            goto L_0x0076
        L_0x0075:
            r4 = r1
        L_0x0076:
            if (r4 == 0) goto L_0x0050
            java.lang.String r7 = r4.name
            java.lang.String r8 = r4.type
        L_0x007c:
            if (r7 == 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            if (r8 == 0) goto L_0x009c
        L_0x0081:
            r6.a((java.lang.String) r7, (java.lang.String) r8)
            return
        L_0x0085:
            if (r9 != 0) goto L_0x0088
            goto L_0x0093
        L_0x0088:
            java.lang.String r7 = r9.getStringExtra(r8)
            if (r7 == 0) goto L_0x0093
            r6.a((java.lang.String) r7)
            return
        L_0x0093:
            iwd r7 = a
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.String r9 = "Unable to find account type, pretending the request was canceled"
            r7.b(r9, r8)
        L_0x009c:
            iwd r7 = a
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.String r9 = "Unable to find added account, pretending the request was canceled"
            r7.b(r9, r8)
        L_0x00a5:
            iwd r7 = a
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.String r9 = "Canceled"
            r7.a(r9, r8)
            pzg r7 = r6.f
            pzd r8 = new pzd
            r8.<init>(r0, r1)
            r7.a((defpackage.pzd) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pze.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onCreate(Bundle bundle) {
        amzy amzy;
        super.onCreate(bundle);
        setRetainInstance(true);
        Context context = getContext();
        amrl.a((Object) context);
        this.b = context.getApplicationContext();
        Bundle arguments = getArguments();
        amrl.a((Object) arguments);
        String[] stringArray = arguments.getStringArray("allowed_account_types");
        if (stringArray != null) {
            amzy = amym.a((Object[]) stringArray).b();
        } else {
            amzy = null;
        }
        this.i = amzy;
        this.j = arguments.getBoolean("force_account_picking");
        this.k = arguments.getParcelableArrayList("valid_accounts");
        this.l = arguments.getString("hosted_domain_filter");
        this.m = arguments.getBundle("add_account_options");
        String string = arguments.getString("calling_package");
        amrl.a((Object) string);
        this.h = string;
        this.n = arguments.getBoolean("use_particle_disc");
        this.p = wlt.a(this.b, g);
        this.q = wlt.d(this.b, g);
        Activity activity = getActivity();
        amrl.a((Object) activity);
        pzg pzg = (pzg) qck.a(activity).a(pzg.class);
        this.f = pzg;
        pzg.e.a(this, new pyw(this));
        this.d = this.b.getResources().getDimensionPixelSize(R.dimen.identity_common_account_picker_chip_avatar_size);
        this.c = new LinkedHashMap();
        this.o = qub.a(this.b);
        List b2 = b();
        int size = b2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Account account = (Account) b2.get(i2);
            this.c.put(account, pzh.a(account.name, account.type));
        }
    }

    public final void onResume() {
        String[] strArr;
        super.onResume();
        if (!this.e) {
            List b2 = b();
            if (!b2.isEmpty()) {
                qub a2 = qub.a(this.b);
                if (!this.j && b2.size() == 1 && pys.a(this.b, a2, (Account) b2.get(0), this.h)) {
                    Account account = (Account) b2.get(0);
                    a(account.name, account.type);
                }
            } else if (!jgu.g(this.b)) {
                this.f.a(new pzd(10, (Intent) null));
            } else {
                qub a3 = qub.a(this.b);
                amzy amzy = this.i;
                if (amzy != null) {
                    strArr = (String[]) amzy.toArray(new String[0]);
                } else {
                    strArr = null;
                }
                Set a4 = pys.a(a3, strArr);
                if (a4 == null || a4.size() != 1) {
                    this.e = true;
                    a((Intent) null, 1);
                    return;
                }
                a((String) a4.iterator().next());
            }
        }
    }

    private final void a(String str) {
        qub.a(this.b).a(str, (String) null, (String[]) null, this.m, (android.app.Activity) null, new pyz(this));
    }

    public final void a() {
        qaq qaq = new qaq(new qvr(Looper.getMainLooper()));
        ArrayList arrayList = new ArrayList(this.c.size() + 1);
        if (!this.c.isEmpty()) {
            anaf a2 = anet.a((Iterable) this.c.keySet(), pza.a);
            iby iby = this.q;
            wkz wkz = new wkz();
            wkz.b = false;
            aorr a3 = qbc.a(iby.a(wkz));
            aorl.a(a3, new pzc(this, a2), qaq);
            arrayList.add(a3);
            for (Map.Entry key : this.c.entrySet()) {
                Account account = (Account) key.getKey();
                aorr a4 = qbc.a(this.p.a(account.name, 1, this.n ? 1 : 0));
                aorl.a(a4, new pzb(this, account), qaq);
                arrayList.add(a4);
            }
        }
        aorl.b((Iterable) arrayList).a((Runnable) new pyx(this), (Executor) qaq);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(AccountManagerFuture accountManagerFuture) {
        if (accountManagerFuture != null) {
            try {
                Intent intent = (Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent");
                if (intent == null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("errorMessage", "error communicating with server");
                    this.f.a(new pzd(-1, new Intent().putExtras(bundle)));
                    return;
                }
                this.e = true;
                intent.setFlags(intent.getFlags() & -268435457);
                a(intent, 2);
            } catch (OperationCanceledException e2) {
                this.f.a(new pzd(0, (Intent) null));
            } catch (AuthenticatorException | IOException e3) {
                a.e("Authenticator returned an exception", e3, new Object[0]);
            }
        } else {
            a.e("Got a null future while adding an account!", new Object[0]);
        }
    }

    public final void a(Intent intent, int i2) {
        String[] strArr;
        if (i2 == 1) {
            Activity activity = getActivity();
            amrl.a((Object) activity);
            amzy amzy = this.i;
            Intent intent2 = new Intent();
            intent2.setFlags(524288);
            jix.i(activity);
            intent2.setClassName(activity, "com.google.android.gms.common.account.AccountTypePickerActivity");
            if (amzy != null) {
                strArr = (String[]) amzy.toArray(new String[amzy.size()]);
            } else {
                strArr = null;
            }
            intent2.putExtra("allowableAccountTypes", strArr);
            intent = intent2;
        } else if (i2 != 2) {
            this.f.a(new pzf(3, 0, this.c.size()));
            intent = new Intent("android.settings.SYNC_SETTINGS");
            Activity activity2 = getActivity();
            amrl.a((Object) activity2);
            activity2.onBackPressed();
        } else {
            this.f.a(new pzf(2, 0, this.c.size()));
        }
        if (intent != null) {
            startActivityForResult(intent, i2);
        }
    }

    public final void a(String str, String str2) {
        if (jkr.e() && anbs.b((Iterable) Arrays.asList(iri.a), amrs.a((Object) str2)) && str != null && str2 != null) {
            Account account = new Account(str, str2);
            qub a2 = qub.a(this.b);
            if (a2.b(account, this.h) == 4) {
                a2.a(account, this.h, 2);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putString("accountType", str2);
        bundle.putBoolean("pickedFromAccountChips", true);
        this.f.a(new pzd(-1, new Intent().putExtras(bundle)));
        List list = (List) this.f.d.b();
        if (list != null && list.size() > 0) {
            this.f.a(new pzf(0, anbs.e(list, new pyy(str)), list.size()));
        }
    }
}
