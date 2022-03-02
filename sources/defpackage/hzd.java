package defpackage;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorDescription;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import com.google.android.chimera.Activity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: hzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class hzd extends bjs implements AccountManagerCallback {
    private Set a;
    private Set b;
    private String c = null;
    protected int d;
    protected boolean e;
    protected String f;
    protected amri g;
    public ListView h;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private ArrayList l;
    private int m = 0;
    private Parcelable[] n = null;

    private final ArrayList a(qub qub) {
        ArrayList arrayList = new ArrayList();
        Set<String> set = this.b;
        if (set != null) {
            for (String a2 : set) {
                arrayList.addAll(a(qub, a2));
            }
        } else {
            for (String a3 : iri.a) {
                arrayList.addAll(a(qub, a3));
            }
        }
        return arrayList;
    }

    private final View b(String str) {
        try {
            return findViewById(getResources().getIdentifier(str, (String) null, (String) null));
        } catch (Resources.NotFoundException e2) {
            return null;
        }
    }

    private static boolean c(String str) {
        for (String equals : iri.a) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private final void h() {
        Intent intent = new Intent();
        intent.setClassName(this, "com.google.android.gms.common.account.AccountTypePickerActivity");
        intent.setFlags(524288);
        intent.putExtra("allowableAccountTypes", getIntent().getStringArrayExtra("allowableAccountTypes"));
        intent.putExtra("addAccountOptions", getIntent().getBundleExtra("addAccountOptions"));
        intent.putExtra("addAccountRequiredFeatures", getIntent().getStringArrayExtra("addAccountRequiredFeatures"));
        intent.putExtra("authTokenType", getIntent().getStringExtra("authTokenType"));
        startActivityForResult(intent, 1);
        this.m = 1;
    }

    /* access modifiers changed from: protected */
    public void a(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public abstract void e();

    /* access modifiers changed from: protected */
    public ArrayList f() {
        if (this.l == null) {
            this.l = a(qub.a((Context) this));
        }
        return this.l;
    }

    /* access modifiers changed from: protected */
    public boolean i() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v38, types: [android.view.View] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j() {
        /*
            r10 = this;
            r0 = 2131428832(0x7f0b05e0, float:1.847932E38)
            android.view.View r1 = r10.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Intent r2 = r10.getIntent()
            java.lang.String r3 = "overrideCustomTheme"
            r4 = 0
            int r2 = r2.getIntExtra(r3, r4)
            r3 = 8
            r5 = 1
            if (r2 == r5) goto L_0x00f6
            r1 = 2
            if (r2 == r1) goto L_0x001e
            goto L_0x0166
        L_0x001e:
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x00f5
            r2 = 2131429557(0x7f0b08b5, float:1.848079E38)
            android.view.View r6 = r10.findViewById(r2)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131427531(0x7f0b00cb, float:1.847668E38)
            android.view.View r7 = r10.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            amri r8 = r10.g
            boolean r8 = r8.a()
            if (r8 == 0) goto L_0x004d
            amri r8 = r10.g
            java.lang.Object r8 = r8.b()
            pyu r8 = (defpackage.pyu) r8
            amri r8 = r8.b()
            goto L_0x004f
        L_0x004d:
            ampu r8 = defpackage.ampu.a
        L_0x004f:
            boolean r9 = r8.a()
            if (r9 == 0) goto L_0x0065
            java.lang.Object r2 = r8.b()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            r0.setSingleLine(r4)
            r0.setMaxLines(r1)
            return
        L_0x0065:
            android.content.res.Resources r1 = r10.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r8 = r1.heightPixels
            float r8 = (float) r8
            float r1 = r1.density
            float r8 = r8 / r1
            agvx r1 = defpackage.hzt.a
            java.lang.Object r1 = r1.c()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            float r1 = (float) r1
            r9 = 0
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x00a3
            r0.setVisibility(r3)
            android.widget.ListView r0 = r10.h
            android.view.LayoutInflater r1 = r10.getLayoutInflater()
            r3 = 2131624148(0x7f0e00d4, float:1.8875468E38)
            android.view.View r1 = r1.inflate(r3, r9)
            r0.addHeaderView(r1, r9, r4)
            android.widget.ListView r0 = r10.h
            android.view.View r0 = r0.findViewById(r2)
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = r9
            goto L_0x00a4
        L_0x00a3:
        L_0x00a4:
            if (r7 == 0) goto L_0x00de
            java.lang.String r0 = r10.f
            if (r0 == 0) goto L_0x00b7
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00ba }
            android.graphics.drawable.Drawable r1 = r1.getApplicationIcon(r0)     // Catch:{ NameNotFoundException -> 0x00ba }
            amri r0 = defpackage.amri.b(r1)     // Catch:{ NameNotFoundException -> 0x00ba }
            goto L_0x00cc
        L_0x00b7:
            ampu r0 = defpackage.ampu.a     // Catch:{ NameNotFoundException -> 0x00ba }
            goto L_0x00cc
        L_0x00ba:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r0
            java.lang.String r0 = "Cannot find icon of package: %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            java.lang.String r2 = "AccountChooser"
            android.util.Log.w(r2, r0, r1)
            ampu r0 = defpackage.ampu.a
        L_0x00cc:
            boolean r1 = r0.a()
            if (r1 == 0) goto L_0x00de
            java.lang.Object r0 = r0.b()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r7.setImageDrawable(r0)
            r7.setVisibility(r4)
        L_0x00de:
            if (r6 == 0) goto L_0x00f5
            r6.setVisibility(r4)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r1 = r10.l()
            r0[r4] = r1
            r1 = 2131952101(0x7f1301e5, float:1.9540635E38)
            java.lang.String r0 = r10.getString(r1, r0)
            r6.setText(r0)
        L_0x00f5:
            return
        L_0x00f6:
            if (r1 != 0) goto L_0x00f9
            goto L_0x0159
        L_0x00f9:
            amri r0 = r10.g
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x012a
            amri r0 = r10.g
            java.lang.Object r0 = r0.b()
            pyu r0 = (defpackage.pyu) r0
            amri r0 = r0.b()
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0114
            goto L_0x012a
        L_0x0114:
            amri r0 = r10.g
            java.lang.Object r0 = r0.b()
            pyu r0 = (defpackage.pyu) r0
            amri r0 = r0.b()
            java.lang.Object r0 = r0.b()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            goto L_0x013c
        L_0x012a:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r2 = r10.l()
            r0[r4] = r2
            r2 = 2131952104(0x7f1301e8, float:1.9540641E38)
            java.lang.String r0 = r10.getString(r2, r0)
            r1.setText(r0)
        L_0x013c:
            r0 = 2131230981(0x7f080105, float:1.807803E38)
            r1.setBackgroundResource(r0)
            r0 = -1
            r1.setTextColor(r0)
            r0 = 16
            r1.setGravity(r0)
            android.content.res.Resources r0 = r10.getResources()
            r2 = 2131165653(0x7f0701d5, float:1.794553E38)
            int r0 = r0.getDimensionPixelSize(r2)
            r1.setPadding(r0, r4, r0, r4)
        L_0x0159:
            java.lang.String r0 = "android:id/titleDivider"
            android.view.View r0 = r10.b(r0)
            if (r0 == 0) goto L_0x0166
            r0.setVisibility(r3)
            return
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzd.j():void");
    }

    /* access modifiers changed from: protected */
    public final void k() {
        if (this.d == f().size()) {
            h();
        } else if (this.d != -1) {
            Account account = (Account) f().get(this.d);
            a(account.name, account.type);
        }
    }

    /* access modifiers changed from: protected */
    public final String l() {
        String str = this.f;
        if (!TextUtils.isEmpty(str)) {
            try {
                return jni.b(getApplicationContext()).b(str).toString();
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("AccountChooser", String.format("Cannot find label of package: %s", new Object[]{str}), e2);
            }
        }
        return "";
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        String stringExtra;
        String str;
        this.m = 0;
        Parcelable[] parcelableArr = this.n;
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
                        if (parcelableArr != null && (str2 == null || str == null)) {
                            ArrayList a2 = a(qub.a((Context) this));
                            Account[] accountArr = (Account[]) a2.toArray(new Account[a2.size()]);
                            HashSet hashSet = new HashSet();
                            for (Parcelable parcelable : parcelableArr) {
                                hashSet.add((Account) parcelable);
                            }
                            int length = accountArr.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                    break;
                                }
                                Account account = accountArr[i4];
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
        } else if (f().isEmpty()) {
            setResult(0);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        HashSet hashSet;
        Bundle bundleExtra = getIntent().getBundleExtra("first_party_options_bundle");
        if (bundleExtra != null) {
            this.g = amri.b(pyu.a(bundleExtra).a());
        } else {
            this.g = ampu.a;
        }
        String a2 = jhg.a((Activity) this);
        if (a2 == null) {
            Log.w("AccountChooser", "Unable to get caller identity");
            finish();
        } else if (!i() || qby.a((Context) this, a2)) {
            if (ampw.a(a2, getPackageName()) && getIntent().hasExtra("realClientPackage")) {
                a2 = getIntent().getStringExtra("realClientPackage");
            }
            this.f = a2;
        } else {
            Log.w("AccountChooser", "App was not signed by Google.");
            finish();
        }
        Intent intent = getIntent();
        amri amri = ampu.a;
        if (intent.hasExtra("overrideTheme")) {
            amri = amri.b(Integer.valueOf(intent.getIntExtra("overrideTheme", 0)));
        }
        if (this.g.a() && ((pyu) this.g.b()).f().a()) {
            amri = ((pyu) this.g.b()).f();
        }
        if (amri.a()) {
            int intValue = ((Integer) amri.b()).intValue();
            if (intValue == 1) {
                setTheme(2132017630);
            } else if (intValue == 1000) {
                setTheme(2132017629);
            } else if (intValue != 1001) {
                setTheme(2132017631);
            } else {
                setTheme(2132017627);
            }
        }
        super.onCreate(bundle);
        Intent intent2 = getIntent();
        if (intent2 != null) {
            HashSet hashSet2 = null;
            if (bundle != null) {
                this.m = bundle.getInt("pendingRequest");
                this.n = bundle.getParcelableArray("existingAccounts");
                this.c = bundle.getString("selectedAccountName");
                this.i = bundle.getBoolean("selectedAddAccount", false);
            } else {
                this.m = 0;
                this.n = null;
                Account account = (Account) intent2.getParcelableExtra("selectedAccount");
                if (account != null) {
                    this.c = account.name;
                }
            }
            ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("allowableAccounts");
            if (parcelableArrayListExtra != null) {
                hashSet = new HashSet(parcelableArrayListExtra.size());
                int size = parcelableArrayListExtra.size();
                for (int i2 = 0; i2 < size; i2++) {
                    hashSet.add((Account) ((Parcelable) parcelableArrayListExtra.get(i2)));
                }
            } else {
                hashSet = null;
            }
            this.a = hashSet;
            String[] stringArrayExtra = intent2.getStringArrayExtra("allowableAccountTypes");
            if (stringArrayExtra != null) {
                HashSet hashSet3 = new HashSet(r2);
                for (String add : stringArrayExtra) {
                    hashSet3.add(add);
                }
                HashSet hashSet4 = new HashSet(r2);
                for (AuthenticatorDescription authenticatorDescription : qub.a((Context) this).a()) {
                    hashSet4.add(authenticatorDescription.type);
                }
                hashSet3.retainAll(hashSet4);
                hashSet2 = hashSet3;
            }
            this.b = hashSet2;
            this.j = intent2.getBooleanExtra("alwaysPromptForAccount", false);
            this.k = intent2.getBooleanExtra("setGmsCoreAccount", false);
            this.e = jgu.g(this);
            return;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00aa, code lost:
        if (defpackage.qby.a((android.content.Context) r8, r4) != false) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r8 = this;
            super.onResume()
            r0 = 0
            r8.l = r0
            int r0 = r8.m
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 != 0) goto L_0x00f3
            java.util.ArrayList r0 = r8.f()
            boolean r0 = r0.isEmpty()
            java.lang.String r4 = "AccountChooser"
            if (r0 == 0) goto L_0x0054
            boolean r0 = defpackage.jgu.g(r8)
            if (r0 != 0) goto L_0x0035
            r0 = 2131952107(0x7f1301eb, float:1.9540647E38)
            android.widget.Toast r0 = android.widget.Toast.makeText(r8, r0, r3)
            r0.show()
            java.lang.String r0 = "User doesn't have the ability to add an Account. Nothing to choose."
            android.util.Log.i(r4, r0)
            r8.setResult(r3)
            r8.finish()
            return
        L_0x0035:
            java.util.Set r0 = r8.b
            if (r0 == 0) goto L_0x0050
            int r0 = r0.size()
            if (r0 == r1) goto L_0x0040
            goto L_0x0050
        L_0x0040:
            java.util.Set r0 = r8.b
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8.a((java.lang.String) r0)
            return
        L_0x0050:
            r8.h()
            return
        L_0x0054:
            boolean r0 = r8.j
            if (r0 == 0) goto L_0x005a
            goto L_0x00f3
        L_0x005a:
            java.util.ArrayList r0 = r8.f()
            int r5 = r0.size()
            if (r5 != r1) goto L_0x00f3
            java.lang.Object r5 = r0.get(r3)
            android.accounts.Account r5 = (android.accounts.Account) r5
            boolean r6 = defpackage.jkr.e()
            if (r6 == 0) goto L_0x00ad
            java.lang.String r4 = r5.type
            boolean r4 = c(r4)
            if (r4 == 0) goto L_0x00f3
            qub r4 = defpackage.qub.a((android.content.Context) r8)
            java.lang.String r6 = r8.f
            if (r6 == 0) goto L_0x00f3
            int r4 = r4.b((android.accounts.Account) r5, (java.lang.String) r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = r4.intValue()
            r6 = 2
            if (r5 == r6) goto L_0x00e4
            int r5 = r4.intValue()
            if (r5 == r1) goto L_0x00e4
            int r4 = r4.intValue()
            r5 = 4
            if (r4 != r5) goto L_0x00f3
            java.lang.String r4 = r8.f
            if (r4 == 0) goto L_0x00a5
            int r4 = defpackage.jhg.i(r8, r4)
            goto L_0x00a6
        L_0x00a5:
            r4 = -1
        L_0x00a6:
            boolean r4 = defpackage.qby.a((android.content.Context) r8, (int) r4)
            if (r4 == 0) goto L_0x00f3
            goto L_0x00e4
        L_0x00ad:
            java.lang.String r5 = r8.f
            if (r5 == 0) goto L_0x00b6
            int r6 = defpackage.jhg.i(r8, r5)
            goto L_0x00b7
        L_0x00b6:
            r6 = -1
        L_0x00b7:
            boolean r7 = defpackage.qby.a((android.content.Context) r8, (int) r6)
            if (r7 != 0) goto L_0x00e4
            if (r5 != 0) goto L_0x00c0
            goto L_0x00dd
        L_0x00c0:
            if (r6 == r2) goto L_0x00dd
            com.google.android.gms.common.internal.ClientContext r7 = new com.google.android.gms.common.internal.ClientContext
            r7.<init>()
            r7.b = r6
            r7.e = r5
            ixk r5 = defpackage.ixk.a((android.content.Context) r8, (com.google.android.gms.common.internal.ClientContext) r7)
            java.lang.String r6 = "android.permission.GET_ACCOUNTS"
            int r5 = r5.a(r6)
            if (r5 == 0) goto L_0x00e4
            java.lang.String r0 = "The calling package does not have the android.permission.GET_ACCOUNTS permission. Will display Chooser."
            android.util.Log.w(r4, r0)
            goto L_0x00f3
        L_0x00dd:
            java.lang.String r0 = "Could not get calling package."
            android.util.Log.w(r4, r0)
            goto L_0x00f3
        L_0x00e4:
            java.lang.Object r0 = r0.get(r3)
            android.accounts.Account r0 = (android.accounts.Account) r0
            java.lang.String r1 = r0.name
            java.lang.String r0 = r0.type
            r8.a((java.lang.String) r1, (java.lang.String) r0)
            return
        L_0x00f3:
            java.util.ArrayList r0 = r8.f()
            java.lang.String r4 = r8.c
            boolean r5 = r8.i
            if (r5 == 0) goto L_0x0102
            int r0 = r0.size()
            goto L_0x011d
        L_0x0102:
        L_0x0103:
            int r5 = r0.size()
            if (r3 >= r5) goto L_0x011c
            java.lang.Object r5 = r0.get(r3)
            android.accounts.Account r5 = (android.accounts.Account) r5
            java.lang.String r5 = r5.name
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x011a
            int r3 = r3 + 1
            goto L_0x0103
        L_0x011a:
            r0 = r3
            goto L_0x011d
        L_0x011c:
            r0 = -1
        L_0x011d:
            r8.d = r0
            r8.e()
            r8.j()
            int r0 = r8.d
            if (r0 == r2) goto L_0x012e
            android.widget.ListView r2 = r8.h
            r2.setItemChecked(r0, r1)
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzd.onResume():void");
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("pendingRequest", this.m);
        bundle.putParcelableArray("existingAccounts", this.n);
        int i2 = this.d;
        if (i2 == -1) {
            return;
        }
        if (i2 == f().size()) {
            bundle.putBoolean("selectedAddAccount", true);
            return;
        }
        bundle.putBoolean("selectedAddAccount", false);
        bundle.putString("selectedAccountName", ((Account) f().get(this.d)).name);
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
            this.m = 2;
            ArrayList a2 = a(qub.a((Context) this));
            this.n = (Parcelable[]) a2.toArray(new Account[a2.size()]);
            intent.setFlags(intent.getFlags() & -268435457);
            startActivityForResult(intent, 2);
        } catch (OperationCanceledException e2) {
            setResult(0);
            finish();
        } catch (AuthenticatorException | IOException e3) {
        }
    }

    private final ArrayList a(qub qub, String str) {
        String str2 = this.f;
        int i2 = Build.VERSION.SDK_INT;
        ArrayList arrayList = new ArrayList(r0);
        for (Account account : (c(str) && str2 != null) ? qub.a(str, str2) : new Account[0]) {
            Set set = this.a;
            if (set == null || set.contains(account)) {
                arrayList.add(account);
            }
        }
        return arrayList;
    }

    private final void a(String str, String str2) {
        String str3;
        if (!(!this.k || (str3 = this.f) == null || str == null)) {
            itg.a((Context) this, str, str3);
        }
        if (jkr.e() && str != null && str2 != null && c(str2)) {
            Account account = new Account(str, str2);
            qub a2 = qub.a((Context) this);
            String str4 = this.f;
            if (str4 != null && Integer.valueOf(a2.b(account, str4)).intValue() == 4) {
                a2.a(account, this.f, 2);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putString("accountType", str2);
        a(bundle);
        setResult(-1, new Intent().putExtras(bundle));
        finish();
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        Bundle bundleExtra = getIntent().getBundleExtra("addAccountOptions");
        String[] stringArrayExtra = getIntent().getStringArrayExtra("addAccountRequiredFeatures");
        qub.a((Context) this).a(str, getIntent().getStringExtra("authTokenType"), stringArrayExtra, bundleExtra, (android.app.Activity) null, this);
    }
}
