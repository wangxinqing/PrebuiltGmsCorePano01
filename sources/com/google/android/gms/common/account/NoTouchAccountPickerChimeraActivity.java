package com.google.android.gms.common.account;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.pano.chimera.Action;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NoTouchAccountPickerChimeraActivity extends aked implements AccountManagerCallback {
    private Set b;
    private Set c;
    private String d = null;
    private boolean e = false;
    private boolean f = false;
    private String g = null;
    private boolean h = false;
    private String i;
    private ArrayList j;
    private int k;
    private Parcelable[] l;
    private int m;
    private HashMap n = new HashMap();

    private final void a(String str, String str2) {
        String str3;
        if (this.h && (str3 = this.i) != null) {
            itg.a((Context) this, str, str3);
        }
        if (((Boolean) hzg.a.c()).booleanValue() && jkr.e() && b(str2)) {
            Account account = new Account(str, str2);
            if (Integer.valueOf(qub.a((Context) this).b(account, this.i)).intValue() == 4) {
                qub.a((Context) this).a(account, this.i, 2);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putString("accountType", str2);
        setResult(-1, new Intent().putExtras(bundle));
        finish();
    }

    private final ArrayList b() {
        Set set;
        if (this.j == null) {
            ArrayList arrayList = new ArrayList(r2);
            for (Account account : qub.a((Context) this).b()) {
                Set set2 = this.b;
                if ((set2 == null || set2.contains(account)) && ((set = this.c) == null || set.contains(account.type))) {
                    arrayList.add(account);
                }
            }
            this.j = arrayList;
        }
        return this.j;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        String stringExtra;
        String str;
        this.k = 0;
        if (i3 != 0) {
            if (i3 == -1) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        String str2 = null;
                        if (intent != null) {
                            str2 = intent.getStringExtra("authAccount");
                            str = intent.getStringExtra("accountType");
                        } else {
                            str = null;
                        }
                        if (str2 == null || str == null) {
                            Account[] b2 = qub.a((Context) this).b();
                            HashSet hashSet = new HashSet();
                            for (Parcelable parcelable : this.l) {
                                hashSet.add((Account) parcelable);
                            }
                            int length = b2.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                    break;
                                }
                                Account account = b2[i4];
                                if (!hashSet.contains(account)) {
                                    str2 = account.name;
                                    str = account.type;
                                    break;
                                }
                                i4++;
                            }
                        }
                        if (!(str2 == null && str == null)) {
                            a(str2, str);
                            return;
                        }
                    }
                } else if (!(intent == null || (stringExtra = intent.getStringExtra("accountType")) == null)) {
                    a(stringExtra);
                    return;
                }
            }
            setResult(0);
            finish();
        } else if (b().isEmpty()) {
            setResult(0);
            finish();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01d7, code lost:
        if (defpackage.hya.a((android.content.Context) r11).a(defpackage.jhg.i(r11, r11.i)) != false) goto L_0x020f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            android.view.View r0 = r11.a
            r1 = 4
            r0.setVisibility(r1)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r2 = defpackage.jhg.a((com.google.android.chimera.Activity) r11)
            r11.i = r2
            r2 = 0
            r3 = 0
            if (r12 == 0) goto L_0x0038
            java.lang.String r4 = "pendingRequest"
            int r4 = r12.getInt(r4)
            r11.k = r4
            java.lang.String r4 = "existingAccounts"
            android.os.Parcelable[] r4 = r12.getParcelableArray(r4)
            r11.l = r4
            java.lang.String r4 = "selectedAccountName"
            java.lang.String r4 = r12.getString(r4)
            r11.d = r4
            java.lang.String r4 = "selectedAddAccount"
            boolean r12 = r12.getBoolean(r4, r3)
            r11.e = r12
            goto L_0x004a
        L_0x0038:
            r11.k = r3
            r11.l = r2
            java.lang.String r12 = "selectedAccount"
            android.os.Parcelable r12 = r0.getParcelableExtra(r12)
            android.accounts.Account r12 = (android.accounts.Account) r12
            if (r12 == 0) goto L_0x004a
            java.lang.String r12 = r12.name
            r11.d = r12
        L_0x004a:
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            qub r4 = defpackage.qub.a((android.content.Context) r11)
            android.accounts.AuthenticatorDescription[] r4 = r4.a()
            int r5 = r4.length
            r6 = 0
        L_0x0059:
            if (r6 >= r5) goto L_0x0065
            r7 = r4[r6]
            java.lang.String r8 = r7.type
            r12.put(r8, r7)
            int r6 = r6 + 1
            goto L_0x0059
        L_0x0065:
            r11.n = r12
            java.lang.String r12 = "allowableAccounts"
            java.util.ArrayList r12 = r0.getParcelableArrayListExtra(r12)
            if (r12 == 0) goto L_0x008e
            java.util.HashSet r4 = new java.util.HashSet
            int r5 = r12.size()
            r4.<init>(r5)
            int r5 = r12.size()
            r6 = 0
        L_0x007d:
            if (r6 >= r5) goto L_0x008d
            java.lang.Object r7 = r12.get(r6)
            android.os.Parcelable r7 = (android.os.Parcelable) r7
            android.accounts.Account r7 = (android.accounts.Account) r7
            r4.add(r7)
            int r6 = r6 + 1
            goto L_0x007d
        L_0x008d:
            goto L_0x008f
        L_0x008e:
            r4 = r2
        L_0x008f:
            r11.b = r4
            java.lang.String r12 = "allowableAccountTypes"
            java.lang.String[] r4 = r0.getStringArrayExtra(r12)
            if (r4 == 0) goto L_0x00c9
            int r5 = r4.length
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r5)
            r7 = 0
        L_0x00a0:
            if (r7 < r5) goto L_0x00c1
            qub r4 = defpackage.qub.a((android.content.Context) r11)
            android.accounts.AuthenticatorDescription[] r4 = r4.a()
            java.util.HashSet r5 = new java.util.HashSet
            int r7 = r4.length
            r5.<init>(r7)
            r8 = 0
        L_0x00b1:
            if (r8 >= r7) goto L_0x00bd
            r9 = r4[r8]
            java.lang.String r9 = r9.type
            r5.add(r9)
            int r8 = r8 + 1
            goto L_0x00b1
        L_0x00bd:
            r6.retainAll(r5)
            goto L_0x00ca
        L_0x00c1:
            r8 = r4[r7]
            r6.add(r8)
            int r7 = r7 + 1
            goto L_0x00a0
        L_0x00c9:
            r6 = r2
        L_0x00ca:
            r11.c = r6
            java.lang.String r4 = "alwaysPromptForAccount"
            boolean r4 = r0.getBooleanExtra(r4, r3)
            r11.f = r4
            java.lang.String r4 = "descriptionTextOverride"
            java.lang.String r4 = r0.getStringExtra(r4)
            r11.g = r4
            java.lang.String r4 = "setGmsCoreAccount"
            boolean r0 = r0.getBooleanExtra(r4, r3)
            r11.h = r0
            r11.j = r2
            int r0 = r11.k
            r4 = -1
            r5 = 1
            if (r0 != 0) goto L_0x0224
            java.util.ArrayList r0 = r11.b()
            boolean r0 = r0.isEmpty()
            java.lang.String r6 = "PanoAccountPicker"
            if (r0 == 0) goto L_0x0175
            boolean r0 = defpackage.jgu.g(r11)
            if (r0 != 0) goto L_0x010a
            java.lang.String r12 = "User doesn't have the ability to add an Account. Nothing to choose."
            android.util.Log.i(r6, r12)
            r11.setResult(r3)
            r11.finish()
            return
        L_0x010a:
            java.util.Set r0 = r11.c
            if (r0 != 0) goto L_0x010f
            goto L_0x0125
        L_0x010f:
            int r0 = r0.size()
            if (r0 != r5) goto L_0x0125
            java.util.Set r12 = r11.c
            java.util.Iterator r12 = r12.iterator()
            java.lang.Object r12 = r12.next()
            java.lang.String r12 = (java.lang.String) r12
            r11.a((java.lang.String) r12)
            return
        L_0x0125:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.app.Activity r1 = r11.getContainerActivity()
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r2 = "com.google.android.gms.common.account.NoTouchAccountTypePickerActivity"
            android.content.Intent r0 = r0.setClassName(r1, r2)
            r1 = 524288(0x80000, float:7.34684E-40)
            r0.setFlags(r1)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String[] r1 = r1.getStringArrayExtra(r12)
            r0.putExtra(r12, r1)
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r1 = "addAccountOptions"
            android.os.Bundle r12 = r12.getBundleExtra(r1)
            r0.putExtra(r1, r12)
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r1 = "addAccountRequiredFeatures"
            java.lang.String[] r12 = r12.getStringArrayExtra(r1)
            r0.putExtra(r1, r12)
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r1 = "authTokenType"
            java.lang.String r12 = r12.getStringExtra(r1)
            r0.putExtra(r1, r12)
            r11.startActivityForResult(r0, r5)
            r11.k = r5
            return
        L_0x0175:
            boolean r12 = r11.f
            if (r12 == 0) goto L_0x017b
            goto L_0x0224
        L_0x017b:
            java.util.ArrayList r12 = r11.b()
            int r0 = r12.size()
            if (r0 != r5) goto L_0x0224
            java.lang.Object r0 = r12.get(r3)
            android.accounts.Account r0 = (android.accounts.Account) r0
            ikz r7 = defpackage.hzg.a
            java.lang.Object r7 = r7.c()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x01da
            boolean r7 = defpackage.jkr.e()
            if (r7 != 0) goto L_0x01a0
            goto L_0x01da
        L_0x01a0:
            java.lang.String r6 = r0.type
            boolean r6 = b(r6)
            if (r6 == 0) goto L_0x0224
            qub r6 = defpackage.qub.a((android.content.Context) r11)
            java.lang.String r7 = r11.i
            int r0 = r6.b((android.accounts.Account) r0, (java.lang.String) r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r6 = r0.intValue()
            r7 = 2
            if (r6 == r7) goto L_0x020f
            int r6 = r0.intValue()
            if (r6 == r5) goto L_0x020f
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0224
            java.lang.String r0 = r11.i
            int r0 = defpackage.jhg.i(r11, r0)
            hya r1 = defpackage.hya.a((android.content.Context) r11)
            boolean r0 = r1.a((int) r0)
            if (r0 == 0) goto L_0x0224
            goto L_0x020f
        L_0x01da:
            java.lang.String r0 = r11.i
            int r0 = defpackage.jhg.i(r11, r0)
            hya r1 = defpackage.hya.a((android.content.Context) r11)
            boolean r1 = r1.a((int) r0)
            if (r1 == 0) goto L_0x01eb
            goto L_0x020f
        L_0x01eb:
            java.lang.String r1 = r11.i
            if (r1 != 0) goto L_0x01f0
            goto L_0x021e
        L_0x01f0:
            if (r0 == r4) goto L_0x021e
            com.google.android.gms.common.internal.ClientContext r1 = new com.google.android.gms.common.internal.ClientContext
            r1.<init>()
            r1.b = r0
            java.lang.String r0 = r11.i
            r1.e = r0
            ixk r0 = defpackage.ixk.a((android.content.Context) r11, (com.google.android.gms.common.internal.ClientContext) r1)
            java.lang.String r1 = "android.permission.GET_ACCOUNTS"
            int r0 = r0.a(r1)
            if (r0 == 0) goto L_0x020f
            java.lang.String r12 = "The calling package does not have the android.permission.GET_ACCOUNTS permission. Will display Chooser."
            android.util.Log.w(r6, r12)
            goto L_0x0224
        L_0x020f:
            java.lang.Object r12 = r12.get(r3)
            android.accounts.Account r12 = (android.accounts.Account) r12
            java.lang.String r0 = r12.name
            java.lang.String r12 = r12.type
            r11.a(r0, r12)
            return
        L_0x021e:
            java.lang.String r12 = "Could not get calling package."
            android.util.Log.w(r6, r12)
        L_0x0224:
            java.util.ArrayList r12 = r11.b()
            java.lang.String r0 = r11.d
            boolean r1 = r11.e
            if (r1 == 0) goto L_0x0233
            int r4 = r12.size()
            goto L_0x024e
        L_0x0233:
            r1 = 0
        L_0x0234:
            int r6 = r12.size()
            if (r1 >= r6) goto L_0x024d
            java.lang.Object r6 = r12.get(r1)
            android.accounts.Account r6 = (android.accounts.Account) r6
            java.lang.String r6 = r6.name
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x024b
            int r1 = r1 + 1
            goto L_0x0234
        L_0x024b:
            r4 = r1
            goto L_0x024e
        L_0x024d:
        L_0x024e:
            r11.m = r4
            java.util.ArrayList r12 = r11.b()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L_0x025a:
            int r4 = r12.size()
            if (r1 >= r4) goto L_0x02af
            java.lang.Object r4 = r12.get(r1)
            android.accounts.Account r4 = (android.accounts.Account) r4
            java.util.HashMap r6 = r11.n
            java.lang.String r7 = r4.type
            java.lang.Object r6 = r6.get(r7)
            android.accounts.AuthenticatorDescription r6 = (android.accounts.AuthenticatorDescription) r6
            if (r6 == 0) goto L_0x0277
            java.lang.String r7 = r6.packageName
            int r6 = r6.iconId
            goto L_0x0279
        L_0x0277:
            r7 = r2
            r6 = 0
        L_0x0279:
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r9 = "extra_account"
            r8.putExtra(r9, r4)
            akdk r9 = new akdk
            r9.<init>()
            java.lang.String r10 = java.lang.String.valueOf(r1)
            r9.a = r10
            java.lang.String r4 = r4.name
            r9.b = r4
            r9.c = r2
            r9.e = r7
            r9.f = r6
            int r4 = r11.m
            if (r1 != r4) goto L_0x029e
            r4 = 1
            goto L_0x029f
        L_0x029e:
            r4 = 0
        L_0x029f:
            r9.h = r4
            r9.i = r3
            r9.d = r8
            com.google.android.pano.chimera.Action r4 = r9.a()
            r0.add(r4)
            int r1 = r1 + 1
            goto L_0x025a
        L_0x02af:
            azgn r1 = defpackage.azgn.a
            azgo r1 = r1.a()
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x02f7
            boolean r1 = defpackage.jgu.g(r11)
            if (r1 == 0) goto L_0x02f7
            akdk r1 = new akdk
            r1.<init>()
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r6 = "extra_add_account"
            r4.putExtra(r6, r5)
            int r12 = r12.size()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r1.a = r12
            r12 = 2131952102(0x7f1301e6, float:1.9540637E38)
            java.lang.String r12 = r11.getString(r12)
            r1.b = r12
            r1.c = r2
            r12 = 2131231823(0x7f08044f, float:1.8079738E38)
            r1.f = r12
            r1.h = r3
            r1.i = r3
            r1.d = r4
            com.google.android.pano.chimera.Action r12 = r1.a()
            r0.add(r12)
        L_0x02f7:
            android.view.View r12 = r11.a
            r12.setVisibility(r3)
            java.lang.String r12 = r11.g
            r1 = 2131952147(0x7f130213, float:1.9540729E38)
            java.lang.String r1 = r11.getString(r1)
            akec r12 = defpackage.akec.a(r1, r12)
            akds r0 = defpackage.akds.a((java.util.ArrayList) r0)
            r11.a(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.account.NoTouchAccountPickerChimeraActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("pendingRequest", this.k);
        if (this.k == 2) {
            bundle.putParcelableArray("existingAccounts", this.l);
        }
        int i2 = this.m;
        if (i2 == -1) {
            return;
        }
        if (i2 == b().size()) {
            bundle.putBoolean("selectedAddAccount", true);
            return;
        }
        bundle.putBoolean("selectedAddAccount", false);
        bundle.putString("selectedAccountName", ((Account) b().get(this.m)).name);
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            Intent intent = (Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent");
            if (intent == null) {
                Bundle bundle = new Bundle();
                bundle.putString("errorMessage", "error communicating with server");
                setResult(-1, new Intent().putExtras(bundle));
                finish();
                return;
            }
            this.k = 2;
            this.l = qub.a((Context) this).b();
            intent.setFlags(intent.getFlags() & -268435457);
            startActivityForResult(intent, 2);
        } catch (OperationCanceledException e2) {
            setResult(0);
            finish();
        } catch (AuthenticatorException | IOException e3) {
        }
    }

    private static boolean b(String str) {
        for (String equals : iri.a) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void a(Action action) {
        if (!action.d.getBooleanExtra("extra_add_account", false)) {
            Account account = (Account) action.d.getParcelableExtra("extra_account");
            a(account.name, account.type);
            return;
        }
        a("com.google");
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        Bundle bundleExtra = getIntent().getBundleExtra("addAccountOptions");
        String[] stringArrayExtra = getIntent().getStringArrayExtra("addAccountRequiredFeatures");
        qub.a((Context) this).a(str, getIntent().getStringExtra("authTokenType"), stringArrayExtra, bundleExtra, (Activity) null, this);
    }
}
