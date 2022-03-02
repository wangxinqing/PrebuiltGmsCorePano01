package com.google.android.gms.appinvite;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.ui.context.section.CustomSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.ListSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.SelectionSectionInfo;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppInviteChimeraActivity extends bjs implements TextWatcher, dyd, dyf, dye, ica, icb, dxv {
    private String A;
    private String B;
    private String C;
    private boolean D;
    private boolean E;
    private CharSequence F;
    private CharSequence G;
    private int H;
    private boolean I;
    private long J;
    private long K;
    private long L;
    private long M;
    private long N;
    private long O;
    private long P;
    public icc a;
    public String b;
    public dzq c;
    public Toolbar d;
    public TextView e;
    public EditText f;
    public View g;
    public dyc h;
    public Bitmap i;
    public View.OnClickListener j;
    public dwe k;
    public boolean l;
    public boolean m;
    public boolean n;
    private AppInviteResponseReceiver o;
    private List p;
    private Account q;
    private View r;
    private ImageView s;
    private ImageView t;
    private dxx u;
    private jgs v;
    private dvw w;
    private dvx x;
    private Uri y;
    private String z;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    class AppInviteResponseReceiver extends nla {
        public AppInviteResponseReceiver() {
            super("appinvite");
        }

        public final void a(Context context, Intent intent) {
            AppInviteChimeraActivity.this.b(intent);
        }
    }

    private static final ArrayList a(Intent intent, String str) {
        ArrayList<CharSequence> charSequenceArrayListExtra = intent.getCharSequenceArrayListExtra(str);
        if (charSequenceArrayListExtra == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(charSequenceArrayListExtra.size());
        int size = charSequenceArrayListExtra.size();
        for (int i2 = 0; i2 < size; i2++) {
            CharSequence charSequence = charSequenceArrayListExtra.get(i2);
            arrayList.add(charSequence != null ? charSequence.toString() : null);
        }
        return arrayList;
    }

    private final void b(boolean z2) {
        long j2;
        List list;
        boolean z3;
        boolean z4;
        if (this.P != 0) {
            j2 = SystemClock.uptimeMillis() - this.P;
        } else {
            j2 = 0;
        }
        dwe dwe = this.k;
        dxx dxx = this.u;
        if (dxx != null) {
            list = dxx.b();
        } else {
            list = null;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.J;
        if (this.K == 0 || this.L == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.L != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        int[] iArr = new int[4];
        dwe.a(list, iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        aucd o2 = anrv.k.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anrv anrv = (anrv) o2.b;
        int i6 = 1 | anrv.a;
        anrv.a = i6;
        anrv.b = z2;
        int i7 = i6 | 2;
        anrv.a = i7;
        anrv.c = i2;
        int i8 = 4 | i7;
        anrv.a = i8;
        anrv.d = i5;
        int i9 = i8 | 8;
        anrv.a = i9;
        anrv.e = i4;
        int i10 = i9 | 16;
        anrv.a = i10;
        anrv.f = i3;
        int i11 = i10 | 32;
        anrv.a = i11;
        anrv.g = j2;
        int i12 = i11 | 64;
        anrv.a = i12;
        anrv.h = uptimeMillis;
        int i13 = i12 | 128;
        anrv.a = i13;
        anrv.i = z3;
        anrv.a = i13 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        anrv.j = z4;
        dwe.a((anrv) o2.i(), 8, dwe.b);
    }

    private final void l() {
        HashMap hashMap;
        String str;
        String str2;
        String str3;
        Uri uri;
        Bitmap bitmap;
        String str4;
        String str5;
        this.P = SystemClock.uptimeMillis();
        Uri uri2 = (Uri) getIntent().getParcelableExtra("com.google.android.gms.appinvite.DEEP_LINK_URL");
        Bundle bundleExtra = getIntent().getBundleExtra("com.google.android.gms.appinvite.REFERRAL_PARAMETERS_URI");
        if (bundleExtra != null) {
            HashMap hashMap2 = new HashMap(bundleExtra.size());
            for (String str6 : bundleExtra.keySet()) {
                hashMap2.put(str6, bundleExtra.getString(str6));
            }
            hashMap = hashMap2;
        } else {
            hashMap = null;
        }
        if (uri2 != null) {
            str = uri2.toString();
        } else {
            str = null;
        }
        String stringExtra = getIntent().getStringExtra("com.google.android.gms.appinvite.EMAIL_CONTENT");
        String stringExtra2 = getIntent().getStringExtra("com.google.android.gms.appinvite.EMAIL_SUBJECT");
        Uri uri3 = this.y;
        boolean z2 = false;
        if (uri3 != null && !uri3.getScheme().equals("https") && !this.y.getScheme().equals("http")) {
            z2 = true;
        }
        Context applicationContext = getApplicationContext();
        String a2 = jhg.a((Activity) this);
        String str7 = this.q.name;
        String obj = this.f.getText().toString();
        boolean z3 = this.I;
        if (z3) {
            str2 = stringExtra2;
        } else {
            str2 = null;
        }
        if (z3) {
            str3 = stringExtra;
        } else {
            str3 = null;
        }
        String str8 = this.z;
        String p2 = p();
        ArrayList arrayList = this.u.r;
        String str9 = this.B;
        String str10 = this.C;
        if (!z2) {
            uri = this.y;
        } else {
            uri = null;
        }
        if (z2) {
            bitmap = this.i;
        } else {
            bitmap = null;
        }
        CharSequence charSequence = this.F;
        if (charSequence != null) {
            str4 = charSequence.toString();
        } else {
            str4 = null;
        }
        CharSequence charSequence2 = this.G;
        if (charSequence2 != null) {
            str5 = charSequence2.toString();
        } else {
            str5 = null;
        }
        dwb dwb = new dwb(applicationContext, a2, str7, obj, str2, str3, str, hashMap, str8, p2, arrayList, str9, str10, uri, bitmap, str4, str5, this.H);
        AppInviteIntentOperation.a.offer(dwb);
        startService(IntentOperation.getStartIntent((Context) this, AppInviteIntentOperation.class, "com.google.android.gms.appinvite.send.INTENT"));
        this.p.add(Long.valueOf(dwb.a));
    }

    private final void m() {
        boolean z2;
        int i2;
        dxx dxx = this.u;
        if (dxx == null || !dxx.a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        View view = this.r;
        if (!z2) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (z2) {
            jgs jgs = this.v;
            if (jgs != null && jgs.isRunning()) {
                this.v.stop();
            }
            this.s.setVisibility(8);
        } else {
            if (this.v == null) {
                jgs a2 = eak.a(this.s);
                this.v = a2;
                this.s.setImageDrawable(a2);
            }
            if (!this.v.isRunning()) {
                this.v.start();
            }
            this.s.setVisibility(0);
        }
        supportInvalidateOptionsMenu();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("progressFragment");
        List list = this.p;
        if (list == null || list.isEmpty()) {
            if (findFragmentByTag != null) {
                beginTransaction.remove(findFragmentByTag);
            }
        } else if (findFragmentByTag == null) {
            beginTransaction.add((Fragment) eak.a(), "progressFragment");
        }
        if (!beginTransaction.isEmpty()) {
            beginTransaction.commitAllowingStateLoss();
        }
    }

    private final void n() {
        if (jgu.d(this, this.b).size() > 1) {
            this.d.a((View.OnClickListener) new dvv(this));
        }
    }

    private final String o() {
        int length = 100 - this.f.getText().length();
        if (length < 0) {
            int i2 = -length;
            return getResources().getQuantityString(R.plurals.appinvite_message_over_limit, i2, new Object[]{Integer.valueOf(i2)});
        }
        return getResources().getQuantityString(R.plurals.appinvite_message_within_limit, length, new Object[]{Integer.valueOf(length)});
    }

    private static final String p() {
        return UUID.randomUUID().toString();
    }

    public final void a(int i2) {
    }

    public final void afterTextChanged(Editable editable) {
        int length = 100 - editable.length();
        String o2 = o();
        if (length < 0) {
            eat.a((View) this.f, (CharSequence) o());
            this.D = true;
            this.E = true;
        } else if (!this.E && length <= 10) {
            eat.a((View) this.f, (CharSequence) o());
            this.D = true;
            this.E = true;
        }
        this.e.setText(String.format(getString(R.string.appinvite_message_limit), new Object[]{Integer.valueOf(editable.length()), 100}));
        this.e.setContentDescription(o2);
        supportInvalidateOptionsMenu();
        if (!this.D) {
            eat.a((View) this.f, (CharSequence) o());
            this.D = true;
        }
        this.l = true;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public final void e() {
        eat.a(this, getString(R.string.appinvite_load_error), false, true);
        finish();
    }

    public final synchronized void f() {
        this.M = SystemClock.uptimeMillis() - this.J;
    }

    public final void g(Bundle bundle) {
        Account account;
        if (!this.n && (account = this.q) != null) {
            dvw dvw = new dvw(this, this, this.a, account.name, this.d);
            this.w = dvw;
            dvw.execute(new Void[0]);
        }
        if (!this.I && this.y != null && this.t.getDrawable() == null) {
            dvx dvx = new dvx(this, this, this.y, this.t);
            this.x = dvx;
            dvx.execute(new Void[0]);
        }
    }

    public final synchronized void h() {
        this.N = SystemClock.uptimeMillis() - this.J;
    }

    public final synchronized void i() {
        this.O = SystemClock.uptimeMillis() - this.J;
    }

    public final void j() {
        ArrayList arrayList = new ArrayList(jgu.d(this, this.b));
        startActivityForResult(hwy.a(this.q, arrayList, new String[]{"com.google"}, false, 1), 1);
    }

    public final adl k() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            if (i3 != -1) {
                eat.a(this, getString(R.string.appinvite_send_error), false, true);
                setResult(203);
                finish();
                return;
            }
            l();
        } else if (i3 == -1) {
            String stringExtra = intent.getStringExtra("authAccount");
            a(new Account(stringExtra, "com.google"), true);
            SharedPreferences.Editor edit = getSharedPreferences("appinvite.default_account_prefs", 0).edit();
            edit.putString(this.b, stringExtra);
            edit.apply();
            n();
        } else if (this.q == null) {
            b(false);
            setResult(202);
            finish();
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        if (isFinishing()) {
            b(false);
        }
    }

    /* JADX WARNING: type inference failed for: r0v60, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            super.onCreate(r20)
            r2 = 2131624003(0x7f0e0043, float:1.8875173E38)
            r1.setContentView((int) r2)
            java.lang.String r2 = defpackage.jhg.a((com.google.android.chimera.Activity) r19)
            r1.b = r2
            java.lang.String r11 = defpackage.jhg.h(r1, r2)
            if (r0 == 0) goto L_0x0022
            java.lang.String r2 = "sessionId"
            java.lang.String r2 = r0.getString(r2)
            r1.A = r2
            goto L_0x0028
        L_0x0022:
            java.lang.String r2 = p()
            r1.A = r2
        L_0x0028:
            dwe r2 = new dwe
            android.content.Context r3 = r19.getApplicationContext()
            java.lang.String r4 = r1.A
            r2.<init>(r3, r4)
            r1.k = r2
            r2.a()
            long r2 = android.os.SystemClock.uptimeMillis()
            r1.J = r2
            android.content.Intent r2 = r19.getIntent()
            java.lang.String r3 = "com.google.android.gms.appinvite.ADDITIONAL_SUGGESTIONS"
            java.util.ArrayList r5 = r2.getParcelableArrayListExtra(r3)
            java.lang.String r3 = "com.google.android.gms.appinvite.additionalPeople"
            java.util.ArrayList r6 = r2.getParcelableArrayListExtra(r3)
            java.lang.String r3 = "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_PERSON_IDS"
            java.util.ArrayList r7 = a((android.content.Intent) r2, (java.lang.String) r3)
            java.lang.String r3 = "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_EMAIL_ADDRESSES"
            java.util.ArrayList r8 = a((android.content.Intent) r2, (java.lang.String) r3)
            java.lang.String r3 = "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_PHONE_NUMBERS"
            java.util.ArrayList r9 = a((android.content.Intent) r2, (java.lang.String) r3)
            java.lang.String r3 = "com.google.android.gms.appinvite.MESSAGE"
            java.lang.CharSequence r14 = r2.getCharSequenceExtra(r3)
            java.lang.String r3 = "com.google.android.gms.appinvite.DEEP_LINK_URL"
            android.os.Parcelable r3 = r2.getParcelableExtra(r3)
            android.net.Uri r3 = (android.net.Uri) r3
            if (r3 == 0) goto L_0x0076
            java.lang.String r3 = r3.toString()
            r13 = r3
            goto L_0x0077
        L_0x0076:
            r13 = 0
        L_0x0077:
            if (r14 == 0) goto L_0x0080
            int r3 = r14.length()
            r16 = r3
            goto L_0x0082
        L_0x0080:
            r16 = 0
        L_0x0082:
            java.lang.String r3 = r1.b
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x02a3
            awhr r3 = defpackage.awhr.a
            awhv r3 = r3.a()
            boolean r3 = r3.j()
            if (r3 != 0) goto L_0x009a
            r14 = 1
            r15 = 0
            goto L_0x02a5
        L_0x009a:
            awhr r3 = defpackage.awhr.a
            awhv r3 = r3.a()
            boolean r3 = r3.h()
            if (r3 == 0) goto L_0x00c0
            java.lang.String r3 = "com.google.android.gms.appinvite.EMAIL_SUBJECT"
            java.lang.String r3 = r2.getStringExtra(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00c0
            java.lang.String r3 = "com.google.android.gms.appinvite.EMAIL_CONTENT"
            java.lang.String r3 = r2.getStringExtra(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00c0
            r3 = 1
            goto L_0x00c1
        L_0x00c0:
            r3 = 0
        L_0x00c1:
            r1.I = r3
            java.lang.String r3 = "com.google.android.gms.appinvite.TITLE"
            java.lang.CharSequence r3 = r2.getCharSequenceExtra(r3)
            r1.setTitle((java.lang.CharSequence) r3)
            r3 = 2131429705(0x7f0b0949, float:1.848109E38)
            android.view.View r3 = r1.findViewById(r3)
            android.support.v7.widget.Toolbar r3 = (android.support.v7.widget.Toolbar) r3
            r1.d = r3
            r1.a((android.support.v7.widget.Toolbar) r3)
            r3 = 2131428347(0x7f0b03fb, float:1.8478336E38)
            android.view.View r3 = r1.findViewById(r3)
            r1.r = r3
            r3 = 2131429262(0x7f0b078e, float:1.8480192E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r1.s = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.p = r3
            if (r0 == 0) goto L_0x010f
            java.lang.String r3 = "pendingOperations"
            long[] r3 = r0.getLongArray(r3)
            r4 = 0
        L_0x00fe:
            int r10 = r3.length
            if (r4 >= r10) goto L_0x010f
            java.util.List r10 = r1.p
            r17 = r3[r4]
            java.lang.Long r12 = java.lang.Long.valueOf(r17)
            r10.add(r12)
            int r4 = r4 + 1
            goto L_0x00fe
        L_0x010f:
            if (r0 == 0) goto L_0x0141
            java.lang.String r3 = "account"
            android.os.Parcelable r3 = r0.getParcelable(r3)
            android.accounts.Account r3 = (android.accounts.Account) r3
            java.lang.String r4 = "messageFocused"
            boolean r4 = r0.getBoolean(r4)
            r1.m = r4
            java.lang.String r4 = "message_edited"
            boolean r4 = r0.getBoolean(r4)
            r1.l = r4
            java.lang.String r4 = "message"
            java.lang.String r14 = r0.getString(r4)
            java.lang.String r4 = "messageLimitFirstEdit"
            boolean r4 = r0.getBoolean(r4)
            r1.D = r4
            java.lang.String r4 = "messageLimitNearWarning"
            boolean r0 = r0.getBoolean(r4)
            r1.E = r0
            r15 = 0
            goto L_0x0158
        L_0x0141:
            dwe r3 = r1.k
            r4 = 1
            java.lang.String r10 = r1.b
            r12 = 1
            r15 = 0
            r12 = r16
            r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = "com.google.android.gms.appinvite.ACCOUNT_NAME"
            android.os.Parcelable r0 = r2.getParcelableExtra(r0)
            r3 = r0
            android.accounts.Account r3 = (android.accounts.Account) r3
            r1.m = r15
        L_0x0158:
            android.view.LayoutInflater r0 = r19.getLayoutInflater()
            android.view.View r4 = r1.r
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r5 = 2131624018(0x7f0e0052, float:1.8875204E38)
            android.view.View r0 = r0.inflate(r5, r4, r15)
            dzq r4 = new dzq
            r4.<init>(r0)
            r1.c = r4
            android.view.View r0 = r4.y
            boolean r4 = r1.I
            if (r4 == 0) goto L_0x017d
            dvq r4 = new dvq
            r4.<init>(r1)
            r0.setOnClickListener(r4)
            goto L_0x0182
        L_0x017d:
            r4 = 8
            r0.setVisibility(r4)
        L_0x0182:
            android.net.Uri r0 = r2.getData()
            r1.y = r0
            dzq r0 = r1.c
            android.view.View r4 = r0.x
            r1.g = r4
            android.widget.ImageView r0 = r0.w
            r1.t = r0
            r4 = 2131951742(0x7f13007e, float:1.9539907E38)
            java.lang.String r4 = r1.getString(r4)
            r0.setContentDescription(r4)
            dvr r0 = new dvr
            r0.<init>(r1)
            r1.j = r0
            com.google.android.chimera.FragmentManager r0 = r19.getSupportFragmentManager()
            java.lang.String r4 = "imagePreviewFragment"
            com.google.android.chimera.Fragment r0 = r0.findFragmentByTag(r4)
            dyc r0 = (defpackage.dyc) r0
            r1.h = r0
            if (r0 != 0) goto L_0x01b4
            goto L_0x01b8
        L_0x01b4:
            android.view.View$OnClickListener r4 = r1.j
            r0.a = r4
        L_0x01b8:
            android.widget.ImageView r0 = r1.t
            dvs r4 = new dvs
            r4.<init>(r1)
            r0.setOnClickListener(r4)
            dzq r0 = r1.c
            android.widget.TextView r4 = r0.v
            r1.e = r4
            android.widget.EditText r0 = r0.t
            r1.f = r0
            r0.setText(r14)
            if (r14 == 0) goto L_0x01e2
            int r0 = r14.length()
            r4 = 100
            if (r0 <= r4) goto L_0x01e2
            android.widget.EditText r0 = r1.f
            android.text.Editable r0 = r0.getText()
            r1.afterTextChanged(r0)
        L_0x01e2:
            android.widget.EditText r0 = r1.f
            r0.addTextChangedListener(r1)
            android.widget.EditText r0 = r1.f
            dvu r4 = new dvu
            r4.<init>(r1)
            r0.setOnFocusChangeListener(r4)
            java.lang.String r0 = "com.google.android.gms.appinvite.GOOGLE_ANALYTICS_TRACKING_ID"
            java.lang.String r0 = r2.getStringExtra(r0)
            r1.z = r0
            java.lang.String r0 = "com.google.android.gms.appinvite.iosTargetApplication"
            java.lang.String r0 = r2.getStringExtra(r0)
            r1.B = r0
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r4 = "com.google.android.gms.appinvite.androidTargetApplication"
            java.lang.String r0 = r0.getStringExtra(r4)
            r1.C = r0
            hya r0 = defpackage.hya.a((android.content.Context) r19)
            java.lang.String r4 = r1.b
            boolean r0 = r0.b((java.lang.String) r4)
            if (r0 == 0) goto L_0x0220
            java.lang.String r0 = "com.google.android.gms.appinvite.DESCRIPTION"
            java.lang.CharSequence r0 = r2.getCharSequenceExtra(r0)
            goto L_0x0221
        L_0x0220:
            r0 = 0
        L_0x0221:
            r1.F = r0
            java.lang.String r0 = "com.google.android.gms.appinvite.BUTTON_TEXT"
            java.lang.CharSequence r0 = r2.getCharSequenceExtra(r0)
            r1.G = r0
            java.lang.String r0 = "com.google.android.gms.appinvite.appMinimumVersionCode"
            int r0 = r2.getIntExtra(r0, r15)
            r1.H = r0
            java.lang.String r0 = r1.b     // Catch:{ NameNotFoundException -> 0x0251 }
            android.content.Context r0 = r1.createPackageContext(r0, r15)     // Catch:{ NameNotFoundException -> 0x0251 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NameNotFoundException -> 0x0251 }
            java.lang.String r2 = "ai_config"
            java.lang.String r4 = "xml"
            java.lang.String r5 = r1.b     // Catch:{ NameNotFoundException -> 0x0251 }
            int r2 = r0.getIdentifier(r2, r4, r5)     // Catch:{ NameNotFoundException -> 0x0251 }
            if (r2 == 0) goto L_0x0255
            android.content.res.XmlResourceParser r0 = r0.getXml(r2)     // Catch:{ NameNotFoundException -> 0x0251 }
            r1.a((android.content.res.XmlResourceParser) r0)     // Catch:{ NameNotFoundException -> 0x0251 }
            goto L_0x0255
        L_0x0251:
            r0 = move-exception
            defpackage.apev.a(r0)
        L_0x0255:
            if (r3 != 0) goto L_0x0272
            java.lang.String r0 = "appinvite.default_account_prefs"
            android.content.SharedPreferences r0 = r1.getSharedPreferences(r0, r15)
            java.lang.String r2 = r1.b
            r4 = 0
            java.lang.String r0 = r0.getString(r2, r4)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0273
            android.accounts.Account r3 = new android.accounts.Account
            java.lang.String r2 = "com.google"
            r3.<init>(r0, r2)
            goto L_0x0274
        L_0x0272:
            r4 = 0
        L_0x0273:
        L_0x0274:
            if (r3 != 0) goto L_0x0277
            goto L_0x027f
        L_0x0277:
            java.lang.String r0 = r1.b
            boolean r0 = defpackage.jgu.b((android.content.Context) r1, (android.accounts.Account) r3, (java.lang.String) r0)
            if (r0 != 0) goto L_0x0295
        L_0x027f:
            java.lang.String r0 = r1.b
            java.util.List r0 = defpackage.jgu.d(r1, r0)
            int r2 = r0.size()
            r14 = 1
            if (r2 != r14) goto L_0x0293
            java.lang.Object r0 = r0.get(r15)
            android.accounts.Account r0 = (android.accounts.Account) r0
            goto L_0x0296
        L_0x0293:
            r0 = r4
            goto L_0x0296
        L_0x0295:
            r0 = r3
        L_0x0296:
            if (r0 == 0) goto L_0x029f
            r1.a((android.accounts.Account) r0, (boolean) r15)
            r19.n()
            return
        L_0x029f:
            r19.j()
            return
        L_0x02a3:
            r14 = 1
            r15 = 0
        L_0x02a5:
            dwe r3 = r1.k
            r4 = 0
            java.lang.String r10 = r1.b
            r12 = r16
            r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = 2131951758(0x7f13008e, float:1.953994E38)
            java.lang.String r0 = r1.getString(r0)
            defpackage.eat.a(r1, r0, r15, r14)
            java.lang.String r0 = r1.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02c4
            r0 = 200(0xc8, float:2.8E-43)
            goto L_0x02c6
        L_0x02c4:
            r0 = 201(0xc9, float:2.82E-43)
        L_0x02c6:
            r1.setResult(r0)
            r19.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.appinvite.AppInviteChimeraActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.appinvite_activity, menu);
        MenuItem item = menu.getItem(0);
        dxx dxx = this.u;
        if (dxx == null || !dxx.a() || this.u.r.isEmpty() || this.f.getText().length() == 0 || this.f.getText().length() > 100) {
            item.getIcon().setColorFilter(getResources().getColor(R.color.appinvite_disabled_send), PorterDuff.Mode.MULTIPLY);
            item.setEnabled(false);
        } else {
            item.getIcon().setColorFilter(getResources().getColor(R.color.material_grey_white_1000), PorterDuff.Mode.MULTIPLY);
            item.setEnabled(true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_send || this.u.r.isEmpty()) {
            return false;
        }
        l();
        b(true);
        m();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        unregisterReceiver(this.o);
        dvw dvw = this.w;
        if (dvw != null) {
            dvw.a.b();
            dvw.cancel(true);
            this.w = null;
        }
        dvx dvx = this.x;
        if (dvx != null) {
            dvx.cancel(true);
            this.x = null;
        }
        icc icc = this.a;
        if (icc != null && (icc.j() || this.a.i())) {
            this.a.g();
        }
        jgs jgs = this.v;
        if (jgs != null && jgs.isRunning()) {
            this.v.stop();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResumeFragments() {
        icc icc;
        Intent intent;
        super.onResumeFragments();
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.appinvite.intent.action.INVITE_SENT");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        AppInviteResponseReceiver appInviteResponseReceiver = new AppInviteResponseReceiver();
        this.o = appInviteResponseReceiver;
        registerReceiver(appInviteResponseReceiver, intentFilter);
        ArrayList arrayList = new ArrayList(this.p);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Long l2 = (Long) arrayList.get(i2);
            if (AppInviteIntentOperation.b.a(Long.valueOf(l2.longValue()))) {
                long longValue = l2.longValue();
                dvz dvz = AppInviteIntentOperation.b;
                Long valueOf = Long.valueOf(longValue);
                if (dvz.a(valueOf)) {
                    intent = (Intent) AppInviteIntentOperation.b.a.get(valueOf);
                } else {
                    intent = null;
                }
                b(intent);
            }
        }
        if ((!this.n || this.t.getDrawable() == null) && (icc = this.a) != null) {
            icc.e();
        }
        m();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int size = this.p.size();
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            jArr[i2] = ((Long) this.p.get(i2)).longValue();
        }
        bundle.putLongArray("pendingOperations", jArr);
        bundle.putString("sessionId", this.A);
        bundle.putParcelable("account", this.q);
        bundle.putString("message", this.f.getText().toString());
        bundle.putBoolean("messageFocused", this.m);
        bundle.putBoolean("messageLimitFirstEdit", this.D);
        bundle.putBoolean("messageLimitNearWarning", this.E);
        bundle.putBoolean("message_edited", this.l);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        this.k.a();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        dwe dwe = this.k;
        if (dwe.a) {
            dwe.c.g();
        }
        super.onStop();
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    private final void a(Account account, boolean z2) {
        boolean z3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String[] strArr;
        Account account2 = account;
        if (account2 != null && !account2.equals(this.q)) {
            if (this.q != null) {
                dwe dwe = this.k;
                aucd o2 = anra.c.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anra anra = (anra) o2.b;
                anra.a |= 1;
                anra.b = true;
                dwe.a((anra) o2.i(), 9, dwe.b);
            }
            if (this.c.a.getParent() != null) {
                ((ViewGroup) this.c.a.getParent()).removeView(this.c.a);
            }
            this.q = account2;
            this.d.d((int) R.drawable.product_logo_avatar_circle_blue_color_48);
            this.d.c((int) R.string.common_choose_account);
            this.n = false;
            this.g.setVisibility(8);
            ArrayList arrayList5 = null;
            this.t.setImageDrawable((Drawable) null);
            wlr a2 = wls.a();
            a2.a = 80;
            wls a3 = a2.a();
            icc icc = this.a;
            if (icc != null && (icc.i() || this.a.j())) {
                this.a.g();
            }
            ibz ibz = new ibz(this);
            ibz.a(this.q.name);
            ibz.a((ica) this);
            ibz.a((icb) this);
            ibz.a(wlt.a, (ibj) a3);
            this.a = ibz.b();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            dxx dxx = (dxx) supportFragmentManager.findFragmentByTag("selectionFragment");
            this.u = dxx;
            if (z2 || dxx == null) {
                Intent intent = getIntent();
                boolean hasSystemFeature = getPackageManager().hasSystemFeature("android.hardware.telephony");
                boolean z4 = !jkr.b() || checkSelfPermission("android.permission.SEND_SMS") == 0;
                if (!hasSystemFeature) {
                    z3 = false;
                } else {
                    z3 = z4;
                }
                if (hya.a((Context) this).b(this.b)) {
                    arrayList5 = intent.getParcelableArrayListExtra("com.google.android.gms.appinvite.ADDITIONAL_SUGGESTIONS");
                    arrayList3 = intent.getParcelableArrayListExtra("com.google.android.gms.appinvite.additionalPeople");
                    arrayList2 = a(intent, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_PERSON_IDS");
                    arrayList = a(intent, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_EMAIL_ADDRESSES");
                    arrayList4 = a(intent, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_PHONE_NUMBERS");
                } else {
                    arrayList4 = null;
                    arrayList3 = null;
                    arrayList2 = null;
                    arrayList = null;
                }
                Resources resources = getResources();
                String[] split = awhr.a.a().f().split(";");
                String[] split2 = awhr.a.a().d().split(";");
                String[] split3 = awhr.a.a().e().split(";");
                if (!z3) {
                    split = a(split);
                    split2 = a(split2);
                    strArr = a(split3);
                } else {
                    strArr = split3;
                }
                ArrayList arrayList6 = r7;
                ArrayList arrayList7 = new ArrayList();
                arrayList7.add(new CustomSectionInfo(new int[]{R.layout.appinvite_edit_message}));
                SelectionSectionInfo selectionSectionInfo = new SelectionSectionInfo();
                selectionSectionInfo.p = true;
                selectionSectionInfo.a = getString(R.string.appinvite_recipients_hint);
                arrayList7.add(selectionSectionInfo);
                ListSectionInfo listSectionInfo = new ListSectionInfo("suggested");
                listSectionInfo.b = split;
                listSectionInfo.i = 1;
                listSectionInfo.l = arrayList5;
                listSectionInfo.m = arrayList2;
                listSectionInfo.a(arrayList);
                listSectionInfo.b(arrayList4);
                listSectionInfo.g = getString(R.string.appinvite_grid_header);
                arrayList7.add(listSectionInfo);
                ListSectionInfo listSectionInfo2 = new ListSectionInfo("identityPeople");
                listSectionInfo2.d = "useCachedContacts";
                listSectionInfo2.b = split2;
                listSectionInfo2.e = true;
                listSectionInfo2.i = 2;
                listSectionInfo2.l = arrayList3;
                listSectionInfo2.g = getString(R.string.appinvite_list_header);
                arrayList7.add(listSectionInfo2);
                this.u = dxx.a(this.q.name, (int) awhr.a.a().t(), (ArrayList) null, true, (Bundle) null, false, strArr, false, resources.getInteger(R.integer.appinivte_num_portrait_grid_columns), resources.getInteger(R.integer.appinivte_num_landscape_grid_columns), arrayList6, this.b, false, (ArrayList) null, (ArrayList) null, (ArrayList) null, (String) null, true);
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, this.u, "selectionFragment").commitAllowingStateLoss();
            }
            dxx dxx2 = this.u;
            dxx2.e = this;
            dxx2.f = this;
            dxx2.g = this;
            dxx2.x = this;
        }
    }

    public final synchronized void b(int i2, int i3) {
        if (this.K == 0) {
            this.K = SystemClock.uptimeMillis() - this.J;
        }
        m();
    }

    public final void b(Intent intent) {
        Long valueOf = Long.valueOf(intent.getLongExtra("appOperationCode", -1));
        if (!this.p.contains(valueOf)) {
            eat.a(this, getString(R.string.appinvite_send_error), false, true);
            m();
            return;
        }
        this.p.remove(valueOf);
        long longValue = valueOf.longValue();
        dvz dvz = AppInviteIntentOperation.b;
        Long valueOf2 = Long.valueOf(longValue);
        if (dvz.a.containsKey(valueOf2)) {
            dvz.a.remove(valueOf2);
            dvz.b.remove(valueOf2);
        }
        if (intent.hasExtra("com.google.android.gms.appinvite.errorType")) {
            int intExtra = intent.getIntExtra("com.google.android.gms.appinvite.errorType", 0);
            if (intExtra == 1) {
                setResult(intent.getIntExtra("com.google.android.gms.appinvite.errorCode", 204));
                finish();
            } else if (intExtra == 2) {
                m();
                this.P = 0;
            } else if (intExtra != 3) {
                setResult(204);
                finish();
            } else {
                Intent intent2 = (Intent) intent.getParcelableExtra("com.google.android.gms.appinvite.authIntent");
                if (intent2 != null) {
                    startActivityForResult(intent2, 2);
                } else {
                    setResult(203);
                    finish();
                }
            }
            if (isFinishing()) {
                b(false);
            } else {
                eat.a(this, getString(R.string.appinvite_send_error), false, true);
            }
        } else {
            String[] stringArrayExtra = intent.getStringArrayExtra("appInviteResult");
            eat.a(this, getString(R.string.appinvite_invitation_sent), false, false);
            Intent intent3 = new Intent();
            intent3.putExtra("com.google.android.gms.appinvite.RESULT_INVITATION_IDS", stringArrayExtra);
            setResult(-1, intent3);
            finish();
            b(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071 A[Catch:{ IOException | XmlPullParserException -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008c A[Catch:{ IOException | XmlPullParserException -> 0x009d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.content.res.XmlResourceParser r8) {
        /*
            r7 = this;
            r8.next()     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            int r0 = r8.getEventType()     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
        L_0x0007:
            r1 = 1
            if (r0 == r1) goto L_0x009c
            int r0 = r8.getEventType()     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            r2 = 2
            if (r0 != r2) goto L_0x0096
            java.lang.String r0 = r8.getName()     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            java.lang.String r0 = r0.toLowerCase()     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            java.lang.String r3 = "string"
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            if (r0 == 0) goto L_0x0096
            r0 = 0
            java.lang.String r3 = "name"
            java.lang.String r0 = r8.getAttributeValue(r0, r3)     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            java.lang.String r3 = r8.nextText()     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            java.lang.String r3 = r3.trim()     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            if (r4 != 0) goto L_0x0096
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            if (r4 == 0) goto L_0x003d
            goto L_0x0096
        L_0x003d:
            int r4 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            r5 = -1657726487(0xffffffff9d3119e9, float:-2.343915E-21)
            r6 = -1
            if (r4 == r5) goto L_0x0066
            r5 = -1567212789(0xffffffffa2963b0b, float:-4.0720096E-18)
            if (r4 == r5) goto L_0x005c
            r5 = 1737683639(0x6792f2b7, float:1.3878856E24)
            if (r4 == r5) goto L_0x0052
        L_0x0051:
            goto L_0x006f
        L_0x0052:
            java.lang.String r4 = "ga_trackingId"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            if (r0 == 0) goto L_0x0051
            r6 = 0
            goto L_0x006f
        L_0x005c:
            java.lang.String r4 = "ai_ios_target_application"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            if (r0 == 0) goto L_0x0051
            r6 = 1
            goto L_0x006f
        L_0x0066:
            java.lang.String r4 = "ai_android_target_application"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            if (r0 == 0) goto L_0x0051
            r6 = 2
        L_0x006f:
            if (r6 == 0) goto L_0x008c
            if (r6 == r1) goto L_0x0081
            if (r6 == r2) goto L_0x0076
            goto L_0x0096
        L_0x0076:
            java.lang.String r0 = r7.C     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            if (r0 == 0) goto L_0x0096
            r7.C = r3     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            goto L_0x0096
        L_0x0081:
            java.lang.String r0 = r7.B     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            if (r0 == 0) goto L_0x0096
            r7.B = r3     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            goto L_0x0096
        L_0x008c:
            java.lang.String r0 = r7.z     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            if (r0 == 0) goto L_0x0096
            r7.z = r3     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
        L_0x0096:
            int r0 = r8.next()     // Catch:{ XmlPullParserException -> 0x009f, IOException -> 0x009d }
            goto L_0x0007
        L_0x009c:
            return
        L_0x009d:
            r8 = move-exception
            goto L_0x00a0
        L_0x009f:
            r8 = move-exception
        L_0x00a0:
            java.lang.String r8 = "AppInvite"
            java.lang.String r0 = "Error parsing configuration file"
            android.util.Log.e(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.appinvite.AppInviteChimeraActivity.a(android.content.res.XmlResourceParser):void");
    }

    private static final String[] a(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.remove("phone");
        return arrayList.size() != strArr.length ? (String[]) arrayList.toArray(new String[arrayList.size()]) : strArr;
    }

    public final Bundle a(int i2, CharSequence charSequence) {
        Bundle bundle = new Bundle();
        bundle.putInt("View_id", hdg.a(this, i2));
        bundle.putCharSequence("TextView_text", charSequence);
        return bundle;
    }

    public final synchronized void a(int i2, int i3) {
        long uptimeMillis = SystemClock.uptimeMillis() - this.J;
        this.L = uptimeMillis;
        if (this.K == 0) {
            this.K = uptimeMillis;
        }
        m();
        dwe dwe = this.k;
        long j2 = this.L;
        long j3 = this.K;
        long j4 = this.M;
        long j5 = this.N;
        long j6 = this.O;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dwe.a(2, j2));
        arrayList.add(dwe.a(1, j3));
        arrayList.add(dwe.a(3, j4));
        arrayList.add(dwe.a(4, j5));
        arrayList.add(dwe.a(5, j6));
        aucd o2 = ansb.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ansb ansb = (ansb) o2.b;
        int i4 = 1 | ansb.a;
        ansb.a = i4;
        ansb.b = i2;
        ansb.a = i4 | 2;
        ansb.c = i3;
        if (!arrayList.isEmpty()) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ansb ansb2 = (ansb) o2.b;
            if (!ansb2.d.a()) {
                ansb2.d = aucj.a(ansb2.d);
            }
            auab.a((Iterable) arrayList, (List) ansb2.d);
        }
        dwe.a((ansb) o2.i(), 3, dwe.b);
    }

    public final void a(ContactPerson.ContactMethod contactMethod, boolean z2) {
        dwe dwe = this.k;
        aucd o2 = anru.d.o();
        int i2 = contactMethod.a;
        if (i2 == 0) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anru anru = (anru) o2.b;
            anru.b = 1;
            anru.a |= 1;
        } else if (i2 == 1) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anru anru2 = (anru) o2.b;
            anru2.b = 2;
            anru2.a |= 1;
        } else if (i2 != 2) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anru anru3 = (anru) o2.b;
            anru3.b = 0;
            anru3.a |= 1;
        } else {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anru anru4 = (anru) o2.b;
            anru4.b = 3;
            anru4.a |= 1;
        }
        anru anru5 = (anru) o2.b;
        anru5.a = 2 | anru5.a;
        anru5.c = z2;
        dwe.a((anru) o2.i(), 7, dwe.b);
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [aucj] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.appinvite.model.ContactPerson r7, int r8, int r9, boolean r10) {
        /*
            r6 = this;
            dwe r0 = r6.k
            int r8 = defpackage.anrj.a(r8)
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r7 == 0) goto L_0x007f
            com.google.android.gms.appinvite.model.ContactPerson$ContactMethod r7 = r7.a()
            if (r7 == 0) goto L_0x007f
            anrg r1 = defpackage.anrg.c
            aucd r1 = r1.o()
            int r7 = r7.a
            if (r7 == 0) goto L_0x0062
            if (r7 == r3) goto L_0x004c
            if (r7 == r2) goto L_0x0035
            boolean r7 = r1.c
            if (r7 == 0) goto L_0x0029
            r1.c()
            r1.c = r4
        L_0x0029:
            aucj r7 = r1.b
            anrg r7 = (defpackage.anrg) r7
            r7.b = r4
            int r5 = r7.a
            r5 = r5 | r3
            r7.a = r5
            goto L_0x0077
        L_0x0035:
            boolean r7 = r1.c
            if (r7 != 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r1.c()
            r1.c = r4
        L_0x003f:
            aucj r7 = r1.b
            anrg r7 = (defpackage.anrg) r7
            r5 = 3
            r7.b = r5
            int r5 = r7.a
            r5 = r5 | r3
            r7.a = r5
            goto L_0x0077
        L_0x004c:
            boolean r7 = r1.c
            if (r7 != 0) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r1.c()
            r1.c = r4
        L_0x0056:
            aucj r7 = r1.b
            anrg r7 = (defpackage.anrg) r7
            r7.b = r2
            int r5 = r7.a
            r5 = r5 | r3
            r7.a = r5
            goto L_0x0077
        L_0x0062:
            boolean r7 = r1.c
            if (r7 != 0) goto L_0x0067
            goto L_0x006c
        L_0x0067:
            r1.c()
            r1.c = r4
        L_0x006c:
            aucj r7 = r1.b
            anrg r7 = (defpackage.anrg) r7
            r7.b = r3
            int r5 = r7.a
            r5 = r5 | r3
            r7.a = r5
        L_0x0077:
            aucj r7 = r1.i()
            r1 = r7
            anrg r1 = (defpackage.anrg) r1
            goto L_0x0080
        L_0x007f:
        L_0x0080:
            anrk r7 = defpackage.anrk.f
            aucd r7 = r7.o()
            if (r8 == 0) goto L_0x009f
            boolean r5 = r7.c
            if (r5 != 0) goto L_0x008d
            goto L_0x0092
        L_0x008d:
            r7.c()
            r7.c = r4
        L_0x0092:
            aucj r5 = r7.b
            anrk r5 = (defpackage.anrk) r5
            int r8 = r8 + -1
            r5.b = r8
            int r8 = r5.a
            r8 = r8 | r3
            r5.a = r8
        L_0x009f:
            if (r1 == 0) goto L_0x00b9
            boolean r8 = r7.c
            if (r8 != 0) goto L_0x00a6
            goto L_0x00ab
        L_0x00a6:
            r7.c()
            r7.c = r4
        L_0x00ab:
            aucj r8 = r7.b
            anrk r8 = (defpackage.anrk) r8
            r1.getClass()
            r8.c = r1
            int r1 = r8.a
            r1 = r1 | r2
            r8.a = r1
        L_0x00b9:
            boolean r8 = r7.c
            if (r8 != 0) goto L_0x00be
            goto L_0x00c3
        L_0x00be:
            r7.c()
            r7.c = r4
        L_0x00c3:
            aucj r8 = r7.b
            anrk r8 = (defpackage.anrk) r8
            int r1 = r8.a
            r1 = r1 | 4
            r8.a = r1
            r8.d = r9
            r9 = r1 | 8
            r8.a = r9
            r8.e = r10
            aucj r7 = r7.i()
            anrk r7 = (defpackage.anrk) r7
            r8 = 5
            java.lang.String r9 = r0.b
            r0.a(r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.appinvite.AppInviteChimeraActivity.a(com.google.android.gms.appinvite.model.ContactPerson, int, int, boolean):void");
    }

    public final void a(ContactPerson contactPerson, boolean z2) {
        if (z2 != this.u.r.isEmpty()) {
            supportInvalidateOptionsMenu();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        this.a.e();
    }

    public final void a(boolean z2) {
        dwe dwe = this.k;
        boolean z3 = !z2;
        aucd o2 = anrs.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anrs anrs = (anrs) o2.b;
        anrs.a |= 1;
        anrs.b = z3;
        dwe.a((anrs) o2.i(), 6, dwe.b);
    }
}
